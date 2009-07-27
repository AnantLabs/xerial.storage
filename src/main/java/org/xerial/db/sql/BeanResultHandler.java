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
// BeanResultHandler.java
// Since: Jan 17, 2008 7:21:27 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BeanResultHandler<T>
{

    private Class<T> beanClass;
    private BeanProcessor beanProcessor = new BeanProcessor();

    protected BeanResultHandler(Class<T> beanClass)
    {
        this.beanClass = beanClass;
    }

    public void init()
    {
    // do nothing in default 
    }

    public abstract void handle(T bean) throws SQLException;

    public T toBean(ResultSet resultSet) throws SQLException
    {
        return beanClass.cast(beanProcessor.toBean(resultSet, beanClass));
    }

    public Class<T> getClassType()
    {
        return beanClass;
    }

    public void finish()
    {
    // do nothing in default
    }

}
