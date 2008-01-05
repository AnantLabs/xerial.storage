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
// SQLiteServerTest.java
// Since: 2007/05/11
//
// $Date$
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.sql.sqlite;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xerial.db.DBException;
import org.xerial.db.sql.sqlite.SQLiteServer;
import org.xerial.util.log.Logger;
import org.xerial.util.thread.ThreadManager;

public class SQLiteServerTest {

	SQLiteServer _server;
	ThreadManager _threadManager = new ThreadManager(10, 10);
	static Logger _logger = Logger.getLogger(SQLiteServerTest.class);
	static final int _port = 6000;  
	
	@Before
	public void setUp() throws Exception {
		_server = new SQLiteServer("tmp.db");
		_server.setPort(_port);
	}

	@After
	public void tearDown() throws Exception {
		_server.dispose();
	}

	class Server implements Runnable
	{
		SQLiteServer _server;

		public Server(SQLiteServer _server) {
			super();
			this._server = _server;
		}

		public void run() {
			try {
				_logger.debug("start up the server");
				_server.startServer();
			} catch (DBException e) {
				_logger.error(e);
			}
		}
	}
	
	class Client implements Runnable
	{
		int id;
		
		public Client(int id)
		{
			this.id = id;
		}
		
		public void run()
		{
			try {
				Socket socket = new Socket("localhost", _port);
				BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter out = new PrintWriter(socket.getOutputStream());
				out.println("hello! I'm " + id);
				out.flush();
				_logger.debug("recieved a message: " + in.readLine());
				in.close();
				out.close();
			} catch (UnknownHostException e) {
				_logger.error(e);
			} catch (IOException e) {
				_logger.error(e);
			}
			
		}
	}
	
	@Test
	public void echoTest() throws InterruptedException, IOException
	{
		_threadManager.addTask(new Server(_server));
		for(int i=0; i<10; i++)
		{
			_threadManager.addTask(new Client(i));
		}
		Thread.sleep(500);
		_server.stopPortListening();
		_threadManager.joinAll();
		
	}
}




