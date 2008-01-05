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
// RelationBuilder.java
// Since: Apr 18, 2007
//
// $Date$
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.xerial.db.Relation;
import org.xerial.db.datatype.BooleanType;
import org.xerial.db.datatype.DataType;
import org.xerial.db.datatype.DoubleType;
import org.xerial.db.datatype.IntegerType;
import org.xerial.db.datatype.StringListType;
import org.xerial.db.datatype.StringType;
import org.xerial.json.JSONArray;
import org.xerial.json.JSONErrorCode;
import org.xerial.json.JSONException;
import org.xerial.json.JSONObject;
import org.xerial.util.bean.BeanBinder;
import org.xerial.util.bean.BeanBinderSet;
import org.xerial.util.bean.BeanErrorCode;
import org.xerial.util.bean.BeanException;
import org.xerial.util.bean.BeanUtil;

/**
 * RelationBuilder creates a Relation instance from a JSON string or a Bean class.
 * 
 * JSON format example. 
 * <code>
 * {"relation":[["id", "integer"], ["name", "string"], ...]}
 * </code>
 * @author leo
 *
 */
public class RelationBuilder {

	
	public static List<String> extractBeanParameterList(Class beanClass) throws BeanException
	{
		ArrayList<String> parameterList = new ArrayList<String>();

		BeanBinderSet outputRuleSet = BeanUtil.getBeanOutputRule(beanClass);
		for(BeanBinder rule : outputRuleSet.getBindRules())
		{
			String parameterName = rule.getParameterName();
			parameterList.add(parameterName);
		}
		return parameterList;
	}
	
	
	public static JSONObject toJSON(Relation r)
	{
		JSONObject obj = new JSONObject();
		JSONArray dataTypeList = new JSONArray();
		for(Iterator it = r.getDataTypeList().iterator(); it.hasNext(); )
		{
			DataType dt = (DataType) it.next();
			JSONArray dataTypePair = new JSONArray();
			dataTypePair.add(dt.getName());
			dataTypePair.add(dt.getTypeName());
			dataTypeList.add(dataTypePair);
		}
		obj.put("relation", dataTypeList);
		return obj;
	}
	
	
	public static Relation createRelation(String jsonString) throws JSONException
	{
		Relation r = new Relation();
		JSONObject json = new JSONObject(jsonString);

		JSONArray dataTypeList;
		dataTypeList = json.getJSONArray("relation");
		if(dataTypeList == null)
			throw new JSONException(JSONErrorCode.InvalidJSONData, "no relation is found");
		for(int i=0; i<dataTypeList.size(); i++)
		{
			try {
				JSONArray dataType = dataTypeList.getJSONArray(i);
				if(dataType.size() != 2)
					throw new JSONException(JSONErrorCode.InvalidJSONData);
				
				String parameterName = dataType.get(0).toString();
				String typeName = dataType.get(1).toString();

				DataType dt = Relation.getDataType(parameterName, typeName);
				r.add(dt);
			} 
			catch (JSONException e) {
				throw new JSONException(JSONErrorCode.InvalidJSONData, dataTypeList.toString() + " does not contain a pair of [param_name, data_type_str]");
			}
								
		}

		return r;
	}
	
	
	public static Relation createRelation(Class beanClass) throws BeanException
	{
		return new BeanToRelationProcess().createRelation(beanClass);
	}
	
	private static class BeanToRelationProcess
	{
		private Relation _relation = new Relation();
		public BeanToRelationProcess() {}
		
		@SuppressWarnings("unchecked")
		public Relation createRelation(Class beanClass) throws BeanException
		{
			if(beanClass == null)
				return _relation;

			BeanBinderSet outputRuleSet = BeanUtil.getBeanOutputRule(beanClass);
			for(BeanBinder rule : outputRuleSet.getBindRules())
			{
				Method getter = rule.getMethod();
				String p = rule.getParameterName();
				
				Class returnType = getter.getReturnType();
				if(returnType.isArray())
				{
					returnType = returnType.getComponentType();
					if(returnType.isAssignableFrom(String.class))
						_relation.add(new StringListType(p));
					else 
						throw new BeanException(BeanErrorCode.UnsupportedDataType, "array type of " + returnType.toString() + " is not supported");
				}
				else {
					if(returnType.isAssignableFrom(Integer.class) || returnType.isAssignableFrom(int.class))
						_relation.add(new IntegerType(p));
					else if(returnType.isAssignableFrom(Double.class) || returnType.isAssignableFrom(double.class))
						_relation.add(new DoubleType(p));
					else if(returnType.isAssignableFrom(String.class))
						_relation.add(new StringType(p));
					else if(returnType.isAssignableFrom(Boolean.class) || returnType.isAssignableFrom(boolean.class))
						_relation.add(new BooleanType(p));
					else
						throw new BeanException(BeanErrorCode.UnsupportedDataType, returnType.toString() + " is not supported");
				}				
				
				
			}
			return _relation;
			
		}
		
	}
	

}




