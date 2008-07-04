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
// QueryParam.java
// Since: Jul 4, 2008 10:14:32 AM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.sql;

/**
 * Tuning parameters (where, order by, offset clauses) for a query
 * 
 * @author leo
 * 
 */
public class QueryParam
{
    public String whereCondition = null;
    public String orderByColumns = null;
    public String offset = null;

    public QueryParam()
    {

    }

    public QueryParam setWhereCondition(String whereClause)
    {
        this.whereCondition = whereClause;
        return this;
    }

    public QueryParam setOrderByColumns(String orderByColumns)
    {
        this.orderByColumns = orderByColumns;
        return this;
    }

    /**
     * @param page
     *            page size of 0-origin
     * @param pageSize
     *            the number of entries in the page
     * @return
     */
    public QueryParam setPagenation(int page, int pageSize)
    {
        if (page < 0)
            page = 0;
        if (pageSize <= 0)
            pageSize = 1;

        offset = String.format("limit %d offset %d", pageSize, page * pageSize);

        return this;
    }

    public String toSQLFragment()
    {
        StringBuilder buf = new StringBuilder();
        if (whereCondition != null)
            buf.append(String.format("where %s ", whereCondition));
        if (orderByColumns != null)
            buf.append(String.format("order by %s ", orderByColumns));
        if (offset != null)
            buf.append(offset);
        return buf.toString();
    }

}
