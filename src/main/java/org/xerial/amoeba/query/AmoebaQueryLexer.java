// $ANTLR 3.0.1 F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g 2008-04-15 14:48:19

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
    public static final int T79=79;
    public static final int DataType=68;
    public static final int OUTPUT=17;
    public static final int INPUT=16;
    public static final int LANG=36;
    public static final int Apos=45;
    public static final int Digit=70;
    public static final int Relationship=62;
    public static final int NUMBER=4;
    public static final int TARGET=12;
    public static final int LEQ=51;
    public static final int VALUE_SET=26;
    public static final int REF=21;
    public static final int PROJECT_ALL=9;
    public static final int T85=85;
    public static final int T83=83;
    public static final int GEQ=53;
    public static final int VALUE=22;
    public static final int OR=15;
    public static final int Letter=69;
    public static final int DIVIDE=65;
    public static final int AND=14;
    public static final int Insert=59;
    public static final int LESS=50;
    public static final int Comma=41;
    public static final int T86=86;
    public static final int FUNCTION=13;
    public static final int Dot=39;
    public static final int Into=60;
    public static final int Object=61;
    public static final int CONDITION=7;
    public static final int ATTRIBUTE_DEF=30;
    public static final int ONE_TO_ONE=33;
    public static final int T81=81;
    public static final int OBJECT_DEF=34;
    public static final int GREATER=52;
    public static final int T77=77;
    public static final int HasMany=63;
    public static final int ML_COMMENT=37;
    public static final int Colon=40;
    public static final int NEW_VALUE=27;
    public static final int At=46;
    public static final int NOT_EQUAL=49;
    public static final int DISTINCT=66;
    public static final int OBJECT=35;
    public static final int RANGE=67;
    public static final int NameChar=72;
    public static final int T84=84;
    public static final int CONTAINED_IN=23;
    public static final int SPLIT=54;
    public static final int T78=78;
    public static final int ORDER_BY=10;
    public static final int Wildcard=47;
    public static final int STRING=5;
    public static final int NEW_RELATION=28;
    public static final int Where=57;
    public static final int RELATION=24;
    public static final int UPDATE=29;
    public static final int T88=88;
    public static final int RParen=42;
    public static final int StringLiteral=74;
    public static final int LINE_COMMENT=38;
    public static final int In=58;
    public static final int Name=75;
    public static final int T87=87;
    public static final int LParen=43;
    public static final int T80=80;
    public static final int From=56;
    public static final int HasOne=64;
    public static final int Select=55;
    public static final int EQUAL=48;
    public static final int COMPARE=19;
    public static final int REF_ALL=11;
    public static final int ONE_TO_MANY=32;
    public static final int QName=76;
    public static final int SELECTION=6;
    public static final int WhiteSpaceChar=73;
    public static final int EOF=-1;
    public static final int Tokens=89;
    public static final int T82=82;
    public static final int PROJECTION=8;
    public static final int ATTRIBUTE=20;
    public static final int Quot=44;
    public static final int SORT_TARGET=31;
    public static final int INSERT=25;
    public static final int Digits=71;
    public static final int ASSIGN_LABEL=18;
    public AmoebaQueryLexer() {;} 
    public AmoebaQueryLexer(CharStream input) {
        super(input);
    }
    public String getGrammarFileName() { return "F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g"; }

    // $ANTLR start T77
    public final void mT77() throws RecognitionException {
        try {
            int _type = T77;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:33:5: ( 'by' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:33:7: 'by'
            {
            match("by"); 


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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:34:5: ( 'auto' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:34:7: 'auto'
            {
            match("auto"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T78

    // $ANTLR start T79
    public final void mT79() throws RecognitionException {
        try {
            int _type = T79;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:35:5: ( 'AUTO' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:35:7: 'AUTO'
            {
            match("AUTO"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T79

    // $ANTLR start T80
    public final void mT80() throws RecognitionException {
        try {
            int _type = T80;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:36:5: ( 'update' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:36:7: 'update'
            {
            match("update"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T80

    // $ANTLR start T81
    public final void mT81() throws RecognitionException {
        try {
            int _type = T81;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:37:5: ( 'set' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:37:7: 'set'
            {
            match("set"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T81

    // $ANTLR start T82
    public final void mT82() throws RecognitionException {
        try {
            int _type = T82;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:38:5: ( '{' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:38:7: '{'
            {
            match('{'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T82

    // $ANTLR start T83
    public final void mT83() throws RecognitionException {
        try {
            int _type = T83;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:39:5: ( '}' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:39:7: '}'
            {
            match('}'); 

            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T83

    // $ANTLR start T84
    public final void mT84() throws RecognitionException {
        try {
            int _type = T84;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:40:5: ( 'as' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:40:7: 'as'
            {
            match("as"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T84

    // $ANTLR start T85
    public final void mT85() throws RecognitionException {
        try {
            int _type = T85;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:41:5: ( 'order' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:41:7: 'order'
            {
            match("order"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T85

    // $ANTLR start T86
    public final void mT86() throws RecognitionException {
        try {
            int _type = T86;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:42:5: ( 'or' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:42:7: 'or'
            {
            match("or"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T86

    // $ANTLR start T87
    public final void mT87() throws RecognitionException {
        try {
            int _type = T87;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:43:5: ( 'and' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:43:7: 'and'
            {
            match("and"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T87

    // $ANTLR start T88
    public final void mT88() throws RecognitionException {
        try {
            int _type = T88;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:44:5: ( 'like' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:44:7: 'like'
            {
            match("like"); 


            }

            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end T88

    // $ANTLR start ML_COMMENT
    public final void mML_COMMENT() throws RecognitionException {
        try {
            int _type = ML_COMMENT;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:147:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:147:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:147:14: ( options {greedy=false; } : . )*
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
            	    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:147:41: .
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:151:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:151:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:151:12: (~ ( '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<='\uFFFE')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:151:12: ~ ( '\\n' | '\\r' )
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

            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:151:26: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:151:26: '\\r'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:154:4: ( '.' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:154:6: '.'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:155:6: ( ';' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:155:8: ';'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:156:6: ( ',' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:156:8: ','
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:157:7: ( ')' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:157:9: ')'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:158:7: ( '(' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:158:9: '('
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:159:14: ( '\"' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:159:16: '\"'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:160:14: ( '\\'' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:160:16: '\\''
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:161:3: ( '@' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:161:5: '@'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:162:10: ( '*' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:162:12: '*'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:163:7: ( '=' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:163:9: '='
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:164:11: ( '!=' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:164:13: '!='
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:165:6: ( '<' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:165:8: '<'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:166:6: ( '<=' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:166:8: '<='
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:167:9: ( '>' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:167:11: '>'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:168:5: ( '>=' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:168:7: '>='
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:169:7: ( '|' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:169:9: '|'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:171:7: ( 'select' | 'SELECT' )
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
                    new NoViableAltException("171:1: Select : ( 'select' | 'SELECT' );", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:171:9: 'select'
                    {
                    match("select"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:171:20: 'SELECT'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:172:5: ( 'from' | 'FROM' )
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
                    new NoViableAltException("172:1: From : ( 'from' | 'FROM' );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:172:7: 'from'
                    {
                    match("from"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:172:16: 'FROM'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:173:6: ( 'where' | 'WHERE' )
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
                    new NoViableAltException("173:1: Where : ( 'where' | 'WHERE' );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:173:8: 'where'
                    {
                    match("where"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:173:18: 'WHERE'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:3: ( 'in' | 'IN' )
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
                    new NoViableAltException("174:1: In : ( 'in' | 'IN' );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:5: 'in'
                    {
                    match("in"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:174:12: 'IN'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:175:7: ( 'insert' | 'INSERT' )
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
                    new NoViableAltException("175:1: Insert : ( 'insert' | 'INSERT' );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:175:9: 'insert'
                    {
                    match("insert"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:175:20: 'INSERT'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:176:5: ( 'into' | 'INTO' )
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
                    new NoViableAltException("176:1: Into : ( 'into' | 'INTO' );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:176:7: 'into'
                    {
                    match("into"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:176:16: 'INTO'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:177:7: ( 'object' | 'OBJECT' | 'Object' )
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='o') ) {
                alt10=1;
            }
            else if ( (LA10_0=='O') ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2=='B') ) {
                    alt10=2;
                }
                else if ( (LA10_2=='b') ) {
                    alt10=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("177:1: Object : ( 'object' | 'OBJECT' | 'Object' );", 10, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("177:1: Object : ( 'object' | 'OBJECT' | 'Object' );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:177:9: 'object'
                    {
                    match("object"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:177:20: 'OBJECT'
                    {
                    match("OBJECT"); 


                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:177:31: 'Object'
                    {
                    match("Object"); 


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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:178:13: ( 'relationship' | 'RELATIONSHIP' | 'Relationship' )
            int alt11=3;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='r') ) {
                alt11=1;
            }
            else if ( (LA11_0=='R') ) {
                int LA11_2 = input.LA(2);

                if ( (LA11_2=='e') ) {
                    alt11=3;
                }
                else if ( (LA11_2=='E') ) {
                    alt11=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("178:1: Relationship : ( 'relationship' | 'RELATIONSHIP' | 'Relationship' );", 11, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("178:1: Relationship : ( 'relationship' | 'RELATIONSHIP' | 'Relationship' );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:178:15: 'relationship'
                    {
                    match("relationship"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:178:32: 'RELATIONSHIP'
                    {
                    match("RELATIONSHIP"); 


                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:178:49: 'Relationship'
                    {
                    match("Relationship"); 


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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:179:9: ( 'hasmany' | 'HASMANY' | 'HasMany' )
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
                        new NoViableAltException("179:1: HasMany : ( 'hasmany' | 'HASMANY' | 'HasMany' );", 12, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("179:1: HasMany : ( 'hasmany' | 'HASMANY' | 'HasMany' );", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:179:11: 'hasmany'
                    {
                    match("hasmany"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:179:23: 'HASMANY'
                    {
                    match("HASMANY"); 


                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:179:35: 'HasMany'
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

    // $ANTLR start HasOne
    public final void mHasOne() throws RecognitionException {
        try {
            int _type = HasOne;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:180:8: ( 'hasone' | 'HASONE' | 'HasOne' )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='h') ) {
                alt13=1;
            }
            else if ( (LA13_0=='H') ) {
                int LA13_2 = input.LA(2);

                if ( (LA13_2=='a') ) {
                    alt13=3;
                }
                else if ( (LA13_2=='A') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("180:1: HasOne : ( 'hasone' | 'HASONE' | 'HasOne' );", 13, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("180:1: HasOne : ( 'hasone' | 'HASONE' | 'HasOne' );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:180:10: 'hasone'
                    {
                    match("hasone"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:180:21: 'HASONE'
                    {
                    match("HASONE"); 


                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:180:32: 'HasOne'
                    {
                    match("HasOne"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end HasOne

    // $ANTLR start DIVIDE
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:181:7: ( 'divide' | 'DIVIDE' | 'Divide' )
            int alt14=3;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='d') ) {
                alt14=1;
            }
            else if ( (LA14_0=='D') ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2=='I') ) {
                    alt14=2;
                }
                else if ( (LA14_2=='i') ) {
                    alt14=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("181:1: DIVIDE : ( 'divide' | 'DIVIDE' | 'Divide' );", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("181:1: DIVIDE : ( 'divide' | 'DIVIDE' | 'Divide' );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:181:9: 'divide'
                    {
                    match("divide"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:181:20: 'DIVIDE'
                    {
                    match("DIVIDE"); 


                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:181:31: 'Divide'
                    {
                    match("Divide"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DIVIDE

    // $ANTLR start DISTINCT
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:182:9: ( 'distinct' | 'DISTINCT' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='d') ) {
                alt15=1;
            }
            else if ( (LA15_0=='D') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("182:1: DISTINCT : ( 'distinct' | 'DISTINCT' );", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:182:11: 'distinct'
                    {
                    match("distinct"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:182:24: 'DISTINCT'
                    {
                    match("DISTINCT"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end DISTINCT

    // $ANTLR start RANGE
    public final void mRANGE() throws RecognitionException {
        try {
            int _type = RANGE;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:183:6: ( 'range' | 'RANGE' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='r') ) {
                alt16=1;
            }
            else if ( (LA16_0=='R') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("183:1: RANGE : ( 'range' | 'RANGE' );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:183:8: 'range'
                    {
                    match("range"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:183:18: 'RANGE'
                    {
                    match("RANGE"); 


                    }
                    break;

            }
            this.type = _type;
        }
        finally {
        }
    }
    // $ANTLR end RANGE

    // $ANTLR start DataType
    public final void mDataType() throws RecognitionException {
        try {
            int _type = DataType;
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:9: ( 'string' | 'integer' | 'boolean' | 'float' | 'double' | 'text' )
            int alt17=6;
            switch ( input.LA(1) ) {
            case 's':
                {
                alt17=1;
                }
                break;
            case 'i':
                {
                alt17=2;
                }
                break;
            case 'b':
                {
                alt17=3;
                }
                break;
            case 'f':
                {
                alt17=4;
                }
                break;
            case 'd':
                {
                alt17=5;
                }
                break;
            case 't':
                {
                alt17=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("186:1: DataType : ( 'string' | 'integer' | 'boolean' | 'float' | 'double' | 'text' );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:11: 'string'
                    {
                    match("string"); 


                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:22: 'integer'
                    {
                    match("integer"); 


                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:34: 'boolean'
                    {
                    match("boolean"); 


                    }
                    break;
                case 4 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:46: 'float'
                    {
                    match("float"); 


                    }
                    break;
                case 5 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:56: 'double'
                    {
                    match("double"); 


                    }
                    break;
                case 6 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:186:67: 'text'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:189:16: ( 'a' .. 'z' | 'A' .. 'Z' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:190:15: ( '0' .. '9' )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:190:17: '0' .. '9'
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:191:7: ( ( Digit )+ )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:191:9: ( Digit )+
            {
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:191:9: ( Digit )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:191:10: Digit
            	    {
            	    mDigit(); 

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:193:18: ( Letter | Digit | '_' | '-' | At )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:195:15: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+ )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:195:17: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+
            {
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:195:17: ( ' ' | '\\t' | '\\n' | '\\r' | '\\u000C' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\t' && LA19_0<='\n')||(LA19_0>='\f' && LA19_0<='\r')||LA19_0==' ') ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:
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
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:198:1: ( Quot (~ '\"' )* Quot | Apos (~ '\\'' )* Apos )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='\"') ) {
                alt22=1;
            }
            else if ( (LA22_0=='\'') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("197:1: StringLiteral : ( Quot (~ '\"' )* Quot | Apos (~ '\\'' )* Apos );", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:198:3: Quot (~ '\"' )* Quot
                    {
                    mQuot(); 
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:198:9: (~ '\"' )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( ((LA20_0>='\u0000' && LA20_0<='!')||(LA20_0>='#' && LA20_0<='\uFFFE')) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:198:10: ~ '\"'
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
                    	    break loop20;
                        }
                    } while (true);

                    mQuot(); 

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:199:3: Apos (~ '\\'' )* Apos
                    {
                    mApos(); 
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:199:9: (~ '\\'' )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( ((LA21_0>='\u0000' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='\uFFFE')) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:199:10: ~ '\\''
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
                    	    break loop21;
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:203:14: ( ( Letter | '_' ) ( NameChar )* )
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:203:16: ( Letter | '_' ) ( NameChar )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recover(mse);    throw mse;
            }

            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:203:31: ( NameChar )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0=='-'||(LA23_0>='0' && LA23_0<='9')||(LA23_0>='@' && LA23_0<='Z')||LA23_0=='_'||(LA23_0>='a' && LA23_0<='z')) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:203:31: NameChar
            	    {
            	    mNameChar(); 

            	    }
            	    break;

            	default :
            	    break loop23;
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
            // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:206:2: ( Name Colon Name | Name )
            int alt24=2;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:206:4: Name Colon Name
                    {
                    mName(); 
                    mColon(); 
                    mName(); 

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:207:4: Name
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
        // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:8: ( T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | ML_COMMENT | LINE_COMMENT | Dot | Colon | Comma | RParen | LParen | At | Wildcard | EQUAL | NOT_EQUAL | LESS | LEQ | GREATER | GEQ | SPLIT | Select | From | Where | In | Insert | Into | Object | Relationship | HasMany | HasOne | DIVIDE | DISTINCT | RANGE | DataType | Digits | WhiteSpaceChar | StringLiteral | QName )
        int alt25=46;
        switch ( input.LA(1) ) {
        case 'b':
            {
            switch ( input.LA(2) ) {
            case 'y':
                {
                int LA25_42 = input.LA(3);

                if ( (LA25_42=='-'||(LA25_42>='0' && LA25_42<='9')||LA25_42==';'||(LA25_42>='@' && LA25_42<='Z')||LA25_42=='_'||(LA25_42>='a' && LA25_42<='z')) ) {
                    alt25=46;
                }
                else {
                    alt25=1;}
                }
                break;
            case 'o':
                {
                int LA25_43 = input.LA(3);

                if ( (LA25_43=='o') ) {
                    int LA25_84 = input.LA(4);

                    if ( (LA25_84=='l') ) {
                        int LA25_125 = input.LA(5);

                        if ( (LA25_125=='e') ) {
                            int LA25_167 = input.LA(6);

                            if ( (LA25_167=='a') ) {
                                int LA25_205 = input.LA(7);

                                if ( (LA25_205=='n') ) {
                                    int LA25_234 = input.LA(8);

                                    if ( (LA25_234=='-'||(LA25_234>='0' && LA25_234<='9')||LA25_234==';'||(LA25_234>='@' && LA25_234<='Z')||LA25_234=='_'||(LA25_234>='a' && LA25_234<='z')) ) {
                                        alt25=46;
                                    }
                                    else {
                                        alt25=42;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'a':
            {
            switch ( input.LA(2) ) {
            case 'n':
                {
                int LA25_44 = input.LA(3);

                if ( (LA25_44=='d') ) {
                    int LA25_85 = input.LA(4);

                    if ( (LA25_85=='-'||(LA25_85>='0' && LA25_85<='9')||LA25_85==';'||(LA25_85>='@' && LA25_85<='Z')||LA25_85=='_'||(LA25_85>='a' && LA25_85<='z')) ) {
                        alt25=46;
                    }
                    else {
                        alt25=11;}
                }
                else {
                    alt25=46;}
                }
                break;
            case 's':
                {
                int LA25_45 = input.LA(3);

                if ( (LA25_45=='-'||(LA25_45>='0' && LA25_45<='9')||LA25_45==';'||(LA25_45>='@' && LA25_45<='Z')||LA25_45=='_'||(LA25_45>='a' && LA25_45<='z')) ) {
                    alt25=46;
                }
                else {
                    alt25=8;}
                }
                break;
            case 'u':
                {
                int LA25_46 = input.LA(3);

                if ( (LA25_46=='t') ) {
                    int LA25_87 = input.LA(4);

                    if ( (LA25_87=='o') ) {
                        int LA25_127 = input.LA(5);

                        if ( (LA25_127=='-'||(LA25_127>='0' && LA25_127<='9')||LA25_127==';'||(LA25_127>='@' && LA25_127<='Z')||LA25_127=='_'||(LA25_127>='a' && LA25_127<='z')) ) {
                            alt25=46;
                        }
                        else {
                            alt25=2;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'A':
            {
            int LA25_3 = input.LA(2);

            if ( (LA25_3=='U') ) {
                int LA25_47 = input.LA(3);

                if ( (LA25_47=='T') ) {
                    int LA25_88 = input.LA(4);

                    if ( (LA25_88=='O') ) {
                        int LA25_128 = input.LA(5);

                        if ( (LA25_128=='-'||(LA25_128>='0' && LA25_128<='9')||LA25_128==';'||(LA25_128>='@' && LA25_128<='Z')||LA25_128=='_'||(LA25_128>='a' && LA25_128<='z')) ) {
                            alt25=46;
                        }
                        else {
                            alt25=3;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
            }
            break;
        case 'u':
            {
            int LA25_4 = input.LA(2);

            if ( (LA25_4=='p') ) {
                int LA25_48 = input.LA(3);

                if ( (LA25_48=='d') ) {
                    int LA25_89 = input.LA(4);

                    if ( (LA25_89=='a') ) {
                        int LA25_129 = input.LA(5);

                        if ( (LA25_129=='t') ) {
                            int LA25_170 = input.LA(6);

                            if ( (LA25_170=='e') ) {
                                int LA25_206 = input.LA(7);

                                if ( (LA25_206=='-'||(LA25_206>='0' && LA25_206<='9')||LA25_206==';'||(LA25_206>='@' && LA25_206<='Z')||LA25_206=='_'||(LA25_206>='a' && LA25_206<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=4;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
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
                    int LA25_90 = input.LA(4);

                    if ( (LA25_90=='e') ) {
                        int LA25_130 = input.LA(5);

                        if ( (LA25_130=='c') ) {
                            int LA25_171 = input.LA(6);

                            if ( (LA25_171=='t') ) {
                                int LA25_207 = input.LA(7);

                                if ( (LA25_207=='-'||(LA25_207>='0' && LA25_207<='9')||LA25_207==';'||(LA25_207>='@' && LA25_207<='Z')||LA25_207=='_'||(LA25_207>='a' && LA25_207<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=29;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                    }
                    break;
                case 't':
                    {
                    int LA25_91 = input.LA(4);

                    if ( (LA25_91=='-'||(LA25_91>='0' && LA25_91<='9')||LA25_91==';'||(LA25_91>='@' && LA25_91<='Z')||LA25_91=='_'||(LA25_91>='a' && LA25_91<='z')) ) {
                        alt25=46;
                    }
                    else {
                        alt25=5;}
                    }
                    break;
                default:
                    alt25=46;}

                }
                break;
            case 't':
                {
                int LA25_50 = input.LA(3);

                if ( (LA25_50=='r') ) {
                    int LA25_92 = input.LA(4);

                    if ( (LA25_92=='i') ) {
                        int LA25_132 = input.LA(5);

                        if ( (LA25_132=='n') ) {
                            int LA25_172 = input.LA(6);

                            if ( (LA25_172=='g') ) {
                                int LA25_208 = input.LA(7);

                                if ( (LA25_208=='-'||(LA25_208>='0' && LA25_208<='9')||LA25_208==';'||(LA25_208>='@' && LA25_208<='Z')||LA25_208=='_'||(LA25_208>='a' && LA25_208<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=42;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case '{':
            {
            alt25=6;
            }
            break;
        case '}':
            {
            alt25=7;
            }
            break;
        case 'o':
            {
            switch ( input.LA(2) ) {
            case 'r':
                {
                switch ( input.LA(3) ) {
                case 'd':
                    {
                    int LA25_93 = input.LA(4);

                    if ( (LA25_93=='e') ) {
                        int LA25_133 = input.LA(5);

                        if ( (LA25_133=='r') ) {
                            int LA25_173 = input.LA(6);

                            if ( (LA25_173=='-'||(LA25_173>='0' && LA25_173<='9')||LA25_173==';'||(LA25_173>='@' && LA25_173<='Z')||LA25_173=='_'||(LA25_173>='a' && LA25_173<='z')) ) {
                                alt25=46;
                            }
                            else {
                                alt25=9;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
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
                    alt25=46;
                    }
                    break;
                default:
                    alt25=10;}

                }
                break;
            case 'b':
                {
                int LA25_52 = input.LA(3);

                if ( (LA25_52=='j') ) {
                    int LA25_95 = input.LA(4);

                    if ( (LA25_95=='e') ) {
                        int LA25_134 = input.LA(5);

                        if ( (LA25_134=='c') ) {
                            int LA25_174 = input.LA(6);

                            if ( (LA25_174=='t') ) {
                                int LA25_210 = input.LA(7);

                                if ( (LA25_210=='-'||(LA25_210>='0' && LA25_210<='9')||LA25_210==';'||(LA25_210>='@' && LA25_210<='Z')||LA25_210=='_'||(LA25_210>='a' && LA25_210<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=35;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'l':
            {
            int LA25_9 = input.LA(2);

            if ( (LA25_9=='i') ) {
                int LA25_53 = input.LA(3);

                if ( (LA25_53=='k') ) {
                    int LA25_96 = input.LA(4);

                    if ( (LA25_96=='e') ) {
                        int LA25_135 = input.LA(5);

                        if ( (LA25_135=='-'||(LA25_135>='0' && LA25_135<='9')||LA25_135==';'||(LA25_135>='@' && LA25_135<='Z')||LA25_135=='_'||(LA25_135>='a' && LA25_135<='z')) ) {
                            alt25=46;
                        }
                        else {
                            alt25=12;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
            }
            break;
        case '/':
            {
            int LA25_10 = input.LA(2);

            if ( (LA25_10=='*') ) {
                alt25=13;
            }
            else if ( (LA25_10=='/') ) {
                alt25=14;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("1:1: Tokens : ( T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | ML_COMMENT | LINE_COMMENT | Dot | Colon | Comma | RParen | LParen | At | Wildcard | EQUAL | NOT_EQUAL | LESS | LEQ | GREATER | GEQ | SPLIT | Select | From | Where | In | Insert | Into | Object | Relationship | HasMany | HasOne | DIVIDE | DISTINCT | RANGE | DataType | Digits | WhiteSpaceChar | StringLiteral | QName );", 25, 10, input);

                throw nvae;
            }
            }
            break;
        case '.':
            {
            alt25=15;
            }
            break;
        case ';':
            {
            alt25=16;
            }
            break;
        case ',':
            {
            alt25=17;
            }
            break;
        case ')':
            {
            alt25=18;
            }
            break;
        case '(':
            {
            alt25=19;
            }
            break;
        case '@':
            {
            alt25=20;
            }
            break;
        case '*':
            {
            alt25=21;
            }
            break;
        case '=':
            {
            alt25=22;
            }
            break;
        case '!':
            {
            alt25=23;
            }
            break;
        case '<':
            {
            int LA25_20 = input.LA(2);

            if ( (LA25_20=='=') ) {
                alt25=25;
            }
            else {
                alt25=24;}
            }
            break;
        case '>':
            {
            int LA25_21 = input.LA(2);

            if ( (LA25_21=='=') ) {
                alt25=27;
            }
            else {
                alt25=26;}
            }
            break;
        case '|':
            {
            alt25=28;
            }
            break;
        case 'S':
            {
            int LA25_23 = input.LA(2);

            if ( (LA25_23=='E') ) {
                int LA25_60 = input.LA(3);

                if ( (LA25_60=='L') ) {
                    int LA25_97 = input.LA(4);

                    if ( (LA25_97=='E') ) {
                        int LA25_136 = input.LA(5);

                        if ( (LA25_136=='C') ) {
                            int LA25_176 = input.LA(6);

                            if ( (LA25_176=='T') ) {
                                int LA25_211 = input.LA(7);

                                if ( (LA25_211=='-'||(LA25_211>='0' && LA25_211<='9')||LA25_211==';'||(LA25_211>='@' && LA25_211<='Z')||LA25_211=='_'||(LA25_211>='a' && LA25_211<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=29;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
            }
            break;
        case 'f':
            {
            switch ( input.LA(2) ) {
            case 'l':
                {
                int LA25_61 = input.LA(3);

                if ( (LA25_61=='o') ) {
                    int LA25_98 = input.LA(4);

                    if ( (LA25_98=='a') ) {
                        int LA25_137 = input.LA(5);

                        if ( (LA25_137=='t') ) {
                            int LA25_177 = input.LA(6);

                            if ( (LA25_177=='-'||(LA25_177>='0' && LA25_177<='9')||LA25_177==';'||(LA25_177>='@' && LA25_177<='Z')||LA25_177=='_'||(LA25_177>='a' && LA25_177<='z')) ) {
                                alt25=46;
                            }
                            else {
                                alt25=42;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            case 'r':
                {
                int LA25_62 = input.LA(3);

                if ( (LA25_62=='o') ) {
                    int LA25_99 = input.LA(4);

                    if ( (LA25_99=='m') ) {
                        int LA25_138 = input.LA(5);

                        if ( (LA25_138=='-'||(LA25_138>='0' && LA25_138<='9')||LA25_138==';'||(LA25_138>='@' && LA25_138<='Z')||LA25_138=='_'||(LA25_138>='a' && LA25_138<='z')) ) {
                            alt25=46;
                        }
                        else {
                            alt25=30;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'F':
            {
            int LA25_25 = input.LA(2);

            if ( (LA25_25=='R') ) {
                int LA25_63 = input.LA(3);

                if ( (LA25_63=='O') ) {
                    int LA25_100 = input.LA(4);

                    if ( (LA25_100=='M') ) {
                        int LA25_139 = input.LA(5);

                        if ( (LA25_139=='-'||(LA25_139>='0' && LA25_139<='9')||LA25_139==';'||(LA25_139>='@' && LA25_139<='Z')||LA25_139=='_'||(LA25_139>='a' && LA25_139<='z')) ) {
                            alt25=46;
                        }
                        else {
                            alt25=30;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
            }
            break;
        case 'w':
            {
            int LA25_26 = input.LA(2);

            if ( (LA25_26=='h') ) {
                int LA25_64 = input.LA(3);

                if ( (LA25_64=='e') ) {
                    int LA25_101 = input.LA(4);

                    if ( (LA25_101=='r') ) {
                        int LA25_140 = input.LA(5);

                        if ( (LA25_140=='e') ) {
                            int LA25_179 = input.LA(6);

                            if ( (LA25_179=='-'||(LA25_179>='0' && LA25_179<='9')||LA25_179==';'||(LA25_179>='@' && LA25_179<='Z')||LA25_179=='_'||(LA25_179>='a' && LA25_179<='z')) ) {
                                alt25=46;
                            }
                            else {
                                alt25=31;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
            }
            break;
        case 'W':
            {
            int LA25_27 = input.LA(2);

            if ( (LA25_27=='H') ) {
                int LA25_65 = input.LA(3);

                if ( (LA25_65=='E') ) {
                    int LA25_102 = input.LA(4);

                    if ( (LA25_102=='R') ) {
                        int LA25_141 = input.LA(5);

                        if ( (LA25_141=='E') ) {
                            int LA25_180 = input.LA(6);

                            if ( (LA25_180=='-'||(LA25_180>='0' && LA25_180<='9')||LA25_180==';'||(LA25_180>='@' && LA25_180<='Z')||LA25_180=='_'||(LA25_180>='a' && LA25_180<='z')) ) {
                                alt25=46;
                            }
                            else {
                                alt25=31;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
            }
            break;
        case 'i':
            {
            int LA25_28 = input.LA(2);

            if ( (LA25_28=='n') ) {
                switch ( input.LA(3) ) {
                case 't':
                    {
                    switch ( input.LA(4) ) {
                    case 'e':
                        {
                        int LA25_142 = input.LA(5);

                        if ( (LA25_142=='g') ) {
                            int LA25_181 = input.LA(6);

                            if ( (LA25_181=='e') ) {
                                int LA25_213 = input.LA(7);

                                if ( (LA25_213=='r') ) {
                                    int LA25_238 = input.LA(8);

                                    if ( (LA25_238=='-'||(LA25_238>='0' && LA25_238<='9')||LA25_238==';'||(LA25_238>='@' && LA25_238<='Z')||LA25_238=='_'||(LA25_238>='a' && LA25_238<='z')) ) {
                                        alt25=46;
                                    }
                                    else {
                                        alt25=42;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                        }
                        break;
                    case 'o':
                        {
                        int LA25_143 = input.LA(5);

                        if ( (LA25_143=='-'||(LA25_143>='0' && LA25_143<='9')||LA25_143==';'||(LA25_143>='@' && LA25_143<='Z')||LA25_143=='_'||(LA25_143>='a' && LA25_143<='z')) ) {
                            alt25=46;
                        }
                        else {
                            alt25=34;}
                        }
                        break;
                    default:
                        alt25=46;}

                    }
                    break;
                case 's':
                    {
                    int LA25_104 = input.LA(4);

                    if ( (LA25_104=='e') ) {
                        int LA25_144 = input.LA(5);

                        if ( (LA25_144=='r') ) {
                            int LA25_183 = input.LA(6);

                            if ( (LA25_183=='t') ) {
                                int LA25_214 = input.LA(7);

                                if ( (LA25_214=='-'||(LA25_214>='0' && LA25_214<='9')||LA25_214==';'||(LA25_214>='@' && LA25_214<='Z')||LA25_214=='_'||(LA25_214>='a' && LA25_214<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=33;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
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
                    alt25=46;
                    }
                    break;
                default:
                    alt25=32;}

            }
            else {
                alt25=46;}
            }
            break;
        case 'I':
            {
            int LA25_29 = input.LA(2);

            if ( (LA25_29=='N') ) {
                switch ( input.LA(3) ) {
                case 'T':
                    {
                    int LA25_106 = input.LA(4);

                    if ( (LA25_106=='O') ) {
                        int LA25_145 = input.LA(5);

                        if ( (LA25_145=='-'||(LA25_145>='0' && LA25_145<='9')||LA25_145==';'||(LA25_145>='@' && LA25_145<='Z')||LA25_145=='_'||(LA25_145>='a' && LA25_145<='z')) ) {
                            alt25=46;
                        }
                        else {
                            alt25=34;}
                    }
                    else {
                        alt25=46;}
                    }
                    break;
                case 'S':
                    {
                    int LA25_107 = input.LA(4);

                    if ( (LA25_107=='E') ) {
                        int LA25_146 = input.LA(5);

                        if ( (LA25_146=='R') ) {
                            int LA25_184 = input.LA(6);

                            if ( (LA25_184=='T') ) {
                                int LA25_215 = input.LA(7);

                                if ( (LA25_215=='-'||(LA25_215>='0' && LA25_215<='9')||LA25_215==';'||(LA25_215>='@' && LA25_215<='Z')||LA25_215=='_'||(LA25_215>='a' && LA25_215<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=33;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
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
                    alt25=46;
                    }
                    break;
                default:
                    alt25=32;}

            }
            else {
                alt25=46;}
            }
            break;
        case 'O':
            {
            switch ( input.LA(2) ) {
            case 'B':
                {
                int LA25_68 = input.LA(3);

                if ( (LA25_68=='J') ) {
                    int LA25_108 = input.LA(4);

                    if ( (LA25_108=='E') ) {
                        int LA25_147 = input.LA(5);

                        if ( (LA25_147=='C') ) {
                            int LA25_185 = input.LA(6);

                            if ( (LA25_185=='T') ) {
                                int LA25_216 = input.LA(7);

                                if ( (LA25_216=='-'||(LA25_216>='0' && LA25_216<='9')||LA25_216==';'||(LA25_216>='@' && LA25_216<='Z')||LA25_216=='_'||(LA25_216>='a' && LA25_216<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=35;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            case 'b':
                {
                int LA25_69 = input.LA(3);

                if ( (LA25_69=='j') ) {
                    int LA25_109 = input.LA(4);

                    if ( (LA25_109=='e') ) {
                        int LA25_148 = input.LA(5);

                        if ( (LA25_148=='c') ) {
                            int LA25_186 = input.LA(6);

                            if ( (LA25_186=='t') ) {
                                int LA25_217 = input.LA(7);

                                if ( (LA25_217=='-'||(LA25_217>='0' && LA25_217<='9')||LA25_217==';'||(LA25_217>='@' && LA25_217<='Z')||LA25_217=='_'||(LA25_217>='a' && LA25_217<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=35;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'r':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA25_70 = input.LA(3);

                if ( (LA25_70=='n') ) {
                    int LA25_110 = input.LA(4);

                    if ( (LA25_110=='g') ) {
                        int LA25_149 = input.LA(5);

                        if ( (LA25_149=='e') ) {
                            int LA25_187 = input.LA(6);

                            if ( (LA25_187=='-'||(LA25_187>='0' && LA25_187<='9')||LA25_187==';'||(LA25_187>='@' && LA25_187<='Z')||LA25_187=='_'||(LA25_187>='a' && LA25_187<='z')) ) {
                                alt25=46;
                            }
                            else {
                                alt25=41;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            case 'e':
                {
                int LA25_71 = input.LA(3);

                if ( (LA25_71=='l') ) {
                    int LA25_111 = input.LA(4);

                    if ( (LA25_111=='a') ) {
                        int LA25_150 = input.LA(5);

                        if ( (LA25_150=='t') ) {
                            int LA25_188 = input.LA(6);

                            if ( (LA25_188=='i') ) {
                                int LA25_219 = input.LA(7);

                                if ( (LA25_219=='o') ) {
                                    int LA25_240 = input.LA(8);

                                    if ( (LA25_240=='n') ) {
                                        int LA25_250 = input.LA(9);

                                        if ( (LA25_250=='s') ) {
                                            int LA25_256 = input.LA(10);

                                            if ( (LA25_256=='h') ) {
                                                int LA25_260 = input.LA(11);

                                                if ( (LA25_260=='i') ) {
                                                    int LA25_263 = input.LA(12);

                                                    if ( (LA25_263=='p') ) {
                                                        int LA25_266 = input.LA(13);

                                                        if ( (LA25_266=='-'||(LA25_266>='0' && LA25_266<='9')||LA25_266==';'||(LA25_266>='@' && LA25_266<='Z')||LA25_266=='_'||(LA25_266>='a' && LA25_266<='z')) ) {
                                                            alt25=46;
                                                        }
                                                        else {
                                                            alt25=36;}
                                                    }
                                                    else {
                                                        alt25=46;}
                                                }
                                                else {
                                                    alt25=46;}
                                            }
                                            else {
                                                alt25=46;}
                                        }
                                        else {
                                            alt25=46;}
                                    }
                                    else {
                                        alt25=46;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'R':
            {
            switch ( input.LA(2) ) {
            case 'E':
                {
                int LA25_72 = input.LA(3);

                if ( (LA25_72=='L') ) {
                    int LA25_112 = input.LA(4);

                    if ( (LA25_112=='A') ) {
                        int LA25_151 = input.LA(5);

                        if ( (LA25_151=='T') ) {
                            int LA25_189 = input.LA(6);

                            if ( (LA25_189=='I') ) {
                                int LA25_220 = input.LA(7);

                                if ( (LA25_220=='O') ) {
                                    int LA25_241 = input.LA(8);

                                    if ( (LA25_241=='N') ) {
                                        int LA25_251 = input.LA(9);

                                        if ( (LA25_251=='S') ) {
                                            int LA25_257 = input.LA(10);

                                            if ( (LA25_257=='H') ) {
                                                int LA25_261 = input.LA(11);

                                                if ( (LA25_261=='I') ) {
                                                    int LA25_264 = input.LA(12);

                                                    if ( (LA25_264=='P') ) {
                                                        int LA25_267 = input.LA(13);

                                                        if ( (LA25_267=='-'||(LA25_267>='0' && LA25_267<='9')||LA25_267==';'||(LA25_267>='@' && LA25_267<='Z')||LA25_267=='_'||(LA25_267>='a' && LA25_267<='z')) ) {
                                                            alt25=46;
                                                        }
                                                        else {
                                                            alt25=36;}
                                                    }
                                                    else {
                                                        alt25=46;}
                                                }
                                                else {
                                                    alt25=46;}
                                            }
                                            else {
                                                alt25=46;}
                                        }
                                        else {
                                            alt25=46;}
                                    }
                                    else {
                                        alt25=46;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            case 'A':
                {
                int LA25_73 = input.LA(3);

                if ( (LA25_73=='N') ) {
                    int LA25_113 = input.LA(4);

                    if ( (LA25_113=='G') ) {
                        int LA25_152 = input.LA(5);

                        if ( (LA25_152=='E') ) {
                            int LA25_190 = input.LA(6);

                            if ( (LA25_190=='-'||(LA25_190>='0' && LA25_190<='9')||LA25_190==';'||(LA25_190>='@' && LA25_190<='Z')||LA25_190=='_'||(LA25_190>='a' && LA25_190<='z')) ) {
                                alt25=46;
                            }
                            else {
                                alt25=41;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            case 'e':
                {
                int LA25_74 = input.LA(3);

                if ( (LA25_74=='l') ) {
                    int LA25_114 = input.LA(4);

                    if ( (LA25_114=='a') ) {
                        int LA25_153 = input.LA(5);

                        if ( (LA25_153=='t') ) {
                            int LA25_191 = input.LA(6);

                            if ( (LA25_191=='i') ) {
                                int LA25_221 = input.LA(7);

                                if ( (LA25_221=='o') ) {
                                    int LA25_242 = input.LA(8);

                                    if ( (LA25_242=='n') ) {
                                        int LA25_252 = input.LA(9);

                                        if ( (LA25_252=='s') ) {
                                            int LA25_258 = input.LA(10);

                                            if ( (LA25_258=='h') ) {
                                                int LA25_262 = input.LA(11);

                                                if ( (LA25_262=='i') ) {
                                                    int LA25_265 = input.LA(12);

                                                    if ( (LA25_265=='p') ) {
                                                        int LA25_268 = input.LA(13);

                                                        if ( (LA25_268=='-'||(LA25_268>='0' && LA25_268<='9')||LA25_268==';'||(LA25_268>='@' && LA25_268<='Z')||LA25_268=='_'||(LA25_268>='a' && LA25_268<='z')) ) {
                                                            alt25=46;
                                                        }
                                                        else {
                                                            alt25=36;}
                                                    }
                                                    else {
                                                        alt25=46;}
                                                }
                                                else {
                                                    alt25=46;}
                                            }
                                            else {
                                                alt25=46;}
                                        }
                                        else {
                                            alt25=46;}
                                    }
                                    else {
                                        alt25=46;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'h':
            {
            int LA25_33 = input.LA(2);

            if ( (LA25_33=='a') ) {
                int LA25_75 = input.LA(3);

                if ( (LA25_75=='s') ) {
                    switch ( input.LA(4) ) {
                    case 'm':
                        {
                        int LA25_154 = input.LA(5);

                        if ( (LA25_154=='a') ) {
                            int LA25_192 = input.LA(6);

                            if ( (LA25_192=='n') ) {
                                int LA25_222 = input.LA(7);

                                if ( (LA25_222=='y') ) {
                                    int LA25_243 = input.LA(8);

                                    if ( (LA25_243=='-'||(LA25_243>='0' && LA25_243<='9')||LA25_243==';'||(LA25_243>='@' && LA25_243<='Z')||LA25_243=='_'||(LA25_243>='a' && LA25_243<='z')) ) {
                                        alt25=46;
                                    }
                                    else {
                                        alt25=37;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                        }
                        break;
                    case 'o':
                        {
                        int LA25_155 = input.LA(5);

                        if ( (LA25_155=='n') ) {
                            int LA25_193 = input.LA(6);

                            if ( (LA25_193=='e') ) {
                                int LA25_223 = input.LA(7);

                                if ( (LA25_223=='-'||(LA25_223>='0' && LA25_223<='9')||LA25_223==';'||(LA25_223>='@' && LA25_223<='Z')||LA25_223=='_'||(LA25_223>='a' && LA25_223<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=38;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                        }
                        break;
                    default:
                        alt25=46;}

                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
            }
            break;
        case 'H':
            {
            switch ( input.LA(2) ) {
            case 'a':
                {
                int LA25_76 = input.LA(3);

                if ( (LA25_76=='s') ) {
                    switch ( input.LA(4) ) {
                    case 'M':
                        {
                        int LA25_156 = input.LA(5);

                        if ( (LA25_156=='a') ) {
                            int LA25_194 = input.LA(6);

                            if ( (LA25_194=='n') ) {
                                int LA25_224 = input.LA(7);

                                if ( (LA25_224=='y') ) {
                                    int LA25_245 = input.LA(8);

                                    if ( (LA25_245=='-'||(LA25_245>='0' && LA25_245<='9')||LA25_245==';'||(LA25_245>='@' && LA25_245<='Z')||LA25_245=='_'||(LA25_245>='a' && LA25_245<='z')) ) {
                                        alt25=46;
                                    }
                                    else {
                                        alt25=37;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                        }
                        break;
                    case 'O':
                        {
                        int LA25_157 = input.LA(5);

                        if ( (LA25_157=='n') ) {
                            int LA25_195 = input.LA(6);

                            if ( (LA25_195=='e') ) {
                                int LA25_225 = input.LA(7);

                                if ( (LA25_225=='-'||(LA25_225>='0' && LA25_225<='9')||LA25_225==';'||(LA25_225>='@' && LA25_225<='Z')||LA25_225=='_'||(LA25_225>='a' && LA25_225<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=38;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                        }
                        break;
                    default:
                        alt25=46;}

                }
                else {
                    alt25=46;}
                }
                break;
            case 'A':
                {
                int LA25_77 = input.LA(3);

                if ( (LA25_77=='S') ) {
                    switch ( input.LA(4) ) {
                    case 'M':
                        {
                        int LA25_158 = input.LA(5);

                        if ( (LA25_158=='A') ) {
                            int LA25_196 = input.LA(6);

                            if ( (LA25_196=='N') ) {
                                int LA25_226 = input.LA(7);

                                if ( (LA25_226=='Y') ) {
                                    int LA25_246 = input.LA(8);

                                    if ( (LA25_246=='-'||(LA25_246>='0' && LA25_246<='9')||LA25_246==';'||(LA25_246>='@' && LA25_246<='Z')||LA25_246=='_'||(LA25_246>='a' && LA25_246<='z')) ) {
                                        alt25=46;
                                    }
                                    else {
                                        alt25=37;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                        }
                        break;
                    case 'O':
                        {
                        int LA25_159 = input.LA(5);

                        if ( (LA25_159=='N') ) {
                            int LA25_197 = input.LA(6);

                            if ( (LA25_197=='E') ) {
                                int LA25_227 = input.LA(7);

                                if ( (LA25_227=='-'||(LA25_227>='0' && LA25_227<='9')||LA25_227==';'||(LA25_227>='@' && LA25_227<='Z')||LA25_227=='_'||(LA25_227>='a' && LA25_227<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=38;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                        }
                        break;
                    default:
                        alt25=46;}

                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'd':
            {
            switch ( input.LA(2) ) {
            case 'i':
                {
                switch ( input.LA(3) ) {
                case 's':
                    {
                    int LA25_118 = input.LA(4);

                    if ( (LA25_118=='t') ) {
                        int LA25_160 = input.LA(5);

                        if ( (LA25_160=='i') ) {
                            int LA25_198 = input.LA(6);

                            if ( (LA25_198=='n') ) {
                                int LA25_228 = input.LA(7);

                                if ( (LA25_228=='c') ) {
                                    int LA25_247 = input.LA(8);

                                    if ( (LA25_247=='t') ) {
                                        int LA25_254 = input.LA(9);

                                        if ( (LA25_254=='-'||(LA25_254>='0' && LA25_254<='9')||LA25_254==';'||(LA25_254>='@' && LA25_254<='Z')||LA25_254=='_'||(LA25_254>='a' && LA25_254<='z')) ) {
                                            alt25=46;
                                        }
                                        else {
                                            alt25=40;}
                                    }
                                    else {
                                        alt25=46;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                    }
                    break;
                case 'v':
                    {
                    int LA25_119 = input.LA(4);

                    if ( (LA25_119=='i') ) {
                        int LA25_161 = input.LA(5);

                        if ( (LA25_161=='d') ) {
                            int LA25_199 = input.LA(6);

                            if ( (LA25_199=='e') ) {
                                int LA25_229 = input.LA(7);

                                if ( (LA25_229=='-'||(LA25_229>='0' && LA25_229<='9')||LA25_229==';'||(LA25_229>='@' && LA25_229<='Z')||LA25_229=='_'||(LA25_229>='a' && LA25_229<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=39;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                    }
                    break;
                default:
                    alt25=46;}

                }
                break;
            case 'o':
                {
                int LA25_79 = input.LA(3);

                if ( (LA25_79=='u') ) {
                    int LA25_120 = input.LA(4);

                    if ( (LA25_120=='b') ) {
                        int LA25_162 = input.LA(5);

                        if ( (LA25_162=='l') ) {
                            int LA25_200 = input.LA(6);

                            if ( (LA25_200=='e') ) {
                                int LA25_230 = input.LA(7);

                                if ( (LA25_230=='-'||(LA25_230>='0' && LA25_230<='9')||LA25_230==';'||(LA25_230>='@' && LA25_230<='Z')||LA25_230=='_'||(LA25_230>='a' && LA25_230<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=42;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 'D':
            {
            switch ( input.LA(2) ) {
            case 'I':
                {
                switch ( input.LA(3) ) {
                case 'V':
                    {
                    int LA25_121 = input.LA(4);

                    if ( (LA25_121=='I') ) {
                        int LA25_163 = input.LA(5);

                        if ( (LA25_163=='D') ) {
                            int LA25_201 = input.LA(6);

                            if ( (LA25_201=='E') ) {
                                int LA25_231 = input.LA(7);

                                if ( (LA25_231=='-'||(LA25_231>='0' && LA25_231<='9')||LA25_231==';'||(LA25_231>='@' && LA25_231<='Z')||LA25_231=='_'||(LA25_231>='a' && LA25_231<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=39;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                    }
                    break;
                case 'S':
                    {
                    int LA25_122 = input.LA(4);

                    if ( (LA25_122=='T') ) {
                        int LA25_164 = input.LA(5);

                        if ( (LA25_164=='I') ) {
                            int LA25_202 = input.LA(6);

                            if ( (LA25_202=='N') ) {
                                int LA25_232 = input.LA(7);

                                if ( (LA25_232=='C') ) {
                                    int LA25_249 = input.LA(8);

                                    if ( (LA25_249=='T') ) {
                                        int LA25_255 = input.LA(9);

                                        if ( (LA25_255=='-'||(LA25_255>='0' && LA25_255<='9')||LA25_255==';'||(LA25_255>='@' && LA25_255<='Z')||LA25_255=='_'||(LA25_255>='a' && LA25_255<='z')) ) {
                                            alt25=46;
                                        }
                                        else {
                                            alt25=40;}
                                    }
                                    else {
                                        alt25=46;}
                                }
                                else {
                                    alt25=46;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                    }
                    break;
                default:
                    alt25=46;}

                }
                break;
            case 'i':
                {
                int LA25_81 = input.LA(3);

                if ( (LA25_81=='v') ) {
                    int LA25_123 = input.LA(4);

                    if ( (LA25_123=='i') ) {
                        int LA25_165 = input.LA(5);

                        if ( (LA25_165=='d') ) {
                            int LA25_203 = input.LA(6);

                            if ( (LA25_203=='e') ) {
                                int LA25_233 = input.LA(7);

                                if ( (LA25_233=='-'||(LA25_233>='0' && LA25_233<='9')||LA25_233==';'||(LA25_233>='@' && LA25_233<='Z')||LA25_233=='_'||(LA25_233>='a' && LA25_233<='z')) ) {
                                    alt25=46;
                                }
                                else {
                                    alt25=39;}
                            }
                            else {
                                alt25=46;}
                        }
                        else {
                            alt25=46;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
                }
                break;
            default:
                alt25=46;}

            }
            break;
        case 't':
            {
            int LA25_37 = input.LA(2);

            if ( (LA25_37=='e') ) {
                int LA25_82 = input.LA(3);

                if ( (LA25_82=='x') ) {
                    int LA25_124 = input.LA(4);

                    if ( (LA25_124=='t') ) {
                        int LA25_166 = input.LA(5);

                        if ( (LA25_166=='-'||(LA25_166>='0' && LA25_166<='9')||LA25_166==';'||(LA25_166>='@' && LA25_166<='Z')||LA25_166=='_'||(LA25_166>='a' && LA25_166<='z')) ) {
                            alt25=46;
                        }
                        else {
                            alt25=42;}
                    }
                    else {
                        alt25=46;}
                }
                else {
                    alt25=46;}
            }
            else {
                alt25=46;}
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
            alt25=43;
            }
            break;
        case '\t':
        case '\n':
        case '\f':
        case '\r':
        case ' ':
            {
            alt25=44;
            }
            break;
        case '\"':
        case '\'':
            {
            alt25=45;
            }
            break;
        case 'B':
        case 'C':
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
            alt25=46;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("1:1: Tokens : ( T77 | T78 | T79 | T80 | T81 | T82 | T83 | T84 | T85 | T86 | T87 | T88 | ML_COMMENT | LINE_COMMENT | Dot | Colon | Comma | RParen | LParen | At | Wildcard | EQUAL | NOT_EQUAL | LESS | LEQ | GREATER | GEQ | SPLIT | Select | From | Where | In | Insert | Into | Object | Relationship | HasMany | HasOne | DIVIDE | DISTINCT | RANGE | DataType | Digits | WhiteSpaceChar | StringLiteral | QName );", 25, 0, input);

            throw nvae;
        }

        switch (alt25) {
            case 1 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:10: T77
                {
                mT77(); 

                }
                break;
            case 2 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:14: T78
                {
                mT78(); 

                }
                break;
            case 3 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:18: T79
                {
                mT79(); 

                }
                break;
            case 4 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:22: T80
                {
                mT80(); 

                }
                break;
            case 5 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:26: T81
                {
                mT81(); 

                }
                break;
            case 6 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:30: T82
                {
                mT82(); 

                }
                break;
            case 7 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:34: T83
                {
                mT83(); 

                }
                break;
            case 8 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:38: T84
                {
                mT84(); 

                }
                break;
            case 9 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:42: T85
                {
                mT85(); 

                }
                break;
            case 10 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:46: T86
                {
                mT86(); 

                }
                break;
            case 11 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:50: T87
                {
                mT87(); 

                }
                break;
            case 12 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:54: T88
                {
                mT88(); 

                }
                break;
            case 13 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:58: ML_COMMENT
                {
                mML_COMMENT(); 

                }
                break;
            case 14 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:69: LINE_COMMENT
                {
                mLINE_COMMENT(); 

                }
                break;
            case 15 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:82: Dot
                {
                mDot(); 

                }
                break;
            case 16 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:86: Colon
                {
                mColon(); 

                }
                break;
            case 17 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:92: Comma
                {
                mComma(); 

                }
                break;
            case 18 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:98: RParen
                {
                mRParen(); 

                }
                break;
            case 19 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:105: LParen
                {
                mLParen(); 

                }
                break;
            case 20 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:112: At
                {
                mAt(); 

                }
                break;
            case 21 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:115: Wildcard
                {
                mWildcard(); 

                }
                break;
            case 22 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:124: EQUAL
                {
                mEQUAL(); 

                }
                break;
            case 23 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:130: NOT_EQUAL
                {
                mNOT_EQUAL(); 

                }
                break;
            case 24 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:140: LESS
                {
                mLESS(); 

                }
                break;
            case 25 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:145: LEQ
                {
                mLEQ(); 

                }
                break;
            case 26 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:149: GREATER
                {
                mGREATER(); 

                }
                break;
            case 27 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:157: GEQ
                {
                mGEQ(); 

                }
                break;
            case 28 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:161: SPLIT
                {
                mSPLIT(); 

                }
                break;
            case 29 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:167: Select
                {
                mSelect(); 

                }
                break;
            case 30 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:174: From
                {
                mFrom(); 

                }
                break;
            case 31 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:179: Where
                {
                mWhere(); 

                }
                break;
            case 32 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:185: In
                {
                mIn(); 

                }
                break;
            case 33 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:188: Insert
                {
                mInsert(); 

                }
                break;
            case 34 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:195: Into
                {
                mInto(); 

                }
                break;
            case 35 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:200: Object
                {
                mObject(); 

                }
                break;
            case 36 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:207: Relationship
                {
                mRelationship(); 

                }
                break;
            case 37 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:220: HasMany
                {
                mHasMany(); 

                }
                break;
            case 38 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:228: HasOne
                {
                mHasOne(); 

                }
                break;
            case 39 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:235: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 40 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:242: DISTINCT
                {
                mDISTINCT(); 

                }
                break;
            case 41 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:251: RANGE
                {
                mRANGE(); 

                }
                break;
            case 42 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:257: DataType
                {
                mDataType(); 

                }
                break;
            case 43 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:266: Digits
                {
                mDigits(); 

                }
                break;
            case 44 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:273: WhiteSpaceChar
                {
                mWhiteSpaceChar(); 

                }
                break;
            case 45 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:288: StringLiteral
                {
                mStringLiteral(); 

                }
                break;
            case 46 :
                // F:\\cygwin\\home\\leo\\work\\eclipse\\workspace\\xerial\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:1:302: QName
                {
                mQName(); 

                }
                break;

        }

    }


    protected DFA24 dfa24 = new DFA24(this);
    static final String DFA24_eotS =
        "\1\uffff\2\3\2\uffff";
    static final String DFA24_eofS =
        "\5\uffff";
    static final String DFA24_minS =
        "\1\101\2\55\2\uffff";
    static final String DFA24_maxS =
        "\3\172\2\uffff";
    static final String DFA24_acceptS =
        "\3\uffff\1\2\1\1";
    static final String DFA24_specialS =
        "\5\uffff}>";
    static final String[] DFA24_transitionS = {
            "\32\1\4\uffff\1\1\1\uffff\32\1",
            "\1\2\2\uffff\12\2\1\uffff\1\4\4\uffff\33\2\4\uffff\1\2\1\uffff"+
            "\32\2",
            "\1\2\2\uffff\12\2\1\uffff\1\4\4\uffff\33\2\4\uffff\1\2\1\uffff"+
            "\32\2",
            "",
            ""
    };

    static final short[] DFA24_eot = DFA.unpackEncodedString(DFA24_eotS);
    static final short[] DFA24_eof = DFA.unpackEncodedString(DFA24_eofS);
    static final char[] DFA24_min = DFA.unpackEncodedStringToUnsignedChars(DFA24_minS);
    static final char[] DFA24_max = DFA.unpackEncodedStringToUnsignedChars(DFA24_maxS);
    static final short[] DFA24_accept = DFA.unpackEncodedString(DFA24_acceptS);
    static final short[] DFA24_special = DFA.unpackEncodedString(DFA24_specialS);
    static final short[][] DFA24_transition;

    static {
        int numStates = DFA24_transitionS.length;
        DFA24_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA24_transition[i] = DFA.unpackEncodedString(DFA24_transitionS[i]);
        }
    }

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = DFA24_eot;
            this.eof = DFA24_eof;
            this.min = DFA24_min;
            this.max = DFA24_max;
            this.accept = DFA24_accept;
            this.special = DFA24_special;
            this.transition = DFA24_transition;
        }
        public String getDescription() {
            return "205:1: QName : ( Name Colon Name | Name );";
        }
    }
 

}