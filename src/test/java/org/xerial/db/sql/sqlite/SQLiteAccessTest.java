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
// XerialJ Project
//
// SQLiteAccessTest.java
// Since: May 8, 2007
//
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.sql.sqlite;


import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.xerial.db.DBException;
import org.xerial.db.Relation;
import org.xerial.db.datatype.IntegerType;
import org.xerial.db.datatype.StringType;
import org.xerial.db.sql.ConnectionPool;
import org.xerial.db.sql.ConnectionPoolImpl;
import org.xerial.db.sql.DatabaseAccess;
import org.xerial.db.sql.RelationBuilder;
import org.xerial.db.sql.sqlite.SQLite;
import org.xerial.db.sql.sqlite.SQLiteAccess;
import org.xerial.util.CollectionUtil;
import org.xerial.util.bean.BeanException;
import org.xerial.util.log.Logger;



public class SQLiteAccessTest {

	static private DatabaseAccess _dbAccess; 
	static private ConnectionPool _connectionPool;
	
	static Logger _logger  = Logger.getLogger(SQLiteAccessTest.class);
	
	@BeforeClass
	public static void openDatabase() throws DBException
	{

	}
	
	@AfterClass
	public static void closeDatabase() throws DBException
	{
	}
	
	
	private SQLiteAccess query; 
	
	@Before
	public void setUp() throws Exception {
	    
        _connectionPool = new ConnectionPoolImpl(SQLite.driverName, SQLite.getMemoryDatabaseAddress());
        _dbAccess = new DatabaseAccess(_connectionPool);

		query = new SQLiteAccess(_dbAccess);
		query.createTable("person", RelationBuilder.createRelation(Person.class));
	}

	@After
	public void tearDown() throws Exception {
	    if(_dbAccess != null)
	        _dbAccess.dispose();

	}

	
	@Test
	public void getTableList() throws DBException
	{
		List<String> tableList = CollectionUtil.toString(query.getTableList());

		assertTrue(tableList.contains("person"));
	}
	
	@Test
	public void hasTable() throws DBException
	{
		assertTrue(query.hasTable("person"));
	}
	
	@Test
	public void getRelation() throws DBException 
	{
		Relation r = query.getRelationSchema("person");
		_logger.debug(r);
	}
	
	
	@Test
	public void update() throws DBException, BeanException
	{
		query.insert(new Person(3, "leopard"), "person");
		query.deleteByKeyValue(new Person(3), "person");
	}
	
	@Test
	public void createTable() throws DBException 
	{
		Relation r = new Relation();
		r.add(new IntegerType("id", true, true));
		r.add(new StringType("name"));
		
		query.createTable("tmp", r);
		query.dropTable("tmp");
	}
	
	
	@Test
	public void memoryDatabase() throws DBException, BeanException
	{
		ConnectionPool connectionPool = new ConnectionPoolImpl(SQLite.driverName, SQLite.getMemoryDatabaseAddress());
		
		DatabaseAccess dbAccess = new DatabaseAccess(connectionPool);
		SQLiteAccess query = new SQLiteAccess(dbAccess);
		
		query.createTable("person", RelationBuilder.createRelation(Person.class));
		query.insert(new Person(1, "leo"), "person");
		query.insert(new Person(2, "yui"), "person");

	}
	
}									




