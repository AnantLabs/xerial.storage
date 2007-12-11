// $ANTLR 3.0.1 F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g 2007-12-11 14:57:36

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
//--------------------------------------------------
// Xerial -- Transactional XML Database System      
// 
// AmoebaQueryLexer.java
// Since  2005/10/27 23:17:42
// 
//--------------------------------------------------

package org.xerial.amoeba.query;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class AmoebaQueryLexer extends Lexer {
    public static final int T75=75;
    public static final int FUNCTION=12;
    public static final int T76=76;
    public static final int T73=73;
    public static final int T74=74;
    public static final int DataType=62;
    public static final int Insert=57;
    public static final int SORT_TARGET=30;
    public static final int T77=77;
    public static final int Apos=43;
    public static final int T78=78;
    public static final int Wildcard=45;
    public static final int HasMany=61;
    public static final int SPLIT=52;
    public static final int ATTRIBUTE=19;
    public static final int INPUT=15;
    public static final int Where=55;
    public static final int UPDATE=28;
    public static final int CONDITION=7;
    public static final int Into=58;
    public static final int AND=13;
    public static final int EOF=-1;
    public static final int T72=72;
    public static final int T71=71;
    public static final int SELECTION=6;
    public static final int ML_COMMENT=35;
    public static final int GREATER=50;
    public static final int ASSIGN_LABEL=17;
    public static final int INSERT=24;
    public static final int OBJECT=33;
    public static final int Digits=65;
    public static final int NOT_EQUAL=47;
    public static final int CONTAINED_IN=22;
    public static final int WhiteSpaceChar=67;
    public static final int NEW_VALUE=26;
    public static final int EQUAL=46;
    public static final int LESS=48;
    public static final int COMPARE=18;
    public static final int Select=53;
    public static final int REF_ALL=10;
    public static final int GEQ=51;
    public static final int VALUE_SET=25;
    public static final int Relationship=60;
    public static final int NEW_RELATION=27;
    public static final int Quot=42;
    public static final int PROJECT_ALL=9;
    public static final int RParen=40;
    public static final int In=56;
    public static final int At=44;
    public static final int QName=70;
    public static final int LParen=41;
    public static final int LINE_COMMENT=36;
    public static final int NUMBER=4;
    public static final int NameChar=66;
    public static final int RELATION=23;
    public static final int Colon=38;
    public static final int TARGET=11;
    public static final int VALUE=21;
    public static final int Digit=64;
    public static final int Tokens=79;
    public static final int ONE_TO_MANY=31;
    public static final int ATTRIBUTE_DEF=29;
    public static final int REF=20;
    public static final int From=54;
    public static final int Object=59;
    public static final int StringLiteral=68;
    public static final int OR=14;
    public static final int Dot=37;
    public static final int Name=69;
    public static final int PROJECTION=8;
    public static final int Comma=39;
    public static final int OUTPUT=16;
    public static final int Letter=63;
    public static final int LANG=34;
    public static final int STRING=5;
    public static final int OBJECT_DEF=32;
    public static final int LEQ=49;
    public AmoebaQueryLexer() {;} 
    public AmoebaQueryLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g"; }

    // $ANTLR start T71
    public final void mT71() throws RecognitionException {
        try {
            int _type = T71;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:33:5: ( 'update' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:33:7: 'update'
            {
            match("update"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T71

    // $ANTLR start T72
    public final void mT72() throws RecognitionException {
        try {
            int _type = T72;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:34:5: ( 'set' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:34:7: 'set'
            {
            match("set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T72

    // $ANTLR start T73
    public final void mT73() throws RecognitionException {
        try {
            int _type = T73;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:35:5: ( '{' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:35:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T73

    // $ANTLR start T74
    public final void mT74() throws RecognitionException {
        try {
            int _type = T74;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:36:5: ( '}' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:36:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T74

    // $ANTLR start T75
    public final void mT75() throws RecognitionException {
        try {
            int _type = T75;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:37:5: ( 'as' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:37:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T75

    // $ANTLR start T76
    public final void mT76() throws RecognitionException {
        try {
            int _type = T76;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:38:5: ( 'or' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:38:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T76

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:39:5: ( 'and' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:39:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T77

    // $ANTLR start T78
    public final void mT78() throws RecognitionException {
        try {
            int _type = T78;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:40:5: ( 'like' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:40:7: 'like'
            {
            match("like"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start ML_COMMENT
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:140:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:140:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:140:14: ( options {greedy=false; } : . )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='*') ) {
                    int LA1_1 = input.LA(2);

                    if ( (LA1_1=='/') ) {
                        alt1=2;
                    }
                    else if ( ((LA1_1>='\u0000' && LA1_1<='.')||(LA1_1>='0' && LA1_1<='\uFFFE')) ) {
                        alt1=1;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<=')')||(LA1_0>='+' && LA1_0<='\uFFFE')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:140:41: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match("*/"); 

            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end ML_COMMENT

    // $ANTLR start LINE_COMMENT
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:144:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:144:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:144:12: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:144:12: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFE') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:144:26: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:144:26: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 
            channel=HIDDEN;

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LINE_COMMENT

    // $ANTLR start Dot
    public final void mDot() throws RecognitionException {
        try {
            int _type = Dot;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:147:4: ( '.' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:147:6: '.'
            {
            match('.'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Dot

    // $ANTLR start Colon
    public final void mColon() throws RecognitionException {
        try {
            int _type = Colon;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:148:6: ( ';' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:148:8: ';'
            {
            match(';'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Colon

    // $ANTLR start Comma
    public final void mComma() throws RecognitionException {
        try {
            int _type = Comma;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:149:6: ( ',' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:149:8: ','
            {
            match(','); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Comma

    // $ANTLR start RParen
    public final void mRParen() throws RecognitionException {
        try {
            int _type = RParen;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:150:7: ( ')' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:150:9: ')'
            {
            match(')'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RParen

    // $ANTLR start LParen
    public final void mLParen() throws RecognitionException {
        try {
            int _type = LParen;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:151:7: ( '(' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:151:9: '('
            {
            match('('); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LParen

    // $ANTLR start Quot
    public final void mQuot() throws RecognitionException {
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:152:14: ( '\"' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:152:16: '\"'
            {
            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Quot

    // $ANTLR start Apos
    public final void mApos() throws RecognitionException {
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:153:14: ( '\\'' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:153:16: '\\''
            {
            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Apos

    // $ANTLR start At
    public final void mAt() throws RecognitionException {
        try {
            int _type = At;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:154:3: ( '@' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:154:5: '@'
            {
            match('@'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end At

    // $ANTLR start Wildcard
    public final void mWildcard() throws RecognitionException {
        try {
            int _type = Wildcard;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:155:10: ( '*' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:155:12: '*'
            {
            match('*'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Wildcard

    // $ANTLR start EQUAL
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:156:7: ( '=' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:156:9: '='
            {
            match('='); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end EQUAL

    // $ANTLR start NOT_EQUAL
    public final void mNOT_EQUAL() throws RecognitionException {
        try {
            int _type = NOT_EQUAL;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:157:11: ( '!=' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:157:13: '!='
            {
            match("!="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end NOT_EQUAL

    // $ANTLR start LESS
    public final void mLESS() throws RecognitionException {
        try {
            int _type = LESS;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:158:6: ( '<' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:158:8: '<'
            {
            match('<'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LESS

    // $ANTLR start LEQ
    public final void mLEQ() throws RecognitionException {
        try {
            int _type = LEQ;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:159:6: ( '<=' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:159:8: '<='
            {
            match("<="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end LEQ

    // $ANTLR start GREATER
    public final void mGREATER() throws RecognitionException {
        try {
            int _type = GREATER;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:160:9: ( '>' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:160:11: '>'
            {
            match('>'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GREATER

    // $ANTLR start GEQ
    public final void mGEQ() throws RecognitionException {
        try {
            int _type = GEQ;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:161:5: ( '>=' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:161:7: '>='
            {
            match(">="); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end GEQ

    // $ANTLR start SPLIT
    public final void mSPLIT() throws RecognitionException {
        try {
            int _type = SPLIT;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:162:7: ( '|' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:162:9: '|'
            {
            match('|'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end SPLIT

    // $ANTLR start Select
    public final void mSelect() throws RecognitionException {
        try {
            int _type = Select;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:164:7: ( 'select' | 'SELECT' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='s') ) {
                alt4=1;
            }
            else if ( (LA4_0=='S') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("164:1: Select : ( 'select' | 'SELECT' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:164:9: 'select'
                    {
                    match("select"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:164:20: 'SELECT'
                    {
                    match("SELECT"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Select

    // $ANTLR start From
    public final void mFrom() throws RecognitionException {
        try {
            int _type = From;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:165:5: ( 'from' | 'FROM' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='f') ) {
                alt5=1;
            }
            else if ( (LA5_0=='F') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("165:1: From : ( 'from' | 'FROM' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:165:7: 'from'
                    {
                    match("from"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:165:16: 'FROM'
                    {
                    match("FROM"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end From

    // $ANTLR start Where
    public final void mWhere() throws RecognitionException {
        try {
            int _type = Where;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:166:6: ( 'where' | 'WHERE' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='w') ) {
                alt6=1;
            }
            else if ( (LA6_0=='W') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("166:1: Where : ( 'where' | 'WHERE' );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:166:8: 'where'
                    {
                    match("where"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:166:18: 'WHERE'
                    {
                    match("WHERE"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Where

    // $ANTLR start In
    public final void mIn() throws RecognitionException {
        try {
            int _type = In;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:167:3: ( 'in' | 'IN' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='i') ) {
                alt7=1;
            }
            else if ( (LA7_0=='I') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("167:1: In : ( 'in' | 'IN' );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:167:5: 'in'
                    {
                    match("in"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:167:12: 'IN'
                    {
                    match("IN"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end In

    // $ANTLR start Insert
    public final void mInsert() throws RecognitionException {
        try {
            int _type = Insert;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:168:7: ( 'insert' | 'INSERT' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='i') ) {
                alt8=1;
            }
            else if ( (LA8_0=='I') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("168:1: Insert : ( 'insert' | 'INSERT' );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:168:9: 'insert'
                    {
                    match("insert"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:168:20: 'INSERT'
                    {
                    match("INSERT"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Insert

    // $ANTLR start Into
    public final void mInto() throws RecognitionException {
        try {
            int _type = Into;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:169:5: ( 'into' | 'INTO' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='i') ) {
                alt9=1;
            }
            else if ( (LA9_0=='I') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("169:1: Into : ( 'into' | 'INTO' );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:169:7: 'into'
                    {
                    match("into"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:169:16: 'INTO'
                    {
                    match("INTO"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Into

    // $ANTLR start Object
    public final void mObject() throws RecognitionException {
        try {
            int _type = Object;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:170:7: ( 'object' | 'OBJECT' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='o') ) {
                alt10=1;
            }
            else if ( (LA10_0=='O') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("170:1: Object : ( 'object' | 'OBJECT' );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:170:9: 'object'
                    {
                    match("object"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:170:20: 'OBJECT'
                    {
                    match("OBJECT"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Object

    // $ANTLR start Relationship
    public final void mRelationship() throws RecognitionException {
        try {
            int _type = Relationship;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:171:13: ( 'relationship' | 'RELATIONSHIP' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='r') ) {
                alt11=1;
            }
            else if ( (LA11_0=='R') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("171:1: Relationship : ( 'relationship' | 'RELATIONSHIP' );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:171:15: 'relationship'
                    {
                    match("relationship"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:171:32: 'RELATIONSHIP'
                    {
                    match("RELATIONSHIP"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Relationship

    // $ANTLR start HasMany
    public final void mHasMany() throws RecognitionException {
        try {
            int _type = HasMany;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:172:9: ( 'hasmany' | 'HASMANY' | 'HasMany' )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='h') ) {
                alt12=1;
            }
            else if ( (LA12_0=='H') ) {
                int LA12_2 = input.LA(2);

                if ( (LA12_2=='A') ) {
                    alt12=2;
                }
                else if ( (LA12_2=='a') ) {
                    alt12=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("172:1: HasMany : ( 'hasmany' | 'HASMANY' | 'HasMany' );", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("172:1: HasMany : ( 'hasmany' | 'HASMANY' | 'HasMany' );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:172:11: 'hasmany'
                    {
                    match("hasmany"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:172:23: 'HASMANY'
                    {
                    match("HASMANY"); 


                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:172:35: 'HasMany'
                    {
                    match("HasMany"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HasMany

    // $ANTLR start DataType
    public final void mDataType() throws RecognitionException {
        try {
            int _type = DataType;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:9: ( 'string' | 'integer' | 'boolean' | 'float' | 'double' | 'text' )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt13=1;
                }
                break;
            case 'i':
                {
                alt13=2;
                }
                break;
            case 'b':
                {
                alt13=3;
                }
                break;
            case 'f':
                {
                alt13=4;
                }
                break;
            case 'd':
                {
                alt13=5;
                }
                break;
            case 't':
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("174:1: DataType : ( 'string' | 'integer' | 'boolean' | 'float' | 'double' | 'text' );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:11: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:22: 'integer'
                    {
                    match("integer"); 


                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:34: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 4 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:46: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 5 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:56: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 6 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:67: 'text'
                    {
                    match("text"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DataType

    // $ANTLR start Letter
    public final void mLetter() throws RecognitionException {
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:177:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end Letter

    // $ANTLR start Digit
    public final void mDigit() throws RecognitionException {
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:178:15: ( '0' .. '9' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:178:17: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end Digit

    // $ANTLR start Digits
    public final void mDigits() throws RecognitionException {
        try {
            int _type = Digits;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:179:7: ( ( Digit )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:179:9: ( Digit )+
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:179:9: ( Digit )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:179:10: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end Digits

    // $ANTLR start NameChar
    public final void mNameChar() throws RecognitionException {
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:181:18: ( Letter | Digit | '_' | '-' | At )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:
            {
            if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='@' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }


            }

        }
        finally {
        }
    }
    // $ANTLR end NameChar

    // $ANTLR start WhiteSpaceChar
    public final void mWhiteSpaceChar() throws RecognitionException {
        try {
            int _type = WhiteSpaceChar;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:183:15: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:183:17: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:183:17: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\t' && LA15_0<='\n')||(LA15_0>='\f' && LA15_0<='\r')||LA15_0==' ') ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse =
            	            new MismatchedSetException(null,input);
            	        recover(mse);    throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

             channel=HIDDEN; 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end WhiteSpaceChar

    // $ANTLR start StringLiteral
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:1: ( Quot (~ '\"' )* Quot | Apos (~ '\\'' )* Apos )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='\"') ) {
                alt18=1;
            }
            else if ( (LA18_0=='\'') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("185:1: StringLiteral : ( Quot (~ '\"' )* Quot | Apos (~ '\\'' )* Apos );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:3: Quot (~ '\"' )* Quot
                    {
                    mQuot(); 
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:9: (~ '\"' )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( ((LA16_0>='\u0000' && LA16_0<='!')||(LA16_0>='#' && LA16_0<='\uFFFE')) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:10: ~ '\"'
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    mQuot(); 

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:187:3: Apos (~ '\\'' )* Apos
                    {
                    mApos(); 
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:187:9: (~ '\\'' )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='\uFFFE')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:187:10: ~ '\\''
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFE') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse =
                    	            new MismatchedSetException(null,input);
                    	        recover(mse);    throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    mApos(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end StringLiteral

    // $ANTLR start Name
    public final void mName() throws RecognitionException {
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:191:14: ( ( Letter | '_' ) ( NameChar )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:191:16: ( Letter | '_' ) ( NameChar )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:191:31: ( NameChar )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='-'||(LA19_0>='0' && LA19_0<='9')||(LA19_0>='@' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='a' && LA19_0<='z')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:191:31: NameChar
            	    {
            	    mNameChar(); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end Name

    // $ANTLR start QName
    public final void mQName() throws RecognitionException {
        try {
            int _type = QName;
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:194:2: ( Name Colon Name | Name )
            int alt20=2;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:194:4: Name Colon Name
                    {
                    mName(); 
                    mColon(); 
                    mName(); 

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:195:4: Name
                    {
                    mName(); 

                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end QName

    public void mTokens() throws RecognitionException {
        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:8: ( T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | ML_COMMENT | LINE_COMMENT | Dot | Colon | Comma | RParen | LParen | At | Wildcard | EQUAL | NOT_EQUAL | LESS | LEQ | GREATER | GEQ | SPLIT | Select | From | Where | In | Insert | Into | Object | Relationship | HasMany | DataType | Digits | WhiteSpaceChar | StringLiteral | QName )
        int alt21=38;
        switch ( input.LA(1) ) {
        case 'u':
            {
            int LA21_1 = input.LA(2);

            if ( (LA21_1=='p') ) {
                int LA21_40 = input.LA(3);

                if ( (LA21_40=='d') ) {
                    int LA21_71 = input.LA(4);

                    if ( (LA21_71=='a') ) {
                        int LA21_100 = input.LA(5);

                        if ( (LA21_100=='t') ) {
                            int LA21_127 = input.LA(6);

                            if ( (LA21_127=='e') ) {
                                int LA21_150 = input.LA(7);

                                if ( (LA21_150=='-'||(LA21_150>='0' && LA21_150<='9')||LA21_150==';'||(LA21_150>='@' && LA21_150<='Z')||LA21_150=='_'||(LA21_150>='a' && LA21_150<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=1;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 's':
            {
            switch ( input.LA(2) ) {
            case 'e':
                {
                switch ( input.LA(3) ) {
                case 'l':
                    {
                    int LA21_72 = input.LA(4);

                    if ( (LA21_72=='e') ) {
                        int LA21_101 = input.LA(5);

                        if ( (LA21_101=='c') ) {
                            int LA21_128 = input.LA(6);

                            if ( (LA21_128=='t') ) {
                                int LA21_151 = input.LA(7);

                                if ( (LA21_151=='-'||(LA21_151>='0' && LA21_151<='9')||LA21_151==';'||(LA21_151>='@' && LA21_151<='Z')||LA21_151=='_'||(LA21_151>='a' && LA21_151<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=25;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                    }
                    break;
                case 't':
                    {
                    int LA21_73 = input.LA(4);

                    if ( (LA21_73=='-'||(LA21_73>='0' && LA21_73<='9')||LA21_73==';'||(LA21_73>='@' && LA21_73<='Z')||LA21_73=='_'||(LA21_73>='a' && LA21_73<='z')) ) {
                        alt21=38;
                    }
                    else {
                        alt21=2;}
                    }
                    break;
                default:
                    alt21=38;}

                }
                break;
            case 't':
                {
                int LA21_42 = input.LA(3);

                if ( (LA21_42=='r') ) {
                    int LA21_74 = input.LA(4);

                    if ( (LA21_74=='i') ) {
                        int LA21_103 = input.LA(5);

                        if ( (LA21_103=='n') ) {
                            int LA21_129 = input.LA(6);

                            if ( (LA21_129=='g') ) {
                                int LA21_152 = input.LA(7);

                                if ( (LA21_152=='-'||(LA21_152>='0' && LA21_152<='9')||LA21_152==';'||(LA21_152>='@' && LA21_152<='Z')||LA21_152=='_'||(LA21_152>='a' && LA21_152<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=34;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
                }
                break;
            default:
                alt21=38;}

            }
            break;
        case '{':
            {
            alt21=3;
            }
            break;
        case '}':
            {
            alt21=4;
            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA21_43 = input.LA(3);

                if ( (LA21_43=='d') ) {
                    int LA21_75 = input.LA(4);

                    if ( (LA21_75=='-'||(LA21_75>='0' && LA21_75<='9')||LA21_75==';'||(LA21_75>='@' && LA21_75<='Z')||LA21_75=='_'||(LA21_75>='a' && LA21_75<='z')) ) {
                        alt21=38;
                    }
                    else {
                        alt21=7;}
                }
                else {
                    alt21=38;}
                }
                break;
            case 's':
                {
                int LA21_44 = input.LA(3);

                if ( (LA21_44=='-'||(LA21_44>='0' && LA21_44<='9')||LA21_44==';'||(LA21_44>='@' && LA21_44<='Z')||LA21_44=='_'||(LA21_44>='a' && LA21_44<='z')) ) {
                    alt21=38;
                }
                else {
                    alt21=5;}
                }
                break;
            default:
                alt21=38;}

            }
            break;
        case 'o':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA21_45 = input.LA(3);

                if ( (LA21_45=='-'||(LA21_45>='0' && LA21_45<='9')||LA21_45==';'||(LA21_45>='@' && LA21_45<='Z')||LA21_45=='_'||(LA21_45>='a' && LA21_45<='z')) ) {
                    alt21=38;
                }
                else {
                    alt21=6;}
                }
                break;
            case 'b':
                {
                int LA21_46 = input.LA(3);

                if ( (LA21_46=='j') ) {
                    int LA21_78 = input.LA(4);

                    if ( (LA21_78=='e') ) {
                        int LA21_105 = input.LA(5);

                        if ( (LA21_105=='c') ) {
                            int LA21_130 = input.LA(6);

                            if ( (LA21_130=='t') ) {
                                int LA21_153 = input.LA(7);

                                if ( (LA21_153=='-'||(LA21_153>='0' && LA21_153<='9')||LA21_153==';'||(LA21_153>='@' && LA21_153<='Z')||LA21_153=='_'||(LA21_153>='a' && LA21_153<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=31;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
                }
                break;
            default:
                alt21=38;}

            }
            break;
        case 'l':
            {
            int LA21_7 = input.LA(2);

            if ( (LA21_7=='i') ) {
                int LA21_47 = input.LA(3);

                if ( (LA21_47=='k') ) {
                    int LA21_79 = input.LA(4);

                    if ( (LA21_79=='e') ) {
                        int LA21_106 = input.LA(5);

                        if ( (LA21_106=='-'||(LA21_106>='0' && LA21_106<='9')||LA21_106==';'||(LA21_106>='@' && LA21_106<='Z')||LA21_106=='_'||(LA21_106>='a' && LA21_106<='z')) ) {
                            alt21=38;
                        }
                        else {
                            alt21=8;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case '/':
            {
            int LA21_8 = input.LA(2);

            if ( (LA21_8=='*') ) {
                alt21=9;
            }
            else if ( (LA21_8=='/') ) {
                alt21=10;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | ML_COMMENT | LINE_COMMENT | Dot | Colon | Comma | RParen | LParen | At | Wildcard | EQUAL | NOT_EQUAL | LESS | LEQ | GREATER | GEQ | SPLIT | Select | From | Where | In | Insert | Into | Object | Relationship | HasMany | DataType | Digits | WhiteSpaceChar | StringLiteral | QName );", 21, 8, input);

                throw nvae;
            }
            }
            break;
        case '.':
            {
            alt21=11;
            }
            break;
        case ';':
            {
            alt21=12;
            }
            break;
        case ',':
            {
            alt21=13;
            }
            break;
        case ')':
            {
            alt21=14;
            }
            break;
        case '(':
            {
            alt21=15;
            }
            break;
        case '@':
            {
            alt21=16;
            }
            break;
        case '*':
            {
            alt21=17;
            }
            break;
        case '=':
            {
            alt21=18;
            }
            break;
        case '!':
            {
            alt21=19;
            }
            break;
        case '<':
            {
            int LA21_18 = input.LA(2);

            if ( (LA21_18=='=') ) {
                alt21=21;
            }
            else {
                alt21=20;}
            }
            break;
        case '>':
            {
            int LA21_19 = input.LA(2);

            if ( (LA21_19=='=') ) {
                alt21=23;
            }
            else {
                alt21=22;}
            }
            break;
        case '|':
            {
            alt21=24;
            }
            break;
        case 'S':
            {
            int LA21_21 = input.LA(2);

            if ( (LA21_21=='E') ) {
                int LA21_54 = input.LA(3);

                if ( (LA21_54=='L') ) {
                    int LA21_80 = input.LA(4);

                    if ( (LA21_80=='E') ) {
                        int LA21_107 = input.LA(5);

                        if ( (LA21_107=='C') ) {
                            int LA21_132 = input.LA(6);

                            if ( (LA21_132=='T') ) {
                                int LA21_154 = input.LA(7);

                                if ( (LA21_154=='-'||(LA21_154>='0' && LA21_154<='9')||LA21_154==';'||(LA21_154>='@' && LA21_154<='Z')||LA21_154=='_'||(LA21_154>='a' && LA21_154<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=25;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                int LA21_55 = input.LA(3);

                if ( (LA21_55=='o') ) {
                    int LA21_81 = input.LA(4);

                    if ( (LA21_81=='m') ) {
                        int LA21_108 = input.LA(5);

                        if ( (LA21_108=='-'||(LA21_108>='0' && LA21_108<='9')||LA21_108==';'||(LA21_108>='@' && LA21_108<='Z')||LA21_108=='_'||(LA21_108>='a' && LA21_108<='z')) ) {
                            alt21=38;
                        }
                        else {
                            alt21=26;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
                }
                break;
            case 'l':
                {
                int LA21_56 = input.LA(3);

                if ( (LA21_56=='o') ) {
                    int LA21_82 = input.LA(4);

                    if ( (LA21_82=='a') ) {
                        int LA21_109 = input.LA(5);

                        if ( (LA21_109=='t') ) {
                            int LA21_134 = input.LA(6);

                            if ( (LA21_134=='-'||(LA21_134>='0' && LA21_134<='9')||LA21_134==';'||(LA21_134>='@' && LA21_134<='Z')||LA21_134=='_'||(LA21_134>='a' && LA21_134<='z')) ) {
                                alt21=38;
                            }
                            else {
                                alt21=34;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
                }
                break;
            default:
                alt21=38;}

            }
            break;
        case 'F':
            {
            int LA21_23 = input.LA(2);

            if ( (LA21_23=='R') ) {
                int LA21_57 = input.LA(3);

                if ( (LA21_57=='O') ) {
                    int LA21_83 = input.LA(4);

                    if ( (LA21_83=='M') ) {
                        int LA21_110 = input.LA(5);

                        if ( (LA21_110=='-'||(LA21_110>='0' && LA21_110<='9')||LA21_110==';'||(LA21_110>='@' && LA21_110<='Z')||LA21_110=='_'||(LA21_110>='a' && LA21_110<='z')) ) {
                            alt21=38;
                        }
                        else {
                            alt21=26;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'w':
            {
            int LA21_24 = input.LA(2);

            if ( (LA21_24=='h') ) {
                int LA21_58 = input.LA(3);

                if ( (LA21_58=='e') ) {
                    int LA21_84 = input.LA(4);

                    if ( (LA21_84=='r') ) {
                        int LA21_111 = input.LA(5);

                        if ( (LA21_111=='e') ) {
                            int LA21_135 = input.LA(6);

                            if ( (LA21_135=='-'||(LA21_135>='0' && LA21_135<='9')||LA21_135==';'||(LA21_135>='@' && LA21_135<='Z')||LA21_135=='_'||(LA21_135>='a' && LA21_135<='z')) ) {
                                alt21=38;
                            }
                            else {
                                alt21=27;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'W':
            {
            int LA21_25 = input.LA(2);

            if ( (LA21_25=='H') ) {
                int LA21_59 = input.LA(3);

                if ( (LA21_59=='E') ) {
                    int LA21_85 = input.LA(4);

                    if ( (LA21_85=='R') ) {
                        int LA21_112 = input.LA(5);

                        if ( (LA21_112=='E') ) {
                            int LA21_136 = input.LA(6);

                            if ( (LA21_136=='-'||(LA21_136>='0' && LA21_136<='9')||LA21_136==';'||(LA21_136>='@' && LA21_136<='Z')||LA21_136=='_'||(LA21_136>='a' && LA21_136<='z')) ) {
                                alt21=38;
                            }
                            else {
                                alt21=27;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'i':
            {
            int LA21_26 = input.LA(2);

            if ( (LA21_26=='n') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA21_113 = input.LA(5);

                        if ( (LA21_113=='g') ) {
                            int LA21_137 = input.LA(6);

                            if ( (LA21_137=='e') ) {
                                int LA21_156 = input.LA(7);

                                if ( (LA21_156=='r') ) {
                                    int LA21_170 = input.LA(8);

                                    if ( (LA21_170=='-'||(LA21_170>='0' && LA21_170<='9')||LA21_170==';'||(LA21_170>='@' && LA21_170<='Z')||LA21_170=='_'||(LA21_170>='a' && LA21_170<='z')) ) {
                                        alt21=38;
                                    }
                                    else {
                                        alt21=34;}
                                }
                                else {
                                    alt21=38;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                        }
                        break;
                    case 'o':
                        {
                        int LA21_114 = input.LA(5);

                        if ( (LA21_114=='-'||(LA21_114>='0' && LA21_114<='9')||LA21_114==';'||(LA21_114>='@' && LA21_114<='Z')||LA21_114=='_'||(LA21_114>='a' && LA21_114<='z')) ) {
                            alt21=38;
                        }
                        else {
                            alt21=30;}
                        }
                        break;
                    default:
                        alt21=38;}

                    }
                    break;
                case 's':
                    {
                    int LA21_87 = input.LA(4);

                    if ( (LA21_87=='e') ) {
                        int LA21_115 = input.LA(5);

                        if ( (LA21_115=='r') ) {
                            int LA21_139 = input.LA(6);

                            if ( (LA21_139=='t') ) {
                                int LA21_157 = input.LA(7);

                                if ( (LA21_157=='-'||(LA21_157>='0' && LA21_157<='9')||LA21_157==';'||(LA21_157>='@' && LA21_157<='Z')||LA21_157=='_'||(LA21_157>='a' && LA21_157<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=29;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                    }
                    break;
                case '-':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case ';':
                case '@':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt21=38;
                    }
                    break;
                default:
                    alt21=28;}

            }
            else {
                alt21=38;}
            }
            break;
        case 'I':
            {
            int LA21_27 = input.LA(2);

            if ( (LA21_27=='N') ) {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA21_89 = input.LA(4);

                    if ( (LA21_89=='O') ) {
                        int LA21_116 = input.LA(5);

                        if ( (LA21_116=='-'||(LA21_116>='0' && LA21_116<='9')||LA21_116==';'||(LA21_116>='@' && LA21_116<='Z')||LA21_116=='_'||(LA21_116>='a' && LA21_116<='z')) ) {
                            alt21=38;
                        }
                        else {
                            alt21=30;}
                    }
                    else {
                        alt21=38;}
                    }
                    break;
                case 'S':
                    {
                    int LA21_90 = input.LA(4);

                    if ( (LA21_90=='E') ) {
                        int LA21_117 = input.LA(5);

                        if ( (LA21_117=='R') ) {
                            int LA21_140 = input.LA(6);

                            if ( (LA21_140=='T') ) {
                                int LA21_158 = input.LA(7);

                                if ( (LA21_158=='-'||(LA21_158>='0' && LA21_158<='9')||LA21_158==';'||(LA21_158>='@' && LA21_158<='Z')||LA21_158=='_'||(LA21_158>='a' && LA21_158<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=29;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                    }
                    break;
                case '-':
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case ';':
                case '@':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt21=38;
                    }
                    break;
                default:
                    alt21=28;}

            }
            else {
                alt21=38;}
            }
            break;
        case 'O':
            {
            int LA21_28 = input.LA(2);

            if ( (LA21_28=='B') ) {
                int LA21_62 = input.LA(3);

                if ( (LA21_62=='J') ) {
                    int LA21_91 = input.LA(4);

                    if ( (LA21_91=='E') ) {
                        int LA21_118 = input.LA(5);

                        if ( (LA21_118=='C') ) {
                            int LA21_141 = input.LA(6);

                            if ( (LA21_141=='T') ) {
                                int LA21_159 = input.LA(7);

                                if ( (LA21_159=='-'||(LA21_159>='0' && LA21_159<='9')||LA21_159==';'||(LA21_159>='@' && LA21_159<='Z')||LA21_159=='_'||(LA21_159>='a' && LA21_159<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=31;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'r':
            {
            int LA21_29 = input.LA(2);

            if ( (LA21_29=='e') ) {
                int LA21_63 = input.LA(3);

                if ( (LA21_63=='l') ) {
                    int LA21_92 = input.LA(4);

                    if ( (LA21_92=='a') ) {
                        int LA21_119 = input.LA(5);

                        if ( (LA21_119=='t') ) {
                            int LA21_142 = input.LA(6);

                            if ( (LA21_142=='i') ) {
                                int LA21_160 = input.LA(7);

                                if ( (LA21_160=='o') ) {
                                    int LA21_172 = input.LA(8);

                                    if ( (LA21_172=='n') ) {
                                        int LA21_178 = input.LA(9);

                                        if ( (LA21_178=='s') ) {
                                            int LA21_181 = input.LA(10);

                                            if ( (LA21_181=='h') ) {
                                                int LA21_183 = input.LA(11);

                                                if ( (LA21_183=='i') ) {
                                                    int LA21_185 = input.LA(12);

                                                    if ( (LA21_185=='p') ) {
                                                        int LA21_187 = input.LA(13);

                                                        if ( (LA21_187=='-'||(LA21_187>='0' && LA21_187<='9')||LA21_187==';'||(LA21_187>='@' && LA21_187<='Z')||LA21_187=='_'||(LA21_187>='a' && LA21_187<='z')) ) {
                                                            alt21=38;
                                                        }
                                                        else {
                                                            alt21=32;}
                                                    }
                                                    else {
                                                        alt21=38;}
                                                }
                                                else {
                                                    alt21=38;}
                                            }
                                            else {
                                                alt21=38;}
                                        }
                                        else {
                                            alt21=38;}
                                    }
                                    else {
                                        alt21=38;}
                                }
                                else {
                                    alt21=38;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'R':
            {
            int LA21_30 = input.LA(2);

            if ( (LA21_30=='E') ) {
                int LA21_64 = input.LA(3);

                if ( (LA21_64=='L') ) {
                    int LA21_93 = input.LA(4);

                    if ( (LA21_93=='A') ) {
                        int LA21_120 = input.LA(5);

                        if ( (LA21_120=='T') ) {
                            int LA21_143 = input.LA(6);

                            if ( (LA21_143=='I') ) {
                                int LA21_161 = input.LA(7);

                                if ( (LA21_161=='O') ) {
                                    int LA21_173 = input.LA(8);

                                    if ( (LA21_173=='N') ) {
                                        int LA21_179 = input.LA(9);

                                        if ( (LA21_179=='S') ) {
                                            int LA21_182 = input.LA(10);

                                            if ( (LA21_182=='H') ) {
                                                int LA21_184 = input.LA(11);

                                                if ( (LA21_184=='I') ) {
                                                    int LA21_186 = input.LA(12);

                                                    if ( (LA21_186=='P') ) {
                                                        int LA21_188 = input.LA(13);

                                                        if ( (LA21_188=='-'||(LA21_188>='0' && LA21_188<='9')||LA21_188==';'||(LA21_188>='@' && LA21_188<='Z')||LA21_188=='_'||(LA21_188>='a' && LA21_188<='z')) ) {
                                                            alt21=38;
                                                        }
                                                        else {
                                                            alt21=32;}
                                                    }
                                                    else {
                                                        alt21=38;}
                                                }
                                                else {
                                                    alt21=38;}
                                            }
                                            else {
                                                alt21=38;}
                                        }
                                        else {
                                            alt21=38;}
                                    }
                                    else {
                                        alt21=38;}
                                }
                                else {
                                    alt21=38;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'h':
            {
            int LA21_31 = input.LA(2);

            if ( (LA21_31=='a') ) {
                int LA21_65 = input.LA(3);

                if ( (LA21_65=='s') ) {
                    int LA21_94 = input.LA(4);

                    if ( (LA21_94=='m') ) {
                        int LA21_121 = input.LA(5);

                        if ( (LA21_121=='a') ) {
                            int LA21_144 = input.LA(6);

                            if ( (LA21_144=='n') ) {
                                int LA21_162 = input.LA(7);

                                if ( (LA21_162=='y') ) {
                                    int LA21_174 = input.LA(8);

                                    if ( (LA21_174=='-'||(LA21_174>='0' && LA21_174<='9')||LA21_174==';'||(LA21_174>='@' && LA21_174<='Z')||LA21_174=='_'||(LA21_174>='a' && LA21_174<='z')) ) {
                                        alt21=38;
                                    }
                                    else {
                                        alt21=33;}
                                }
                                else {
                                    alt21=38;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'H':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA21_66 = input.LA(3);

                if ( (LA21_66=='s') ) {
                    int LA21_95 = input.LA(4);

                    if ( (LA21_95=='M') ) {
                        int LA21_122 = input.LA(5);

                        if ( (LA21_122=='a') ) {
                            int LA21_145 = input.LA(6);

                            if ( (LA21_145=='n') ) {
                                int LA21_163 = input.LA(7);

                                if ( (LA21_163=='y') ) {
                                    int LA21_175 = input.LA(8);

                                    if ( (LA21_175=='-'||(LA21_175>='0' && LA21_175<='9')||LA21_175==';'||(LA21_175>='@' && LA21_175<='Z')||LA21_175=='_'||(LA21_175>='a' && LA21_175<='z')) ) {
                                        alt21=38;
                                    }
                                    else {
                                        alt21=33;}
                                }
                                else {
                                    alt21=38;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
                }
                break;
            case 'A':
                {
                int LA21_67 = input.LA(3);

                if ( (LA21_67=='S') ) {
                    int LA21_96 = input.LA(4);

                    if ( (LA21_96=='M') ) {
                        int LA21_123 = input.LA(5);

                        if ( (LA21_123=='A') ) {
                            int LA21_146 = input.LA(6);

                            if ( (LA21_146=='N') ) {
                                int LA21_164 = input.LA(7);

                                if ( (LA21_164=='Y') ) {
                                    int LA21_176 = input.LA(8);

                                    if ( (LA21_176=='-'||(LA21_176>='0' && LA21_176<='9')||LA21_176==';'||(LA21_176>='@' && LA21_176<='Z')||LA21_176=='_'||(LA21_176>='a' && LA21_176<='z')) ) {
                                        alt21=38;
                                    }
                                    else {
                                        alt21=33;}
                                }
                                else {
                                    alt21=38;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
                }
                break;
            default:
                alt21=38;}

            }
            break;
        case 'b':
            {
            int LA21_33 = input.LA(2);

            if ( (LA21_33=='o') ) {
                int LA21_68 = input.LA(3);

                if ( (LA21_68=='o') ) {
                    int LA21_97 = input.LA(4);

                    if ( (LA21_97=='l') ) {
                        int LA21_124 = input.LA(5);

                        if ( (LA21_124=='e') ) {
                            int LA21_147 = input.LA(6);

                            if ( (LA21_147=='a') ) {
                                int LA21_165 = input.LA(7);

                                if ( (LA21_165=='n') ) {
                                    int LA21_177 = input.LA(8);

                                    if ( (LA21_177=='-'||(LA21_177>='0' && LA21_177<='9')||LA21_177==';'||(LA21_177>='@' && LA21_177<='Z')||LA21_177=='_'||(LA21_177>='a' && LA21_177<='z')) ) {
                                        alt21=38;
                                    }
                                    else {
                                        alt21=34;}
                                }
                                else {
                                    alt21=38;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 'd':
            {
            int LA21_34 = input.LA(2);

            if ( (LA21_34=='o') ) {
                int LA21_69 = input.LA(3);

                if ( (LA21_69=='u') ) {
                    int LA21_98 = input.LA(4);

                    if ( (LA21_98=='b') ) {
                        int LA21_125 = input.LA(5);

                        if ( (LA21_125=='l') ) {
                            int LA21_148 = input.LA(6);

                            if ( (LA21_148=='e') ) {
                                int LA21_166 = input.LA(7);

                                if ( (LA21_166=='-'||(LA21_166>='0' && LA21_166<='9')||LA21_166==';'||(LA21_166>='@' && LA21_166<='Z')||LA21_166=='_'||(LA21_166>='a' && LA21_166<='z')) ) {
                                    alt21=38;
                                }
                                else {
                                    alt21=34;}
                            }
                            else {
                                alt21=38;}
                        }
                        else {
                            alt21=38;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case 't':
            {
            int LA21_35 = input.LA(2);

            if ( (LA21_35=='e') ) {
                int LA21_70 = input.LA(3);

                if ( (LA21_70=='x') ) {
                    int LA21_99 = input.LA(4);

                    if ( (LA21_99=='t') ) {
                        int LA21_126 = input.LA(5);

                        if ( (LA21_126=='-'||(LA21_126>='0' && LA21_126<='9')||LA21_126==';'||(LA21_126>='@' && LA21_126<='Z')||LA21_126=='_'||(LA21_126>='a' && LA21_126<='z')) ) {
                            alt21=38;
                        }
                        else {
                            alt21=34;}
                    }
                    else {
                        alt21=38;}
                }
                else {
                    alt21=38;}
            }
            else {
                alt21=38;}
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt21=35;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt21=36;
            }
            break;
        case '\"':
        case '\'':
            {
            alt21=37;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'G':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'P':
        case 'Q':
        case 'T':
        case 'U':
        case 'V':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'c':
        case 'e':
        case 'g':
        case 'j':
        case 'k':
        case 'm':
        case 'n':
        case 'p':
        case 'q':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt21=38;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T71 | T72 | T73 | T74 | T75 | T76 | T77 | T78 | ML_COMMENT | LINE_COMMENT | Dot | Colon | Comma | RParen | LParen | At | Wildcard | EQUAL | NOT_EQUAL | LESS | LEQ | GREATER | GEQ | SPLIT | Select | From | Where | In | Insert | Into | Object | Relationship | HasMany | DataType | Digits | WhiteSpaceChar | StringLiteral | QName );", 21, 0, input);

            throw nvae;
        }

        switch (alt21) {
            case 1 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:10: T71
                {
                mT71(); 

                }
                break;
            case 2 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:14: T72
                {
                mT72(); 

                }
                break;
            case 3 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:18: T73
                {
                mT73(); 

                }
                break;
            case 4 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:22: T74
                {
                mT74(); 

                }
                break;
            case 5 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:26: T75
                {
                mT75(); 

                }
                break;
            case 6 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:30: T76
                {
                mT76(); 

                }
                break;
            case 7 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:34: T77
                {
                mT77(); 

                }
                break;
            case 8 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:38: T78
                {
                mT78(); 

                }
                break;
            case 9 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:42: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 10 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:53: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 11 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:66: Dot
                {
                mDot(); 

                }
                break;
            case 12 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:70: Colon
                {
                mColon(); 

                }
                break;
            case 13 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:76: Comma
                {
                mComma(); 

                }
                break;
            case 14 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:82: RParen
                {
                mRParen(); 

                }
                break;
            case 15 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:89: LParen
                {
                mLParen(); 

                }
                break;
            case 16 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:96: At
                {
                mAt(); 

                }
                break;
            case 17 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:99: Wildcard
                {
                mWildcard(); 

                }
                break;
            case 18 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:108: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 19 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:114: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 20 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:124: LESS
                {
                mLESS(); 

                }
                break;
            case 21 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:129: LEQ
                {
                mLEQ(); 

                }
                break;
            case 22 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:133: GREATER
                {
                mGREATER(); 

                }
                break;
            case 23 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:141: GEQ
                {
                mGEQ(); 

                }
                break;
            case 24 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:145: SPLIT
                {
                mSPLIT(); 

                }
                break;
            case 25 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:151: Select
                {
                mSelect(); 

                }
                break;
            case 26 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:158: From
                {
                mFrom(); 

                }
                break;
            case 27 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:163: Where
                {
                mWhere(); 

                }
                break;
            case 28 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:169: In
                {
                mIn(); 

                }
                break;
            case 29 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:172: Insert
                {
                mInsert(); 

                }
                break;
            case 30 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:179: Into
                {
                mInto(); 

                }
                break;
            case 31 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:184: Object
                {
                mObject(); 

                }
                break;
            case 32 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:191: Relationship
                {
                mRelationship(); 

                }
                break;
            case 33 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:204: HasMany
                {
                mHasMany(); 

                }
                break;
            case 34 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:212: DataType
                {
                mDataType(); 

                }
                break;
            case 35 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:221: Digits
                {
                mDigits(); 

                }
                break;
            case 36 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:228: WhiteSpaceChar
                {
                mWhiteSpaceChar(); 

                }
                break;
            case 37 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:243: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 38 :
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:257: QName
                {
                mQName(); 

                }
                break;

        }

    }


    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA20_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA20_eofS =
        "\5\uffff";
    static final String DFA20_minS =
        "\1\101\2\55\2\uffff";
    static final String DFA20_maxS =
        "\3\172\2\uffff";
    static final String DFA20_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA20_specialS =
        "\5\uffff}>";
    static final String[] DFA20_transitionS = {
            "\32\1\4\uffff\1\1\1\uffff\32\1",
            "\1\2\2\uffff\12\2\1\uffff\1\4\4\uffff\33\2\4\uffff\1\2\1\uffff"+
            "\32\2",
            "\1\2\2\uffff\12\2\1\uffff\1\4\4\uffff\33\2\4\uffff\1\2\1\uffff"+
            "\32\2",
            "",
            ""
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "193:1: QName : ( Name Colon Name | Name );";
        }
    }
 

}