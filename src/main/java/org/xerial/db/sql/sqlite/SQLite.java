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
    private static boolean extracted = false;

    static
    {
        setSQLiteNativeLibraryPath();
    }
    
    static boolean extractLibraryFile(String libraryName, String outputFileName)
    {
        File libFile = new File(outputFileName);

        try
        {
            // extract file into the current directory
            InputStream reader = SQLite.class.getResourceAsStream(libraryName);
            FileOutputStream writer = new FileOutputStream(libFile);
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = reader.read(buffer)) != -1)
            {
                writer.write(buffer, 0, bytesRead);
            }
            
            writer.close();
            reader.close();
            
            if(!System.getProperty("os.name").contains("Windows"))
            {
                try {
                    Runtime.getRuntime ().exec (new String []{"chmod", "755", outputFileName}).waitFor(); 
                } catch (Throwable e) {}
            }
            
            return setNativeLibraryPath(null, outputFileName);
        }
        catch (IOException e)
        {
            _logger.error(e);
            return false;
        }

    }

    static boolean setNativeLibraryPath(String path, String name)
    {
        File libPath = new File(path, name);
        if(libPath.exists())
        {
            System.setProperty("org.sqlite.lib.path", path == null ? "./" : path);
            System.setProperty("org.sqlite.lib.name", name);
            return true;
        }
        else
            return false;
    }

    static void setSQLiteNativeLibraryPath()
    {
        if (extracted)
            return;

        // Try loading library from org.sqlite.lib.path library path */
        String sqliteNativeLibraryPath = System.getProperty("org.sqlite.lib.path");
        String sqliteNativeLibraryName = System.getProperty("org.sqlite.lib.name");
        if (sqliteNativeLibraryName == null)
            sqliteNativeLibraryName = System.mapLibraryName("sqlitejdbc");

        if (setNativeLibraryPath(sqliteNativeLibraryPath, sqliteNativeLibraryName))
        {
            extracted = true;
            return;
        }

        // Load the os-dependent library from a jar file
        String osName = System.getProperty("os.name");
        if (osName.contains("Windows"))
        {
            sqliteNativeLibraryPath = "/sqlite/win32";
        }
        else if (osName.contains("Mac"))
        {
            sqliteNativeLibraryPath = "/sqlite/mac";
        }
        /*
         * else if (osName.contains("Linux")) { sqliteNativeLibraryPath =
         * "/sqlite/linux"; }
         */
        else
            throw new UnsupportedOperationException("unsupported OS for SQLite-JDBC driver: " + osName);

        /* Try extracting and loading library from jar */
        if (extractLibraryFile(sqliteNativeLibraryPath + "/" + sqliteNativeLibraryName,
                sqliteNativeLibraryName))
        {
            extracted = true;
            return;
        }

        extracted = false;
        return;
    }

    // non constractable
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
