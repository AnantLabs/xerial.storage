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
// RDBAccess.java
// Since: Jan 15, 2008 7:13:07 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import java.util.List;

import org.xerial.db.DBException;

/**
 * An interface to access relational databases
 * 
 * @author leo
 *
 */
public interface DatabaseAccess {
	
    /**
     * perform the given SQL query, then output its results 
     * @param sql An SQL statement
     * @param <T> row type	: Bean class type to which the result will be transformed
     * @param resultRowType Bean class type to which the result will be transformed
     * @param result the list of the result beans
     * @throws DBException
     */
	public <T> List<T> query(String sql, Class<T> resultRowType) throws DBException;
	
	/**
	 * Performs an SQL query, while consuming the results with the given handler
	 * @param <T> 
	 * @param sql the SQL query expression
	 * @param resultSetHandler the result set handler that consumes the result set of the query.
	 * @throws DBException
	 */
	public <T> void query(String sql, ResultSetHandler<T> resultSetHandler) throws DBException;
	
    /**
     * Accumulate the query result within the ResultSetHandler, then return the result from the handler
     * @param <T>
     * @param sql
     * @param handler
     * @return
     * @throws DBException
     */
    public <T> T accumulate(String sql, ResultSetHandler<T> handler) throws DBException; 

    /**
     * Performs the update query
     * @param sql the update SQL query
     * @return the number of rows updated
     * @throws DBException 
     */
    public int update(String sql) throws DBException;
    /**
     * Performs the update query
     * @param sql the update SQL query
     * @param autoCommit   true when enable auto commit arounc this update query, false otherwise 
     * @return the number of rows updated
     * @throws DBException
     */
    public int update(String sql, boolean autoCommit) throws DBException;
    
    /**
     * Sets the time of the query until it will be terminated in seconds 
     * @param sec timeout (sec.)
     */
    public void setQueryTimeout(int sec);
    
    /**
     * Enable auto commit mode for all subsequent queries.
     */
    public void enableAutoCommit();
    
    /**
     * Disable auto commit mode for all subsequent queries. 
     */
    public void disableAutoCommit();
	
}
