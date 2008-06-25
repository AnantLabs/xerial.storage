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
// DatabaseAccessTest.java
// Since: 2008/06/25 17:24:56
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xerial.db.DBException;
import org.xerial.db.Relation;
import org.xerial.db.datatype.DataType;
import org.xerial.db.sql.sqlite.SQLiteAccess;
import org.xerial.util.log.Logger;

public class DatabaseAccessTest
{
    private static Logger _logger = Logger.getLogger(DatabaseAccessTest.class);
    
    private DatabaseAccess dbAccess;
    
    @Before
    public void setUp() throws Exception
    {
        dbAccess = new SQLiteAccess();
    }

    @After
    public void tearDown() throws Exception
    {}

    @Test
    public void testGetTableNameList() throws DBException
    {
        dbAccess.update("create table student (id integer primary key autoincrement not null, name string, createdAt datetime)");
        List<String> tableNameList = dbAccess.getTableNameList();
        _logger.debug(tableNameList);
        assertEquals(1, tableNameList.size());
        
        assert(tableNameList.contains("student"));
        
        dbAccess.update("create table report (id integer primary key autoincrement not null, student_id integer not null, data blob)");
        tableNameList = dbAccess.getTableNameList();
        assertEquals(2, tableNameList.size());
        
        assert(tableNameList.contains("student"));
        assert(tableNameList.contains("report"));

    }

    @Test
    public void testGetRelation() throws DBException
    {
        dbAccess.update("create table student (id integer primary key autoincrement not null, name string, createdAt datetime)");
        Relation r = dbAccess.getRelation("student");
    
        List<DataType> dt = r.getDataTypeList();
        _logger.debug(dt);
        assertEquals(3, dt.size());
        assertEquals("id", dt.get(0).getName());        
        assertEquals("integer", dt.get(0).getTypeName());
        assertEquals(true, dt.get(0).isPrimaryKey());
        assertEquals(true, dt.get(0).isNotNull());
        
        assertEquals("name", dt.get(1).getName());        
        assertEquals("string", dt.get(1).getTypeName());
        assertEquals(false, dt.get(1).isNotNull());

        assertEquals("createdAt", dt.get(2).getName());        
        assertEquals("datetime", dt.get(2).getTypeName());
        assertEquals(false, dt.get(2).isNotNull());

    }

    @Test
    public void testQueryStringClassOfT()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testQueryStringResultSetHandlerOfT()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testQueryStringBeanResultHandlerOfT()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testToJSON()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testSingleColumnQuery()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testAccumulate()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateString()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateStringBoolean()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testUpdateWithPreparedStatement()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testInsert()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testSetQueryTimeout()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testSetAutoCommit()
    {
        fail("Not yet implemented");
    }

}
