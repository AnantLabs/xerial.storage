//--------------------------------------
// UTGB Common Project
//
// RelationBuilderTest.java
// Since: Apr 18, 2007
//
// $Date$
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.xerial.db.Relation;
import org.xerial.json.JSONException;
import org.xerial.util.bean.BeanException;


class Sample
{
	int id;
	String name;
	boolean check;
	
	public Sample() {}

	public boolean getCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}


public class RelationBuilderTest {
	
	@Test 
	public void createRelation() throws BeanException, JSONException 
	{
		Relation r1;
		r1 = RelationBuilder.createRelation(Sample.class);
		String json = RelationBuilder.toJSON(r1).toString();
		Relation r2 = RelationBuilder.createRelation(json);
		assertEquals(r1.getDataTypeList().size(), r2.getDataTypeList().size());
	}
}




