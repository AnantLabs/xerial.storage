//--------------------------------------
// XerialJ Project
//
// SQLExpression.java
// Since: May 8, 2007
//
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.xerial.db.DBException;
import org.xerial.db.ErrorCode;



/**
 * SQLExpression is a template that has several variables $1, $2, ... etc.
 * A user can assign arbitrary values into an SQLExpression.
 * 
 * 
 * <pre>
 * String assignedSQL = SQLExpression.assignTo("select * from $1", "t1");
 * // assignedSQL will be "select * from t1"
 * </pre>
 * @author leo
 *
 */
public class SQLExpression
{
    private String _sqlExpr;
    
    /**
     * 
     * @param sql sql expression template
     */
    public SQLExpression(String sql)
    {
        _sqlExpr = sql;
    }
    
    /**
     * assign values given as arguments to variables $1, $2, ... 
     * @param arguments string values to replace variables
     * @return  an SQL expression in which variables $1, $2, ... are replaced with arguments
     * @throws DBException 
     */
    public String assign(Object... arguments) throws DBException
    {
        String assignedSQL = _sqlExpr;
        for(int i=0; i<arguments.length; i++)
        {
            String pattern = "\\$" + (i+1);
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(assignedSQL);
            if(!m.find())
            	continue;
            
            int start = m.start();
            int end = m.end();
            
            Quote quoteType = withinWhatTypeOfQuote(assignedSQL, start, end);
            if(quoteType == Quote.INVALID)
            	throw new DBException(ErrorCode.InvalidSQLExpression, "invalid quotation around $" + (i+1) + " in " + assignedSQL);
            
            String replacement = sanitize(arguments[i] != null ? arguments[i].toString() : "", quoteType);
            assignedSQL = assignedSQL.replaceAll(pattern, replacement);
        }
        return assignedSQL;
    }
    
    private Quote withinWhatTypeOfQuote(String sql, int targetBegin, int targetEnd)
    {
        LinkedList<Quote> quoteStack = new LinkedList<Quote>();
        quoteStack.push(Quote.NONE);
    	for(int i = 0; i<targetBegin; i++)
    	{
    	    if(quoteStack.isEmpty())
    	        return Quote.INVALID;
    		
    	    if(sql.charAt(i) == '\'')
    		{
    		    if(quoteStack.getLast() == Quote.SINGLE_QUOTE)
    		        quoteStack.removeLast();
    		    else
    		        quoteStack.addLast(Quote.SINGLE_QUOTE);
    		}
    		else if(sql.charAt(i) == '"')
    		{
    			if(quoteStack.getLast() == Quote.DOUBLE_QUOTE)
    			    quoteStack.removeLast();
    			else
    			    quoteStack.addLast(Quote.DOUBLE_QUOTE);
    		}
    	}
    	Quote forwardQuote = quoteStack.getLast();
    	
    	LinkedList<Quote> quoteStack2 = new LinkedList<Quote>();
    	quoteStack2.push(Quote.NONE);
    	for(int i=sql.length()-1; i>targetEnd; i--)
    	{
            if(quoteStack2.isEmpty())
                return Quote.INVALID;
            
            if(sql.charAt(i) == '\'')
            {
                if(quoteStack2.getLast() == Quote.SINGLE_QUOTE)
                    quoteStack2.removeLast();
                else
                    quoteStack2.addLast(Quote.SINGLE_QUOTE);
            }
            else if(sql.charAt(i) == '"')
            {
                if(quoteStack2.getLast() == Quote.DOUBLE_QUOTE)
                    quoteStack2.removeLast();
                else
                    quoteStack2.addLast(Quote.DOUBLE_QUOTE);
            }
    	}
    	Quote backwardQuote = quoteStack.getLast();
    	
    	if(forwardQuote == backwardQuote)
    	{
    	    return forwardQuote;
    	}
    	else
    	    return Quote.INVALID;
    }
    
    public enum Quote { SINGLE_QUOTE, DOUBLE_QUOTE, NONE, INVALID}
    
    /**
     * unquote the input value and remove any maricious statement  
     * to avoid SQL injection.
     * 
     * @param input
     * @param contextQuotation quotation type where input string is contained. 
     * @return 
     * @throws DBException when the input value has invalid quotation
     */
    public static String sanitize(String input, Quote contextQuotation) throws DBException
    {
    	LinkedList<Quote> arrayDeque = new LinkedList<Quote>();
    	arrayDeque.addLast(contextQuotation);
    	    
    	int cursor = 0;
    	while(cursor < input.length())
    	{
    	    if(arrayDeque.isEmpty())
    	        throw new DBException(ErrorCode.InvalidSQLExpression, "get out from the context of " + contextQuotation.name() + ": " + input);
    	        
    		if(input.charAt(cursor) == '\'')
    		{
    		    if(arrayDeque.getLast() == Quote.SINGLE_QUOTE)
    		        arrayDeque.removeLast();
    		    else
    		        arrayDeque.addLast(Quote.SINGLE_QUOTE);
    		}
    		else if(input.charAt(cursor) == '"')
    		{
    		    if(arrayDeque.getLast() == Quote.DOUBLE_QUOTE)
    		        arrayDeque.removeLast();
    		    else
    		        arrayDeque.addLast(Quote.DOUBLE_QUOTE);
    		}
    		cursor++;
    	}
        
    	arrayDeque.addLast(contextQuotation);
    	
    	assert(contextQuotation != Quote.INVALID);

    	
    	// consume corresponding quotes
    	Quote currentContextQuotation = contextQuotation;
    	while(!arrayDeque.isEmpty())
    	{
    		if(arrayDeque.getFirst() == arrayDeque.getLast())
    		{
    			currentContextQuotation = arrayDeque.getFirst();

    			arrayDeque.removeFirst();
                arrayDeque.removeLast();
                
    			if(currentContextQuotation == Quote.DOUBLE_QUOTE)
    			{
    			    while(!arrayDeque.isEmpty() && arrayDeque.getFirst() == Quote.SINGLE_QUOTE)
    			        arrayDeque.removeFirst();
    			}
    			else if(currentContextQuotation == Quote.SINGLE_QUOTE)
    			{
                    while(!arrayDeque.isEmpty() && arrayDeque.getFirst() == Quote.DOUBLE_QUOTE)
                        arrayDeque.removeFirst();
    			}
    		}
    		else
    		{
        		throw new DBException(ErrorCode.InvalidSQLExpression, "paren does not match: " + input);
    		}
    	}
    	
		return input;
    }
    
    
    
    
    /**
     * assign values to the given SQL template
     * @param sqlTemplate SQL expression
     * @param arguments assign values
     * @return sql expression in which variables are replaced with values
     * @throws DBException when input values have invalid quotations
     */
    public static String fillTemplate(String sqlTemplate, Object... arguments) throws DBException
    {
        return new SQLExpression(sqlTemplate).assign(arguments);
    }

}

