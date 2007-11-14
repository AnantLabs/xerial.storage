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
// BenchmarkTableGenerator.java
// Since: Nov 13, 2007 8:17:41 PM
//
// $URL$
// $Author$
//--------------------------------------
package org.xerial.benchmark;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.Random;

import org.xerial.util.cui.OptionHandler;
import org.xerial.util.cui.OptionParser;
import org.xerial.util.cui.OptionParserException;
import org.xerial.util.xml.InvalidXMLException;
import org.xerial.util.xml.XMLAttribute;
import org.xerial.util.xml.XMLGenerator;

import com.sun.xml.internal.bind.v2.runtime.output.XmlOutput;

/**
 * Generates Benchmark Tables
 * 
 * @author leo
 * 
 */
public class BenchmarkTableGenerator
{
    private static enum Mode {
        SIMPLE, HIERARCHICAL, RANDOM
    }

    
    private int fanout = 2;
    private int numColumn = 4;
    private double factor = 0.1; // factor * 1,000 rows will be generated
    private Mode mode = Mode.SIMPLE;

    private Writer out = new OutputStreamWriter(System.out);

    private static enum Opt {
        HELP, FANOUT, COLUMN, SCALABILITY_FACTOR, MODE, OUTPUT
    }
    
    private boolean isReady = true;
    
    private OptionParser<Opt> optionParser;

    public BenchmarkTableGenerator(String[] args) throws OptionParserException
    {
        optionParser = new OptionParser<Opt>();
        optionParser.addOption(Opt.HELP, "h", "help", "display help messsage", new OptionHandler<Opt>(){
            public void handle(OptionParser<Opt> parser) throws OptionParserException
            {
                System.out.println(optionParser.helpMessage());
                isReady = false;
            }});
        optionParser.addOptionWithArgument(Opt.FANOUT, "f", "fanout", "FANOUT", "set fanout. default = 5",
                new OptionHandler<Opt>() {
                    public void handle(OptionParser<Opt> parser) throws OptionParserException
                    {
                        fanout = parser.getIntValue(Opt.FANOUT);
                    }
                });
        optionParser.addOptionWithArgument(Opt.COLUMN, "c", "column", "NUM", "set table column size. default = 3",
                new OptionHandler<Opt>() {
                    public void handle(OptionParser<Opt> parser) throws OptionParserException
                    {
                        numColumn = parser.getIntValue(Opt.COLUMN) + 1;
                    }
                });
        optionParser.addOptionWithArgument(Opt.SCALABILITY_FACTOR, "s", "scalability", "FACTOR",
                "scalability factor. default = 1.0", new OptionHandler<Opt>() {
                    public void handle(OptionParser<Opt> parser) throws OptionParserException
                    {
                        factor = parser.getDoubleValue(Opt.SCALABILITY_FACTOR);
                    }
                });

        optionParser.addOptionWithArgument(Opt.MODE, "m", "mode", "MODE", "0: simple, 1: hierarchical, 2: random",
                new OptionHandler<Opt>() {
                    public void handle(OptionParser<Opt> parser) throws OptionParserException
                    {
                        int value = parser.getIntValue(Opt.MODE);
                        switch(value)
                        {
                        case 0:
                            mode = Mode.SIMPLE;
                            break;
                        case 1:
                            mode = Mode.HIERARCHICAL;
                            break;
                        case 2:
                            mode = Mode.RANDOM;
                            break;
                        default:
                            throw new OptionParserException("Unknown mode: " + value);    
                        }
                    }
                });
        optionParser.addOptionWithArgument(Opt.OUTPUT, "o", "output", "FILE", "output file name", new OptionHandler<Opt>(){
            public void handle(OptionParser<Opt> parser) throws OptionParserException
            {
                String fileName = parser.getValue(Opt.OUTPUT);
                try
                {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
                    out = writer;
                }
                catch (IOException e)
                {
                    throw new OptionParserException(e);
                }
            }});
        

        optionParser.parse(args);
        
        
    }

    private String[] colName; 
    
    public void generate() throws InvalidXMLException, IOException
    {
        colName = new String[numColumn+1];
        colName[0] = "item";
        for(int i=1; i<colName.length; i++)
        {
            char c = (char) ('a' + i - 1);
            colName[i] = String.valueOf(c);
        }
        
        XMLGenerator xmlOut = new XMLGenerator(out);
        xmlOut.startTag("table");

        int numRow = (int) (factor * 1000);
        switch(mode)
        {
        case SIMPLE:
            Simple s = new Simple(numRow, xmlOut);
            s.generate();
            break;
        case HIERARCHICAL:
            Hierarchical h = new Hierarchical(numRow, xmlOut);
            h.generate();
            break;
        case RANDOM:
            RandomGen r = new RandomGen(numRow, xmlOut);
            r.generate();
            break;
        }
        xmlOut.endTag();
        xmlOut.endDocument();
        xmlOut.flush();
        out.close();
    }
    
    
    
    public String getColName(int colIndex)
    {
        return colName[colIndex];
    }
    
    public class Hierarchical
    {
        int numRow;
        XMLGenerator xmlOut;

        public Hierarchical(int numRow, XMLGenerator xmlOut) throws InvalidXMLException
        {
            this.numRow = numRow;
            this.xmlOut = xmlOut;

            int treeSize = (int) (Math.pow((double) fanout, (double) numColumn));
            int numTree = numRow / treeSize + (numRow % treeSize == 0 ? 0 : 1);
        }
        
        public void generate() throws InvalidXMLException
        {
            int offset = 0;
            while(numRow > 0)
            {
                process(0, offset++);
            }
        }
        
        private void process(int col, int offset) throws InvalidXMLException
        {
            if(col >= numColumn)
            {
                xmlOut.flush();
                numRow--;
                return;
            }
            
            if(numRow <= 0)
                return;
            
            int numChildren = (col == 0) ? 1 : fanout;
            for(int f=0; f<numChildren; f++)
            {
                xmlOut.startTag(getColName(col), new XMLAttribute("value", f+1+offset));
                process(col + 1, 0);
                xmlOut.endTag();
            }

        }
    }

    public class RandomGen
    {
        int numRow;
        XMLGenerator xmlOut;
        Random r = new Random(1);
        
        public RandomGen(int numRow, XMLGenerator xmlOut) throws InvalidXMLException
        {
            this.numRow = numRow;
            this.xmlOut = xmlOut;

            int treeSize = (int) (Math.pow((double) fanout, (double) numColumn));
            int numTree = numRow / treeSize + (numRow % treeSize == 0 ? 0 : 1);
        }
        
        public void generate() throws InvalidXMLException
        {
            int offset = 0;
            while(numRow > 0)
            {
                LinkedList<Integer> colSet = new LinkedList<Integer>();  
                for(int i=1; i<numColumn; i++)
                {
                    colSet.add(i);
                }
                LinkedList<Integer> randomOrder = new LinkedList<Integer>();  
                while(!colSet.isEmpty())
                {
                    int targetIndex = r.nextInt(colSet.size());
                    int targetCol = colSet.remove(targetIndex);
                    randomOrder.add(targetCol);
                }
                //xmlOut.startTag("item", new XMLAttribute("value", ++offset));
                process(randomOrder, 0, new LinkedList<Element>());
                //xmlOut.endTag();
            }
        }
        
        class Element
        {
            int col;
            int value;
            public Element(int col, int value)
            {
                super();
                this.col = col;
                this.value = value;
            }
        }
        
        private boolean canHaveMulpleNodes(LinkedList<Integer> randomOrder, int index)
        {
            int currentColumn = randomOrder.get(index);
            int maxInFirstHalf = -1;
            for(int i=0; i<index; i++)
            {
                int column = randomOrder.get(i);
                if(column > currentColumn)
                    return false;
                if(maxInFirstHalf < column)
                    maxInFirstHalf = column;
            }
            for(int i=index+1; i<randomOrder.size(); i++)
            {
                if(maxInFirstHalf > randomOrder.get(i))
                    return false;
            }
            return true;
        }
        
        private int smallestFDColumnIndex(LinkedList<Integer> randomOrder, int index)
        {
            int currentColumn = randomOrder.get(index);
            for(int i=0; i<index; i++)
            {
                int column = randomOrder.get(i);
                if(column > currentColumn)
                {
                    return i;
                }
            }
            return -1;
        }
        
        
        private void process(LinkedList<Integer> randomOrder, int cursor, LinkedList<Element> elementStack) throws InvalidXMLException
        {
            if(cursor >= numColumn - 1)
            {
                numRow--;
                return;
            }


            int currentColumn = randomOrder.get(cursor);
            int smallestFDColumnIndex = smallestFDColumnIndex(randomOrder, cursor);
            if(smallestFDColumnIndex == -1)
                smallestFDColumnIndex = cursor;
            for(int f=0; f<fanout; f++)
            {
                Element e = new Element(currentColumn, f+1);
                elementStack.add(e);
                xmlOut.startTag(getColName(e.col), new XMLAttribute("value", e.value));
                process(randomOrder, cursor+1, elementStack);
                xmlOut.endTag();
                if(numRow <= 0)
                {
                    elementStack.removeLast();
                    break;
                }
                else
                {
                    if(f < (fanout - 1))
                    {
                        for(int i=cursor-1; i>=smallestFDColumnIndex; i--)
                        {
                            xmlOut.endTag();
                        }
                        for(int i=smallestFDColumnIndex; i<cursor; i++)
                        {
                            Element e2 = elementStack.get(i);
                            xmlOut.startTag(getColName(e2.col), new XMLAttribute("value", e2.value));
                        }
                    }
                }
                elementStack.removeLast();
            }
        }
    }

    public class Simple
    {
        int numRow;
        XMLGenerator xmlOut;
        int[] value = new int[numColumn];

        public Simple(int numRow, XMLGenerator xmlOut) throws InvalidXMLException
        {
            this.numRow = numRow;
            this.xmlOut = xmlOut;

            for(int i=0; i<value.length; i++)
                value[i] = 1;
            
            int treeSize = (int) (Math.pow((double) fanout, (double) numColumn-1));
            int numTree = numRow / treeSize + (numRow % treeSize == 0 ? 0 : 1);
        }
        
        public void generate() throws InvalidXMLException
        {
            int offset = 0;
            while(numRow > 0)
            {
                process(0, offset++);
            }
        }
        
        private void process(int col, int offset) throws InvalidXMLException
        {
            if(col >= numColumn)
            {
                for(int c=0; c<numColumn; c++)
                    xmlOut.startTag(getColName(c), new XMLAttribute("value", value[c]));
                for(int c=0; c<numColumn; c++)
                    xmlOut.endTag();
                xmlOut.flush();
                numRow--;
                return;
            }
            
            if(numRow <= 0)
                return;
            
            int numChildren = (col == 0) ? 1 : fanout;
            for(int f=0; f<numChildren; f++)
            {
                value[col] = f+1+offset;
                process(col + 1, 0);
            }

        }
    }
    

    public static void main(String[] args)
    {
        try
        {
            BenchmarkTableGenerator btg = new BenchmarkTableGenerator(args);
            if(btg.isReady)
                btg.generate();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

}
