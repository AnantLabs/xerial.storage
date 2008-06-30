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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xerial.db.DBErrorCode;
import org.xerial.db.DBException;
import org.xerial.db.sql.impl.ObjectStorageImpl;
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
    public void testRegister() throws DBException
    {
        storage.register(Person.class);
        List<String> tableNameList = storage.getDatabaseAccess().getTableNameList();

        assertTrue(tableNameList.contains("person"));

    }

    @Test
    public void testRegistWithTableName() throws DBException
    {
        storage.register("person_table", Person.class);
    }

    @Test
    public void createAssocatedObject() throws DBException
    {
        Person p = storage.create(new Person("leo"));
        _logger.debug(p);
        Report r = storage.create(p, new Report());
        _logger.debug(r);

        assertTrue(p.getId() >= 1);
        assertEquals(p.getId(), r.getPersonId());
        assertTrue(r.getId() >= 1);
    }

    @Test
    public void timeStampTest() throws DBException
    {
        Person p = storage.create(new Person("leo"));
        _logger.debug(p);
        Report r = storage.create(p, new Report());
        _logger.debug(r);

        assertTrue(p.getId() >= 1);
        assertEquals(p.getId(), r.getPersonId());
        assertTrue(r.getId() >= 1);

        assertNotNull(r.getCreatedAt());
        assertNotNull(r.getModifiedAt());

        assertEquals(r.getCreatedAt(), r.getModifiedAt());

        Report r2 = storage.get(Report.class, r.getId());
        _logger.debug(r2);

        assertEquals(r.getId(), r2.getId());
        assertEquals(r.getPersonId(), r2.getPersonId());

        // date time values are round to hh:mm:ss  
        assertEquals(r.getCreatedAt(), r2.getCreatedAt());
        assertEquals(r.getModifiedAt(), r2.getModifiedAt());

        Date rCreatedAt = (Date) r.getCreatedAt().clone();

        try
        {
            Thread.sleep(1000 * 1);
        }
        catch (InterruptedException e)
        {
            fail(e.getMessage());
        }
        storage.save(r);
        Report r3 = storage.get(Report.class, r.getId());
        _logger.debug(r3);

        assertEquals(rCreatedAt, r3.getCreatedAt());
        _logger.debug(rCreatedAt.getTime());
        _logger.debug(r3.getModifiedAt().getTime());
        assertTrue(rCreatedAt.compareTo(r3.getModifiedAt()) <= 0);

    }

    @Test
    public void testOneToOne() throws DBException
    {
        storage.oneToOne(Person.class, Report.class);
        
        Person p = storage.create(new Person("leo"));
        Report r = storage.create(p, new Report());

        Report r2 = storage.getOne(p, Report.class);
        
        assertNotNull(r2);
        assertEquals(r.getId(), r2.getId());
        assertEquals(r.getPersonId(), r2.getPersonId());
        assertEquals(r.getCreatedAt(), r2.getCreatedAt());
        assertEquals(r.getModifiedAt(), r2.getModifiedAt());
        
        try
        {
            Report r3 = storage.create(p, new Report());
            fail("cannot not create two or more duplicate objects associated as one to one");
        }
        catch(DBException e)
        {
            assertEquals(DBErrorCode.AssociatedObjectAlreadyExist, e.getErrorCode());
        }
        
        Person p2 = storage.getParent(r, Person.class);
        assertNotNull(p2);
        assertEquals(p.getId(), p2.getId());
        assertEquals(p.getName(), p2.getName());

    }

    @Test
    public void testOneToMany() throws DBException
    {
        Person p = storage.create(new Person("leo"));
        Report r = storage.create(p, new Report());
        Report r2 = storage.create(p, new Report());
        
        fail("not yet implemented");
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
        Person p = storage.create(new Person("leo"));
        _logger.debug(p.toString());
        assertTrue(p.getId() >= 0);
        assertEquals("leo", p.getName());

        Person p2 = storage.create(new Person("yui"));
        _logger.debug(p2.toString());
        assertTrue(p2.getId() >= p.getId());
        assertEquals("yui", p2.getName());

    }

    @Test
    public void testSave() throws DBException
    {
        Person p = storage.create(new Person("leo"));
        assertTrue(p.getId() >= 0);
        assertEquals("leo", p.getName());

        int id = p.getId();

        p.setName("Taro L. Saito");
        storage.save(p);
        assertEquals(id, p.getId());
        assertEquals("Taro L. Saito", p.getName());

    }

    @Test
    public void testSaveAll() throws DBException
    {
        Person p = storage.create(new Person("leo"));
        Person p2 = storage.create(new Person("yui", "xxx-xxxx"));
        assertTrue(p.getId() >= 0);
        assertEquals("leo", p.getName());

        int id = p.getId();
        int id2 = p2.getId();

        ArrayList<Person> list = new ArrayList<Person>();
        list.add(p);
        list.add(p2);

        p.setName("Taro L. Saito");
        p2.setName("Yui Yui");
        p2.setAddress("yyy-yyyy");
        storage.saveAll(Person.class, list);

        Person newP = storage.get(Person.class, id);
        Person newP2 = storage.get(Person.class, id2);
        assertNotNull(newP);
        assertNotNull(newP2);

        _logger.debug(newP);
        _logger.debug(newP2);

        assertEquals(id, newP.getId());
        assertEquals("Taro L. Saito", newP.getName());
        assertEquals("", newP.getAddress());

        assertEquals(id2, newP2.getId());
        assertEquals("Yui Yui", newP2.getName());
        assertEquals("yyy-yyyy", newP2.getAddress());

    }

    @Test
    public void testAbortInSaveAll() throws DBException
    {
        Person p = storage.create(new Person("leo"));
        Person p2 = storage.create(new Person("yui", "xxx-xxxx"));
        assertTrue(p.getId() >= 0);
        assertEquals("leo", p.getName());

        int id = p.getId();
        int id2 = p2.getId();

        ArrayList<Person> list = new ArrayList<Person>();
        list.add(p);
        list.add(null);

        p.setName("Taro L. Saito");
        try
        {
            storage.saveAll(Person.class, list);
            fail("cannot reach here");
        }
        catch (DBException e)
        {
            _logger.debug("intended abort: " + e.getMessage());
        }

        Person newP = storage.get(Person.class, id);
        Person newP2 = storage.get(Person.class, id2);
        assertNotNull(newP);
        assertNotNull(newP2);

        _logger.debug(newP);
        _logger.debug(newP2);

        assertEquals(id, newP.getId());
        assertEquals("leo", newP.getName());
        assertEquals("", newP.getAddress());

        assertEquals(id2, newP2.getId());
        assertEquals("yui", newP2.getName());
        assertEquals("xxx-xxxx", newP2.getAddress());

    }

    @Test
    public void testGetClassOfTInt() throws DBException
    {
        Person p = storage.create(new Person("leo", "xxx-xxx"));
        int id = p.getId();

        Person p2 = storage.get(Person.class, 1);

        assertEquals(id, p2.getId());
        assertEquals(p.getName(), p2.getName());
        assertEquals(p.getAddress(), p2.getAddress());
    }

    @Test
    public void testGetClassOfTString() throws DBException
    {
        Person p = storage.create(new Person("leo", "xxx-xxx"));
        int id = p.getId();

        Person p2 = storage.get(Person.class, "select * from person where id = " + id);

        assertEquals(id, p2.getId());
        assertEquals(p.getName(), p2.getName());
        assertEquals(p.getAddress(), p2.getAddress());
    }

    @Test
    public void testGetAllClassOfT() throws DBException
    {
        Person p = storage.create(new Person("leo", "xxx-xxxx"));
        Person p2 = storage.create(new Person("yui", "yyy-yyyy"));

        TreeSet<Person> personList = new TreeSet<Person>(storage.getAll(Person.class));
        assertEquals(2, personList.size());
        assertTrue(personList.contains(p));
        assertTrue(personList.contains(p2));

        Person pf = personList.first();
        assertEquals(p.getId(), pf.getId());
        assertEquals(p.getName(), pf.getName());
        assertEquals(p.getAddress(), pf.getAddress());
        pf = personList.last();
        assertEquals(p2.getId(), pf.getId());
        assertEquals(p2.getName(), pf.getName());
        assertEquals(p2.getAddress(), pf.getAddress());

    }

    @Test
    public void testGetAllClassOfTString() throws DBException
    {
        Person p = storage.create(new Person("leo", "xxx-xxxx"));
        Person p2 = storage.create(new Person("yui", "yyy-yyyy"));

        TreeSet<Person> personList = new TreeSet<Person>(storage.getAll(Person.class, "select * from person"));
        assertEquals(2, personList.size());
        assertTrue(personList.contains(p));
        assertTrue(personList.contains(p2));

        Person pf = personList.first();
        assertEquals(p.getId(), pf.getId());
        assertEquals(p.getName(), pf.getName());
        assertEquals(p.getAddress(), pf.getAddress());
        pf = personList.last();
        assertEquals(p2.getId(), pf.getId());
        assertEquals(p2.getName(), pf.getName());
        assertEquals(p2.getAddress(), pf.getAddress());

    }

}
