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
// FileWithBlob.java
// Since: Jul 3, 2008 4:09:39 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.sql;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Blob;

import org.xerial.db.sql.impl.BlobImpl;
import org.xerial.util.log.Logger;

public class FileWithBlob
{
    private static Logger _logger = Logger.getLogger(FileWithBlob.class);

    int id = -1;
    String title;
    long size;
    byte[] fileData = null;

    public FileWithBlob()
    {

    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public long getSize()
    {
        return size;
    }

    public void setSize(long size)
    {
        this.size = size;
    }

    public Blob getFileData()
    {
        return new BlobImpl(fileData);
    }

    public void setFileData(Blob fileData)
    {
        try
        {
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            BufferedInputStream in = new BufferedInputStream(fileData.getBinaryStream());
            byte[] buf = new byte[1024];
            for (int readLength = 0; (readLength = in.read(buf)) >= 0;)
            {
                out.write(buf, 0, readLength);
            }
        }
        catch (Exception e)
        {
            _logger.error(e);
        }
    }

}
