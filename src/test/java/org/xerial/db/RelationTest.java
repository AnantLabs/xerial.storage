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
// RelationTest.java
// Since: Jun 26, 2008 4:05:53 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.Blob;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xerial.db.datatype.BlobType;
import org.xerial.db.datatype.BooleanType;
import org.xerial.db.datatype.DataType;
import org.xerial.db.datatype.DateTimeType;
import org.xerial.db.datatype.IntegerType;
import org.xerial.db.datatype.LongType;
import org.xerial.db.datatype.PasswordType;
import org.xerial.db.datatype.StringType;
import org.xerial.db.datatype.TextType;
import org.xerial.db.sql.sqlite.Person;

import sun.util.calendar.BaseCalendar.Date;

public class RelationTest
{

    @Before
    public void setUp() throws Exception
    {}

    @After
    public void tearDown() throws Exception
    {}

    @Test
    public void testGetDataTypeStringString()
    {
        String paramName = "param";
        DataType dt = Relation.getDataType(paramName, "integer");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof IntegerType);

        dt = Relation.getDataType(paramName, "int");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof IntegerType);

        // must not be case-sensitive 
        dt = Relation.getDataType(paramName, "Integer");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof IntegerType);

        // serial type must be an integer
        dt = Relation.getDataType(paramName, "serial");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof IntegerType);

        dt = Relation.getDataType(paramName, "boolean");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof BooleanType);

        dt = Relation.getDataType(paramName, "string");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof StringType);

        dt = Relation.getDataType(paramName, "long");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof LongType);

        dt = Relation.getDataType(paramName, "password");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof PasswordType);

        dt = Relation.getDataType(paramName, "text");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof TextType);

        dt = Relation.getDataType(paramName, "datetime");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof DateTimeType);

        // unknown type must be bound to StringType
        dt = Relation.getDataType(paramName, "other");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof StringType);

        // blob type
        dt = Relation.getDataType(paramName, "blob");
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof BlobType);

    }

    @Test
    public void testGetDataTypeStringClassOfT()
    {
        String paramName = "param";
        DataType dt = null;

        dt = Relation.getDataType(paramName, Integer.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof IntegerType);

        dt = Relation.getDataType(paramName, int.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof IntegerType);

        dt = Relation.getDataType(paramName, Boolean.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof BooleanType);

        dt = Relation.getDataType(paramName, boolean.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof BooleanType);

        dt = Relation.getDataType(paramName, String.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof StringType);

        dt = Relation.getDataType(paramName, Long.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof LongType);

        dt = Relation.getDataType(paramName, long.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof LongType);

        dt = Relation.getDataType(paramName, Date.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof DateTimeType);

        // unknown type must be bound to StringType
        dt = Relation.getDataType(paramName, Person.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof StringType);

        // {@link Blob} type
        dt = Relation.getDataType(paramName, Blob.class);
        assertEquals(dt.getName(), paramName);
        assertTrue(dt instanceof BlobType);

    }

}
