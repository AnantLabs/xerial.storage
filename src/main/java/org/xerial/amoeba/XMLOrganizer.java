/*--------------------------------------------------------------------------
 *  Copyright 2007 Taro L. Saito
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *--------------------------------------------------------------------------*/
//--------------------------------------
// XerialJ
//
// XMLOrganizer.java
// Since: Oct 11, 2007 10:48:53 AM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.amoeba;

import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.xerial.core.XerialException;
import org.xerial.db.DBException;
import org.xerial.db.Relation;
import org.xerial.db.datatype.DataType;
import org.xerial.db.sql.SQLExpression;
import org.xerial.db.sql.sqlite.SQLiteAccess;
import org.xerial.json.JSONException;
import org.xerial.json.JSONObject;
import org.xerial.util.Algorithm;
import org.xerial.util.CollectionUtil;
import org.xerial.util.Functor;
import org.xerial.util.StringUtil;
import org.xerial.util.cui.OptionHandler;
import org.xerial.util.cui.OptionParser;
import org.xerial.util.cui.OptionParserException;
import org.xerial.util.log.Logger;
import org.xerial.util.xml.InvalidXMLException;
import org.xerial.util.xml.XMLAttribute;
import org.xerial.util.xml.XMLGenerator;

public class XMLOrganizer
{
    public static Logger _logger = Logger.getLogger(XMLOrganizer.class);

    private enum Opt {
        HELP, FLAT, AGGREGATE
    }

    private enum StructureType {
        FLAT_XML, AGGREATED_XML
    }

    private StructureType structureType = StructureType.FLAT_XML;

    public static void main(String[] args)
    {
        final XMLOrganizer organizer = new XMLOrganizer();

        OptionParser<Opt> option = new OptionParser<Opt>();
        option.addOption(Opt.HELP, "h", "help", "display help message");
        option.addOption(Opt.FLAT, "f", "flat", "create flat XML (default)", new OptionHandler<Opt>() {
            public void handle(OptionParser<Opt> parser) throws OptionParserException
            {
                organizer.structureType = StructureType.FLAT_XML;
            }
        });
        option.addOption(Opt.AGGREGATE, "a", "aggregate", "create aggregated XML", new OptionHandler<Opt>() {
            public void handle(OptionParser<Opt> parser) throws OptionParserException
            {
                organizer.structureType = StructureType.AGGREATED_XML;
            }
        });

        _logger.setOutputWriter(new OutputStreamWriter(System.err));

        try
        {
            option.parse(args);
            if (option.isSet(Opt.HELP))
            {
                System.out.println("> XMLOrganizer [option] sqlite_dbfile");
                System.out.println(option.helpMessage());
            }

            if (option.getArgumentLength() <= 0)
            {
                throw new OptionParserException("db file name is not specified");
            }

            String dbFileName = option.getArgument(0);
            organizer.load(dbFileName);
        }
        catch (XerialException e)
        {
            System.err.println(e);
        }
    }

    public void load(String sqliteDBFileName) throws XerialException
    {
        SQLiteAccess sqliteDB = new SQLiteAccess(sqliteDBFileName);
        XMLGenerator xmlOut = new XMLGenerator();

        xmlOut.startTag("database", new XMLAttribute("file", sqliteDBFileName));

        switch (structureType)
        {
        case FLAT_XML:
            flatXML(sqliteDB, xmlOut);
            break;
        case AGGREATED_XML:
        {
            RecursiveAggregator aggregator = new RecursiveAggregator(sqliteDB, xmlOut);
            aggregator.process();
        }
            break;
        default:
            throw new XerialException("Unknown Structure Type");
        }

        xmlOut.endTag(); // database
        xmlOut.endDocument();

        System.out.flush();
    }

    public void flatXML(SQLiteAccess sqliteDB, XMLGenerator xmlOut) throws InvalidXMLException, DBException
    {
        for (String table : sqliteDB.getTableList())
        {
            List<Integer> count = sqliteDB.query(SQLExpression.fillTemplate("select count(*) as count from $1", table),
                    "count", Integer.class);
            if (count.size() <= 0)
                continue;
            int rowCount = count.get(0);
            _logger.debug("row count: " + rowCount);

            final int limit = 100;
            int readRowCount = 0;
            while (readRowCount < rowCount)
            {
                List<JSONObject> rowData = sqliteDB.jsonQuery(SQLExpression.fillTemplate(
                        "select * from $1 limit $2 offset $3", table, limit, readRowCount));
                for (JSONObject obj : rowData)
                {
                    xmlOut.startTag(table);
                    for (String key : obj.keys())
                    {
                        try
                        {
                            String value = obj.getString(key);
                            xmlOut.element(key, value);
                        }
                        catch (JSONException e)
                        {
                            _logger.error(e);
                        }
                    }
                    xmlOut.endTag(); // table
                }
                readRowCount += rowData.size();
            }
        }

    }

    class RecursiveAggregator
    {
        SQLiteAccess sqliteDB;
        XMLGenerator xmlOut;

        /**
         * @param sqliteDB
         * @param xmlOut
         */
        public RecursiveAggregator(SQLiteAccess sqliteDB, XMLGenerator xmlOut)
        {
            this.sqliteDB = sqliteDB;
            this.xmlOut = xmlOut;
        }

        public String generateWhereClause(List<String> conditionList)
        {
            return conditionList.isEmpty() ? "" : "where " + StringUtil.join(conditionList, " and ");
        }

        public int groupCountQuery(String tableName, String column, List<String> conditionList) throws DBException
        {
            List<Integer> count = sqliteDB.query(SQLExpression.fillTemplate(
                    "select count(*) as count from (select * from $1 $2 group by $3)", 
                    tableName,
                    generateWhereClause(conditionList), column), "count", Integer.class);
            if (count.size() <= 0)
                return 0;
            return count.get(0);
        }

        public int countQuery(String tableName, List<String> conditionList) throws DBException
        {
            List<Integer> count = sqliteDB.query(SQLExpression.fillTemplate("select count(*) as count from $1 $2",
                    tableName, generateWhereClause(conditionList)),
                    "count", Integer.class);
            return (count.size() <= 0) ? 0 : count.get(0);
        }

        class Count
        {
            public DataType dataType;
            public int count;

            /**
             * @param dataType
             * @param count
             */
            public Count(DataType dataType, int count)
            {
                this.dataType = dataType;
                this.count = count;
            }

        }

        public Count getMinGroupCount(String tableName, List<DataType> remainingDataTypeList, List<String> conditionList)
                throws DBException
        {
            int minGroupCountIndex = 0;
            int minGroupCount = Integer.MAX_VALUE;
            int index = 0;
            for (DataType dt : remainingDataTypeList)
            {
                int groupEntryCount = groupCountQuery(tableName, dt.getName(), conditionList);
                if (groupEntryCount < minGroupCount)
                {
                    minGroupCountIndex = index;
                    minGroupCount = groupEntryCount;
                }
                index++;
            }
            return new Count(remainingDataTypeList.get(minGroupCountIndex), minGroupCount);
        }

        public void recursivelyOutputColumnData(String tableName, LinkedList<DataType> columnDataTypeList,
                LinkedList<String> conditionList, boolean isTopElement) throws DBException, InvalidXMLException
        {
            int rowCount = countQuery(tableName, conditionList);

            _logger.debug("recursive: " + columnDataTypeList);
            
            while (!columnDataTypeList.isEmpty())
            {
                Count minCount = getMinGroupCount(tableName, columnDataTypeList, conditionList);
                if (minCount.count >= rowCount)
                {
                    // no aggregation is required

                    List selectColumnList = CollectionUtil.collect(columnDataTypeList, new Functor<DataType>() {
                        public Object apply(DataType input)
                        {
                            return input.getName();
                        }
                    });
                    String selectColumn = StringUtil.join(selectColumnList, ", ");
                    String condition = generateWhereClause(conditionList);

                    final int limit = 100;
                    int readRowCount = 0;
                    while (readRowCount < rowCount)
                    {
                        List<JSONObject> rowData = sqliteDB.jsonQuery(SQLExpression.fillTemplate(
                                "select $1 from $2 $3 limit $4 offset $5", selectColumn, tableName, condition,
                                limit, readRowCount));
                        for (JSONObject obj : rowData)
                        {
                            if (isTopElement)
                                xmlOut.startTag(tableName);
                            for (String key : obj.keys())
                            {
                                try
                                {
                                    String value = obj.getString(key);
                                    xmlOut.element(key, value);
                                }
                                catch (JSONException e)
                                {
                                    _logger.error(e);
                                }
                            }
                            if (isTopElement)
                                xmlOut.endTag(); // table
                        }
                        readRowCount += rowData.size();
                    }
                    return; // exit the loop
                }
                else
                {
                    // further aggregation is possible
                    DataType targetColumnOfAggregation = minCount.dataType;

                    List distinctValueList = sqliteDB.query(SQLExpression.fillTemplate(
                            "select distinct $1 from $2 order by $1", targetColumnOfAggregation.getName(), tableName),
                            targetColumnOfAggregation.getName(), String.class);

                    for (Object columnValueObj : distinctValueList)
                    {
                        String columnValue = columnValueObj.toString();
                        
                        xmlOut.startTag(targetColumnOfAggregation.getName(), new XMLAttribute("value", columnValue));

                        columnDataTypeList.remove(targetColumnOfAggregation);
                        conditionList.addLast(targetColumnOfAggregation.getName() + "=\"" + columnValue + "\"");

                        recursivelyOutputColumnData(tableName, columnDataTypeList, conditionList, false);

                        conditionList.removeLast();
                        xmlOut.endTag(); // targetColumnNameOfAggregation
                    }
                }

            }

        }

        public void process() throws InvalidXMLException, DBException
        {
            for (String table : sqliteDB.getTableList())
            {
                Relation schema = sqliteDB.getRelationSchema(table);
                LinkedList<DataType> columnDataTypeList = new LinkedList<DataType>();
                columnDataTypeList.addAll(schema.getDataTypeList());

                // aggregate relational data beginning from a column with the
                // fewest number of distinct values.
                LinkedList<String> conditionList = new LinkedList<String>();
                recursivelyOutputColumnData(table, columnDataTypeList, conditionList, true);

            }

        }

    }

}
