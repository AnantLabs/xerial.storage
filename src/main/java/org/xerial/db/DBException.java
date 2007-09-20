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
	private final ErrorCode errorCode;

	public DBException(ErrorCode errorCode) {
		super();
		this.errorCode = errorCode;
	}


	public DBException(ErrorCode errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public DBException(ErrorCode errorCode, Throwable e) {
		super(e);
		this.errorCode = errorCode;
	}
	
	public DBException(ErrorCode errorCode, String message, Throwable e)
	{
		super(message, e);
		this.errorCode = errorCode;
	}


    @Override
    public String getMessage()
    {
        return "[" + errorCode.name() + "] " + super.getMessage();
    }


}

