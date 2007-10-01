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
// HeapPage.java
// Since: Aug 31, 2007 1:19:43 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.db.heap;

import java.util.ArrayList;
import java.util.Collections;

import org.xerial.db.CommonPageHeader;
import org.xerial.db.DBException;
import org.xerial.db.ErrorCode;
import org.xerial.db.PageType;
import org.xerial.db.Tuple;
import org.xerial.db.TupleComparator;
import org.xerial.db.TupleFactory;
import org.xerial.db.cache.Buffer;
import org.xerial.db.cache.BufferReader;
import org.xerial.db.cache.BufferWriter;


/**
 * Heap pages support sequential data appends to the database.
 * 
 * 
 * Page Layout:
 * <pre>
 * ----------------------
 * |CommonPageHeader 
 * |numEntries       
 * |entrySizeTotal
 * | (entries: ([entry size:VariableLengthInteger, entry data ...]) )
 * |  ....
 * | 
 * ----------------------
 * </pre>
 * @author leo
 *
 */
public class HeapPage 
{
    // header contents 
    private final CommonPageHeader header = new CommonPageHeader();
    private int numEntries = 0;     // the number of entries in this heap page
    private int entrySizeTotal = 0;

    
    private final int bufferSize;
    private int freeSpaceSize;    // free space for entries and entry pointers 
    private final ArrayList<Tuple> tupleList = new ArrayList<Tuple>();
    

    
    public HeapPage(int bufferSize, TupleFactory tupleFactory)
    {
        this.bufferSize = bufferSize;
        this.freeSpaceSize = bufferSize - getHeaderSize(); 
    }
    
    public int getHeaderSize()
    {
        return header.getHeaderSize() + Buffer.LONG_SIZE + Buffer.INT_SIZE * 2;        
    }
    
        
    public void append(Tuple tuple) throws DBException
    {
        int tupleSize = tuple.getByteSize();
        int requiredByteSizeForTheTuple = (tupleSize + Buffer.INT_SIZE); // tuple size + pointer size
        if(freeSpaceSize < requiredByteSizeForTheTuple)
        {
            throw new DBException(ErrorCode.PageIsFull, "no enough space");
        }
        tupleList.add(tuple);
        numEntries++;
        freeSpaceSize -= requiredByteSizeForTheTuple;
    }
    
    public void sortTuples(TupleComparator comparator)
    {
        Collections.sort(tupleList, comparator);
    }
    
    public void loadFrom(final Buffer pageBuffer, final TupleFactory tupleFactory) throws DBException
    {
        assert(pageBuffer.size() == bufferSize);

        tupleList.clear();
        
        BufferReader reader = new BufferReader(pageBuffer);
        
        // load the header
        header.load(reader);
        numEntries = reader.readInt();
        entrySizeTotal = reader.readInt();
        
        
        // load tuples
        for(int i=0; i<numEntries; i++)
        {
            Tuple tuple = tupleFactory.createTupleFromBuffer(reader);
            tupleList.add(tuple);
        }

        // validation
        if(header.getPageType() != PageType.Heap)
            throw new DBException(ErrorCode.InvalidPageHeader, "not the heap page type: " + header.getPageType());
        
    }
    
    /**
     * Marshaling the heap contents, and write them to the page buffer
     * @param pageBuffer
     */
    public void saveTo(final Buffer pageBuffer)
    {
        assert(pageBuffer.size() == bufferSize);
        
        BufferWriter writer = new BufferWriter(pageBuffer);
        
        // write out the header
        header.save(writer);
        writer.writeInt(numEntries);
        writer.writeInt(entrySizeTotal);
        
        int pointerDataAddress = bufferSize - Buffer.INT_SIZE;
        // write out tuples
        for(Tuple t : tupleList)
        {
            int pointerToTuple = writer.getCursorPosition();
            t.save(writer);
            pageBuffer.writeInt(pointerDataAddress, pointerToTuple);
            pointerDataAddress -= Buffer.INT_SIZE;
        }
        
    }
    
}




