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
// IntegerType.java
// Since: 2007/04/13
//
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.datatype;


import org.xerial.db.ValueDomain;




public class IntegerType extends DataTypeBase 
{
	private ValueDomain _valueDomain = null;

	public IntegerType(String name) {
		super(name);
	}
	public IntegerType(String name, ValueDomain valueDomain)
	{
		super(name);
		_valueDomain = valueDomain;
	}
	
	public IntegerType(String name, boolean isPrimaryKey, boolean isNotNull)
	{
		super(name, isPrimaryKey, isNotNull);
	}


	public String getTypeName() {
		return "integer";
	}

	public static int parseInt(String value)
	{
	    return Integer.parseInt(value);
	}



}




