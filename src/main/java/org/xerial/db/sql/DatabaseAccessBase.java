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
// xerial-storage Project
//
// DatabaseAccessBase.java
// Since: 2007/02/25
//
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import static java.sql.Types.ARRAY;
import static java.sql.Types.BIGINT;
import static java.sql.Types.BINARY;
import static java.sql.Types.BIT;
import static java.sql.Types.BLOB;
import static java.sql.Types.CHAR;
import static java.sql.Types.CLOB;
import static java.sql.Types.DATE;
import static java.sql.Types.DECIMAL;
import static java.sql.Types.DISTINCT;
import static java.sql.Types.DOUBLE;
import static java.sql.Types.FLOAT;
import static java.sql.Types.INTEGER;
import static java.sql.Types.JAVA_OBJECT;
import static java.sql.Types.LONGVARBINARY;
import static java.sql.Types.LONGVARCHAR;
import static java.sql.Types.NULL;
import static java.sql.Types.NUMERIC;
import static java.sql.Types.OTHER;
import static java.sql.Types.REAL;
import static java.sql.Types.REF;
import static java.sql.Types.SMALLINT;
import static java.sql.Types.STRUCT;
import static java.sql.Types.TIME;
import static java.sql.Types.TIMESTAMP;
import static java.sql.Types.TINYINT;
import static java.sql.Types.VARBINARY;
import static java.sql.Types.VARCHAR;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.xerial.db.DBErrorCode;
import org.xerial.db.DBException;
import org.xerial.db.Relation;
import org.xerial.db.datatype.DataType;
import org.xerial.db.datatype.DoubleType;
import org.xerial.db.datatype.IntegerType;
import org.xerial.db.datatype.LongType;
import org.xerial.db.datatype.StringType;
import org.xerial.util.log.Logger;

/**
 * A base implementation of the {@link DatabaseAccess} interface.
 * 
 * @author leo
 * 
 */
public class DatabaseAccessBase implements DatabaseAccess
{

    private ConnectionPool _connectionPool;
    private static Logger _logger = Logger.getLogger(DatabaseAccessBase.class);

    private int queryTimeout = 60;
    private boolean autoCommit = true;

    public DatabaseAccessBase(ConnectionPool connectionPool) throws DBException
    {
        _connectionPool = connectionPool;

        // validate connection
        Connection con = _connectionPool.getConnection();
        _connectionPool.returnConnection(con);
    }

    public void dispose() throws DBException
    {
        _connectionPool.closeAll();
    }

    protected Statement createStatement(Connection connection) throws SQLException
    {
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(queryTimeout);
        return statement;
    }

    /**
     * perforam a given SQL query, then output its results
     * 
     * @param <T>
     *            row type : Bean class type
     * @param sql
     *            sql statement
     * @param resultRowType
     *            it must be equal to the T
     * @param result
     * @throws DBException
     */
    @SuppressWarnings("unchecked")
    public <T> List<T> query(String sql, Class<T> resultRowType) throws DBException
    {
        return queryWithHandler(sql, new BeanReader(resultRowType));
    }

    public <T> void query(String sql, ResultSetHandler<T> pullHandler) throws DBException
    {
        Connection connection = null;
        try
        {
            connection = getConnection(true);
            Statement statement = createStatement(connection);
            _logger.debug(sql);

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next())
            {
                pullHandler.handle(rs);
            }
        }
        catch (SQLException e)
        {
            throw new DBException(DBErrorCode.QueryError, e);
        }
        finally
        {
            if (connection != null)
                _connectionPool.returnConnection(connection);
        }
    }

    public <T> List<T> queryWithHandler(String sql, ResultSetHandler<T> handler) throws DBException
    {
        Connection connection = null;
        ArrayList<T> result = new ArrayList<T>();
        try
        {
            connection = getConnection(true);
            Statement statement = createStatement(connection);
            _logger.debug(sql);

            ResultSet rs = statement.executeQuery(sql);
            while (rs.next())
            {
                T row = handler.handle(rs);
                if (row != null)
                    result.add(row);
                else
                    _logger.warn("null handler result is returned");
            }
        }
        catch (SQLException e)
        {
            throw new DBException(DBErrorCode.QueryError, e);
        }
        finally
        {
            if (connection != null)
                _connectionPool.returnConnection(connection);
        }
        return result;
    }

    /**
     * Accumulate the query result within the ResultSetHandler, then return the
     * result from the handler
     * 
     * @param <T>
     * @param sql
     * @param handler
     * @return
     * @throws DBException
     */
    public <T> T accumulate(String sql, ResultSetHandler<T> handler) throws DBException
    {
        Connection connection = null;
        T result = null;
        try
        {
            connection = getConnection(true);
            Statement statement = createStatement(connection);
            _logger.debug(sql);

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next())
            {
                result = handler.handle(rs);
            }
        }
        catch (SQLException e)
        {
            throw new DBException(DBErrorCode.QueryError, e);
        }
        finally
        {
            if (connection != null)
                _connectionPool.returnConnection(connection);
        }
        return result;
    }

    public int update(String sql) throws DBException
    {
        return update(sql, autoCommit);
    }

    public int update(String sql, boolean autoCommit) throws DBException
    {
        Connection connection = null;
        try
        {
            connection = getConnection(false);
            connection.setAutoCommit(autoCommit);
            Statement statement = createStatement(connection);

            _logger.debug(sql);
            int ret = statement.executeUpdate(sql);
            return ret;
        }
        catch (SQLException e)
        {
            throw new DBException(DBErrorCode.UpdateError, e);
        }
        finally
        {
            if (connection != null)
            {
                _connectionPool.returnConnection(connection);
            }
        }

    }

    public ConnectionPool getConnectionPool()
    {
        return _connectionPool;
    }

    private Connection getConnection(boolean readOnly) throws DBException, SQLException
    {
        Connection conn = _connectionPool.getConnection();
        conn.setAutoCommit(autoCommit);
        conn.setReadOnly(readOnly);
        return conn;
    }

    public void disableAutoCommit()
    {
        this.autoCommit = false;
    }

    public void enableAutoCommit()
    {
        this.autoCommit = true;
    }

    public void setQueryTimeout(int sec)
    {
        this.queryTimeout = sec;
    }

    public Relation getRelation(String tableName) throws DBException
    {
        Relation relation = new Relation();

        Connection connection = null;
        try
        {
            connection = getConnection(true);
            DatabaseMetaData metadata = connection.getMetaData();
            for (ResultSet resultSet = metadata.getColumns(null, null, tableName, null); resultSet.next();)
            {
                String columnName = resultSet.getString("COLUMN_NAME");
                int dataType = resultSet.getInt("DATA_TYPE");

                DataType dt = null;
                switch (dataType)
                {
                case CHAR:
                case VARCHAR:
                case VARBINARY:
                case LONGVARBINARY:
                case LONGVARCHAR:
                case DATE:
                case TIME:
                case TIMESTAMP:
                case OTHER:
                    dt = new StringType(columnName);
                    break;

                case NUMERIC:
                case DOUBLE:
                case FLOAT:
                    dt = new DoubleType(columnName);
                    break;

                case DECIMAL:
                case TINYINT:
                case SMALLINT:
                case INTEGER:
                    dt = new IntegerType(columnName);
                    break;

                case BIGINT:
                    dt = new LongType(columnName);
                    break;

                case DISTINCT:
                case JAVA_OBJECT:
                case NULL:
                case REAL:
                case REF:
                case STRUCT:
                case ARRAY:
                case BINARY:
                case BIT:
                case BLOB:
                case CLOB:
                default:
                    _logger.warn("skipped. unsupported SQL data type: " + resultSet.getString("TYPE_NAME"));
                }

                if (dt != null)
                {
                    dt.setNotNull(!resultSet.getString("IS_NULLABLE").equals("YES"));
                    relation.add(dt);
                }
            }
        }
        catch (SQLException e)
        {
            throw new DBException(DBErrorCode.QueryError, e);
        }
        finally
        {
            if (connection != null)
                _connectionPool.returnConnection(connection);
        }
        return null;
    }

    public List<String> getTableNameList() throws DBException
    {
        ArrayList<String> tableNameList = new ArrayList<String>();

        Connection connection = null;
        try
        {
            connection = getConnection(true);
            DatabaseMetaData metadata = connection.getMetaData();
            for (ResultSet resultSet = metadata.getTables(null, null, "%", null); resultSet.next();)
            {
                tableNameList.add(resultSet.getString("TABLE_NAME"));
            }
        }
        catch (SQLException e)
        {
            throw new DBException(DBErrorCode.QueryError, e);
        }
        finally
        {
            if (connection != null)
                _connectionPool.returnConnection(connection);
        }

        return tableNameList;
    }

    public <T> List<T> singleColumnQuery(String sql, String targetColumn, Class<T> resultColumnType) throws DBException
    {
        return queryWithHandler(sql, new ColumnReader<T>(targetColumn));
    }

}