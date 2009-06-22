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
// StorageBenchTest.java
// Since: Jun 21, 2009 2:59:17 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.benchmark;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StorageBenchTest
{

    @Before
    public void setUp() throws Exception
    {}

    @After
    public void tearDown() throws Exception
    {}

    @Test
    public void testPerf() throws Exception
    {
        StorageBench.Config config = new StorageBench.Config();
        config.directory = "F:";
        StorageBench bench = new StorageBench(config);
        bench.run();
    }

}