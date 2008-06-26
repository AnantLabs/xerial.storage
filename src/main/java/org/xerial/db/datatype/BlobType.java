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
// BlobType.java
// Since: Jun 26, 2008 4:23:27 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.datatype;

/**
 * Binary Large Object (BLOB) Type
 * 
 * @author leo
 * 
 */
public class BlobType extends DataTypeBase
{
    public BlobType(String name)
    {
        super(name);
    }

    public String getTypeName()
    {
        return "blob";
    }

}
