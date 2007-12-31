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
// $ANTLR 3.0.1 F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g 2007-12-11 17:43:07

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
// AmoebaQueryParser.java
// Since  2005/10/27 23:17:42
// 
//--------------------------------------------------
package org.xerial.amoeba.query;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class AmoebaQueryParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER", "STRING", "SELECTION", "CONDITION", "PROJECTION", "PROJECT_ALL", "ORDER_BY", "REF_ALL", "TARGET", "FUNCTION", "AND", "OR", "INPUT", "OUTPUT", "ASSIGN_LABEL", "COMPARE", "ATTRIBUTE", "REF", "VALUE", "CONTAINED_IN", "RELATION", "INSERT", "VALUE_SET", "NEW_VALUE", "NEW_RELATION", "UPDATE", "ATTRIBUTE_DEF", "SORT_TARGET", "ONE_TO_MANY", "ONE_TO_ONE", "OBJECT_DEF", "OBJECT", "LANG", "ML_COMMENT", "LINE_COMMENT", "Dot", "Colon", "Comma", "RParen", "LParen", "Quot", "Apos", "At", "Wildcard", "EQUAL", "NOT_EQUAL", "LESS", "LEQ", "GREATER", "GEQ", "SPLIT", "Select", "From", "Where", "In", "Insert", "Into", "Object", "Relationship", "HasMany", "HasOne", "DIVIDE", "DISTINCT", "RANGE", "DataType", "Letter", "Digit", "Digits", "NameChar", "WhiteSpaceChar", "StringLiteral", "Name", "QName", "'by'", "'auto'", "'AUTO'", "'update'", "'set'", "'{'", "'}'", "'as'", "'order'", "'or'", "'and'", "'like'"
    };
    public static final int FUNCTION=13;
    public static final int DataType=68;
    public static final int Insert=59;
    public static final int SORT_TARGET=31;
    public static final int Apos=45;
    public static final int Wildcard=47;
    public static final int HasMany=63;
    public static final int SPLIT=54;
    public static final int ATTRIBUTE=20;
    public static final int Where=57;
    public static final int INPUT=16;
    public static final int UPDATE=29;
    public static final int CONDITION=7;
    public static final int Into=60;
    public static final int AND=14;
    public static final int EOF=-1;
    public static final int SELECTION=6;
    public static final int ML_COMMENT=37;
    public static final int GREATER=52;
    public static final int ASSIGN_LABEL=18;
    public static final int INSERT=25;
    public static final int OBJECT=35;
    public static final int Digits=71;
    public static final int NOT_EQUAL=49;
    public static final int CONTAINED_IN=23;
    public static final int WhiteSpaceChar=73;
    public static final int NEW_VALUE=27;
    public static final int EQUAL=48;
    public static final int LESS=50;
    public static final int COMPARE=19;
    public static final int Select=55;
    public static final int REF_ALL=11;
    public static final int GEQ=53;
    public static final int VALUE_SET=26;
    public static final int Relationship=62;
    public static final int NEW_RELATION=28;
    public static final int Quot=44;
    public static final int DIVIDE=65;
    public static final int PROJECT_ALL=9;
    public static final int RParen=42;
    public static final int In=58;
    public static final int QName=76;
    public static final int At=46;
    public static final int LParen=43;
    public static final int LINE_COMMENT=38;
    public static final int NUMBER=4;
    public static final int NameChar=72;
    public static final int HasOne=64;
    public static final int RELATION=24;
    public static final int RANGE=67;
    public static final int Colon=40;
    public static final int TARGET=12;
    public static final int VALUE=22;
    public static final int Digit=70;
    public static final int ONE_TO_MANY=32;
    public static final int Object=61;
    public static final int From=56;
    public static final int REF=21;
    public static final int ATTRIBUTE_DEF=30;
    public static final int StringLiteral=74;
    public static final int ONE_TO_ONE=33;
    public static final int OR=15;
    public static final int Name=75;
    public static final int Dot=39;
    public static final int PROJECTION=8;
    public static final int DISTINCT=66;
    public static final int Comma=41;
    public static final int Letter=69;
    public static final int OUTPUT=17;
    public static final int ORDER_BY=10;
    public static final int STRING=5;
    public static final int LANG=36;
    public static final int LEQ=51;
    public static final int OBJECT_DEF=34;

        public AmoebaQueryParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[41+1];
         }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g"; }


    public static class integerLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start integerLiteral
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:211:1: integerLiteral : Digits ;
    public final integerLiteral_return integerLiteral() throws RecognitionException {
        integerLiteral_return retval = new integerLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Digits1=null;

        Object Digits1_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:211:15: ( Digits )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:211:17: Digits
            {
            root_0 = (Object)adaptor.nil();

            Digits1=(Token)input.LT(1);
            match(input,Digits,FOLLOW_Digits_in_integerLiteral716); if (failed) return retval;
            if ( backtracking==0 ) {
            Digits1_tree = (Object)adaptor.create(Digits1);
            adaptor.addChild(root_0, Digits1_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end integerLiteral

    public static class decimalLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start decimalLiteral
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:212:1: decimalLiteral : ( Dot Digits | Digits Dot Digits );
    public final decimalLiteral_return decimalLiteral() throws RecognitionException {
        decimalLiteral_return retval = new decimalLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Dot2=null;
        Token Digits3=null;
        Token Digits4=null;
        Token Dot5=null;
        Token Digits6=null;

        Object Dot2_tree=null;
        Object Digits3_tree=null;
        Object Digits4_tree=null;
        Object Dot5_tree=null;
        Object Digits6_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:212:15: ( Dot Digits | Digits Dot Digits )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Dot) ) {
                alt1=1;
            }
            else if ( (LA1_0==Digits) ) {
                alt1=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("212:1: decimalLiteral : ( Dot Digits | Digits Dot Digits );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:212:17: Dot Digits
                    {
                    root_0 = (Object)adaptor.nil();

                    Dot2=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_decimalLiteral722); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Dot2_tree = (Object)adaptor.create(Dot2);
                    adaptor.addChild(root_0, Dot2_tree);
                    }
                    Digits3=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral724); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Digits3_tree = (Object)adaptor.create(Digits3);
                    adaptor.addChild(root_0, Digits3_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:212:29: Digits Dot Digits
                    {
                    root_0 = (Object)adaptor.nil();

                    Digits4=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral727); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Digits4_tree = (Object)adaptor.create(Digits4);
                    adaptor.addChild(root_0, Digits4_tree);
                    }
                    Dot5=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_decimalLiteral729); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Dot5_tree = (Object)adaptor.create(Dot5);
                    adaptor.addChild(root_0, Dot5_tree);
                    }
                    Digits6=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral731); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Digits6_tree = (Object)adaptor.create(Digits6);
                    adaptor.addChild(root_0, Digits6_tree);
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end decimalLiteral

    public static class literal_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start literal
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:214:1: literal : ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) );
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token StringLiteral8=null;
        numericLiteral_return numericLiteral7 = null;


        Object StringLiteral8_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleSubtreeStream stream_numericLiteral=new RewriteRuleSubtreeStream(adaptor,"rule numericLiteral");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:214:8: ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case EOF:
            case Comma:
            case RParen:
            case EQUAL:
            case NOT_EQUAL:
            case LESS:
            case LEQ:
            case GREATER:
            case GEQ:
            case Select:
            case From:
            case Where:
            case In:
            case Insert:
            case Object:
            case Relationship:
            case DIVIDE:
            case 80:
            case 83:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt2=1;
                }
                break;
            case Dot:
            case Digits:
                {
                alt2=2;
                }
                break;
            case StringLiteral:
                {
                alt2=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("214:1: literal : ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:4: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal742);
                    numericLiteral7=numericLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_numericLiteral.add(numericLiteral7.getTree());

                    // AST REWRITE
                    // elements: numericLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 215:19: -> ^( NUMBER numericLiteral )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:22: ^( NUMBER numericLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(NUMBER, "NUMBER"), root_1);

                        adaptor.addChild(root_1, stream_numericLiteral.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:216:4: StringLiteral
                    {
                    StringLiteral8=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal755); if (failed) return retval;
                    if ( backtracking==0 ) stream_StringLiteral.add(StringLiteral8);


                    // AST REWRITE
                    // elements: StringLiteral
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 216:18: -> ^( STRING StringLiteral )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:216:21: ^( STRING StringLiteral )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(STRING, "STRING"), root_1);

                        adaptor.addChild(root_1, stream_StringLiteral.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end literal

    public static class numericLiteral_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start numericLiteral
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:219:1: numericLiteral : ( integerLiteral | decimalLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        integerLiteral_return integerLiteral9 = null;

        decimalLiteral_return decimalLiteral10 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:220:2: ( integerLiteral | decimalLiteral )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Digits) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==Dot) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||(LA3_1>=Comma && LA3_1<=RParen)||(LA3_1>=EQUAL && LA3_1<=GEQ)||(LA3_1>=Select && LA3_1<=Insert)||(LA3_1>=Object && LA3_1<=Relationship)||LA3_1==DIVIDE||LA3_1==80||LA3_1==83||(LA3_1>=85 && LA3_1<=88)) ) {
                    alt3=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("219:1: numericLiteral : ( integerLiteral | decimalLiteral );", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==Dot) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("219:1: numericLiteral : ( integerLiteral | decimalLiteral );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:220:4: integerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteral_in_numericLiteral775);
                    integerLiteral9=integerLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, integerLiteral9.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:221:4: decimalLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decimalLiteral_in_numericLiteral781);
                    decimalLiteral10=decimalLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, decimalLiteral10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end numericLiteral

    public static class lang_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start lang
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:226:1: lang : ( | ( expr )+ -> ^( LANG ( expr )+ ) );
    public final lang_return lang() throws RecognitionException {
        lang_return retval = new lang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expr_return expr11 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:226:5: ( | ( expr )+ -> ^( LANG ( expr )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF) ) {
                alt5=1;
            }
            else if ( (LA5_0==Select||LA5_0==Insert||(LA5_0>=Object && LA5_0<=Relationship)||LA5_0==DIVIDE||LA5_0==80) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("226:1: lang : ( | ( expr )+ -> ^( LANG ( expr )+ ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:4: ( expr )+
                    {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:4: ( expr )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Select||LA4_0==Insert||(LA4_0>=Object && LA4_0<=Relationship)||LA4_0==DIVIDE||LA4_0==80) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:4: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_lang796);
                    	    expr11=expr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_expr.add(expr11.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (backtracking>0) {failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 227:10: -> ^( LANG ( expr )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:13: ^( LANG ( expr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(LANG, "LANG"), root_1);

                        if ( !(stream_expr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_expr.hasNext() ) {
                            adaptor.addChild(root_1, stream_expr.next());

                        }
                        stream_expr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end lang

    public static class expr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start expr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:230:1: expr : ( objectDefExpr | amoebaQuery | relationshipExpr | divideExpr );
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        objectDefExpr_return objectDefExpr12 = null;

        amoebaQuery_return amoebaQuery13 = null;

        relationshipExpr_return relationshipExpr14 = null;

        divideExpr_return divideExpr15 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:231:2: ( objectDefExpr | amoebaQuery | relationshipExpr | divideExpr )
            int alt6=4;
            switch ( input.LA(1) ) {
            case Object:
                {
                alt6=1;
                }
                break;
            case Select:
            case Insert:
            case 80:
                {
                alt6=2;
                }
                break;
            case Relationship:
                {
                alt6=3;
                }
                break;
            case DIVIDE:
                {
                alt6=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("230:1: expr : ( objectDefExpr | amoebaQuery | relationshipExpr | divideExpr );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:231:4: objectDefExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectDefExpr_in_expr817);
                    objectDefExpr12=objectDefExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, objectDefExpr12.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:232:4: amoebaQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_amoebaQuery_in_expr822);
                    amoebaQuery13=amoebaQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, amoebaQuery13.getTree());

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:233:4: relationshipExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relationshipExpr_in_expr827);
                    relationshipExpr14=relationshipExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, relationshipExpr14.getTree());

                    }
                    break;
                case 4 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:234:4: divideExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_divideExpr_in_expr832);
                    divideExpr15=divideExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, divideExpr15.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end expr

    public static class divideExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start divideExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:238:1: divideExpr : DIVIDE QName 'by' divideElem ( Comma divideElem )* -> ^( DIVIDE[$QName] ( divideElem )+ ) ;
    public final divideExpr_return divideExpr() throws RecognitionException {
        divideExpr_return retval = new divideExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DIVIDE16=null;
        Token QName17=null;
        Token string_literal18=null;
        Token Comma20=null;
        divideElem_return divideElem19 = null;

        divideElem_return divideElem21 = null;


        Object DIVIDE16_tree=null;
        Object QName17_tree=null;
        Object string_literal18_tree=null;
        Object Comma20_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_DIVIDE=new RewriteRuleTokenStream(adaptor,"token DIVIDE");
        RewriteRuleSubtreeStream stream_divideElem=new RewriteRuleSubtreeStream(adaptor,"rule divideElem");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:239:2: ( DIVIDE QName 'by' divideElem ( Comma divideElem )* -> ^( DIVIDE[$QName] ( divideElem )+ ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:239:4: DIVIDE QName 'by' divideElem ( Comma divideElem )*
            {
            DIVIDE16=(Token)input.LT(1);
            match(input,DIVIDE,FOLLOW_DIVIDE_in_divideExpr845); if (failed) return retval;
            if ( backtracking==0 ) stream_DIVIDE.add(DIVIDE16);

            QName17=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_divideExpr847); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName17);

            string_literal18=(Token)input.LT(1);
            match(input,77,FOLLOW_77_in_divideExpr849); if (failed) return retval;
            if ( backtracking==0 ) stream_77.add(string_literal18);

            pushFollow(FOLLOW_divideElem_in_divideExpr851);
            divideElem19=divideElem();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_divideElem.add(divideElem19.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:239:33: ( Comma divideElem )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Comma) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:239:34: Comma divideElem
            	    {
            	    Comma20=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_divideExpr854); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma20);

            	    pushFollow(FOLLOW_divideElem_in_divideExpr856);
            	    divideElem21=divideElem();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_divideElem.add(divideElem21.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            // AST REWRITE
            // elements: DIVIDE, divideElem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:4: -> ^( DIVIDE[$QName] ( divideElem )+ )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:240:7: ^( DIVIDE[$QName] ( divideElem )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(DIVIDE,QName17), root_1);

                if ( !(stream_divideElem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_divideElem.hasNext() ) {
                    adaptor.addChild(root_1, stream_divideElem.next());

                }
                stream_divideElem.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end divideExpr

    public static class divideElem_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start divideElem
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:243:1: divideElem : ( DISTINCT QName -> ^( DISTINCT[$QName] ) | RANGE QName ( rangeType )? -> ^( RANGE[$QName] ( rangeType )? ) );
    public final divideElem_return divideElem() throws RecognitionException {
        divideElem_return retval = new divideElem_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DISTINCT22=null;
        Token QName23=null;
        Token RANGE24=null;
        Token QName25=null;
        rangeType_return rangeType26 = null;


        Object DISTINCT22_tree=null;
        Object QName23_tree=null;
        Object RANGE24_tree=null;
        Object QName25_tree=null;
        RewriteRuleTokenStream stream_RANGE=new RewriteRuleTokenStream(adaptor,"token RANGE");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_DISTINCT=new RewriteRuleTokenStream(adaptor,"token DISTINCT");
        RewriteRuleSubtreeStream stream_rangeType=new RewriteRuleSubtreeStream(adaptor,"rule rangeType");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:244:2: ( DISTINCT QName -> ^( DISTINCT[$QName] ) | RANGE QName ( rangeType )? -> ^( RANGE[$QName] ( rangeType )? ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DISTINCT) ) {
                alt9=1;
            }
            else if ( (LA9_0==RANGE) ) {
                alt9=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("243:1: divideElem : ( DISTINCT QName -> ^( DISTINCT[$QName] ) | RANGE QName ( rangeType )? -> ^( RANGE[$QName] ( rangeType )? ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:244:4: DISTINCT QName
                    {
                    DISTINCT22=(Token)input.LT(1);
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_divideElem883); if (failed) return retval;
                    if ( backtracking==0 ) stream_DISTINCT.add(DISTINCT22);

                    QName23=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_divideElem885); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName23);


                    // AST REWRITE
                    // elements: DISTINCT
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 244:19: -> ^( DISTINCT[$QName] )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:244:22: ^( DISTINCT[$QName] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(DISTINCT,QName23), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:245:4: RANGE QName ( rangeType )?
                    {
                    RANGE24=(Token)input.LT(1);
                    match(input,RANGE,FOLLOW_RANGE_in_divideElem897); if (failed) return retval;
                    if ( backtracking==0 ) stream_RANGE.add(RANGE24);

                    QName25=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_divideElem899); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName25);

                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:245:16: ( rangeType )?
                    int alt8=2;
                    int LA8_0 = input.LA(1);

                    if ( ((LA8_0>=78 && LA8_0<=79)) ) {
                        alt8=1;
                    }
                    switch (alt8) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:245:16: rangeType
                            {
                            pushFollow(FOLLOW_rangeType_in_divideElem901);
                            rangeType26=rangeType();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_rangeType.add(rangeType26.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: rangeType, RANGE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 245:27: -> ^( RANGE[$QName] ( rangeType )? )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:245:30: ^( RANGE[$QName] ( rangeType )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RANGE,QName25), root_1);

                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:245:46: ( rangeType )?
                        if ( stream_rangeType.hasNext() ) {
                            adaptor.addChild(root_1, stream_rangeType.next());

                        }
                        stream_rangeType.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end divideElem

    public static class rangeType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start rangeType
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:248:1: rangeType : ( 'auto' | 'AUTO' );
    public final rangeType_return rangeType() throws RecognitionException {
        rangeType_return retval = new rangeType_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set27=null;

        Object set27_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:249:2: ( 'auto' | 'AUTO' )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:
            {
            root_0 = (Object)adaptor.nil();

            set27=(Token)input.LT(1);
            if ( (input.LA(1)>=78 && input.LA(1)<=79) ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set27));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_rangeType0);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end rangeType

    public static class relationshipExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationshipExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:252:1: relationshipExpr : ( Relationship obj= QName HasMany objectList -> ^( ONE_TO_MANY[$obj] objectList ) | Relationship obj2= QName HasOne objectList -> ^( ONE_TO_ONE[$obj2] objectList ) );
    public final relationshipExpr_return relationshipExpr() throws RecognitionException {
        relationshipExpr_return retval = new relationshipExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token obj=null;
        Token obj2=null;
        Token Relationship28=null;
        Token HasMany29=null;
        Token Relationship31=null;
        Token HasOne32=null;
        objectList_return objectList30 = null;

        objectList_return objectList33 = null;


        Object obj_tree=null;
        Object obj2_tree=null;
        Object Relationship28_tree=null;
        Object HasMany29_tree=null;
        Object Relationship31_tree=null;
        Object HasOne32_tree=null;
        RewriteRuleTokenStream stream_HasOne=new RewriteRuleTokenStream(adaptor,"token HasOne");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Relationship=new RewriteRuleTokenStream(adaptor,"token Relationship");
        RewriteRuleTokenStream stream_HasMany=new RewriteRuleTokenStream(adaptor,"token HasMany");
        RewriteRuleSubtreeStream stream_objectList=new RewriteRuleSubtreeStream(adaptor,"rule objectList");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:253:2: ( Relationship obj= QName HasMany objectList -> ^( ONE_TO_MANY[$obj] objectList ) | Relationship obj2= QName HasOne objectList -> ^( ONE_TO_ONE[$obj2] objectList ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Relationship) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==QName) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==HasOne) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==HasMany) ) {
                        alt10=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("252:1: relationshipExpr : ( Relationship obj= QName HasMany objectList -> ^( ONE_TO_MANY[$obj] objectList ) | Relationship obj2= QName HasOne objectList -> ^( ONE_TO_ONE[$obj2] objectList ) );", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("252:1: relationshipExpr : ( Relationship obj= QName HasMany objectList -> ^( ONE_TO_MANY[$obj] objectList ) | Relationship obj2= QName HasOne objectList -> ^( ONE_TO_ONE[$obj2] objectList ) );", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("252:1: relationshipExpr : ( Relationship obj= QName HasMany objectList -> ^( ONE_TO_MANY[$obj] objectList ) | Relationship obj2= QName HasOne objectList -> ^( ONE_TO_ONE[$obj2] objectList ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:253:4: Relationship obj= QName HasMany objectList
                    {
                    Relationship28=(Token)input.LT(1);
                    match(input,Relationship,FOLLOW_Relationship_in_relationshipExpr938); if (failed) return retval;
                    if ( backtracking==0 ) stream_Relationship.add(Relationship28);

                    obj=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_relationshipExpr942); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(obj);

                    HasMany29=(Token)input.LT(1);
                    match(input,HasMany,FOLLOW_HasMany_in_relationshipExpr944); if (failed) return retval;
                    if ( backtracking==0 ) stream_HasMany.add(HasMany29);

                    pushFollow(FOLLOW_objectList_in_relationshipExpr946);
                    objectList30=objectList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_objectList.add(objectList30.getTree());

                    // AST REWRITE
                    // elements: objectList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 254:3: -> ^( ONE_TO_MANY[$obj] objectList )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:254:6: ^( ONE_TO_MANY[$obj] objectList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ONE_TO_MANY, obj), root_1);

                        adaptor.addChild(root_1, stream_objectList.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:255:4: Relationship obj2= QName HasOne objectList
                    {
                    Relationship31=(Token)input.LT(1);
                    match(input,Relationship,FOLLOW_Relationship_in_relationshipExpr962); if (failed) return retval;
                    if ( backtracking==0 ) stream_Relationship.add(Relationship31);

                    obj2=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_relationshipExpr966); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(obj2);

                    HasOne32=(Token)input.LT(1);
                    match(input,HasOne,FOLLOW_HasOne_in_relationshipExpr968); if (failed) return retval;
                    if ( backtracking==0 ) stream_HasOne.add(HasOne32);

                    pushFollow(FOLLOW_objectList_in_relationshipExpr970);
                    objectList33=objectList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_objectList.add(objectList33.getTree());

                    // AST REWRITE
                    // elements: objectList
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 256:3: -> ^( ONE_TO_ONE[$obj2] objectList )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:256:6: ^( ONE_TO_ONE[$obj2] objectList )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ONE_TO_ONE, obj2), root_1);

                        adaptor.addChild(root_1, stream_objectList.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end relationshipExpr

    public static class qnameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start qnameList
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:259:1: qnameList : QName ( Comma QName )? -> ( QName )+ ;
    public final qnameList_return qnameList() throws RecognitionException {
        qnameList_return retval = new qnameList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName34=null;
        Token Comma35=null;
        Token QName36=null;

        Object QName34_tree=null;
        Object Comma35_tree=null;
        Object QName36_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:260:2: ( QName ( Comma QName )? -> ( QName )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:260:4: QName ( Comma QName )?
            {
            QName34=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_qnameList992); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName34);

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:260:10: ( Comma QName )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Comma) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:260:11: Comma QName
                    {
                    Comma35=(Token)input.LT(1);
                    match(input,Comma,FOLLOW_Comma_in_qnameList995); if (failed) return retval;
                    if ( backtracking==0 ) stream_Comma.add(Comma35);

                    QName36=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_qnameList997); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName36);


                    }
                    break;

            }


            // AST REWRITE
            // elements: QName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 260:25: -> ( QName )+
            {
                if ( !(stream_QName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_QName.hasNext() ) {
                    adaptor.addChild(root_0, stream_QName.next());

                }
                stream_QName.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end qnameList

    public static class objectList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start objectList
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:263:1: objectList : object ( Comma object )? -> ( object )+ ;
    public final objectList_return objectList() throws RecognitionException {
        objectList_return retval = new objectList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma38=null;
        object_return object37 = null;

        object_return object39 = null;


        Object Comma38_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:264:2: ( object ( Comma object )? -> ( object )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:264:4: object ( Comma object )?
            {
            pushFollow(FOLLOW_object_in_objectList1016);
            object37=object();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_object.add(object37.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:264:11: ( Comma object )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Comma) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:264:12: Comma object
                    {
                    Comma38=(Token)input.LT(1);
                    match(input,Comma,FOLLOW_Comma_in_objectList1019); if (failed) return retval;
                    if ( backtracking==0 ) stream_Comma.add(Comma38);

                    pushFollow(FOLLOW_object_in_objectList1021);
                    object39=object();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_object.add(object39.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: object
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 264:27: -> ( object )+
            {
                if ( !(stream_object.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_object.hasNext() ) {
                    adaptor.addChild(root_0, stream_object.next());

                }
                stream_object.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end objectList

    public static class object_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start object
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:267:1: object : QName -> ^( OBJECT[$QName] ) ;
    public final object_return object() throws RecognitionException {
        object_return retval = new object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName40=null;

        Object QName40_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:268:2: ( QName -> ^( OBJECT[$QName] ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:268:4: QName
            {
            QName40=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_object1039); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName40);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:10: -> ^( OBJECT[$QName] )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:268:13: ^( OBJECT[$QName] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, QName40), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end object

    public static class objectDefExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start objectDefExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:271:1: objectDefExpr : Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= attributeList )? RParen -> ^( OBJECT_DEF[$objName] ( attributeDefExpr )? ( ^( SORT_TARGET $sortOrder) )? ) ;
    public final objectDefExpr_return objectDefExpr() throws RecognitionException {
        objectDefExpr_return retval = new objectDefExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token objName=null;
        Token Object41=null;
        Token LParen42=null;
        Token SPLIT44=null;
        Token RParen45=null;
        attributeList_return sortOrder = null;

        attributeDefExpr_return attributeDefExpr43 = null;


        Object objName_tree=null;
        Object Object41_tree=null;
        Object LParen42_tree=null;
        Object SPLIT44_tree=null;
        Object RParen45_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_SPLIT=new RewriteRuleTokenStream(adaptor,"token SPLIT");
        RewriteRuleTokenStream stream_Object=new RewriteRuleTokenStream(adaptor,"token Object");
        RewriteRuleSubtreeStream stream_attributeList=new RewriteRuleSubtreeStream(adaptor,"rule attributeList");
        RewriteRuleSubtreeStream stream_attributeDefExpr=new RewriteRuleSubtreeStream(adaptor,"rule attributeDefExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:272:2: ( Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= attributeList )? RParen -> ^( OBJECT_DEF[$objName] ( attributeDefExpr )? ( ^( SORT_TARGET $sortOrder) )? ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:272:4: Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= attributeList )? RParen
            {
            Object41=(Token)input.LT(1);
            match(input,Object,FOLLOW_Object_in_objectDefExpr1057); if (failed) return retval;
            if ( backtracking==0 ) stream_Object.add(Object41);

            objName=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_objectDefExpr1061); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(objName);

            LParen42=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_objectDefExpr1063); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen42);

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:272:32: ( attributeDefExpr )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==QName) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:272:32: attributeDefExpr
                    {
                    pushFollow(FOLLOW_attributeDefExpr_in_objectDefExpr1065);
                    attributeDefExpr43=attributeDefExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_attributeDefExpr.add(attributeDefExpr43.getTree());

                    }
                    break;

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:272:50: ( SPLIT sortOrder= attributeList )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==SPLIT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:272:51: SPLIT sortOrder= attributeList
                    {
                    SPLIT44=(Token)input.LT(1);
                    match(input,SPLIT,FOLLOW_SPLIT_in_objectDefExpr1069); if (failed) return retval;
                    if ( backtracking==0 ) stream_SPLIT.add(SPLIT44);

                    pushFollow(FOLLOW_attributeList_in_objectDefExpr1073);
                    sortOrder=attributeList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_attributeList.add(sortOrder.getTree());

                    }
                    break;

            }

            RParen45=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_objectDefExpr1077); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen45);


            // AST REWRITE
            // elements: attributeDefExpr, sortOrder
            // token labels: 
            // rule labels: retval, sortOrder
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_sortOrder=new RewriteRuleSubtreeStream(adaptor,"token sortOrder",sortOrder!=null?sortOrder.tree:null);

            root_0 = (Object)adaptor.nil();
            // 273:3: -> ^( OBJECT_DEF[$objName] ( attributeDefExpr )? ( ^( SORT_TARGET $sortOrder) )? )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:273:6: ^( OBJECT_DEF[$objName] ( attributeDefExpr )? ( ^( SORT_TARGET $sortOrder) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT_DEF, objName), root_1);

                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:273:29: ( attributeDefExpr )?
                if ( stream_attributeDefExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_attributeDefExpr.next());

                }
                stream_attributeDefExpr.reset();
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:273:47: ( ^( SORT_TARGET $sortOrder) )?
                if ( stream_sortOrder.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:273:47: ^( SORT_TARGET $sortOrder)
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(adaptor.create(SORT_TARGET, "SORT_TARGET"), root_2);

                    adaptor.addChild(root_2, stream_sortOrder.next());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_sortOrder.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end objectDefExpr

    public static class attributeDefExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeDefExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:277:1: attributeDefExpr : attributeDef ( Comma attributeDef )* -> ( attributeDef )+ ;
    public final attributeDefExpr_return attributeDefExpr() throws RecognitionException {
        attributeDefExpr_return retval = new attributeDefExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma47=null;
        attributeDef_return attributeDef46 = null;

        attributeDef_return attributeDef48 = null;


        Object Comma47_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_attributeDef=new RewriteRuleSubtreeStream(adaptor,"rule attributeDef");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:278:2: ( attributeDef ( Comma attributeDef )* -> ( attributeDef )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:278:4: attributeDef ( Comma attributeDef )*
            {
            pushFollow(FOLLOW_attributeDef_in_attributeDefExpr1111);
            attributeDef46=attributeDef();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_attributeDef.add(attributeDef46.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:278:17: ( Comma attributeDef )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:278:18: Comma attributeDef
            	    {
            	    Comma47=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_attributeDefExpr1114); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma47);

            	    pushFollow(FOLLOW_attributeDef_in_attributeDefExpr1116);
            	    attributeDef48=attributeDef();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_attributeDef.add(attributeDef48.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            // AST REWRITE
            // elements: attributeDef
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 278:39: -> ( attributeDef )+
            {
                if ( !(stream_attributeDef.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_attributeDef.hasNext() ) {
                    adaptor.addChild(root_0, stream_attributeDef.next());

                }
                stream_attributeDef.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end attributeDefExpr

    public static class attributeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeDef
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:281:1: attributeDef : QName DataType -> ^( ATTRIBUTE_DEF[$QName] DataType ) ;
    public final attributeDef_return attributeDef() throws RecognitionException {
        attributeDef_return retval = new attributeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName49=null;
        Token DataType50=null;

        Object QName49_tree=null;
        Object DataType50_tree=null;
        RewriteRuleTokenStream stream_DataType=new RewriteRuleTokenStream(adaptor,"token DataType");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:282:2: ( QName DataType -> ^( ATTRIBUTE_DEF[$QName] DataType ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:282:4: QName DataType
            {
            QName49=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_attributeDef1134); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName49);

            DataType50=(Token)input.LT(1);
            match(input,DataType,FOLLOW_DataType_in_attributeDef1136); if (failed) return retval;
            if ( backtracking==0 ) stream_DataType.add(DataType50);


            // AST REWRITE
            // elements: DataType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:19: -> ^( ATTRIBUTE_DEF[$QName] DataType )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:282:22: ^( ATTRIBUTE_DEF[$QName] DataType )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ATTRIBUTE_DEF, QName49), root_1);

                adaptor.addChild(root_1, stream_DataType.next());

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end attributeDef

    public static class attributeList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeList
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:285:1: attributeList : attribute ( Comma attributeName )* -> ( attribute )+ ;
    public final attributeList_return attributeList() throws RecognitionException {
        attributeList_return retval = new attributeList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma52=null;
        attribute_return attribute51 = null;

        attributeName_return attributeName53 = null;


        Object Comma52_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_attributeName=new RewriteRuleSubtreeStream(adaptor,"rule attributeName");
        RewriteRuleSubtreeStream stream_attribute=new RewriteRuleSubtreeStream(adaptor,"rule attribute");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:286:2: ( attribute ( Comma attributeName )* -> ( attribute )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:286:4: attribute ( Comma attributeName )*
            {
            pushFollow(FOLLOW_attribute_in_attributeList1158);
            attribute51=attribute();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_attribute.add(attribute51.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:286:14: ( Comma attributeName )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==Comma) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:286:15: Comma attributeName
            	    {
            	    Comma52=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_attributeList1161); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma52);

            	    pushFollow(FOLLOW_attributeName_in_attributeList1163);
            	    attributeName53=attributeName();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_attributeName.add(attributeName53.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            // AST REWRITE
            // elements: attribute
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:37: -> ( attribute )+
            {
                if ( !(stream_attribute.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_attribute.hasNext() ) {
                    adaptor.addChild(root_0, stream_attribute.next());

                }
                stream_attribute.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end attributeList

    public static class attribute_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attribute
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:289:1: attribute : QName -> ^( ATTRIBUTE[$QName] ) ;
    public final attribute_return attribute() throws RecognitionException {
        attribute_return retval = new attribute_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName54=null;

        Object QName54_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:290:2: ( QName -> ^( ATTRIBUTE[$QName] ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:290:4: QName
            {
            QName54=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_attribute1181); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName54);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 290:10: -> ^( ATTRIBUTE[$QName] )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:290:13: ^( ATTRIBUTE[$QName] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ATTRIBUTE, QName54), root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end attribute

    public static class amoebaQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start amoebaQuery
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:293:1: amoebaQuery : ( selectExpr | updateExpr );
    public final amoebaQuery_return amoebaQuery() throws RecognitionException {
        amoebaQuery_return retval = new amoebaQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        selectExpr_return selectExpr55 = null;

        updateExpr_return updateExpr56 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:294:2: ( selectExpr | updateExpr )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==Select) ) {
                alt17=1;
            }
            else if ( (LA17_0==Insert||LA17_0==80) ) {
                alt17=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("293:1: amoebaQuery : ( selectExpr | updateExpr );", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:294:4: selectExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_selectExpr_in_amoebaQuery1199);
                    selectExpr55=selectExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, selectExpr55.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:295:4: updateExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_updateExpr_in_amoebaQuery1204);
                    updateExpr56=updateExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, updateExpr56.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end amoebaQuery

    public static class updateExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start updateExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:298:1: updateExpr : ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) );
    public final updateExpr_return updateExpr() throws RecognitionException {
        updateExpr_return retval = new updateExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Insert57=null;
        Token Into59=null;
        Token string_literal61=null;
        Token string_literal62=null;
        newRelation_return newRelation58 = null;

        targetRelation_return targetRelation60 = null;

        newRelation_return newRelation63 = null;

        whereClause_return whereClause64 = null;


        Object Insert57_tree=null;
        Object Into59_tree=null;
        Object string_literal61_tree=null;
        Object string_literal62_tree=null;
        RewriteRuleTokenStream stream_Insert=new RewriteRuleTokenStream(adaptor,"token Insert");
        RewriteRuleTokenStream stream_Into=new RewriteRuleTokenStream(adaptor,"token Into");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_newRelation=new RewriteRuleSubtreeStream(adaptor,"rule newRelation");
        RewriteRuleSubtreeStream stream_targetRelation=new RewriteRuleSubtreeStream(adaptor,"rule targetRelation");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:299:2: ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Insert) ) {
                alt20=1;
            }
            else if ( (LA20_0==80) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("298:1: updateExpr : ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:299:4: Insert newRelation ( Into targetRelation )?
                    {
                    Insert57=(Token)input.LT(1);
                    match(input,Insert,FOLLOW_Insert_in_updateExpr1216); if (failed) return retval;
                    if ( backtracking==0 ) stream_Insert.add(Insert57);

                    pushFollow(FOLLOW_newRelation_in_updateExpr1218);
                    newRelation58=newRelation();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_newRelation.add(newRelation58.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:299:23: ( Into targetRelation )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==Into) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:299:24: Into targetRelation
                            {
                            Into59=(Token)input.LT(1);
                            match(input,Into,FOLLOW_Into_in_updateExpr1221); if (failed) return retval;
                            if ( backtracking==0 ) stream_Into.add(Into59);

                            pushFollow(FOLLOW_targetRelation_in_updateExpr1223);
                            targetRelation60=targetRelation();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_targetRelation.add(targetRelation60.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: newRelation, targetRelation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 300:4: -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:300:7: ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(INSERT, "INSERT"), root_1);

                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:300:16: ^( NEW_RELATION newRelation )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(NEW_RELATION, "NEW_RELATION"), root_2);

                        adaptor.addChild(root_2, stream_newRelation.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:300:44: ( ^( TARGET targetRelation ) )?
                        if ( stream_targetRelation.hasNext() ) {
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:300:44: ^( TARGET targetRelation )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(adaptor.create(TARGET, "TARGET"), root_2);

                            adaptor.addChild(root_2, stream_targetRelation.next());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_targetRelation.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:301:4: 'update' 'set' newRelation ( whereClause )?
                    {
                    string_literal61=(Token)input.LT(1);
                    match(input,80,FOLLOW_80_in_updateExpr1253); if (failed) return retval;
                    if ( backtracking==0 ) stream_80.add(string_literal61);

                    string_literal62=(Token)input.LT(1);
                    match(input,81,FOLLOW_81_in_updateExpr1255); if (failed) return retval;
                    if ( backtracking==0 ) stream_81.add(string_literal62);

                    pushFollow(FOLLOW_newRelation_in_updateExpr1257);
                    newRelation63=newRelation();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_newRelation.add(newRelation63.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:301:31: ( whereClause )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Where) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:301:31: whereClause
                            {
                            pushFollow(FOLLOW_whereClause_in_updateExpr1259);
                            whereClause64=whereClause();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_whereClause.add(whereClause64.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: newRelation, whereClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 302:4: -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:7: ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(UPDATE, "UPDATE"), root_1);

                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:16: ^( NEW_RELATION newRelation )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(NEW_RELATION, "NEW_RELATION"), root_2);

                        adaptor.addChild(root_2, stream_newRelation.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:44: ( ^( CONDITION whereClause ) )?
                        if ( stream_whereClause.hasNext() ) {
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:44: ^( CONDITION whereClause )
                            {
                            Object root_2 = (Object)adaptor.nil();
                            root_2 = (Object)adaptor.becomeRoot(adaptor.create(CONDITION, "CONDITION"), root_2);

                            adaptor.addChild(root_2, stream_whereClause.next());

                            adaptor.addChild(root_1, root_2);
                            }

                        }
                        stream_whereClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end updateExpr

    public static class newRelation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start newRelation
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:305:1: newRelation : LParen tupleElement ( Comma tupleElement )* RParen -> ( tupleElement )+ ;
    public final newRelation_return newRelation() throws RecognitionException {
        newRelation_return retval = new newRelation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LParen65=null;
        Token Comma67=null;
        Token RParen69=null;
        tupleElement_return tupleElement66 = null;

        tupleElement_return tupleElement68 = null;


        Object LParen65_tree=null;
        Object Comma67_tree=null;
        Object RParen69_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_tupleElement=new RewriteRuleSubtreeStream(adaptor,"rule tupleElement");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:306:2: ( LParen tupleElement ( Comma tupleElement )* RParen -> ( tupleElement )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:306:4: LParen tupleElement ( Comma tupleElement )* RParen
            {
            LParen65=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_newRelation1295); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen65);

            pushFollow(FOLLOW_tupleElement_in_newRelation1297);
            tupleElement66=tupleElement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_tupleElement.add(tupleElement66.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:306:24: ( Comma tupleElement )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==Comma) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:306:25: Comma tupleElement
            	    {
            	    Comma67=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_newRelation1300); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma67);

            	    pushFollow(FOLLOW_tupleElement_in_newRelation1302);
            	    tupleElement68=tupleElement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_tupleElement.add(tupleElement68.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            RParen69=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_newRelation1306); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen69);


            // AST REWRITE
            // elements: tupleElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 307:3: -> ( tupleElement )+
            {
                if ( !(stream_tupleElement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_tupleElement.hasNext() ) {
                    adaptor.addChild(root_0, stream_tupleElement.next());

                }
                stream_tupleElement.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end newRelation

    public static class tupleElement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start tupleElement
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:310:1: tupleElement : ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )? ;
    public final tupleElement_return tupleElement() throws RecognitionException {
        tupleElement_return retval = new tupleElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL71=null;
        elementValue_return e = null;

        attributeName_return attributeName70 = null;


        Object EQUAL71_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_attributeName=new RewriteRuleSubtreeStream(adaptor,"rule attributeName");
        RewriteRuleSubtreeStream stream_elementValue=new RewriteRuleSubtreeStream(adaptor,"rule elementValue");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:2: ( ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )? )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:4: ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )?
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:4: ( attributeName -> attributeName )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:5: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_tupleElement1326);
            attributeName70=attributeName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_attributeName.add(attributeName70.getTree());

            // AST REWRITE
            // elements: attributeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 311:19: -> attributeName
            {
                adaptor.addChild(root_0, stream_attributeName.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:37: ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==EQUAL) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:38: EQUAL e= elementValue
                    {
                    EQUAL71=(Token)input.LT(1);
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleElement1334); if (failed) return retval;
                    if ( backtracking==0 ) stream_EQUAL.add(EQUAL71);

                    pushFollow(FOLLOW_elementValue_in_tupleElement1338);
                    e=elementValue();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_elementValue.add(e.getTree());

                    // AST REWRITE
                    // elements: tupleElement, elementValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 311:59: -> ^( NEW_VALUE $tupleElement elementValue )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:62: ^( NEW_VALUE $tupleElement elementValue )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(NEW_VALUE, "NEW_VALUE"), root_1);

                        adaptor.addChild(root_1, stream_retval.next());
                        adaptor.addChild(root_1, stream_elementValue.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end tupleElement

    public static class elementValue_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start elementValue
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:314:1: elementValue : ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) );
    public final elementValue_return elementValue() throws RecognitionException {
        elementValue_return retval = new elementValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal73=null;
        Token Comma75=null;
        Token char_literal77=null;
        literal_return literal72 = null;

        elementValue_return elementValue74 = null;

        elementValue_return elementValue76 = null;


        Object char_literal73_tree=null;
        Object Comma75_tree=null;
        Object char_literal77_tree=null;
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_elementValue=new RewriteRuleSubtreeStream(adaptor,"rule elementValue");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:2: ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==Dot||(LA24_0>=Comma && LA24_0<=RParen)||LA24_0==Digits||LA24_0==StringLiteral||LA24_0==83) ) {
                alt24=1;
            }
            else if ( (LA24_0==82) ) {
                alt24=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("314:1: elementValue : ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) );", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:4: literal
                    {
                    pushFollow(FOLLOW_literal_in_elementValue1364);
                    literal72=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_literal.add(literal72.getTree());

                    // AST REWRITE
                    // elements: literal
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 316:4: -> ^( VALUE literal )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:316:7: ^( VALUE literal )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VALUE, "VALUE"), root_1);

                        adaptor.addChild(root_1, stream_literal.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:4: '{' elementValue ( Comma elementValue )? '}'
                    {
                    char_literal73=(Token)input.LT(1);
                    match(input,82,FOLLOW_82_in_elementValue1380); if (failed) return retval;
                    if ( backtracking==0 ) stream_82.add(char_literal73);

                    pushFollow(FOLLOW_elementValue_in_elementValue1382);
                    elementValue74=elementValue();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_elementValue.add(elementValue74.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:21: ( Comma elementValue )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==Comma) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:22: Comma elementValue
                            {
                            Comma75=(Token)input.LT(1);
                            match(input,Comma,FOLLOW_Comma_in_elementValue1385); if (failed) return retval;
                            if ( backtracking==0 ) stream_Comma.add(Comma75);

                            pushFollow(FOLLOW_elementValue_in_elementValue1387);
                            elementValue76=elementValue();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_elementValue.add(elementValue76.getTree());

                            }
                            break;

                    }

                    char_literal77=(Token)input.LT(1);
                    match(input,83,FOLLOW_83_in_elementValue1391); if (failed) return retval;
                    if ( backtracking==0 ) stream_83.add(char_literal77);


                    // AST REWRITE
                    // elements: elementValue
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 318:4: -> ^( VALUE_SET ( elementValue )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:318:7: ^( VALUE_SET ( elementValue )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VALUE_SET, "VALUE_SET"), root_1);

                        if ( !(stream_elementValue.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_elementValue.hasNext() ) {
                            adaptor.addChild(root_1, stream_elementValue.next());

                        }
                        stream_elementValue.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end elementValue

    public static class exprSingle_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start exprSingle
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:322:1: exprSingle : ( selectExpr | subQuery );
    public final exprSingle_return exprSingle() throws RecognitionException {
        exprSingle_return retval = new exprSingle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        selectExpr_return selectExpr78 = null;

        subQuery_return subQuery79 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:323:2: ( selectExpr | subQuery )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==Select) ) {
                alt25=1;
            }
            else if ( (LA25_0==LParen) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("322:1: exprSingle : ( selectExpr | subQuery );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:323:4: selectExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_selectExpr_in_exprSingle1416);
                    selectExpr78=selectExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, selectExpr78.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:324:4: subQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subQuery_in_exprSingle1421);
                    subQuery79=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subQuery79.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end exprSingle

    public static class subQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start subQuery
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:327:1: subQuery : LParen selectExpr RParen -> selectExpr ;
    public final subQuery_return subQuery() throws RecognitionException {
        subQuery_return retval = new subQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LParen80=null;
        Token RParen82=null;
        selectExpr_return selectExpr81 = null;


        Object LParen80_tree=null;
        Object RParen82_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleSubtreeStream stream_selectExpr=new RewriteRuleSubtreeStream(adaptor,"rule selectExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:328:2: ( LParen selectExpr RParen -> selectExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:328:4: LParen selectExpr RParen
            {
            LParen80=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_subQuery1433); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen80);

            pushFollow(FOLLOW_selectExpr_in_subQuery1435);
            selectExpr81=selectExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_selectExpr.add(selectExpr81.getTree());
            RParen82=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_subQuery1437); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen82);


            // AST REWRITE
            // elements: selectExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 328:29: -> selectExpr
            {
                adaptor.addChild(root_0, stream_selectExpr.next());

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end subQuery

    public static class selectExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:332:1: selectExpr : Select selectTarget ( fromClause )? ( whereClause )? ( orderByClause )? -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? ( ^( ORDER_BY orderByClause ) )? ) ;
    public final selectExpr_return selectExpr() throws RecognitionException {
        selectExpr_return retval = new selectExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Select83=null;
        selectTarget_return selectTarget84 = null;

        fromClause_return fromClause85 = null;

        whereClause_return whereClause86 = null;

        orderByClause_return orderByClause87 = null;


        Object Select83_tree=null;
        RewriteRuleTokenStream stream_Select=new RewriteRuleTokenStream(adaptor,"token Select");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_selectTarget=new RewriteRuleSubtreeStream(adaptor,"rule selectTarget");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:2: ( Select selectTarget ( fromClause )? ( whereClause )? ( orderByClause )? -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? ( ^( ORDER_BY orderByClause ) )? ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:4: Select selectTarget ( fromClause )? ( whereClause )? ( orderByClause )?
            {
            Select83=(Token)input.LT(1);
            match(input,Select,FOLLOW_Select_in_selectExpr1458); if (failed) return retval;
            if ( backtracking==0 ) stream_Select.add(Select83);

            pushFollow(FOLLOW_selectTarget_in_selectExpr1460);
            selectTarget84=selectTarget();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_selectTarget.add(selectTarget84.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:24: ( fromClause )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==From) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:24: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_selectExpr1462);
                    fromClause85=fromClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fromClause.add(fromClause85.getTree());

                    }
                    break;

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:36: ( whereClause )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==Where) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:36: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_selectExpr1465);
                    whereClause86=whereClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_whereClause.add(whereClause86.getTree());

                    }
                    break;

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:49: ( orderByClause )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==85) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:49: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_selectExpr1468);
                    orderByClause87=orderByClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_orderByClause.add(orderByClause87.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: whereClause, orderByClause, fromClause, selectTarget
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 334:3: -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? ( ^( ORDER_BY orderByClause ) )? )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:6: ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? ( ^( ORDER_BY orderByClause ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SELECTION, "SELECTION"), root_1);

                adaptor.addChild(root_1, stream_selectTarget.next());
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:31: ( ^( INPUT fromClause ) )?
                if ( stream_fromClause.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:31: ^( INPUT fromClause )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(adaptor.create(INPUT, "INPUT"), root_2);

                    adaptor.addChild(root_2, stream_fromClause.next());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_fromClause.reset();
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:52: ( ^( CONDITION whereClause ) )?
                if ( stream_whereClause.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:52: ^( CONDITION whereClause )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(adaptor.create(CONDITION, "CONDITION"), root_2);

                    adaptor.addChild(root_2, stream_whereClause.next());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_whereClause.reset();
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:78: ( ^( ORDER_BY orderByClause ) )?
                if ( stream_orderByClause.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:78: ^( ORDER_BY orderByClause )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(adaptor.create(ORDER_BY, "ORDER_BY"), root_2);

                    adaptor.addChild(root_2, stream_orderByClause.next());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_orderByClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectExpr

    public static class selectTarget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start selectTarget
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:338:1: selectTarget : ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL );
    public final selectTarget_return selectTarget() throws RecognitionException {
        selectTarget_return retval = new selectTarget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma89=null;
        Token Wildcard91=null;
        labelExpr_return labelExpr88 = null;

        labelExpr_return labelExpr90 = null;


        Object Comma89_tree=null;
        Object Wildcard91_tree=null;
        RewriteRuleTokenStream stream_Wildcard=new RewriteRuleTokenStream(adaptor,"token Wildcard");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:2: ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==EOF||LA30_0==Dot||(LA30_0>=Comma && LA30_0<=RParen)||(LA30_0>=Select && LA30_0<=Where)||LA30_0==Insert||(LA30_0>=Object && LA30_0<=Relationship)||LA30_0==DIVIDE||LA30_0==Digits||LA30_0==StringLiteral||LA30_0==QName||LA30_0==80||LA30_0==85) ) {
                alt30=1;
            }
            else if ( (LA30_0==Wildcard) ) {
                alt30=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("338:1: selectTarget : ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:4: labelExpr ( Comma labelExpr )*
                    {
                    pushFollow(FOLLOW_labelExpr_in_selectTarget1512);
                    labelExpr88=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr88.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:14: ( Comma labelExpr )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==Comma) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:15: Comma labelExpr
                    	    {
                    	    Comma89=(Token)input.LT(1);
                    	    match(input,Comma,FOLLOW_Comma_in_selectTarget1515); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_Comma.add(Comma89);

                    	    pushFollow(FOLLOW_labelExpr_in_selectTarget1517);
                    	    labelExpr90=labelExpr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_labelExpr.add(labelExpr90.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);


                    // AST REWRITE
                    // elements: labelExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 339:33: -> ^( PROJECTION ( labelExpr )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:36: ^( PROJECTION ( labelExpr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(PROJECTION, "PROJECTION"), root_1);

                        if ( !(stream_labelExpr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_labelExpr.hasNext() ) {
                            adaptor.addChild(root_1, stream_labelExpr.next());

                        }
                        stream_labelExpr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:340:4: Wildcard
                    {
                    Wildcard91=(Token)input.LT(1);
                    match(input,Wildcard,FOLLOW_Wildcard_in_selectTarget1533); if (failed) return retval;
                    if ( backtracking==0 ) stream_Wildcard.add(Wildcard91);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:13: -> PROJECT_ALL
                    {
                        adaptor.addChild(root_0, adaptor.create(PROJECT_ALL, "PROJECT_ALL"));

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end selectTarget

    public static class fromClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fromClause
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:343:1: fromClause : From fromTarget ( Comma fromTarget )* -> ( fromTarget )+ ;
    public final fromClause_return fromClause() throws RecognitionException {
        fromClause_return retval = new fromClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token From92=null;
        Token Comma94=null;
        fromTarget_return fromTarget93 = null;

        fromTarget_return fromTarget95 = null;


        Object From92_tree=null;
        Object Comma94_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_From=new RewriteRuleTokenStream(adaptor,"token From");
        RewriteRuleSubtreeStream stream_fromTarget=new RewriteRuleSubtreeStream(adaptor,"rule fromTarget");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:344:2: ( From fromTarget ( Comma fromTarget )* -> ( fromTarget )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:344:4: From fromTarget ( Comma fromTarget )*
            {
            From92=(Token)input.LT(1);
            match(input,From,FOLLOW_From_in_fromClause1548); if (failed) return retval;
            if ( backtracking==0 ) stream_From.add(From92);

            pushFollow(FOLLOW_fromTarget_in_fromClause1550);
            fromTarget93=fromTarget();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fromTarget.add(fromTarget93.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:344:20: ( Comma fromTarget )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==Comma) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:344:21: Comma fromTarget
            	    {
            	    Comma94=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_fromClause1553); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma94);

            	    pushFollow(FOLLOW_fromTarget_in_fromClause1555);
            	    fromTarget95=fromTarget();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_fromTarget.add(fromTarget95.getTree());

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            // AST REWRITE
            // elements: fromTarget
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 344:40: -> ( fromTarget )+
            {
                if ( !(stream_fromTarget.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_fromTarget.hasNext() ) {
                    adaptor.addChild(root_0, stream_fromTarget.next());

                }
                stream_fromTarget.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fromClause

    public static class fromTarget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start fromTarget
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:347:1: fromTarget : ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )? ;
    public final fromTarget_return fromTarget() throws RecognitionException {
        fromTarget_return retval = new fromTarget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        Token QName98=null;
        targetRelation_return targetRelation96 = null;


        Object string_literal97_tree=null;
        Object QName98_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_targetRelation=new RewriteRuleSubtreeStream(adaptor,"rule targetRelation");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:2: ( ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )? )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:4: ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )?
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:4: ( targetRelation -> targetRelation )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:5: targetRelation
            {
            pushFollow(FOLLOW_targetRelation_in_fromTarget1574);
            targetRelation96=targetRelation();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_targetRelation.add(targetRelation96.getTree());

            // AST REWRITE
            // elements: targetRelation
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 348:20: -> targetRelation
            {
                adaptor.addChild(root_0, stream_targetRelation.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:39: ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==84) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:40: 'as' QName
                    {
                    string_literal97=(Token)input.LT(1);
                    match(input,84,FOLLOW_84_in_fromTarget1582); if (failed) return retval;
                    if ( backtracking==0 ) stream_84.add(string_literal97);

                    QName98=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_fromTarget1584); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName98);


                    // AST REWRITE
                    // elements: fromTarget, QName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 348:51: -> ^( ASSIGN_LABEL QName $fromTarget)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:54: ^( ASSIGN_LABEL QName $fromTarget)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ASSIGN_LABEL, "ASSIGN_LABEL"), root_1);

                        adaptor.addChild(root_1, stream_QName.next());
                        adaptor.addChild(root_1, stream_retval.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end fromTarget

    public static class targetRelation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start targetRelation
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:351:1: targetRelation : ( QName -> ^( RELATION QName ) | subQuery );
    public final targetRelation_return targetRelation() throws RecognitionException {
        targetRelation_return retval = new targetRelation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName99=null;
        subQuery_return subQuery100 = null;


        Object QName99_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:352:2: ( QName -> ^( RELATION QName ) | subQuery )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==QName) ) {
                alt33=1;
            }
            else if ( (LA33_0==LParen) ) {
                alt33=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("351:1: targetRelation : ( QName -> ^( RELATION QName ) | subQuery );", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:352:4: QName
                    {
                    QName99=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_targetRelation1610); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName99);


                    // AST REWRITE
                    // elements: QName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 352:10: -> ^( RELATION QName )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:352:13: ^( RELATION QName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(RELATION, "RELATION"), root_1);

                        adaptor.addChild(root_1, stream_QName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:353:4: subQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subQuery_in_targetRelation1623);
                    subQuery100=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subQuery100.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end targetRelation

    public static class whereClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start whereClause
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:356:1: whereClause : Where orExpr ;
    public final whereClause_return whereClause() throws RecognitionException {
        whereClause_return retval = new whereClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Where101=null;
        orExpr_return orExpr102 = null;


        Object Where101_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:357:2: ( Where orExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:357:4: Where orExpr
            {
            root_0 = (Object)adaptor.nil();

            Where101=(Token)input.LT(1);
            match(input,Where,FOLLOW_Where_in_whereClause1634); if (failed) return retval;
            pushFollow(FOLLOW_orExpr_in_whereClause1637);
            orExpr102=orExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpr102.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end whereClause

    public static class orderByClause_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orderByClause
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:360:1: orderByClause : 'order' 'by' ( attributeName ( Comma attributeName )* ) -> ( attributeName )+ ;
    public final orderByClause_return orderByClause() throws RecognitionException {
        orderByClause_return retval = new orderByClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal103=null;
        Token string_literal104=null;
        Token Comma106=null;
        attributeName_return attributeName105 = null;

        attributeName_return attributeName107 = null;


        Object string_literal103_tree=null;
        Object string_literal104_tree=null;
        Object Comma106_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_attributeName=new RewriteRuleSubtreeStream(adaptor,"rule attributeName");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:361:2: ( 'order' 'by' ( attributeName ( Comma attributeName )* ) -> ( attributeName )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:361:4: 'order' 'by' ( attributeName ( Comma attributeName )* )
            {
            string_literal103=(Token)input.LT(1);
            match(input,85,FOLLOW_85_in_orderByClause1649); if (failed) return retval;
            if ( backtracking==0 ) stream_85.add(string_literal103);

            string_literal104=(Token)input.LT(1);
            match(input,77,FOLLOW_77_in_orderByClause1651); if (failed) return retval;
            if ( backtracking==0 ) stream_77.add(string_literal104);

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:361:17: ( attributeName ( Comma attributeName )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:361:18: attributeName ( Comma attributeName )*
            {
            pushFollow(FOLLOW_attributeName_in_orderByClause1654);
            attributeName105=attributeName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_attributeName.add(attributeName105.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:361:32: ( Comma attributeName )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:361:33: Comma attributeName
            	    {
            	    Comma106=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_orderByClause1657); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma106);

            	    pushFollow(FOLLOW_attributeName_in_orderByClause1659);
            	    attributeName107=attributeName();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_attributeName.add(attributeName107.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            // AST REWRITE
            // elements: attributeName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 361:56: -> ( attributeName )+
            {
                if ( !(stream_attributeName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_attributeName.hasNext() ) {
                    adaptor.addChild(root_0, stream_attributeName.next());

                }
                stream_attributeName.reset();

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end orderByClause

    public static class orExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:365:1: orExpr : ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )* ;
    public final orExpr_return orExpr() throws RecognitionException {
        orExpr_return retval = new orExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal109=null;
        andExpr_return a = null;

        andExpr_return andExpr108 = null;


        Object string_literal109_tree=null;
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_andExpr=new RewriteRuleSubtreeStream(adaptor,"rule andExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:366:2: ( ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:366:4: ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )*
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:366:4: ( andExpr -> andExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:366:5: andExpr
            {
            pushFollow(FOLLOW_andExpr_in_orExpr1682);
            andExpr108=andExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_andExpr.add(andExpr108.getTree());

            // AST REWRITE
            // elements: andExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 366:13: -> andExpr
            {
                adaptor.addChild(root_0, stream_andExpr.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:366:25: ( 'or' a= andExpr -> ^( OR $orExpr $a) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==86) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:366:26: 'or' a= andExpr
            	    {
            	    string_literal109=(Token)input.LT(1);
            	    match(input,86,FOLLOW_86_in_orExpr1690); if (failed) return retval;
            	    if ( backtracking==0 ) stream_86.add(string_literal109);

            	    pushFollow(FOLLOW_andExpr_in_orExpr1694);
            	    a=andExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_andExpr.add(a.getTree());

            	    // AST REWRITE
            	    // elements: orExpr, a
            	    // token labels: 
            	    // rule labels: retval, a
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 366:41: -> ^( OR $orExpr $a)
            	    {
            	        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:366:44: ^( OR $orExpr $a)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(OR, "OR"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_a.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    }

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end orExpr

    public static class andExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start andExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:369:1: andExpr : ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )* ;
    public final andExpr_return andExpr() throws RecognitionException {
        andExpr_return retval = new andExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal111=null;
        conditionExpr_return c = null;

        conditionExpr_return conditionExpr110 = null;


        Object string_literal111_tree=null;
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_conditionExpr=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:370:2: ( ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:370:4: ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )*
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:370:4: ( conditionExpr -> conditionExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:370:5: conditionExpr
            {
            pushFollow(FOLLOW_conditionExpr_in_andExpr1722);
            conditionExpr110=conditionExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_conditionExpr.add(conditionExpr110.getTree());

            // AST REWRITE
            // elements: conditionExpr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 370:19: -> conditionExpr
            {
                adaptor.addChild(root_0, stream_conditionExpr.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:370:37: ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==87) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:370:38: 'and' c= conditionExpr
            	    {
            	    string_literal111=(Token)input.LT(1);
            	    match(input,87,FOLLOW_87_in_andExpr1730); if (failed) return retval;
            	    if ( backtracking==0 ) stream_87.add(string_literal111);

            	    pushFollow(FOLLOW_conditionExpr_in_andExpr1734);
            	    c=conditionExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_conditionExpr.add(c.getTree());

            	    // AST REWRITE
            	    // elements: c, andExpr
            	    // token labels: 
            	    // rule labels: retval, c
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"token c",c!=null?c.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 370:60: -> ^( AND $andExpr $c)
            	    {
            	        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:370:63: ^( AND $andExpr $c)
            	        {
            	        Object root_1 = (Object)adaptor.nil();
            	        root_1 = (Object)adaptor.becomeRoot(adaptor.create(AND, "AND"), root_1);

            	        adaptor.addChild(root_1, stream_retval.next());
            	        adaptor.addChild(root_1, stream_c.next());

            	        adaptor.addChild(root_0, root_1);
            	        }

            	    }

            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end andExpr

    public static class conditionExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start conditionExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );
    public final conditionExpr_return conditionExpr() throws RecognitionException {
        conditionExpr_return retval = new conditionExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token In115=null;
        comparisonOp_return c = null;

        labelExpr_return labelExpr112 = null;

        labelExpr_return labelExpr113 = null;

        labelExpr_return labelExpr114 = null;

        subQuery_return subQuery116 = null;


        Object In115_tree=null;
        RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
        RewriteRuleSubtreeStream stream_subQuery=new RewriteRuleSubtreeStream(adaptor,"rule subQuery");
        RewriteRuleSubtreeStream stream_comparisonOp=new RewriteRuleSubtreeStream(adaptor,"rule comparisonOp");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:375:2: ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) )
            int alt37=2;
            switch ( input.LA(1) ) {
            case QName:
                {
                switch ( input.LA(2) ) {
                case Dot:
                    {
                    int LA37_7 = input.LA(3);

                    if ( (LA37_7==Wildcard) ) {
                        int LA37_17 = input.LA(4);

                        if ( ((LA37_17>=EQUAL && LA37_17<=GEQ)||LA37_17==88) ) {
                            alt37=1;
                        }
                        else if ( (LA37_17==In) ) {
                            alt37=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 17, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA37_7==QName) ) {
                        int LA37_18 = input.LA(4);

                        if ( (LA37_18==In) ) {
                            alt37=2;
                        }
                        else if ( ((LA37_18>=EQUAL && LA37_18<=GEQ)||LA37_18==88) ) {
                            alt37=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 18, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case LParen:
                    {
                    switch ( input.LA(3) ) {
                    case QName:
                        {
                        switch ( input.LA(4) ) {
                        case Dot:
                            {
                            int LA37_32 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 32, input);

                                throw nvae;
                            }
                            }
                            break;
                        case LParen:
                            {
                            int LA37_33 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 33, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA37_34 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 34, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA37_35 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 35, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 19, input);

                            throw nvae;
                        }

                        }
                        break;
                    case Comma:
                        {
                        switch ( input.LA(4) ) {
                        case QName:
                            {
                            int LA37_36 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 36, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA37_37 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 37, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA37_38 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 38, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Digits:
                            {
                            int LA37_39 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 39, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Dot:
                            {
                            int LA37_40 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 40, input);

                                throw nvae;
                            }
                            }
                            break;
                        case StringLiteral:
                            {
                            int LA37_41 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 41, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 20, input);

                            throw nvae;
                        }

                        }
                        break;
                    case RParen:
                        {
                        int LA37_21 = input.LA(4);

                        if ( ((LA37_21>=EQUAL && LA37_21<=GEQ)||LA37_21==88) ) {
                            alt37=1;
                        }
                        else if ( (LA37_21==In) ) {
                            alt37=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 21, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Digits:
                        {
                        switch ( input.LA(4) ) {
                        case Dot:
                            {
                            int LA37_44 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 44, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA37_45 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 45, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA37_46 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 46, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 22, input);

                            throw nvae;
                        }

                        }
                        break;
                    case Dot:
                        {
                        int LA37_23 = input.LA(4);

                        if ( (LA37_23==Digits) ) {
                            int LA37_47 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 47, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case StringLiteral:
                        {
                        int LA37_24 = input.LA(4);

                        if ( (LA37_24==Comma) ) {
                            int LA37_48 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 48, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA37_24==RParen) ) {
                            int LA37_49 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt37=1;
                            }
                            else if ( (true) ) {
                                alt37=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 49, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 8, input);

                        throw nvae;
                    }

                    }
                    break;
                case EQUAL:
                case NOT_EQUAL:
                case LESS:
                case LEQ:
                case GREATER:
                case GEQ:
                case 88:
                    {
                    alt37=1;
                    }
                    break;
                case In:
                    {
                    alt37=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 1, input);

                    throw nvae;
                }

                }
                break;
            case EQUAL:
            case NOT_EQUAL:
            case LESS:
            case LEQ:
            case GREATER:
            case GEQ:
            case 88:
                {
                alt37=1;
                }
                break;
            case Digits:
                {
                switch ( input.LA(2) ) {
                case Dot:
                    {
                    int LA37_11 = input.LA(3);

                    if ( (LA37_11==Digits) ) {
                        int LA37_25 = input.LA(4);

                        if ( ((LA37_25>=EQUAL && LA37_25<=GEQ)||LA37_25==88) ) {
                            alt37=1;
                        }
                        else if ( (LA37_25==In) ) {
                            alt37=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 25, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case EQUAL:
                case NOT_EQUAL:
                case LESS:
                case LEQ:
                case GREATER:
                case GEQ:
                case 88:
                    {
                    alt37=1;
                    }
                    break;
                case In:
                    {
                    alt37=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 3, input);

                    throw nvae;
                }

                }
                break;
            case Dot:
                {
                int LA37_4 = input.LA(2);

                if ( (LA37_4==Digits) ) {
                    int LA37_14 = input.LA(3);

                    if ( (LA37_14==In) ) {
                        alt37=2;
                    }
                    else if ( ((LA37_14>=EQUAL && LA37_14<=GEQ)||LA37_14==88) ) {
                        alt37=1;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 14, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 4, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                int LA37_5 = input.LA(2);

                if ( (LA37_5==In) ) {
                    alt37=2;
                }
                else if ( ((LA37_5>=EQUAL && LA37_5<=GEQ)||LA37_5==88) ) {
                    alt37=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 5, input);

                    throw nvae;
                }
                }
                break;
            case In:
                {
                alt37=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("374:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:375:4: labelExpr c= comparisonOp labelExpr
                    {
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1770);
                    labelExpr112=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr112.getTree());
                    pushFollow(FOLLOW_comparisonOp_in_conditionExpr1774);
                    c=comparisonOp();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_comparisonOp.add(c.getTree());
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1776);
                    labelExpr113=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr113.getTree());

                    // AST REWRITE
                    // elements: comparisonOp, labelExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 376:4: -> ^( COMPARE comparisonOp ( labelExpr )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:376:7: ^( COMPARE comparisonOp ( labelExpr )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(COMPARE, "COMPARE"), root_1);

                        adaptor.addChild(root_1, stream_comparisonOp.next());
                        if ( !(stream_labelExpr.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_labelExpr.hasNext() ) {
                            adaptor.addChild(root_1, stream_labelExpr.next());

                        }
                        stream_labelExpr.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:377:4: labelExpr In subQuery
                    {
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1796);
                    labelExpr114=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr114.getTree());
                    In115=(Token)input.LT(1);
                    match(input,In,FOLLOW_In_in_conditionExpr1798); if (failed) return retval;
                    if ( backtracking==0 ) stream_In.add(In115);

                    pushFollow(FOLLOW_subQuery_in_conditionExpr1800);
                    subQuery116=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_subQuery.add(subQuery116.getTree());

                    // AST REWRITE
                    // elements: subQuery, labelExpr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 378:4: -> ^( CONTAINED_IN labelExpr subQuery )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:378:7: ^( CONTAINED_IN labelExpr subQuery )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(CONTAINED_IN, "CONTAINED_IN"), root_1);

                        adaptor.addChild(root_1, stream_labelExpr.next());
                        adaptor.addChild(root_1, stream_subQuery.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end conditionExpr

    public static class comparisonOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start comparisonOp
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:381:1: comparisonOp : ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' ) ;
    public final comparisonOp_return comparisonOp() throws RecognitionException {
        comparisonOp_return retval = new comparisonOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set117=null;

        Object set117_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:381:13: ( ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:381:15: ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' )
            {
            root_0 = (Object)adaptor.nil();

            set117=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUAL && input.LA(1)<=GEQ)||input.LA(1)==88 ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set117));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_comparisonOp1822);    throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end comparisonOp

    public static class labelExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start labelExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:383:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );
    public final labelExpr_return labelExpr() throws RecognitionException {
        labelExpr_return retval = new labelExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        function_return function118 = null;

        attributeName_return attributeName119 = null;

        value_return value120 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:384:2: ( function | attributeName | value -> ^( VALUE value ) )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==QName) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==EOF||LA38_1==Dot||(LA38_1>=Comma && LA38_1<=RParen)||(LA38_1>=EQUAL && LA38_1<=GEQ)||(LA38_1>=Select && LA38_1<=Insert)||(LA38_1>=Object && LA38_1<=Relationship)||LA38_1==DIVIDE||LA38_1==80||(LA38_1>=85 && LA38_1<=88)) ) {
                    alt38=2;
                }
                else if ( (LA38_1==LParen) ) {
                    alt38=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("383:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==EOF||LA38_0==Dot||(LA38_0>=Comma && LA38_0<=RParen)||(LA38_0>=EQUAL && LA38_0<=GEQ)||(LA38_0>=Select && LA38_0<=Insert)||(LA38_0>=Object && LA38_0<=Relationship)||LA38_0==DIVIDE||LA38_0==Digits||LA38_0==StringLiteral||LA38_0==80||(LA38_0>=85 && LA38_0<=88)) ) {
                alt38=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("383:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:384:4: function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_in_labelExpr1858);
                    function118=function();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, function118.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:385:4: attributeName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attributeName_in_labelExpr1864);
                    attributeName119=attributeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attributeName119.getTree());

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:386:4: value
                    {
                    pushFollow(FOLLOW_value_in_labelExpr1870);
                    value120=value();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_value.add(value120.getTree());

                    // AST REWRITE
                    // elements: value
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 386:10: -> ^( VALUE value )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:386:13: ^( VALUE value )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(VALUE, "VALUE"), root_1);

                        adaptor.addChild(root_1, stream_value.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end labelExpr

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start value
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:389:1: value : literal ;
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        literal_return literal121 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:390:2: ( literal )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:390:4: literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_literal_in_value1891);
            literal121=literal();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, literal121.getTree());

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end value

    public static class attributeName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeName
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:393:1: attributeName : (qn= QName -> ^( ATTRIBUTE[$qn] ) | relation= QName Dot at= QName -> ^( REF $relation $at) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );
    public final attributeName_return attributeName() throws RecognitionException {
        attributeName_return retval = new attributeName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token qn=null;
        Token relation=null;
        Token at=null;
        Token Dot122=null;
        Token Dot123=null;
        Token Wildcard124=null;

        Object qn_tree=null;
        Object relation_tree=null;
        Object at_tree=null;
        Object Dot122_tree=null;
        Object Dot123_tree=null;
        Object Wildcard124_tree=null;
        RewriteRuleTokenStream stream_Dot=new RewriteRuleTokenStream(adaptor,"token Dot");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Wildcard=new RewriteRuleTokenStream(adaptor,"token Wildcard");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:394:2: (qn= QName -> ^( ATTRIBUTE[$qn] ) | relation= QName Dot at= QName -> ^( REF $relation $at) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) )
            int alt39=3;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==QName) ) {
                int LA39_1 = input.LA(2);

                if ( (LA39_1==Dot) ) {
                    int LA39_2 = input.LA(3);

                    if ( (LA39_2==QName) ) {
                        alt39=2;
                    }
                    else if ( (LA39_2==Wildcard) ) {
                        alt39=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("393:1: attributeName : (qn= QName -> ^( ATTRIBUTE[$qn] ) | relation= QName Dot at= QName -> ^( REF $relation $at) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 39, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA39_1==EOF||(LA39_1>=Comma && LA39_1<=RParen)||(LA39_1>=EQUAL && LA39_1<=GEQ)||(LA39_1>=Select && LA39_1<=Insert)||(LA39_1>=Object && LA39_1<=Relationship)||LA39_1==DIVIDE||LA39_1==80||(LA39_1>=85 && LA39_1<=88)) ) {
                    alt39=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("393:1: attributeName : (qn= QName -> ^( ATTRIBUTE[$qn] ) | relation= QName Dot at= QName -> ^( REF $relation $at) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 39, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("393:1: attributeName : (qn= QName -> ^( ATTRIBUTE[$qn] ) | relation= QName Dot at= QName -> ^( REF $relation $at) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:394:4: qn= QName
                    {
                    qn=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1904); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(qn);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 394:13: -> ^( ATTRIBUTE[$qn] )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:394:16: ^( ATTRIBUTE[$qn] )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ATTRIBUTE, qn), root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:395:4: relation= QName Dot at= QName
                    {
                    relation=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1918); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(relation);

                    Dot122=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_attributeName1920); if (failed) return retval;
                    if ( backtracking==0 ) stream_Dot.add(Dot122);

                    at=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1924); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(at);


                    // AST REWRITE
                    // elements: at, relation
                    // token labels: relation, at
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_relation=new RewriteRuleTokenStream(adaptor,"token relation",relation);
                    RewriteRuleTokenStream stream_at=new RewriteRuleTokenStream(adaptor,"token at",at);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 395:32: -> ^( REF $relation $at)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:395:35: ^( REF $relation $at)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(REF, "REF"), root_1);

                        adaptor.addChild(root_1, stream_relation.next());
                        adaptor.addChild(root_1, stream_at.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:396:4: relation= QName Dot Wildcard
                    {
                    relation=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1943); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(relation);

                    Dot123=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_attributeName1945); if (failed) return retval;
                    if ( backtracking==0 ) stream_Dot.add(Dot123);

                    Wildcard124=(Token)input.LT(1);
                    match(input,Wildcard,FOLLOW_Wildcard_in_attributeName1947); if (failed) return retval;
                    if ( backtracking==0 ) stream_Wildcard.add(Wildcard124);


                    // AST REWRITE
                    // elements: relation
                    // token labels: relation
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_relation=new RewriteRuleTokenStream(adaptor,"token relation",relation);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 396:32: -> ^( REF_ALL $relation)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:396:35: ^( REF_ALL $relation)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(REF_ALL, "REF_ALL"), root_1);

                        adaptor.addChild(root_1, stream_relation.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end attributeName

    public static class function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start function
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:400:1: function : QName LParen labelExpr ( Comma labelExpr )* RParen -> ^( FUNCTION QName ( labelExpr )+ ) ;
    public final function_return function() throws RecognitionException {
        function_return retval = new function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName125=null;
        Token LParen126=null;
        Token Comma128=null;
        Token RParen130=null;
        labelExpr_return labelExpr127 = null;

        labelExpr_return labelExpr129 = null;


        Object QName125_tree=null;
        Object LParen126_tree=null;
        Object Comma128_tree=null;
        Object RParen130_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:401:2: ( QName LParen labelExpr ( Comma labelExpr )* RParen -> ^( FUNCTION QName ( labelExpr )+ ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:401:4: QName LParen labelExpr ( Comma labelExpr )* RParen
            {
            QName125=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_function1970); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName125);

            LParen126=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_function1972); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen126);

            pushFollow(FOLLOW_labelExpr_in_function1974);
            labelExpr127=labelExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_labelExpr.add(labelExpr127.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:401:27: ( Comma labelExpr )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==Comma) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:401:28: Comma labelExpr
            	    {
            	    Comma128=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_function1977); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma128);

            	    pushFollow(FOLLOW_labelExpr_in_function1979);
            	    labelExpr129=labelExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_labelExpr.add(labelExpr129.getTree());

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            RParen130=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_function1983); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen130);


            // AST REWRITE
            // elements: labelExpr, QName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 402:2: -> ^( FUNCTION QName ( labelExpr )+ )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:402:5: ^( FUNCTION QName ( labelExpr )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(FUNCTION, "FUNCTION"), root_1);

                adaptor.addChild(root_1, stream_QName.next());
                if ( !(stream_labelExpr.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_labelExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_labelExpr.next());

                }
                stream_labelExpr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            }

            }

            retval.stop = input.LT(-1);

            if ( backtracking==0 ) {
                retval.tree = (Object)adaptor.rulePostProcessing(root_0);
                adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end function

    // $ANTLR start synpred1
    public final void synpred1_fragment() throws RecognitionException {   
        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:375:4: ( labelExpr comparisonOp labelExpr )
        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:375:4: labelExpr comparisonOp labelExpr
        {
        pushFollow(FOLLOW_labelExpr_in_synpred11770);
        labelExpr();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_comparisonOp_in_synpred11774);
        comparisonOp();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_labelExpr_in_synpred11776);
        labelExpr();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred1

    public final boolean synpred1() {
        backtracking++;
        int start = input.mark();
        try {
            synpred1_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_Digits_in_integerLiteral716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_decimalLiteral722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral727 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_Dot_in_decimalLiteral729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteral_in_numericLiteral775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimalLiteral_in_numericLiteral781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_lang796 = new BitSet(new long[]{0x6880000000000002L,0x0000000000010002L});
    public static final BitSet FOLLOW_objectDefExpr_in_expr817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amoebaQuery_in_expr822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationshipExpr_in_expr827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_divideExpr_in_expr832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DIVIDE_in_divideExpr845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_divideExpr847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_divideExpr849 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_divideElem_in_divideExpr851 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Comma_in_divideExpr854 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000CL});
    public static final BitSet FOLLOW_divideElem_in_divideExpr856 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_DISTINCT_in_divideElem883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_divideElem885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_in_divideElem897 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_divideElem899 = new BitSet(new long[]{0x0000000000000002L,0x000000000000C000L});
    public static final BitSet FOLLOW_rangeType_in_divideElem901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_rangeType0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Relationship_in_relationshipExpr938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_relationshipExpr942 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_HasMany_in_relationshipExpr944 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_objectList_in_relationshipExpr946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Relationship_in_relationshipExpr962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_relationshipExpr966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_HasOne_in_relationshipExpr968 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_objectList_in_relationshipExpr970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_qnameList992 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Comma_in_qnameList995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_qnameList997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_objectList1016 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Comma_in_objectList1019 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_object_in_objectList1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_object1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Object_in_objectDefExpr1057 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_objectDefExpr1061 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LParen_in_objectDefExpr1063 = new BitSet(new long[]{0x0040040000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_attributeDefExpr_in_objectDefExpr1065 = new BitSet(new long[]{0x0040040000000000L});
    public static final BitSet FOLLOW_SPLIT_in_objectDefExpr1069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_attributeList_in_objectDefExpr1073 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RParen_in_objectDefExpr1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeDef_in_attributeDefExpr1111 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Comma_in_attributeDefExpr1114 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_attributeDef_in_attributeDefExpr1116 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_QName_in_attributeDef1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_DataType_in_attributeDef1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attribute_in_attributeList1158 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Comma_in_attributeList1161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_attributeName_in_attributeList1163 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_QName_in_attribute1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpr_in_amoebaQuery1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateExpr_in_amoebaQuery1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Insert_in_updateExpr1216 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_newRelation_in_updateExpr1218 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_Into_in_updateExpr1221 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_targetRelation_in_updateExpr1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_updateExpr1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_updateExpr1255 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_newRelation_in_updateExpr1257 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_whereClause_in_updateExpr1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LParen_in_newRelation1295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_tupleElement_in_newRelation1297 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_Comma_in_newRelation1300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_tupleElement_in_newRelation1302 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_RParen_in_newRelation1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_tupleElement1326 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_EQUAL_in_tupleElement1334 = new BitSet(new long[]{0x0000008000000002L,0x0000000000040480L});
    public static final BitSet FOLLOW_elementValue_in_tupleElement1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_elementValue1364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_elementValue1380 = new BitSet(new long[]{0x0000028000000000L,0x00000000000C0480L});
    public static final BitSet FOLLOW_elementValue_in_elementValue1382 = new BitSet(new long[]{0x0000020000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_Comma_in_elementValue1385 = new BitSet(new long[]{0x0000008000000000L,0x00000000000C0480L});
    public static final BitSet FOLLOW_elementValue_in_elementValue1387 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_elementValue1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpr_in_exprSingle1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuery_in_exprSingle1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LParen_in_subQuery1433 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_selectExpr_in_subQuery1435 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_RParen_in_subQuery1437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Select_in_selectExpr1458 = new BitSet(new long[]{0x0300828000000002L,0x0000000000201480L});
    public static final BitSet FOLLOW_selectTarget_in_selectExpr1460 = new BitSet(new long[]{0x0300000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_fromClause_in_selectExpr1462 = new BitSet(new long[]{0x0200000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_whereClause_in_selectExpr1465 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
    public static final BitSet FOLLOW_orderByClause_in_selectExpr1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_selectTarget1512 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Comma_in_selectTarget1515 = new BitSet(new long[]{0x0000028000000002L,0x0000000000001480L});
    public static final BitSet FOLLOW_labelExpr_in_selectTarget1517 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Wildcard_in_selectTarget1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_From_in_fromClause1548 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_fromTarget_in_fromClause1550 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Comma_in_fromClause1553 = new BitSet(new long[]{0x0000080000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_fromTarget_in_fromClause1555 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_targetRelation_in_fromTarget1574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_fromTarget1582 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_fromTarget1584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_targetRelation1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuery_in_targetRelation1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Where_in_whereClause1634 = new BitSet(new long[]{0x003F008000000000L,0x0000000001001480L});
    public static final BitSet FOLLOW_orExpr_in_whereClause1637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_orderByClause1649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_orderByClause1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_attributeName_in_orderByClause1654 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_Comma_in_orderByClause1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_attributeName_in_orderByClause1659 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1682 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_orExpr1690 = new BitSet(new long[]{0x003F008000000000L,0x0000000001001480L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1694 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
    public static final BitSet FOLLOW_conditionExpr_in_andExpr1722 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_andExpr1730 = new BitSet(new long[]{0x003F008000000000L,0x0000000001001480L});
    public static final BitSet FOLLOW_conditionExpr_in_andExpr1734 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1770 = new BitSet(new long[]{0x003F000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_comparisonOp_in_conditionExpr1774 = new BitSet(new long[]{0x0000008000000002L,0x0000000000001480L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1796 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_In_in_conditionExpr1798 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_subQuery_in_conditionExpr1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparisonOp1822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_labelExpr1858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_labelExpr1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_labelExpr1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_value1891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1918 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_Dot_in_attributeName1920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_QName_in_attributeName1924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1943 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_Dot_in_attributeName1945 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_Wildcard_in_attributeName1947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_function1970 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LParen_in_function1972 = new BitSet(new long[]{0x0000068000000000L,0x0000000000001480L});
    public static final BitSet FOLLOW_labelExpr_in_function1974 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_Comma_in_function1977 = new BitSet(new long[]{0x0000068000000000L,0x0000000000001480L});
    public static final BitSet FOLLOW_labelExpr_in_function1979 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_RParen_in_function1983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_synpred11770 = new BitSet(new long[]{0x003F000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_comparisonOp_in_synpred11774 = new BitSet(new long[]{0x0000008000000002L,0x0000000000001480L});
    public static final BitSet FOLLOW_labelExpr_in_synpred11776 = new BitSet(new long[]{0x0000000000000002L});

}