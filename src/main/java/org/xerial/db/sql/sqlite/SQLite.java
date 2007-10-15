//--------------------------------------
// XerialJ Project
//
// SQLite.java
// Since: 2007/05/10
//
// $Date$
// $URL$ 
// $Author$
//--------------------------------------
package org.xerial.db.sql.sqlite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;

import org.xerial.db.datatype.BooleanType;
import org.xerial.db.datatype.DataType;
import org.xerial.db.datatype.DoubleType;
import org.xerial.db.datatype.IntegerType;
import org.xerial.db.datatype.PasswordType;
import org.xerial.db.datatype.StringType;
import org.xerial.db.datatype.TextType;
import org.xerial.util.log.Logger;

/**
 * This SQLite class holds information related to sqlite3
 * 
 * @author leo
 * 
 */
public class SQLite
{
    private static Logger _logger = Logger.getLogger(SQLite.class);

    static
    {
        initialize();
    }
    
    public static void initialize()
    {
        SQLiteJDBCLoader.setSQLiteNativeLibraryPath();
    }
    
    private SQLite()
    {}

    public static final String driverName = "org.sqlite.JDBC";
    private static final String dbFilePrefix = "jdbc:sqlite:";
    private static final String memoryDatabase = dbFilePrefix + ":memory:";

    public static String getDatabaseAddress(String filePath)
    {
        File file = new File(filePath);
        String fileFullPath = file.toURI().getPath();

        /**
         * change the drive letter C:/... into c:/... since the SQLite JDBC
         * driver does not recognize capital large drive letters.
         */
        int driveLetterSeparatorPos = fileFullPath.indexOf(":");
        if (driveLetterSeparatorPos > 0)
            fileFullPath = fileFullPath.substring(0, driveLetterSeparatorPos).toLowerCase()
                    + fileFullPath.substring(driveLetterSeparatorPos);
        if (!fileFullPath.startsWith("/"))
            fileFullPath = "/" + fileFullPath;
        return dbFilePrefix + fileFullPath;
    }

    public static String getMemoryDatabaseAddress()
    {
        return memoryDatabase;
    }

    public static String getDataTypeName(DataType dataType)
    {
        if (dataType instanceof IntegerType)
            return "integer";
        else if (dataType instanceof StringType || dataType instanceof TextType || dataType instanceof PasswordType)
            return "string";
        else if (dataType instanceof DoubleType)
            return "double";
        else if (dataType instanceof BooleanType)
            return "boolean";
        else
            return "string";
    }

}
