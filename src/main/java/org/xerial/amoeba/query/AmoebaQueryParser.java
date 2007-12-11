// $ANTLR 3.0.1 F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g 2007-12-11 14:27:42

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER", "STRING", "SELECTION", "CONDITION", "PROJECTION", "PROJECT_ALL", "REF_ALL", "TARGET", "FUNCTION", "AND", "OR", "INPUT", "OUTPUT", "ASSIGN_LABEL", "COMPARE", "ATTRIBUTE", "REF", "VALUE", "CONTAINED_IN", "RELATION", "INSERT", "VALUE_SET", "NEW_VALUE", "NEW_RELATION", "UPDATE", "ATTRIBUTE_DEF", "SORT_TARGET", "ONE_TO_MANY", "OBJECT_DEF", "ML_COMMENT", "LINE_COMMENT", "Dot", "Colon", "Comma", "RParen", "LParen", "Quot", "Apos", "At", "Wildcard", "EQUAL", "NOT_EQUAL", "LESS", "LEQ", "GREATER", "GEQ", "SPLIT", "Select", "From", "Where", "In", "Insert", "Into", "Object", "Relationship", "HasMany", "DataType", "Letter", "Digit", "Digits", "NameChar", "WhiteSpaceChar", "StringLiteral", "Name", "QName", "'update'", "'set'", "'{'", "'}'", "'as'", "'or'", "'and'", "'like'"
    };
    public static final int FUNCTION=12;
    public static final int DataType=60;
    public static final int Insert=55;
    public static final int SORT_TARGET=30;
    public static final int Apos=41;
    public static final int Wildcard=43;
    public static final int HasMany=59;
    public static final int SPLIT=50;
    public static final int ATTRIBUTE=19;
    public static final int Where=53;
    public static final int INPUT=15;
    public static final int UPDATE=28;
    public static final int CONDITION=7;
    public static final int Into=56;
    public static final int AND=13;
    public static final int EOF=-1;
    public static final int SELECTION=6;
    public static final int ML_COMMENT=33;
    public static final int GREATER=48;
    public static final int ASSIGN_LABEL=17;
    public static final int INSERT=24;
    public static final int Digits=63;
    public static final int NOT_EQUAL=45;
    public static final int CONTAINED_IN=22;
    public static final int WhiteSpaceChar=65;
    public static final int NEW_VALUE=26;
    public static final int EQUAL=44;
    public static final int LESS=46;
    public static final int COMPARE=18;
    public static final int Select=51;
    public static final int REF_ALL=10;
    public static final int GEQ=49;
    public static final int VALUE_SET=25;
    public static final int Relationship=58;
    public static final int NEW_RELATION=27;
    public static final int Quot=40;
    public static final int PROJECT_ALL=9;
    public static final int RParen=38;
    public static final int In=54;
    public static final int QName=68;
    public static final int At=42;
    public static final int LParen=39;
    public static final int LINE_COMMENT=34;
    public static final int NUMBER=4;
    public static final int NameChar=64;
    public static final int RELATION=23;
    public static final int Colon=36;
    public static final int TARGET=11;
    public static final int VALUE=21;
    public static final int Digit=62;
    public static final int ONE_TO_MANY=31;
    public static final int Object=57;
    public static final int From=52;
    public static final int REF=20;
    public static final int ATTRIBUTE_DEF=29;
    public static final int StringLiteral=66;
    public static final int OR=14;
    public static final int Name=67;
    public static final int Dot=35;
    public static final int PROJECTION=8;
    public static final int Comma=37;
    public static final int Letter=61;
    public static final int OUTPUT=16;
    public static final int STRING=5;
    public static final int LEQ=47;
    public static final int OBJECT_DEF=32;

        public AmoebaQueryParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[33+1];
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:196:1: integerLiteral : Digits ;
    public final integerLiteral_return integerLiteral() throws RecognitionException {
        integerLiteral_return retval = new integerLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Digits1=null;

        Object Digits1_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:196:15: ( Digits )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:196:17: Digits
            {
            root_0 = (Object)adaptor.nil();

            Digits1=(Token)input.LT(1);
            match(input,Digits,FOLLOW_Digits_in_integerLiteral640); if (failed) return retval;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:197:1: decimalLiteral : ( Dot Digits | Digits Dot Digits );
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
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:197:15: ( Dot Digits | Digits Dot Digits )
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
                    new NoViableAltException("197:1: decimalLiteral : ( Dot Digits | Digits Dot Digits );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:197:17: Dot Digits
                    {
                    root_0 = (Object)adaptor.nil();

                    Dot2=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_decimalLiteral646); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Dot2_tree = (Object)adaptor.create(Dot2);
                    adaptor.addChild(root_0, Dot2_tree);
                    }
                    Digits3=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral648); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Digits3_tree = (Object)adaptor.create(Digits3);
                    adaptor.addChild(root_0, Digits3_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:197:29: Digits Dot Digits
                    {
                    root_0 = (Object)adaptor.nil();

                    Digits4=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral651); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Digits4_tree = (Object)adaptor.create(Digits4);
                    adaptor.addChild(root_0, Digits4_tree);
                    }
                    Dot5=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_decimalLiteral653); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Dot5_tree = (Object)adaptor.create(Dot5);
                    adaptor.addChild(root_0, Dot5_tree);
                    }
                    Digits6=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral655); if (failed) return retval;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:199:1: literal : ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) );
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
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:199:8: ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) )
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
            case 69:
            case 72:
            case 74:
            case 75:
            case 76:
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
                    new NoViableAltException("199:1: literal : ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:200:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:200:4: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal666);
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
                    // 200:19: -> ^( NUMBER numericLiteral )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:200:22: ^( NUMBER numericLiteral )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:201:4: StringLiteral
                    {
                    StringLiteral8=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal679); if (failed) return retval;
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
                    // 201:18: -> ^( STRING StringLiteral )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:201:21: ^( STRING StringLiteral )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:204:1: numericLiteral : ( integerLiteral | decimalLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        integerLiteral_return integerLiteral9 = null;

        decimalLiteral_return decimalLiteral10 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:205:2: ( integerLiteral | decimalLiteral )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Digits) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==Dot) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||(LA3_1>=Comma && LA3_1<=RParen)||(LA3_1>=EQUAL && LA3_1<=GEQ)||(LA3_1>=Select && LA3_1<=Insert)||(LA3_1>=Object && LA3_1<=Relationship)||LA3_1==69||LA3_1==72||(LA3_1>=74 && LA3_1<=76)) ) {
                    alt3=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("204:1: numericLiteral : ( integerLiteral | decimalLiteral );", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==Dot) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("204:1: numericLiteral : ( integerLiteral | decimalLiteral );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:205:4: integerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteral_in_numericLiteral699);
                    integerLiteral9=integerLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, integerLiteral9.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:206:4: decimalLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decimalLiteral_in_numericLiteral705);
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:211:1: lang : ( | ( expr )+ );
    public final lang_return lang() throws RecognitionException {
        lang_return retval = new lang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expr_return expr11 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:211:5: ( | ( expr )+ )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF) ) {
                alt5=1;
            }
            else if ( (LA5_0==Select||LA5_0==Insert||(LA5_0>=Object && LA5_0<=Relationship)||LA5_0==69) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("211:1: lang : ( | ( expr )+ );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:212:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:212:4: ( expr )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:212:4: ( expr )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Select||LA4_0==Insert||(LA4_0>=Object && LA4_0<=Relationship)||LA4_0==69) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:212:4: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_lang720);
                    	    expr11=expr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) adaptor.addChild(root_0, expr11.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:1: expr : ( objectExpr | amoebaQuery | relationshipExpr );
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        objectExpr_return objectExpr12 = null;

        amoebaQuery_return amoebaQuery13 = null;

        relationshipExpr_return relationshipExpr14 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:216:2: ( objectExpr | amoebaQuery | relationshipExpr )
            int alt6=3;
            switch ( input.LA(1) ) {
            case Object:
                {
                alt6=1;
                }
                break;
            case Select:
            case Insert:
            case 69:
                {
                alt6=2;
                }
                break;
            case Relationship:
                {
                alt6=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("215:1: expr : ( objectExpr | amoebaQuery | relationshipExpr );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:216:4: objectExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectExpr_in_expr732);
                    objectExpr12=objectExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, objectExpr12.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:217:4: amoebaQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_amoebaQuery_in_expr737);
                    amoebaQuery13=amoebaQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, amoebaQuery13.getTree());

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:218:4: relationshipExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relationshipExpr_in_expr742);
                    relationshipExpr14=relationshipExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, relationshipExpr14.getTree());

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

    public static class relationshipExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start relationshipExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:221:1: relationshipExpr : Relationship obj= QName HasMany qnameList -> ^( ONE_TO_MANY $obj qnameList ) ;
    public final relationshipExpr_return relationshipExpr() throws RecognitionException {
        relationshipExpr_return retval = new relationshipExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token obj=null;
        Token Relationship15=null;
        Token HasMany16=null;
        qnameList_return qnameList17 = null;


        Object obj_tree=null;
        Object Relationship15_tree=null;
        Object HasMany16_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Relationship=new RewriteRuleTokenStream(adaptor,"token Relationship");
        RewriteRuleTokenStream stream_HasMany=new RewriteRuleTokenStream(adaptor,"token HasMany");
        RewriteRuleSubtreeStream stream_qnameList=new RewriteRuleSubtreeStream(adaptor,"rule qnameList");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:222:2: ( Relationship obj= QName HasMany qnameList -> ^( ONE_TO_MANY $obj qnameList ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:222:4: Relationship obj= QName HasMany qnameList
            {
            Relationship15=(Token)input.LT(1);
            match(input,Relationship,FOLLOW_Relationship_in_relationshipExpr753); if (failed) return retval;
            if ( backtracking==0 ) stream_Relationship.add(Relationship15);

            obj=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_relationshipExpr757); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(obj);

            HasMany16=(Token)input.LT(1);
            match(input,HasMany,FOLLOW_HasMany_in_relationshipExpr759); if (failed) return retval;
            if ( backtracking==0 ) stream_HasMany.add(HasMany16);

            pushFollow(FOLLOW_qnameList_in_relationshipExpr761);
            qnameList17=qnameList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_qnameList.add(qnameList17.getTree());

            // AST REWRITE
            // elements: qnameList, obj
            // token labels: obj
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleTokenStream stream_obj=new RewriteRuleTokenStream(adaptor,"token obj",obj);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 223:3: -> ^( ONE_TO_MANY $obj qnameList )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:223:6: ^( ONE_TO_MANY $obj qnameList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ONE_TO_MANY, "ONE_TO_MANY"), root_1);

                adaptor.addChild(root_1, stream_obj.next());
                adaptor.addChild(root_1, stream_qnameList.next());

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
    // $ANTLR end relationshipExpr

    public static class qnameList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start qnameList
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:226:1: qnameList : QName ( Comma QName )? -> ( QName )+ ;
    public final qnameList_return qnameList() throws RecognitionException {
        qnameList_return retval = new qnameList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName18=null;
        Token Comma19=null;
        Token QName20=null;

        Object QName18_tree=null;
        Object Comma19_tree=null;
        Object QName20_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:2: ( QName ( Comma QName )? -> ( QName )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:4: QName ( Comma QName )?
            {
            QName18=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_qnameList787); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName18);

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:10: ( Comma QName )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Comma) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:227:11: Comma QName
                    {
                    Comma19=(Token)input.LT(1);
                    match(input,Comma,FOLLOW_Comma_in_qnameList790); if (failed) return retval;
                    if ( backtracking==0 ) stream_Comma.add(Comma19);

                    QName20=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_qnameList792); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName20);


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
            // 227:25: -> ( QName )+
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

    public static class objectExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start objectExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:230:1: objectExpr : Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= qnameList )? RParen -> ^( OBJECT_DEF[$objName] ( ^( ATTRIBUTE attributeDefExpr ) )? ( ^( SORT_TARGET $sortOrder) )? ) ;
    public final objectExpr_return objectExpr() throws RecognitionException {
        objectExpr_return retval = new objectExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token objName=null;
        Token Object21=null;
        Token LParen22=null;
        Token SPLIT24=null;
        Token RParen25=null;
        qnameList_return sortOrder = null;

        attributeDefExpr_return attributeDefExpr23 = null;


        Object objName_tree=null;
        Object Object21_tree=null;
        Object LParen22_tree=null;
        Object SPLIT24_tree=null;
        Object RParen25_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_SPLIT=new RewriteRuleTokenStream(adaptor,"token SPLIT");
        RewriteRuleTokenStream stream_Object=new RewriteRuleTokenStream(adaptor,"token Object");
        RewriteRuleSubtreeStream stream_qnameList=new RewriteRuleSubtreeStream(adaptor,"rule qnameList");
        RewriteRuleSubtreeStream stream_attributeDefExpr=new RewriteRuleSubtreeStream(adaptor,"rule attributeDefExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:231:2: ( Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= qnameList )? RParen -> ^( OBJECT_DEF[$objName] ( ^( ATTRIBUTE attributeDefExpr ) )? ( ^( SORT_TARGET $sortOrder) )? ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:231:4: Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= qnameList )? RParen
            {
            Object21=(Token)input.LT(1);
            match(input,Object,FOLLOW_Object_in_objectExpr810); if (failed) return retval;
            if ( backtracking==0 ) stream_Object.add(Object21);

            objName=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_objectExpr814); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(objName);

            LParen22=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_objectExpr816); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen22);

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:231:32: ( attributeDefExpr )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==QName) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:231:32: attributeDefExpr
                    {
                    pushFollow(FOLLOW_attributeDefExpr_in_objectExpr818);
                    attributeDefExpr23=attributeDefExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_attributeDefExpr.add(attributeDefExpr23.getTree());

                    }
                    break;

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:231:50: ( SPLIT sortOrder= qnameList )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==SPLIT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:231:51: SPLIT sortOrder= qnameList
                    {
                    SPLIT24=(Token)input.LT(1);
                    match(input,SPLIT,FOLLOW_SPLIT_in_objectExpr822); if (failed) return retval;
                    if ( backtracking==0 ) stream_SPLIT.add(SPLIT24);

                    pushFollow(FOLLOW_qnameList_in_objectExpr826);
                    sortOrder=qnameList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_qnameList.add(sortOrder.getTree());

                    }
                    break;

            }

            RParen25=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_objectExpr830); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen25);


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
            // 232:3: -> ^( OBJECT_DEF[$objName] ( ^( ATTRIBUTE attributeDefExpr ) )? ( ^( SORT_TARGET $sortOrder) )? )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:232:6: ^( OBJECT_DEF[$objName] ( ^( ATTRIBUTE attributeDefExpr ) )? ( ^( SORT_TARGET $sortOrder) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT_DEF, objName), root_1);

                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:232:29: ( ^( ATTRIBUTE attributeDefExpr ) )?
                if ( stream_attributeDefExpr.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:232:29: ^( ATTRIBUTE attributeDefExpr )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_2);

                    adaptor.addChild(root_2, stream_attributeDefExpr.next());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_attributeDefExpr.reset();
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:232:60: ( ^( SORT_TARGET $sortOrder) )?
                if ( stream_sortOrder.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:232:60: ^( SORT_TARGET $sortOrder)
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
    // $ANTLR end objectExpr

    public static class attributeDefExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeDefExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:235:1: attributeDefExpr : attributeDef ( Comma attributeDef )* ;
    public final attributeDefExpr_return attributeDefExpr() throws RecognitionException {
        attributeDefExpr_return retval = new attributeDefExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma27=null;
        attributeDef_return attributeDef26 = null;

        attributeDef_return attributeDef28 = null;


        Object Comma27_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:236:2: ( attributeDef ( Comma attributeDef )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:236:4: attributeDef ( Comma attributeDef )*
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_attributeDef_in_attributeDefExpr866);
            attributeDef26=attributeDef();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, attributeDef26.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:236:17: ( Comma attributeDef )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Comma) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:236:18: Comma attributeDef
            	    {
            	    Comma27=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_attributeDefExpr869); if (failed) return retval;
            	    if ( backtracking==0 ) {
            	    Comma27_tree = (Object)adaptor.create(Comma27);
            	    adaptor.addChild(root_0, Comma27_tree);
            	    }
            	    pushFollow(FOLLOW_attributeDef_in_attributeDefExpr871);
            	    attributeDef28=attributeDef();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) adaptor.addChild(root_0, attributeDef28.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // $ANTLR end attributeDefExpr

    public static class attributeDef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start attributeDef
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:239:1: attributeDef : QName DataType -> ^( ATTRIBUTE_DEF QName DataType ) ;
    public final attributeDef_return attributeDef() throws RecognitionException {
        attributeDef_return retval = new attributeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName29=null;
        Token DataType30=null;

        Object QName29_tree=null;
        Object DataType30_tree=null;
        RewriteRuleTokenStream stream_DataType=new RewriteRuleTokenStream(adaptor,"token DataType");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:240:2: ( QName DataType -> ^( ATTRIBUTE_DEF QName DataType ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:240:4: QName DataType
            {
            QName29=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_attributeDef885); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName29);

            DataType30=(Token)input.LT(1);
            match(input,DataType,FOLLOW_DataType_in_attributeDef887); if (failed) return retval;
            if ( backtracking==0 ) stream_DataType.add(DataType30);


            // AST REWRITE
            // elements: QName, DataType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:19: -> ^( ATTRIBUTE_DEF QName DataType )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:240:22: ^( ATTRIBUTE_DEF QName DataType )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ATTRIBUTE_DEF, "ATTRIBUTE_DEF"), root_1);

                adaptor.addChild(root_1, stream_QName.next());
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

    public static class amoebaQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start amoebaQuery
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:243:1: amoebaQuery : ( selectExpr | updateExpr );
    public final amoebaQuery_return amoebaQuery() throws RecognitionException {
        amoebaQuery_return retval = new amoebaQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        selectExpr_return selectExpr31 = null;

        updateExpr_return updateExpr32 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:244:2: ( selectExpr | updateExpr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==Select) ) {
                alt11=1;
            }
            else if ( (LA11_0==Insert||LA11_0==69) ) {
                alt11=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("243:1: amoebaQuery : ( selectExpr | updateExpr );", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:244:4: selectExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_selectExpr_in_amoebaQuery909);
                    selectExpr31=selectExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, selectExpr31.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:245:4: updateExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_updateExpr_in_amoebaQuery914);
                    updateExpr32=updateExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, updateExpr32.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:248:1: updateExpr : ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) );
    public final updateExpr_return updateExpr() throws RecognitionException {
        updateExpr_return retval = new updateExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Insert33=null;
        Token Into35=null;
        Token string_literal37=null;
        Token string_literal38=null;
        newRelation_return newRelation34 = null;

        targetRelation_return targetRelation36 = null;

        newRelation_return newRelation39 = null;

        whereClause_return whereClause40 = null;


        Object Insert33_tree=null;
        Object Into35_tree=null;
        Object string_literal37_tree=null;
        Object string_literal38_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_Insert=new RewriteRuleTokenStream(adaptor,"token Insert");
        RewriteRuleTokenStream stream_Into=new RewriteRuleTokenStream(adaptor,"token Into");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_newRelation=new RewriteRuleSubtreeStream(adaptor,"rule newRelation");
        RewriteRuleSubtreeStream stream_targetRelation=new RewriteRuleSubtreeStream(adaptor,"rule targetRelation");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:249:2: ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Insert) ) {
                alt14=1;
            }
            else if ( (LA14_0==69) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("248:1: updateExpr : ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:249:4: Insert newRelation ( Into targetRelation )?
                    {
                    Insert33=(Token)input.LT(1);
                    match(input,Insert,FOLLOW_Insert_in_updateExpr926); if (failed) return retval;
                    if ( backtracking==0 ) stream_Insert.add(Insert33);

                    pushFollow(FOLLOW_newRelation_in_updateExpr928);
                    newRelation34=newRelation();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_newRelation.add(newRelation34.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:249:23: ( Into targetRelation )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==Into) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:249:24: Into targetRelation
                            {
                            Into35=(Token)input.LT(1);
                            match(input,Into,FOLLOW_Into_in_updateExpr931); if (failed) return retval;
                            if ( backtracking==0 ) stream_Into.add(Into35);

                            pushFollow(FOLLOW_targetRelation_in_updateExpr933);
                            targetRelation36=targetRelation();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_targetRelation.add(targetRelation36.getTree());

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
                    // 250:4: -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:250:7: ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(INSERT, "INSERT"), root_1);

                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:250:16: ^( NEW_RELATION newRelation )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(NEW_RELATION, "NEW_RELATION"), root_2);

                        adaptor.addChild(root_2, stream_newRelation.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:250:44: ( ^( TARGET targetRelation ) )?
                        if ( stream_targetRelation.hasNext() ) {
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:250:44: ^( TARGET targetRelation )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:251:4: 'update' 'set' newRelation ( whereClause )?
                    {
                    string_literal37=(Token)input.LT(1);
                    match(input,69,FOLLOW_69_in_updateExpr963); if (failed) return retval;
                    if ( backtracking==0 ) stream_69.add(string_literal37);

                    string_literal38=(Token)input.LT(1);
                    match(input,70,FOLLOW_70_in_updateExpr965); if (failed) return retval;
                    if ( backtracking==0 ) stream_70.add(string_literal38);

                    pushFollow(FOLLOW_newRelation_in_updateExpr967);
                    newRelation39=newRelation();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_newRelation.add(newRelation39.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:251:31: ( whereClause )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==Where) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:251:31: whereClause
                            {
                            pushFollow(FOLLOW_whereClause_in_updateExpr969);
                            whereClause40=whereClause();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_whereClause.add(whereClause40.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: whereClause, newRelation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 252:4: -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:252:7: ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(UPDATE, "UPDATE"), root_1);

                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:252:16: ^( NEW_RELATION newRelation )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(NEW_RELATION, "NEW_RELATION"), root_2);

                        adaptor.addChild(root_2, stream_newRelation.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:252:44: ( ^( CONDITION whereClause ) )?
                        if ( stream_whereClause.hasNext() ) {
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:252:44: ^( CONDITION whereClause )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:255:1: newRelation : LParen tupleElement ( Comma tupleElement )* RParen -> ( tupleElement )+ ;
    public final newRelation_return newRelation() throws RecognitionException {
        newRelation_return retval = new newRelation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LParen41=null;
        Token Comma43=null;
        Token RParen45=null;
        tupleElement_return tupleElement42 = null;

        tupleElement_return tupleElement44 = null;


        Object LParen41_tree=null;
        Object Comma43_tree=null;
        Object RParen45_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_tupleElement=new RewriteRuleSubtreeStream(adaptor,"rule tupleElement");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:256:2: ( LParen tupleElement ( Comma tupleElement )* RParen -> ( tupleElement )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:256:4: LParen tupleElement ( Comma tupleElement )* RParen
            {
            LParen41=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_newRelation1005); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen41);

            pushFollow(FOLLOW_tupleElement_in_newRelation1007);
            tupleElement42=tupleElement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_tupleElement.add(tupleElement42.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:256:24: ( Comma tupleElement )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Comma) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:256:25: Comma tupleElement
            	    {
            	    Comma43=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_newRelation1010); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma43);

            	    pushFollow(FOLLOW_tupleElement_in_newRelation1012);
            	    tupleElement44=tupleElement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_tupleElement.add(tupleElement44.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            RParen45=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_newRelation1016); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen45);


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
            // 257:3: -> ( tupleElement )+
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:260:1: tupleElement : ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )? ;
    public final tupleElement_return tupleElement() throws RecognitionException {
        tupleElement_return retval = new tupleElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL47=null;
        elementValue_return e = null;

        attributeName_return attributeName46 = null;


        Object EQUAL47_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_attributeName=new RewriteRuleSubtreeStream(adaptor,"rule attributeName");
        RewriteRuleSubtreeStream stream_elementValue=new RewriteRuleSubtreeStream(adaptor,"rule elementValue");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:261:2: ( ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )? )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:261:4: ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )?
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:261:4: ( attributeName -> attributeName )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:261:5: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_tupleElement1036);
            attributeName46=attributeName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_attributeName.add(attributeName46.getTree());

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
            // 261:19: -> attributeName
            {
                adaptor.addChild(root_0, stream_attributeName.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:261:37: ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==EQUAL) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:261:38: EQUAL e= elementValue
                    {
                    EQUAL47=(Token)input.LT(1);
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleElement1044); if (failed) return retval;
                    if ( backtracking==0 ) stream_EQUAL.add(EQUAL47);

                    pushFollow(FOLLOW_elementValue_in_tupleElement1048);
                    e=elementValue();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_elementValue.add(e.getTree());

                    // AST REWRITE
                    // elements: elementValue, tupleElement
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 261:59: -> ^( NEW_VALUE $tupleElement elementValue )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:261:62: ^( NEW_VALUE $tupleElement elementValue )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:264:1: elementValue : ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) );
    public final elementValue_return elementValue() throws RecognitionException {
        elementValue_return retval = new elementValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal49=null;
        Token Comma51=null;
        Token char_literal53=null;
        literal_return literal48 = null;

        elementValue_return elementValue50 = null;

        elementValue_return elementValue52 = null;


        Object char_literal49_tree=null;
        Object Comma51_tree=null;
        Object char_literal53_tree=null;
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_elementValue=new RewriteRuleSubtreeStream(adaptor,"rule elementValue");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:265:2: ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==Dot||(LA18_0>=Comma && LA18_0<=RParen)||LA18_0==Digits||LA18_0==StringLiteral||LA18_0==72) ) {
                alt18=1;
            }
            else if ( (LA18_0==71) ) {
                alt18=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("264:1: elementValue : ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) );", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:265:4: literal
                    {
                    pushFollow(FOLLOW_literal_in_elementValue1074);
                    literal48=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_literal.add(literal48.getTree());

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
                    // 266:4: -> ^( VALUE literal )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:266:7: ^( VALUE literal )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:267:4: '{' elementValue ( Comma elementValue )? '}'
                    {
                    char_literal49=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_elementValue1090); if (failed) return retval;
                    if ( backtracking==0 ) stream_71.add(char_literal49);

                    pushFollow(FOLLOW_elementValue_in_elementValue1092);
                    elementValue50=elementValue();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_elementValue.add(elementValue50.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:267:21: ( Comma elementValue )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==Comma) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:267:22: Comma elementValue
                            {
                            Comma51=(Token)input.LT(1);
                            match(input,Comma,FOLLOW_Comma_in_elementValue1095); if (failed) return retval;
                            if ( backtracking==0 ) stream_Comma.add(Comma51);

                            pushFollow(FOLLOW_elementValue_in_elementValue1097);
                            elementValue52=elementValue();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_elementValue.add(elementValue52.getTree());

                            }
                            break;

                    }

                    char_literal53=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_elementValue1101); if (failed) return retval;
                    if ( backtracking==0 ) stream_72.add(char_literal53);


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
                    // 268:4: -> ^( VALUE_SET ( elementValue )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:268:7: ^( VALUE_SET ( elementValue )+ )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:272:1: exprSingle : ( selectExpr | subQuery );
    public final exprSingle_return exprSingle() throws RecognitionException {
        exprSingle_return retval = new exprSingle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        selectExpr_return selectExpr54 = null;

        subQuery_return subQuery55 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:273:2: ( selectExpr | subQuery )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==Select) ) {
                alt19=1;
            }
            else if ( (LA19_0==LParen) ) {
                alt19=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("272:1: exprSingle : ( selectExpr | subQuery );", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:273:4: selectExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_selectExpr_in_exprSingle1126);
                    selectExpr54=selectExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, selectExpr54.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:274:4: subQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subQuery_in_exprSingle1131);
                    subQuery55=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subQuery55.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:277:1: subQuery : LParen selectExpr RParen -> selectExpr ;
    public final subQuery_return subQuery() throws RecognitionException {
        subQuery_return retval = new subQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LParen56=null;
        Token RParen58=null;
        selectExpr_return selectExpr57 = null;


        Object LParen56_tree=null;
        Object RParen58_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleSubtreeStream stream_selectExpr=new RewriteRuleSubtreeStream(adaptor,"rule selectExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:278:2: ( LParen selectExpr RParen -> selectExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:278:4: LParen selectExpr RParen
            {
            LParen56=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_subQuery1143); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen56);

            pushFollow(FOLLOW_selectExpr_in_subQuery1145);
            selectExpr57=selectExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_selectExpr.add(selectExpr57.getTree());
            RParen58=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_subQuery1147); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen58);


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
            // 278:29: -> selectExpr
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:282:1: selectExpr : Select selectTarget ( fromClause )? ( whereClause )? -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? ) ;
    public final selectExpr_return selectExpr() throws RecognitionException {
        selectExpr_return retval = new selectExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Select59=null;
        selectTarget_return selectTarget60 = null;

        fromClause_return fromClause61 = null;

        whereClause_return whereClause62 = null;


        Object Select59_tree=null;
        RewriteRuleTokenStream stream_Select=new RewriteRuleTokenStream(adaptor,"token Select");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_selectTarget=new RewriteRuleSubtreeStream(adaptor,"rule selectTarget");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:283:2: ( Select selectTarget ( fromClause )? ( whereClause )? -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:283:4: Select selectTarget ( fromClause )? ( whereClause )?
            {
            Select59=(Token)input.LT(1);
            match(input,Select,FOLLOW_Select_in_selectExpr1168); if (failed) return retval;
            if ( backtracking==0 ) stream_Select.add(Select59);

            pushFollow(FOLLOW_selectTarget_in_selectExpr1170);
            selectTarget60=selectTarget();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_selectTarget.add(selectTarget60.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:283:24: ( fromClause )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==From) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:283:24: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_selectExpr1172);
                    fromClause61=fromClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fromClause.add(fromClause61.getTree());

                    }
                    break;

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:283:36: ( whereClause )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Where) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:283:36: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_selectExpr1175);
                    whereClause62=whereClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_whereClause.add(whereClause62.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: selectTarget, fromClause, whereClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 284:3: -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:284:6: ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SELECTION, "SELECTION"), root_1);

                adaptor.addChild(root_1, stream_selectTarget.next());
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:284:31: ( ^( INPUT fromClause ) )?
                if ( stream_fromClause.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:284:31: ^( INPUT fromClause )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(adaptor.create(INPUT, "INPUT"), root_2);

                    adaptor.addChild(root_2, stream_fromClause.next());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_fromClause.reset();
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:284:52: ( ^( CONDITION whereClause ) )?
                if ( stream_whereClause.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:284:52: ^( CONDITION whereClause )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:288:1: selectTarget : ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL );
    public final selectTarget_return selectTarget() throws RecognitionException {
        selectTarget_return retval = new selectTarget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma64=null;
        Token Wildcard66=null;
        labelExpr_return labelExpr63 = null;

        labelExpr_return labelExpr65 = null;


        Object Comma64_tree=null;
        Object Wildcard66_tree=null;
        RewriteRuleTokenStream stream_Wildcard=new RewriteRuleTokenStream(adaptor,"token Wildcard");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:289:2: ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==EOF||LA23_0==Dot||(LA23_0>=Comma && LA23_0<=RParen)||(LA23_0>=Select && LA23_0<=Where)||LA23_0==Insert||(LA23_0>=Object && LA23_0<=Relationship)||LA23_0==Digits||LA23_0==StringLiteral||(LA23_0>=QName && LA23_0<=69)) ) {
                alt23=1;
            }
            else if ( (LA23_0==Wildcard) ) {
                alt23=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("288:1: selectTarget : ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL );", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:289:4: labelExpr ( Comma labelExpr )*
                    {
                    pushFollow(FOLLOW_labelExpr_in_selectTarget1212);
                    labelExpr63=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr63.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:289:14: ( Comma labelExpr )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==Comma) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:289:15: Comma labelExpr
                    	    {
                    	    Comma64=(Token)input.LT(1);
                    	    match(input,Comma,FOLLOW_Comma_in_selectTarget1215); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_Comma.add(Comma64);

                    	    pushFollow(FOLLOW_labelExpr_in_selectTarget1217);
                    	    labelExpr65=labelExpr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_labelExpr.add(labelExpr65.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop22;
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
                    // 289:33: -> ^( PROJECTION ( labelExpr )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:289:36: ^( PROJECTION ( labelExpr )+ )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:290:4: Wildcard
                    {
                    Wildcard66=(Token)input.LT(1);
                    match(input,Wildcard,FOLLOW_Wildcard_in_selectTarget1233); if (failed) return retval;
                    if ( backtracking==0 ) stream_Wildcard.add(Wildcard66);


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
                    // 290:13: -> PROJECT_ALL
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:293:1: fromClause : From fromTarget ( Comma fromTarget )* -> ( fromTarget )+ ;
    public final fromClause_return fromClause() throws RecognitionException {
        fromClause_return retval = new fromClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token From67=null;
        Token Comma69=null;
        fromTarget_return fromTarget68 = null;

        fromTarget_return fromTarget70 = null;


        Object From67_tree=null;
        Object Comma69_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_From=new RewriteRuleTokenStream(adaptor,"token From");
        RewriteRuleSubtreeStream stream_fromTarget=new RewriteRuleSubtreeStream(adaptor,"rule fromTarget");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:294:2: ( From fromTarget ( Comma fromTarget )* -> ( fromTarget )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:294:4: From fromTarget ( Comma fromTarget )*
            {
            From67=(Token)input.LT(1);
            match(input,From,FOLLOW_From_in_fromClause1248); if (failed) return retval;
            if ( backtracking==0 ) stream_From.add(From67);

            pushFollow(FOLLOW_fromTarget_in_fromClause1250);
            fromTarget68=fromTarget();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fromTarget.add(fromTarget68.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:294:20: ( Comma fromTarget )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==Comma) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:294:21: Comma fromTarget
            	    {
            	    Comma69=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_fromClause1253); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma69);

            	    pushFollow(FOLLOW_fromTarget_in_fromClause1255);
            	    fromTarget70=fromTarget();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_fromTarget.add(fromTarget70.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
            // 294:40: -> ( fromTarget )+
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:297:1: fromTarget : ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )? ;
    public final fromTarget_return fromTarget() throws RecognitionException {
        fromTarget_return retval = new fromTarget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal72=null;
        Token QName73=null;
        targetRelation_return targetRelation71 = null;


        Object string_literal72_tree=null;
        Object QName73_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_targetRelation=new RewriteRuleSubtreeStream(adaptor,"rule targetRelation");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:298:2: ( ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )? )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:298:4: ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )?
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:298:4: ( targetRelation -> targetRelation )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:298:5: targetRelation
            {
            pushFollow(FOLLOW_targetRelation_in_fromTarget1274);
            targetRelation71=targetRelation();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_targetRelation.add(targetRelation71.getTree());

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
            // 298:20: -> targetRelation
            {
                adaptor.addChild(root_0, stream_targetRelation.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:298:39: ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==73) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:298:40: 'as' QName
                    {
                    string_literal72=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_fromTarget1282); if (failed) return retval;
                    if ( backtracking==0 ) stream_73.add(string_literal72);

                    QName73=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_fromTarget1284); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName73);


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
                    // 298:51: -> ^( ASSIGN_LABEL QName $fromTarget)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:298:54: ^( ASSIGN_LABEL QName $fromTarget)
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:301:1: targetRelation : ( QName -> ^( RELATION QName ) | subQuery );
    public final targetRelation_return targetRelation() throws RecognitionException {
        targetRelation_return retval = new targetRelation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName74=null;
        subQuery_return subQuery75 = null;


        Object QName74_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:2: ( QName -> ^( RELATION QName ) | subQuery )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==QName) ) {
                alt26=1;
            }
            else if ( (LA26_0==LParen) ) {
                alt26=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("301:1: targetRelation : ( QName -> ^( RELATION QName ) | subQuery );", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:4: QName
                    {
                    QName74=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_targetRelation1310); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName74);


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
                    // 302:10: -> ^( RELATION QName )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:13: ^( RELATION QName )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:303:4: subQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subQuery_in_targetRelation1323);
                    subQuery75=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subQuery75.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:306:1: whereClause : Where orExpr ;
    public final whereClause_return whereClause() throws RecognitionException {
        whereClause_return retval = new whereClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Where76=null;
        orExpr_return orExpr77 = null;


        Object Where76_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:307:2: ( Where orExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:307:4: Where orExpr
            {
            root_0 = (Object)adaptor.nil();

            Where76=(Token)input.LT(1);
            match(input,Where,FOLLOW_Where_in_whereClause1334); if (failed) return retval;
            pushFollow(FOLLOW_orExpr_in_whereClause1337);
            orExpr77=orExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpr77.getTree());

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

    public static class orExpr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start orExpr
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:310:1: orExpr : ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )* ;
    public final orExpr_return orExpr() throws RecognitionException {
        orExpr_return retval = new orExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        andExpr_return a = null;

        andExpr_return andExpr78 = null;


        Object string_literal79_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_andExpr=new RewriteRuleSubtreeStream(adaptor,"rule andExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:2: ( ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:4: ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )*
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:4: ( andExpr -> andExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:5: andExpr
            {
            pushFollow(FOLLOW_andExpr_in_orExpr1351);
            andExpr78=andExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_andExpr.add(andExpr78.getTree());

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
            // 311:13: -> andExpr
            {
                adaptor.addChild(root_0, stream_andExpr.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:25: ( 'or' a= andExpr -> ^( OR $orExpr $a) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==74) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:26: 'or' a= andExpr
            	    {
            	    string_literal79=(Token)input.LT(1);
            	    match(input,74,FOLLOW_74_in_orExpr1359); if (failed) return retval;
            	    if ( backtracking==0 ) stream_74.add(string_literal79);

            	    pushFollow(FOLLOW_andExpr_in_orExpr1363);
            	    a=andExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_andExpr.add(a.getTree());

            	    // AST REWRITE
            	    // elements: a, orExpr
            	    // token labels: 
            	    // rule labels: retval, a
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_a=new RewriteRuleSubtreeStream(adaptor,"token a",a!=null?a.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 311:41: -> ^( OR $orExpr $a)
            	    {
            	        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:311:44: ^( OR $orExpr $a)
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
            	    break loop27;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:314:1: andExpr : ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )* ;
    public final andExpr_return andExpr() throws RecognitionException {
        andExpr_return retval = new andExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal81=null;
        conditionExpr_return c = null;

        conditionExpr_return conditionExpr80 = null;


        Object string_literal81_tree=null;
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_conditionExpr=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:2: ( ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:4: ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )*
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:4: ( conditionExpr -> conditionExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:5: conditionExpr
            {
            pushFollow(FOLLOW_conditionExpr_in_andExpr1391);
            conditionExpr80=conditionExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_conditionExpr.add(conditionExpr80.getTree());

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
            // 315:19: -> conditionExpr
            {
                adaptor.addChild(root_0, stream_conditionExpr.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:37: ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==75) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:38: 'and' c= conditionExpr
            	    {
            	    string_literal81=(Token)input.LT(1);
            	    match(input,75,FOLLOW_75_in_andExpr1399); if (failed) return retval;
            	    if ( backtracking==0 ) stream_75.add(string_literal81);

            	    pushFollow(FOLLOW_conditionExpr_in_andExpr1403);
            	    c=conditionExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_conditionExpr.add(c.getTree());

            	    // AST REWRITE
            	    // elements: andExpr, c
            	    // token labels: 
            	    // rule labels: retval, c
            	    // token list labels: 
            	    // rule list labels: 
            	    if ( backtracking==0 ) {
            	    retval.tree = root_0;
            	    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);
            	    RewriteRuleSubtreeStream stream_c=new RewriteRuleSubtreeStream(adaptor,"token c",c!=null?c.tree:null);

            	    root_0 = (Object)adaptor.nil();
            	    // 315:60: -> ^( AND $andExpr $c)
            	    {
            	        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:315:63: ^( AND $andExpr $c)
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
            	    break loop28;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );
    public final conditionExpr_return conditionExpr() throws RecognitionException {
        conditionExpr_return retval = new conditionExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token In85=null;
        comparisonOp_return c = null;

        labelExpr_return labelExpr82 = null;

        labelExpr_return labelExpr83 = null;

        labelExpr_return labelExpr84 = null;

        subQuery_return subQuery86 = null;


        Object In85_tree=null;
        RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
        RewriteRuleSubtreeStream stream_subQuery=new RewriteRuleSubtreeStream(adaptor,"rule subQuery");
        RewriteRuleSubtreeStream stream_comparisonOp=new RewriteRuleSubtreeStream(adaptor,"rule comparisonOp");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:320:2: ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) )
            int alt29=2;
            switch ( input.LA(1) ) {
            case QName:
                {
                switch ( input.LA(2) ) {
                case Dot:
                    {
                    int LA29_7 = input.LA(3);

                    if ( (LA29_7==Wildcard) ) {
                        int LA29_17 = input.LA(4);

                        if ( (LA29_17==In) ) {
                            alt29=2;
                        }
                        else if ( ((LA29_17>=EQUAL && LA29_17<=GEQ)||LA29_17==76) ) {
                            alt29=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 17, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA29_7==QName) ) {
                        int LA29_18 = input.LA(4);

                        if ( ((LA29_18>=EQUAL && LA29_18<=GEQ)||LA29_18==76) ) {
                            alt29=1;
                        }
                        else if ( (LA29_18==In) ) {
                            alt29=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 18, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 7, input);

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
                        case LParen:
                            {
                            int LA29_32 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 32, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Dot:
                            {
                            int LA29_33 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 33, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA29_34 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 34, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA29_35 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 35, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 19, input);

                            throw nvae;
                        }

                        }
                        break;
                    case Comma:
                        {
                        switch ( input.LA(4) ) {
                        case QName:
                            {
                            int LA29_36 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 36, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA29_37 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 37, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA29_38 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 38, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Digits:
                            {
                            int LA29_39 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 39, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Dot:
                            {
                            int LA29_40 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 40, input);

                                throw nvae;
                            }
                            }
                            break;
                        case StringLiteral:
                            {
                            int LA29_41 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 41, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 20, input);

                            throw nvae;
                        }

                        }
                        break;
                    case RParen:
                        {
                        int LA29_21 = input.LA(4);

                        if ( (LA29_21==In) ) {
                            alt29=2;
                        }
                        else if ( ((LA29_21>=EQUAL && LA29_21<=GEQ)||LA29_21==76) ) {
                            alt29=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 21, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Digits:
                        {
                        switch ( input.LA(4) ) {
                        case Dot:
                            {
                            int LA29_44 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 44, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA29_45 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 45, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA29_46 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 46, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 22, input);

                            throw nvae;
                        }

                        }
                        break;
                    case Dot:
                        {
                        int LA29_23 = input.LA(4);

                        if ( (LA29_23==Digits) ) {
                            int LA29_47 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 47, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 23, input);

                            throw nvae;
                        }
                        }
                        break;
                    case StringLiteral:
                        {
                        int LA29_24 = input.LA(4);

                        if ( (LA29_24==Comma) ) {
                            int LA29_48 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 48, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA29_24==RParen) ) {
                            int LA29_49 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt29=1;
                            }
                            else if ( (true) ) {
                                alt29=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 49, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 24, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 8, input);

                        throw nvae;
                    }

                    }
                    break;
                case In:
                    {
                    alt29=2;
                    }
                    break;
                case EQUAL:
                case NOT_EQUAL:
                case LESS:
                case LEQ:
                case GREATER:
                case GEQ:
                case 76:
                    {
                    alt29=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 1, input);

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
            case 76:
                {
                alt29=1;
                }
                break;
            case Digits:
                {
                switch ( input.LA(2) ) {
                case Dot:
                    {
                    int LA29_11 = input.LA(3);

                    if ( (LA29_11==Digits) ) {
                        int LA29_25 = input.LA(4);

                        if ( (LA29_25==In) ) {
                            alt29=2;
                        }
                        else if ( ((LA29_25>=EQUAL && LA29_25<=GEQ)||LA29_25==76) ) {
                            alt29=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 25, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 11, input);

                        throw nvae;
                    }
                    }
                    break;
                case In:
                    {
                    alt29=2;
                    }
                    break;
                case EQUAL:
                case NOT_EQUAL:
                case LESS:
                case LEQ:
                case GREATER:
                case GEQ:
                case 76:
                    {
                    alt29=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 3, input);

                    throw nvae;
                }

                }
                break;
            case Dot:
                {
                int LA29_4 = input.LA(2);

                if ( (LA29_4==Digits) ) {
                    int LA29_14 = input.LA(3);

                    if ( ((LA29_14>=EQUAL && LA29_14<=GEQ)||LA29_14==76) ) {
                        alt29=1;
                    }
                    else if ( (LA29_14==In) ) {
                        alt29=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 14, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 4, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                int LA29_5 = input.LA(2);

                if ( ((LA29_5>=EQUAL && LA29_5<=GEQ)||LA29_5==76) ) {
                    alt29=1;
                }
                else if ( (LA29_5==In) ) {
                    alt29=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 5, input);

                    throw nvae;
                }
                }
                break;
            case In:
                {
                alt29=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("319:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:320:4: labelExpr c= comparisonOp labelExpr
                    {
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1439);
                    labelExpr82=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr82.getTree());
                    pushFollow(FOLLOW_comparisonOp_in_conditionExpr1443);
                    c=comparisonOp();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_comparisonOp.add(c.getTree());
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1445);
                    labelExpr83=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr83.getTree());

                    // AST REWRITE
                    // elements: labelExpr, comparisonOp
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 321:4: -> ^( COMPARE comparisonOp ( labelExpr )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:321:7: ^( COMPARE comparisonOp ( labelExpr )+ )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:322:4: labelExpr In subQuery
                    {
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1465);
                    labelExpr84=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr84.getTree());
                    In85=(Token)input.LT(1);
                    match(input,In,FOLLOW_In_in_conditionExpr1467); if (failed) return retval;
                    if ( backtracking==0 ) stream_In.add(In85);

                    pushFollow(FOLLOW_subQuery_in_conditionExpr1469);
                    subQuery86=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_subQuery.add(subQuery86.getTree());

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
                    // 323:4: -> ^( CONTAINED_IN labelExpr subQuery )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:323:7: ^( CONTAINED_IN labelExpr subQuery )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:326:1: comparisonOp : ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' ) ;
    public final comparisonOp_return comparisonOp() throws RecognitionException {
        comparisonOp_return retval = new comparisonOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set87=null;

        Object set87_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:326:13: ( ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:326:15: ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' )
            {
            root_0 = (Object)adaptor.nil();

            set87=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUAL && input.LA(1)<=GEQ)||input.LA(1)==76 ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set87));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_comparisonOp1491);    throw mse;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:328:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );
    public final labelExpr_return labelExpr() throws RecognitionException {
        labelExpr_return retval = new labelExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        function_return function88 = null;

        attributeName_return attributeName89 = null;

        value_return value90 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:329:2: ( function | attributeName | value -> ^( VALUE value ) )
            int alt30=3;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==QName) ) {
                int LA30_1 = input.LA(2);

                if ( (LA30_1==LParen) ) {
                    alt30=1;
                }
                else if ( (LA30_1==EOF||LA30_1==Dot||(LA30_1>=Comma && LA30_1<=RParen)||(LA30_1>=EQUAL && LA30_1<=GEQ)||(LA30_1>=Select && LA30_1<=Insert)||(LA30_1>=Object && LA30_1<=Relationship)||LA30_1==69||(LA30_1>=74 && LA30_1<=76)) ) {
                    alt30=2;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("328:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );", 30, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA30_0==EOF||LA30_0==Dot||(LA30_0>=Comma && LA30_0<=RParen)||(LA30_0>=EQUAL && LA30_0<=GEQ)||(LA30_0>=Select && LA30_0<=Insert)||(LA30_0>=Object && LA30_0<=Relationship)||LA30_0==Digits||LA30_0==StringLiteral||LA30_0==69||(LA30_0>=74 && LA30_0<=76)) ) {
                alt30=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("328:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:329:4: function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_in_labelExpr1527);
                    function88=function();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, function88.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:330:4: attributeName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attributeName_in_labelExpr1533);
                    attributeName89=attributeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attributeName89.getTree());

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:331:4: value
                    {
                    pushFollow(FOLLOW_value_in_labelExpr1539);
                    value90=value();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_value.add(value90.getTree());

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
                    // 331:10: -> ^( VALUE value )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:331:13: ^( VALUE value )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:1: value : literal ;
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        literal_return literal91 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:335:2: ( literal )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:335:4: literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_literal_in_value1560);
            literal91=literal();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, literal91.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:338:1: attributeName : ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );
    public final attributeName_return attributeName() throws RecognitionException {
        attributeName_return retval = new attributeName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token relation=null;
        Token attribute=null;
        Token QName92=null;
        Token Dot93=null;
        Token Dot94=null;
        Token Wildcard95=null;

        Object relation_tree=null;
        Object attribute_tree=null;
        Object QName92_tree=null;
        Object Dot93_tree=null;
        Object Dot94_tree=null;
        Object Wildcard95_tree=null;
        RewriteRuleTokenStream stream_Dot=new RewriteRuleTokenStream(adaptor,"token Dot");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Wildcard=new RewriteRuleTokenStream(adaptor,"token Wildcard");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:2: ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==QName) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==Dot) ) {
                    int LA31_2 = input.LA(3);

                    if ( (LA31_2==QName) ) {
                        alt31=2;
                    }
                    else if ( (LA31_2==Wildcard) ) {
                        alt31=3;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("338:1: attributeName : ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 31, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA31_1==EOF||(LA31_1>=Comma && LA31_1<=RParen)||(LA31_1>=EQUAL && LA31_1<=GEQ)||(LA31_1>=Select && LA31_1<=Insert)||(LA31_1>=Object && LA31_1<=Relationship)||LA31_1==69||(LA31_1>=74 && LA31_1<=76)) ) {
                    alt31=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("338:1: attributeName : ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 31, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("338:1: attributeName : ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:4: QName
                    {
                    QName92=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1571); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName92);


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
                    // 339:10: -> ^( ATTRIBUTE QName )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:13: ^( ATTRIBUTE QName )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(ATTRIBUTE, "ATTRIBUTE"), root_1);

                        adaptor.addChild(root_1, stream_QName.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:340:4: relation= QName Dot attribute= QName
                    {
                    relation=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1586); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(relation);

                    Dot93=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_attributeName1588); if (failed) return retval;
                    if ( backtracking==0 ) stream_Dot.add(Dot93);

                    attribute=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1592); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(attribute);


                    // AST REWRITE
                    // elements: relation, attribute
                    // token labels: relation, attribute
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_relation=new RewriteRuleTokenStream(adaptor,"token relation",relation);
                    RewriteRuleTokenStream stream_attribute=new RewriteRuleTokenStream(adaptor,"token attribute",attribute);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 340:39: -> ^( REF $relation $attribute)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:340:42: ^( REF $relation $attribute)
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(REF, "REF"), root_1);

                        adaptor.addChild(root_1, stream_relation.next());
                        adaptor.addChild(root_1, stream_attribute.next());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    }

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:341:4: relation= QName Dot Wildcard
                    {
                    relation=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1611); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(relation);

                    Dot94=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_attributeName1613); if (failed) return retval;
                    if ( backtracking==0 ) stream_Dot.add(Dot94);

                    Wildcard95=(Token)input.LT(1);
                    match(input,Wildcard,FOLLOW_Wildcard_in_attributeName1615); if (failed) return retval;
                    if ( backtracking==0 ) stream_Wildcard.add(Wildcard95);


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
                    // 341:32: -> ^( REF_ALL $relation)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:341:35: ^( REF_ALL $relation)
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:345:1: function : QName LParen labelExpr ( Comma labelExpr )* RParen -> ^( FUNCTION QName ( labelExpr )+ ) ;
    public final function_return function() throws RecognitionException {
        function_return retval = new function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName96=null;
        Token LParen97=null;
        Token Comma99=null;
        Token RParen101=null;
        labelExpr_return labelExpr98 = null;

        labelExpr_return labelExpr100 = null;


        Object QName96_tree=null;
        Object LParen97_tree=null;
        Object Comma99_tree=null;
        Object RParen101_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:346:2: ( QName LParen labelExpr ( Comma labelExpr )* RParen -> ^( FUNCTION QName ( labelExpr )+ ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:346:4: QName LParen labelExpr ( Comma labelExpr )* RParen
            {
            QName96=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_function1638); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName96);

            LParen97=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_function1640); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen97);

            pushFollow(FOLLOW_labelExpr_in_function1642);
            labelExpr98=labelExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_labelExpr.add(labelExpr98.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:346:27: ( Comma labelExpr )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==Comma) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:346:28: Comma labelExpr
            	    {
            	    Comma99=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_function1645); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma99);

            	    pushFollow(FOLLOW_labelExpr_in_function1647);
            	    labelExpr100=labelExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_labelExpr.add(labelExpr100.getTree());

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            RParen101=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_function1651); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen101);


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
            // 347:2: -> ^( FUNCTION QName ( labelExpr )+ )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:347:5: ^( FUNCTION QName ( labelExpr )+ )
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
        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:320:4: ( labelExpr comparisonOp labelExpr )
        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:320:4: labelExpr comparisonOp labelExpr
        {
        pushFollow(FOLLOW_labelExpr_in_synpred11439);
        labelExpr();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_comparisonOp_in_synpred11443);
        comparisonOp();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_labelExpr_in_synpred11445);
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


 

    public static final BitSet FOLLOW_Digits_in_integerLiteral640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_decimalLiteral646 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral651 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Dot_in_decimalLiteral653 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteral_in_numericLiteral699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimalLiteral_in_numericLiteral705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_lang720 = new BitSet(new long[]{0x0688000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_objectExpr_in_expr732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amoebaQuery_in_expr737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationshipExpr_in_expr742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Relationship_in_relationshipExpr753 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_QName_in_relationshipExpr757 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_HasMany_in_relationshipExpr759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qnameList_in_relationshipExpr761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_qnameList787 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_Comma_in_qnameList790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_QName_in_qnameList792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Object_in_objectExpr810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_QName_in_objectExpr814 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LParen_in_objectExpr816 = new BitSet(new long[]{0x0004004000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_attributeDefExpr_in_objectExpr818 = new BitSet(new long[]{0x0004004000000000L});
    public static final BitSet FOLLOW_SPLIT_in_objectExpr822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qnameList_in_objectExpr826 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RParen_in_objectExpr830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeDef_in_attributeDefExpr866 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_Comma_in_attributeDefExpr869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_attributeDef_in_attributeDefExpr871 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_QName_in_attributeDef885 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_DataType_in_attributeDef887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpr_in_amoebaQuery909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateExpr_in_amoebaQuery914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Insert_in_updateExpr926 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_newRelation_in_updateExpr928 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_Into_in_updateExpr931 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_targetRelation_in_updateExpr933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_updateExpr963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_updateExpr965 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_newRelation_in_updateExpr967 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_whereClause_in_updateExpr969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LParen_in_newRelation1005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_tupleElement_in_newRelation1007 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_Comma_in_newRelation1010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_tupleElement_in_newRelation1012 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_RParen_in_newRelation1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_tupleElement1036 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_EQUAL_in_tupleElement1044 = new BitSet(new long[]{0x8000000800000002L,0x0000000000000084L});
    public static final BitSet FOLLOW_elementValue_in_tupleElement1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_elementValue1074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_elementValue1090 = new BitSet(new long[]{0x8000002800000000L,0x0000000000000184L});
    public static final BitSet FOLLOW_elementValue_in_elementValue1092 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_Comma_in_elementValue1095 = new BitSet(new long[]{0x8000000800000000L,0x0000000000000184L});
    public static final BitSet FOLLOW_elementValue_in_elementValue1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_elementValue1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpr_in_exprSingle1126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuery_in_exprSingle1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LParen_in_subQuery1143 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_selectExpr_in_subQuery1145 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_RParen_in_subQuery1147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Select_in_selectExpr1168 = new BitSet(new long[]{0x8030082800000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_selectTarget_in_selectExpr1170 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_fromClause_in_selectExpr1172 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_whereClause_in_selectExpr1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_selectTarget1212 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_Comma_in_selectTarget1215 = new BitSet(new long[]{0x8000002800000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_labelExpr_in_selectTarget1217 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_Wildcard_in_selectTarget1233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_From_in_fromClause1248 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_fromTarget_in_fromClause1250 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_Comma_in_fromClause1253 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_fromTarget_in_fromClause1255 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_targetRelation_in_fromTarget1274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_fromTarget1282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_QName_in_fromTarget1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_targetRelation1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuery_in_targetRelation1323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Where_in_whereClause1334 = new BitSet(new long[]{0x8003F00800000000L,0x0000000000001014L});
    public static final BitSet FOLLOW_orExpr_in_whereClause1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_orExpr1359 = new BitSet(new long[]{0x8003F00800000000L,0x0000000000001014L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1363 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_conditionExpr_in_andExpr1391 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_andExpr1399 = new BitSet(new long[]{0x8003F00800000000L,0x0000000000001014L});
    public static final BitSet FOLLOW_conditionExpr_in_andExpr1403 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1439 = new BitSet(new long[]{0x0003F00000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_comparisonOp_in_conditionExpr1443 = new BitSet(new long[]{0x8000000800000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1465 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_In_in_conditionExpr1467 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_subQuery_in_conditionExpr1469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparisonOp1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_labelExpr1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_labelExpr1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_labelExpr1539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_value1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1586 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Dot_in_attributeName1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_QName_in_attributeName1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1611 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Dot_in_attributeName1613 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_Wildcard_in_attributeName1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_function1638 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LParen_in_function1640 = new BitSet(new long[]{0x8000006800000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_labelExpr_in_function1642 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_Comma_in_function1645 = new BitSet(new long[]{0x8000006800000000L,0x0000000000000014L});
    public static final BitSet FOLLOW_labelExpr_in_function1647 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_RParen_in_function1651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_synpred11439 = new BitSet(new long[]{0x0003F00000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_comparisonOp_in_synpred11443 = new BitSet(new long[]{0x8000000800000002L,0x0000000000000014L});
    public static final BitSet FOLLOW_labelExpr_in_synpred11445 = new BitSet(new long[]{0x0000000000000002L});

}