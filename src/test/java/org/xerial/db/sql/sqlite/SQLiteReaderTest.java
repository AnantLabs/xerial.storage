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
// SQLiteReaderTest.java
// Since: May 31, 2007
//
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.sql.sqlite;


import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.xerial.db.DBException;
import org.xerial.db.sql.SQLExpression;
import org.xerial.json.JSONException;
import org.xerial.json.JSONObject;


public class SQLiteReaderTest {
	SQLiteReader reader;
	
	@BeforeClass
	public static void setUpClass()
	{

	}
	
	@Before
	public void setUp() throws Exception {
		 reader = new SQLiteReader();
	}

	@After
	public void tearDown() throws Exception {
	}
	

	@Test
	public void query() throws JSONException, DBException, IOException
	{
		JSONObject json = new JSONObject();
		json.put("database", SQLite.getMemoryDatabaseAddress());
		json.put("sql", SQLExpression.fillTemplate("select * from $1", "person"));
	
		//reader.query(json.toJSONString(), System.out);
	}

}




