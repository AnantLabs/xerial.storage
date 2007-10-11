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
import java.util.List;

import org.xerial.core.XerialException;
import org.xerial.db.DBException;
import org.xerial.db.sql.SQLExpression;
import org.xerial.db.sql.sqlite.SQLiteAccess;
import org.xerial.json.JSONException;
import org.xerial.json.JSONObject;
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
    
    private enum Opt { HELP, FLAT }  
    private enum StructureType { FLAT_XML } 
    
    private StructureType structureType = StructureType.FLAT_XML; 
    
    public static void main(String[] args)
    {
        final XMLOrganizer organizer = new XMLOrganizer();
        
        OptionParser<Opt> option = new OptionParser<Opt>();
        option.addOption(Opt.HELP, "h", "help", "display help message");
        option.addOption(Opt.FLAT, "f", "flat", "create flat relation (default)", new OptionHandler<Opt>(){
            public void handle(OptionParser<Opt> parser) throws OptionParserException
            {
                organizer.structureType = StructureType.FLAT_XML;
            }});
        
        _logger.setOutputWriter(new OutputStreamWriter(System.err));
        
        try
        {
            option.parse(args);
            if(option.isSet(Opt.HELP))
            {
                System.out.println("> XMLOrganizer [option] sqlite_dbfile");
                System.out.println(option.helpMessage());
            }
            
            if(option.getArgumentLength() <= 0)
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
 
 
    public void load(String sqliteDBFileName) throws DBException, InvalidXMLException
    {
        SQLiteAccess sqliteDB = new SQLiteAccess(sqliteDBFileName);
        XMLGenerator xmlOut = new XMLGenerator();
        
        xmlOut.startTag("database", new XMLAttribute("file", sqliteDBFileName));
        for(String table : sqliteDB.getTableList())
        {
            List<Integer> count = sqliteDB.query(SQLExpression.fillTemplate("select count(*) as count from $1", table), "count", Integer.class);
            if(count.size() <= 0)
                continue;
            int rowCount = count.get(0);
            _logger.debug("row count: " + rowCount);
            
            final int limit = 100;
            int readRowCount = 0;
            while(readRowCount < rowCount)
            {
                List<JSONObject> rowData = sqliteDB.jsonQuery(SQLExpression.fillTemplate("select * from $1 limit $2 offset $3", table, limit, readRowCount));
                for(JSONObject obj : rowData)
                {
                    xmlOut.startTag(table);                    
                    for(String key : obj.keys())
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
        xmlOut.endTag(); // database
        xmlOut.endDocument();
        
        System.out.flush();
    }
    
    
}
