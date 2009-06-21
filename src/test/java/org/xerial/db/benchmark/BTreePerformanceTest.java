/*--------------------------------------------------------------------------
 *  Copyright 2008 Taro L. Saito
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
// BTreePerformanceTest.java
// Since: Jun 21, 2009 6:09:11 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.benchmark;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.xerial.util.StopWatch;
import org.xerial.util.log.Logger;

public class BTreePerformanceTest
{
    private static Logger _logger = Logger.getLogger(BTreePerformanceTest.class);
    final static int N = 10000;

    private ArrayList<Integer> idList = new ArrayList<Integer>(N);

    @Before
    public void setUp() throws Exception
    {
        Class.forName("org.sqlite.JDBC");
    }

    @After
    public void tearDown() throws Exception
    {}

    @Test
    public void btreeInsert() throws Exception
    {
        System.out.println("drive\top\tN\ttime");
        for (int i = 0; i < N; ++i)
        {
            idList.add(i);
        }
        Collections.shuffle(idList);

        final int repeat = 5;
        for (int i = 0; i < repeat; ++i)
            insertTest("Intel", new File("P:"));
        for (int i = 0; i < repeat; ++i)
            insertTest("Buffalo", new File("Q:"));
        for (int i = 0; i < repeat; ++i)
            insertTest("HDD", new File("F:"));

    }

    public void insertTest(String name, File folder) throws Exception
    {

        StopWatch timer = new StopWatch();

        File tmpFolder = new File(folder, "sqlite");
        tmpFolder.mkdirs();

        File tmpFile = File.createTempFile("tmp", ".sqlite", tmpFolder);
        try
        {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:" + tmpFile.getAbsolutePath());
            Statement stat = conn.createStatement();
            stat.execute("pragma synchronous=off");
            stat.executeUpdate("create table A (id integer primary key, data text)");
            timer.reset();

            stat.execute("begin transaction");

            for (int i = 0; i < N; ++i)
            {
                int id = idList.get(i);
                stat.executeUpdate(String.format(
                        "insert into A(id, data) values(%d,'hello world. nice to meet you. My name is leo')", id));
            }

            stat.execute("commit");
            double time = timer.getElapsedTime();

            System.out.println(String.format("%s\tinsert\t%10d\t%4.2f", name, N, time));
            stat.close();
            conn.close();
        }
        finally
        {
            tmpFile.delete();
        }

    }
}
