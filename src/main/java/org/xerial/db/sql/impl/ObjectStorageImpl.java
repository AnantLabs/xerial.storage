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
// ObjectStorageImpl.java
// Since: Jun 26, 2008 3:28:06 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.sql.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import org.xerial.db.DBException;
import org.xerial.db.sql.DatabaseAccess;
import org.xerial.db.sql.ObjectStorage;
import org.xerial.db.sql.SQLExpression;

/**
 * An implementation of the {@link ObjectStorage}
 * 
 * @author leo
 * 
 */
public class ObjectStorageImpl implements ObjectStorage
{
    private DatabaseAccess dbAccess;

    private HashSet<String> registeredTableSet = new HashSet<String>();
    private HashMap<Class< ? >, String> tableNameOfEachClass = new HashMap<Class< ? >, String>();

    public ObjectStorageImpl(DatabaseAccess dbAccess)
    {
        this.dbAccess = dbAccess;
    }

    public DatabaseAccess getDatabaseAccess()
    {
        return dbAccess;
    }

    public <T> T create(T object) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T> T get(Class<T> classType, int id) throws DBException
    {
        throw new UnsupportedOperationException();

    }

    public <T> T get(Class<T> classType, String sql) throws DBException
    {
        throw new UnsupportedOperationException();

    }

    public <T, U> List<U> getAll(T startPoint, Class<U> associatedType) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T, U> List<U> getAll(T startPoint, Class<U> associatedType, String additionlWhereClauseCondition)
            throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T, U> List<U> getAll(Class<T> startPointClass, int idOfT, Class<U> associtedType) throws DBException
    {
        throw new UnsupportedOperationException();

    }

    public <T, U> List<U> getAll(Class<T> startPointClass, int idOfT, Class<U> associtedType,
            String additionalWhereCondition) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T> List<T> getAll(Class<T> classType) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T> List<T> getAll(Class<T> classType, String sql) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T, U> U getOne(T startPoint, Class<U> associatedType) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T, U> U getOne(T startPoint, Class<U> associatedType, int idOfU) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T, U> U getOne(Class<T> startPointClass, int idOfT, Class<U> associatedType) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T, U> U getOne(Class<T> startPointClass, int idOfT, Class<U> associatedType, int idOfU) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T, U> T getParent(U child) throws DBException
    {
        throw new UnsupportedOperationException();
    }

    public <T, U> T getParent(Class<U> childClass, int idOfU) throws DBException
    {

        throw new UnsupportedOperationException();
    }

    public <S, T, U> List<S> join(Class<T> left, Class<U> right, Class<S> targetType) throws DBException
    {
        throw new UnsupportedOperationException();

    }

    public <T, U> void oneToMany(Class<T> from, Class<U> to) throws DBException
    {
        throw new UnsupportedOperationException();
        // TODO Auto-generated method stub

    }

    public <T, U> void oneToOne(Class<T> from, Class<U> to) throws DBException
    {
        throw new UnsupportedOperationException();
        // TODO Auto-generated method stub

    }

    public <T> void regist(String tableName, Class<T> classType) throws DBException
    {
        if (registeredTableSet.contains(tableName))
            return; // already registered

        if (!dbAccess.hasTable(tableName))
        {
            // No corresponding table is found, so create a new table
            String schema = createTableSchema(classType);
            String sql = SQLExpression.fillTemplate("create table $1 ($2)", tableName, schema);
            dbAccess.update(sql);
        }

        // TODO It it needed to test duplicate entries?
        tableNameOfEachClass.put(classType, tableName);
        registeredTableSet.add(tableName);
        return;
    }

    public static <T> String createTableSchema(Class<T> classType)
    {

        return null;
    }

    public <T> void regist(Class<T> classType) throws DBException
    {
        String tableName = classType.getName().toLowerCase();
        regist(tableName, classType);
    }

    public <T> void save(T object) throws DBException
    {
        throw new UnsupportedOperationException();
        // TODO Auto-generated method stub

    }

    public <T> void saveAll(Class<T> classType, Collection<T> object) throws DBException
    {
        throw new UnsupportedOperationException();
        // TODO Auto-generated method stub

    }
}
