//--------------------------------------
// Aqua Project
//
// DBException.java
// Since: 2007/02/25
//
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db;

import org.xerial.core.XerialException;


/**
 * An exception base class related to the database package
 * @author leo
 *
 */
public class DBException extends XerialException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final DBErrorCode errorCode;

	public DBException(DBErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}


	public DBException(DBErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public DBException(DBErrorCode errorCode, Throwable e) {
		super(e);
		this.errorCode = errorCode;
	}
	
	public DBException(DBErrorCode errorCode, String message, Throwable e)
	{
		super(message, e);
		this.errorCode = errorCode;
	}


}

