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
// ObjectStorageTest.java
// Since: Jun 26, 2008 3:30:06 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xerial.db.DBException;
import org.xerial.db.sql.impl.ObjectStorageImpl;
import org.xerial.db.sql.sqlite.Person;
import org.xerial.db.sql.sqlite.SQLiteAccess;
import org.xerial.util.log.Logger;

public class ObjectStorageTest
{
    private static Logger _logger = Logger.getLogger(ObjectStorageTest.class);
    private ObjectStorageImpl storage;

    @Before
    public void setUp() throws Exception
    {
        storage = new ObjectStorageImpl(new SQLiteAccess()); // use an on-memory database of SQLite
    }

    @After
    public void tearDown() throws Exception
    {
        storage.getDatabaseAccess().dispose();
    }

    @Test
    public void testRegist() throws DBException
    {
        storage.regist(Person.class);
        List<String> tableNameList = storage.getDatabaseAccess().getTableNameList();

        assertTrue(tableNameList.contains("person"));

    }

    @Test
    public void testRegistWithTableName() throws DBException
    {
        storage.regist("person_table", Person.class);
    }

    @Test
    public void testOneToOne()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testOneToMany()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetOneTClassOfU()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetOneTClassOfUInt()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetOneClassOfTIntClassOfU()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetOneClassOfTIntClassOfUInt()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetAllTClassOfU()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetAllTClassOfUString()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetAllClassOfTIntClassOfU()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetAllClassOfTIntClassOfUString()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetParentU()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetParentClassOfUInt()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testJoin()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testCreate() throws DBException
    {
        storage.regist(Person.class);
        Person p = storage.create(new Person("leo"));
        assertTrue(p.getId() >= 0);
        assertEquals("leo", p.getName());
        
        
    }

    @Test
    public void testSave()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testSaveAll()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetClassOfTInt()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetClassOfTString()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetAllClassOfT()
    {
        fail("Not yet implemented");
    }

    @Test
    public void testGetAllClassOfTString()
    {
        fail("Not yet implemented");
    }

}
