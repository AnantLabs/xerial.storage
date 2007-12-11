// $ANTLR 3.0.1 F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g 2007-12-11 14:57:35

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "NUMBER", "STRING", "SELECTION", "CONDITION", "PROJECTION", "PROJECT_ALL", "REF_ALL", "TARGET", "FUNCTION", "AND", "OR", "INPUT", "OUTPUT", "ASSIGN_LABEL", "COMPARE", "ATTRIBUTE", "REF", "VALUE", "CONTAINED_IN", "RELATION", "INSERT", "VALUE_SET", "NEW_VALUE", "NEW_RELATION", "UPDATE", "ATTRIBUTE_DEF", "SORT_TARGET", "ONE_TO_MANY", "OBJECT_DEF", "OBJECT", "LANG", "ML_COMMENT", "LINE_COMMENT", "Dot", "Colon", "Comma", "RParen", "LParen", "Quot", "Apos", "At", "Wildcard", "EQUAL", "NOT_EQUAL", "LESS", "LEQ", "GREATER", "GEQ", "SPLIT", "Select", "From", "Where", "In", "Insert", "Into", "Object", "Relationship", "HasMany", "DataType", "Letter", "Digit", "Digits", "NameChar", "WhiteSpaceChar", "StringLiteral", "Name", "QName", "'update'", "'set'", "'{'", "'}'", "'as'", "'or'", "'and'", "'like'"
    };
    public static final int FUNCTION=12;
    public static final int DataType=62;
    public static final int Insert=57;
    public static final int SORT_TARGET=30;
    public static final int Apos=43;
    public static final int Wildcard=45;
    public static final int HasMany=61;
    public static final int SPLIT=52;
    public static final int ATTRIBUTE=19;
    public static final int Where=55;
    public static final int INPUT=15;
    public static final int UPDATE=28;
    public static final int CONDITION=7;
    public static final int Into=58;
    public static final int AND=13;
    public static final int EOF=-1;
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
    public static final int QName=70;
    public static final int At=44;
    public static final int LParen=41;
    public static final int LINE_COMMENT=36;
    public static final int NUMBER=4;
    public static final int NameChar=66;
    public static final int RELATION=23;
    public static final int Colon=38;
    public static final int TARGET=11;
    public static final int VALUE=21;
    public static final int Digit=64;
    public static final int ONE_TO_MANY=31;
    public static final int Object=59;
    public static final int From=54;
    public static final int REF=20;
    public static final int ATTRIBUTE_DEF=29;
    public static final int StringLiteral=68;
    public static final int OR=14;
    public static final int Name=69;
    public static final int Dot=37;
    public static final int PROJECTION=8;
    public static final int Comma=39;
    public static final int Letter=63;
    public static final int OUTPUT=16;
    public static final int STRING=5;
    public static final int LANG=34;
    public static final int LEQ=49;
    public static final int OBJECT_DEF=32;

        public AmoebaQueryParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[37+1];
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:199:1: integerLiteral : Digits ;
    public final integerLiteral_return integerLiteral() throws RecognitionException {
        integerLiteral_return retval = new integerLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Digits1=null;

        Object Digits1_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:199:15: ( Digits )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:199:17: Digits
            {
            root_0 = (Object)adaptor.nil();

            Digits1=(Token)input.LT(1);
            match(input,Digits,FOLLOW_Digits_in_integerLiteral647); if (failed) return retval;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:200:1: decimalLiteral : ( Dot Digits | Digits Dot Digits );
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
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:200:15: ( Dot Digits | Digits Dot Digits )
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
                    new NoViableAltException("200:1: decimalLiteral : ( Dot Digits | Digits Dot Digits );", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:200:17: Dot Digits
                    {
                    root_0 = (Object)adaptor.nil();

                    Dot2=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_decimalLiteral653); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Dot2_tree = (Object)adaptor.create(Dot2);
                    adaptor.addChild(root_0, Dot2_tree);
                    }
                    Digits3=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral655); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Digits3_tree = (Object)adaptor.create(Digits3);
                    adaptor.addChild(root_0, Digits3_tree);
                    }

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:200:29: Digits Dot Digits
                    {
                    root_0 = (Object)adaptor.nil();

                    Digits4=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral658); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Digits4_tree = (Object)adaptor.create(Digits4);
                    adaptor.addChild(root_0, Digits4_tree);
                    }
                    Dot5=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_decimalLiteral660); if (failed) return retval;
                    if ( backtracking==0 ) {
                    Dot5_tree = (Object)adaptor.create(Dot5);
                    adaptor.addChild(root_0, Dot5_tree);
                    }
                    Digits6=(Token)input.LT(1);
                    match(input,Digits,FOLLOW_Digits_in_decimalLiteral662); if (failed) return retval;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:202:1: literal : ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) );
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
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:202:8: ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) )
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
            case 71:
            case 74:
            case 76:
            case 77:
            case 78:
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
                    new NoViableAltException("202:1: literal : ( | numericLiteral -> ^( NUMBER numericLiteral ) | StringLiteral -> ^( STRING StringLiteral ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:203:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:203:4: numericLiteral
                    {
                    pushFollow(FOLLOW_numericLiteral_in_literal673);
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
                    // 203:19: -> ^( NUMBER numericLiteral )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:203:22: ^( NUMBER numericLiteral )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:204:4: StringLiteral
                    {
                    StringLiteral8=(Token)input.LT(1);
                    match(input,StringLiteral,FOLLOW_StringLiteral_in_literal686); if (failed) return retval;
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
                    // 204:18: -> ^( STRING StringLiteral )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:204:21: ^( STRING StringLiteral )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:207:1: numericLiteral : ( integerLiteral | decimalLiteral );
    public final numericLiteral_return numericLiteral() throws RecognitionException {
        numericLiteral_return retval = new numericLiteral_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        integerLiteral_return integerLiteral9 = null;

        decimalLiteral_return decimalLiteral10 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:208:2: ( integerLiteral | decimalLiteral )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Digits) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==Dot) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EOF||(LA3_1>=Comma && LA3_1<=RParen)||(LA3_1>=EQUAL && LA3_1<=GEQ)||(LA3_1>=Select && LA3_1<=Insert)||(LA3_1>=Object && LA3_1<=Relationship)||LA3_1==71||LA3_1==74||(LA3_1>=76 && LA3_1<=78)) ) {
                    alt3=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("207:1: numericLiteral : ( integerLiteral | decimalLiteral );", 3, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA3_0==Dot) ) {
                alt3=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("207:1: numericLiteral : ( integerLiteral | decimalLiteral );", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:208:4: integerLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_integerLiteral_in_numericLiteral706);
                    integerLiteral9=integerLiteral();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, integerLiteral9.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:209:4: decimalLiteral
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_decimalLiteral_in_numericLiteral712);
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:214:1: lang : ( | ( expr )+ -> ^( LANG ( expr )+ ) );
    public final lang_return lang() throws RecognitionException {
        lang_return retval = new lang_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        expr_return expr11 = null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:214:5: ( | ( expr )+ -> ^( LANG ( expr )+ ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==EOF) ) {
                alt5=1;
            }
            else if ( (LA5_0==Select||LA5_0==Insert||(LA5_0>=Object && LA5_0<=Relationship)||LA5_0==71) ) {
                alt5=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("214:1: lang : ( | ( expr )+ -> ^( LANG ( expr )+ ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:2: 
                    {
                    root_0 = (Object)adaptor.nil();

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:4: ( expr )+
                    {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:4: ( expr )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Select||LA4_0==Insert||(LA4_0>=Object && LA4_0<=Relationship)||LA4_0==71) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:4: expr
                    	    {
                    	    pushFollow(FOLLOW_expr_in_lang727);
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
                    // 215:10: -> ^( LANG ( expr )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:215:13: ^( LANG ( expr )+ )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:218:1: expr : ( objectDefExpr | amoebaQuery | relationshipExpr );
    public final expr_return expr() throws RecognitionException {
        expr_return retval = new expr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        objectDefExpr_return objectDefExpr12 = null;

        amoebaQuery_return amoebaQuery13 = null;

        relationshipExpr_return relationshipExpr14 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:219:2: ( objectDefExpr | amoebaQuery | relationshipExpr )
            int alt6=3;
            switch ( input.LA(1) ) {
            case Object:
                {
                alt6=1;
                }
                break;
            case Select:
            case Insert:
            case 71:
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
                    new NoViableAltException("218:1: expr : ( objectDefExpr | amoebaQuery | relationshipExpr );", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:219:4: objectDefExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_objectDefExpr_in_expr748);
                    objectDefExpr12=objectDefExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, objectDefExpr12.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:220:4: amoebaQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_amoebaQuery_in_expr753);
                    amoebaQuery13=amoebaQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, amoebaQuery13.getTree());

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:221:4: relationshipExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_relationshipExpr_in_expr758);
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:224:1: relationshipExpr : Relationship obj= QName HasMany objectList -> ^( ONE_TO_MANY[$obj] objectList ) ;
    public final relationshipExpr_return relationshipExpr() throws RecognitionException {
        relationshipExpr_return retval = new relationshipExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token obj=null;
        Token Relationship15=null;
        Token HasMany16=null;
        objectList_return objectList17 = null;


        Object obj_tree=null;
        Object Relationship15_tree=null;
        Object HasMany16_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Relationship=new RewriteRuleTokenStream(adaptor,"token Relationship");
        RewriteRuleTokenStream stream_HasMany=new RewriteRuleTokenStream(adaptor,"token HasMany");
        RewriteRuleSubtreeStream stream_objectList=new RewriteRuleSubtreeStream(adaptor,"rule objectList");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:225:2: ( Relationship obj= QName HasMany objectList -> ^( ONE_TO_MANY[$obj] objectList ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:225:4: Relationship obj= QName HasMany objectList
            {
            Relationship15=(Token)input.LT(1);
            match(input,Relationship,FOLLOW_Relationship_in_relationshipExpr769); if (failed) return retval;
            if ( backtracking==0 ) stream_Relationship.add(Relationship15);

            obj=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_relationshipExpr773); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(obj);

            HasMany16=(Token)input.LT(1);
            match(input,HasMany,FOLLOW_HasMany_in_relationshipExpr775); if (failed) return retval;
            if ( backtracking==0 ) stream_HasMany.add(HasMany16);

            pushFollow(FOLLOW_objectList_in_relationshipExpr777);
            objectList17=objectList();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_objectList.add(objectList17.getTree());

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
            // 226:3: -> ^( ONE_TO_MANY[$obj] objectList )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:226:6: ^( ONE_TO_MANY[$obj] objectList )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ONE_TO_MANY, obj), root_1);

                adaptor.addChild(root_1, stream_objectList.next());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:229:1: qnameList : QName ( Comma QName )? -> ( QName )+ ;
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
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:230:2: ( QName ( Comma QName )? -> ( QName )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:230:4: QName ( Comma QName )?
            {
            QName18=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_qnameList799); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName18);

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:230:10: ( Comma QName )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==Comma) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:230:11: Comma QName
                    {
                    Comma19=(Token)input.LT(1);
                    match(input,Comma,FOLLOW_Comma_in_qnameList802); if (failed) return retval;
                    if ( backtracking==0 ) stream_Comma.add(Comma19);

                    QName20=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_qnameList804); if (failed) return retval;
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
            // 230:25: -> ( QName )+
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:233:1: objectList : object ( Comma object )? -> ( object )+ ;
    public final objectList_return objectList() throws RecognitionException {
        objectList_return retval = new objectList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma22=null;
        object_return object21 = null;

        object_return object23 = null;


        Object Comma22_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_object=new RewriteRuleSubtreeStream(adaptor,"rule object");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:234:2: ( object ( Comma object )? -> ( object )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:234:4: object ( Comma object )?
            {
            pushFollow(FOLLOW_object_in_objectList823);
            object21=object();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_object.add(object21.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:234:11: ( Comma object )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Comma) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:234:12: Comma object
                    {
                    Comma22=(Token)input.LT(1);
                    match(input,Comma,FOLLOW_Comma_in_objectList826); if (failed) return retval;
                    if ( backtracking==0 ) stream_Comma.add(Comma22);

                    pushFollow(FOLLOW_object_in_objectList828);
                    object23=object();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_object.add(object23.getTree());

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
            // 234:27: -> ( object )+
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:237:1: object : QName -> ^( OBJECT[$QName] ) ;
    public final object_return object() throws RecognitionException {
        object_return retval = new object_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName24=null;

        Object QName24_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:238:2: ( QName -> ^( OBJECT[$QName] ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:238:4: QName
            {
            QName24=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_object846); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName24);


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
            // 238:10: -> ^( OBJECT[$QName] )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:238:13: ^( OBJECT[$QName] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT, QName24), root_1);

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:241:1: objectDefExpr : Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= sortTargetList )? RParen -> ^( OBJECT_DEF[$objName] ( attributeDefExpr )? ( ^( SORT_TARGET $sortOrder) )? ) ;
    public final objectDefExpr_return objectDefExpr() throws RecognitionException {
        objectDefExpr_return retval = new objectDefExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token objName=null;
        Token Object25=null;
        Token LParen26=null;
        Token SPLIT28=null;
        Token RParen29=null;
        sortTargetList_return sortOrder = null;

        attributeDefExpr_return attributeDefExpr27 = null;


        Object objName_tree=null;
        Object Object25_tree=null;
        Object LParen26_tree=null;
        Object SPLIT28_tree=null;
        Object RParen29_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_SPLIT=new RewriteRuleTokenStream(adaptor,"token SPLIT");
        RewriteRuleTokenStream stream_Object=new RewriteRuleTokenStream(adaptor,"token Object");
        RewriteRuleSubtreeStream stream_sortTargetList=new RewriteRuleSubtreeStream(adaptor,"rule sortTargetList");
        RewriteRuleSubtreeStream stream_attributeDefExpr=new RewriteRuleSubtreeStream(adaptor,"rule attributeDefExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:242:2: ( Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= sortTargetList )? RParen -> ^( OBJECT_DEF[$objName] ( attributeDefExpr )? ( ^( SORT_TARGET $sortOrder) )? ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:242:4: Object objName= QName LParen ( attributeDefExpr )? ( SPLIT sortOrder= sortTargetList )? RParen
            {
            Object25=(Token)input.LT(1);
            match(input,Object,FOLLOW_Object_in_objectDefExpr864); if (failed) return retval;
            if ( backtracking==0 ) stream_Object.add(Object25);

            objName=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_objectDefExpr868); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(objName);

            LParen26=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_objectDefExpr870); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen26);

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:242:32: ( attributeDefExpr )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==QName) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:242:32: attributeDefExpr
                    {
                    pushFollow(FOLLOW_attributeDefExpr_in_objectDefExpr872);
                    attributeDefExpr27=attributeDefExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_attributeDefExpr.add(attributeDefExpr27.getTree());

                    }
                    break;

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:242:50: ( SPLIT sortOrder= sortTargetList )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==SPLIT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:242:51: SPLIT sortOrder= sortTargetList
                    {
                    SPLIT28=(Token)input.LT(1);
                    match(input,SPLIT,FOLLOW_SPLIT_in_objectDefExpr876); if (failed) return retval;
                    if ( backtracking==0 ) stream_SPLIT.add(SPLIT28);

                    pushFollow(FOLLOW_sortTargetList_in_objectDefExpr880);
                    sortOrder=sortTargetList();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_sortTargetList.add(sortOrder.getTree());

                    }
                    break;

            }

            RParen29=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_objectDefExpr884); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen29);


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
            // 243:3: -> ^( OBJECT_DEF[$objName] ( attributeDefExpr )? ( ^( SORT_TARGET $sortOrder) )? )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:243:6: ^( OBJECT_DEF[$objName] ( attributeDefExpr )? ( ^( SORT_TARGET $sortOrder) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(OBJECT_DEF, objName), root_1);

                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:243:29: ( attributeDefExpr )?
                if ( stream_attributeDefExpr.hasNext() ) {
                    adaptor.addChild(root_1, stream_attributeDefExpr.next());

                }
                stream_attributeDefExpr.reset();
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:243:47: ( ^( SORT_TARGET $sortOrder) )?
                if ( stream_sortOrder.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:243:47: ^( SORT_TARGET $sortOrder)
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:246:1: attributeDefExpr : attributeDef ( Comma attributeDef )* -> ( attributeDef )+ ;
    public final attributeDefExpr_return attributeDefExpr() throws RecognitionException {
        attributeDefExpr_return retval = new attributeDefExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma31=null;
        attributeDef_return attributeDef30 = null;

        attributeDef_return attributeDef32 = null;


        Object Comma31_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_attributeDef=new RewriteRuleSubtreeStream(adaptor,"rule attributeDef");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:247:2: ( attributeDef ( Comma attributeDef )* -> ( attributeDef )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:247:4: attributeDef ( Comma attributeDef )*
            {
            pushFollow(FOLLOW_attributeDef_in_attributeDefExpr916);
            attributeDef30=attributeDef();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_attributeDef.add(attributeDef30.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:247:17: ( Comma attributeDef )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Comma) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:247:18: Comma attributeDef
            	    {
            	    Comma31=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_attributeDefExpr919); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma31);

            	    pushFollow(FOLLOW_attributeDef_in_attributeDefExpr921);
            	    attributeDef32=attributeDef();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_attributeDef.add(attributeDef32.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // 247:39: -> ( attributeDef )+
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:250:1: attributeDef : QName DataType -> ^( ATTRIBUTE_DEF[$QName] DataType ) ;
    public final attributeDef_return attributeDef() throws RecognitionException {
        attributeDef_return retval = new attributeDef_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName33=null;
        Token DataType34=null;

        Object QName33_tree=null;
        Object DataType34_tree=null;
        RewriteRuleTokenStream stream_DataType=new RewriteRuleTokenStream(adaptor,"token DataType");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:251:2: ( QName DataType -> ^( ATTRIBUTE_DEF[$QName] DataType ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:251:4: QName DataType
            {
            QName33=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_attributeDef939); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName33);

            DataType34=(Token)input.LT(1);
            match(input,DataType,FOLLOW_DataType_in_attributeDef941); if (failed) return retval;
            if ( backtracking==0 ) stream_DataType.add(DataType34);


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
            // 251:19: -> ^( ATTRIBUTE_DEF[$QName] DataType )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:251:22: ^( ATTRIBUTE_DEF[$QName] DataType )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ATTRIBUTE_DEF, QName33), root_1);

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

    public static class sortTargetList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start sortTargetList
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:254:1: sortTargetList : sortTarget ( Comma sortTarget )* -> ( sortTarget )+ ;
    public final sortTargetList_return sortTargetList() throws RecognitionException {
        sortTargetList_return retval = new sortTargetList_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma36=null;
        sortTarget_return sortTarget35 = null;

        sortTarget_return sortTarget37 = null;


        Object Comma36_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_sortTarget=new RewriteRuleSubtreeStream(adaptor,"rule sortTarget");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:255:2: ( sortTarget ( Comma sortTarget )* -> ( sortTarget )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:255:4: sortTarget ( Comma sortTarget )*
            {
            pushFollow(FOLLOW_sortTarget_in_sortTargetList963);
            sortTarget35=sortTarget();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_sortTarget.add(sortTarget35.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:255:15: ( Comma sortTarget )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Comma) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:255:16: Comma sortTarget
            	    {
            	    Comma36=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_sortTargetList966); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma36);

            	    pushFollow(FOLLOW_sortTarget_in_sortTargetList968);
            	    sortTarget37=sortTarget();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_sortTarget.add(sortTarget37.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: sortTarget
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 255:35: -> ( sortTarget )+
            {
                if ( !(stream_sortTarget.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_sortTarget.hasNext() ) {
                    adaptor.addChild(root_0, stream_sortTarget.next());

                }
                stream_sortTarget.reset();

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
    // $ANTLR end sortTargetList

    public static class sortTarget_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start sortTarget
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:258:1: sortTarget : QName -> ^( ATTRIBUTE[$QName] ) ;
    public final sortTarget_return sortTarget() throws RecognitionException {
        sortTarget_return retval = new sortTarget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName38=null;

        Object QName38_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:259:2: ( QName -> ^( ATTRIBUTE[$QName] ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:259:4: QName
            {
            QName38=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_sortTarget986); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName38);


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
            // 259:10: -> ^( ATTRIBUTE[$QName] )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:259:13: ^( ATTRIBUTE[$QName] )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(ATTRIBUTE, QName38), root_1);

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
    // $ANTLR end sortTarget

    public static class amoebaQuery_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start amoebaQuery
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:262:1: amoebaQuery : ( selectExpr | updateExpr );
    public final amoebaQuery_return amoebaQuery() throws RecognitionException {
        amoebaQuery_return retval = new amoebaQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        selectExpr_return selectExpr39 = null;

        updateExpr_return updateExpr40 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:263:2: ( selectExpr | updateExpr )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Select) ) {
                alt13=1;
            }
            else if ( (LA13_0==Insert||LA13_0==71) ) {
                alt13=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("262:1: amoebaQuery : ( selectExpr | updateExpr );", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:263:4: selectExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_selectExpr_in_amoebaQuery1004);
                    selectExpr39=selectExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, selectExpr39.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:264:4: updateExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_updateExpr_in_amoebaQuery1009);
                    updateExpr40=updateExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, updateExpr40.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:267:1: updateExpr : ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) );
    public final updateExpr_return updateExpr() throws RecognitionException {
        updateExpr_return retval = new updateExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Insert41=null;
        Token Into43=null;
        Token string_literal45=null;
        Token string_literal46=null;
        newRelation_return newRelation42 = null;

        targetRelation_return targetRelation44 = null;

        newRelation_return newRelation47 = null;

        whereClause_return whereClause48 = null;


        Object Insert41_tree=null;
        Object Into43_tree=null;
        Object string_literal45_tree=null;
        Object string_literal46_tree=null;
        RewriteRuleTokenStream stream_Insert=new RewriteRuleTokenStream(adaptor,"token Insert");
        RewriteRuleTokenStream stream_Into=new RewriteRuleTokenStream(adaptor,"token Into");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_newRelation=new RewriteRuleSubtreeStream(adaptor,"rule newRelation");
        RewriteRuleSubtreeStream stream_targetRelation=new RewriteRuleSubtreeStream(adaptor,"rule targetRelation");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:268:2: ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==Insert) ) {
                alt16=1;
            }
            else if ( (LA16_0==71) ) {
                alt16=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("267:1: updateExpr : ( Insert newRelation ( Into targetRelation )? -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? ) | 'update' 'set' newRelation ( whereClause )? -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:268:4: Insert newRelation ( Into targetRelation )?
                    {
                    Insert41=(Token)input.LT(1);
                    match(input,Insert,FOLLOW_Insert_in_updateExpr1021); if (failed) return retval;
                    if ( backtracking==0 ) stream_Insert.add(Insert41);

                    pushFollow(FOLLOW_newRelation_in_updateExpr1023);
                    newRelation42=newRelation();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_newRelation.add(newRelation42.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:268:23: ( Into targetRelation )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==Into) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:268:24: Into targetRelation
                            {
                            Into43=(Token)input.LT(1);
                            match(input,Into,FOLLOW_Into_in_updateExpr1026); if (failed) return retval;
                            if ( backtracking==0 ) stream_Into.add(Into43);

                            pushFollow(FOLLOW_targetRelation_in_updateExpr1028);
                            targetRelation44=targetRelation();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_targetRelation.add(targetRelation44.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: targetRelation, newRelation
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 269:4: -> ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:269:7: ^( INSERT ^( NEW_RELATION newRelation ) ( ^( TARGET targetRelation ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(INSERT, "INSERT"), root_1);

                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:269:16: ^( NEW_RELATION newRelation )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(NEW_RELATION, "NEW_RELATION"), root_2);

                        adaptor.addChild(root_2, stream_newRelation.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:269:44: ( ^( TARGET targetRelation ) )?
                        if ( stream_targetRelation.hasNext() ) {
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:269:44: ^( TARGET targetRelation )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:270:4: 'update' 'set' newRelation ( whereClause )?
                    {
                    string_literal45=(Token)input.LT(1);
                    match(input,71,FOLLOW_71_in_updateExpr1058); if (failed) return retval;
                    if ( backtracking==0 ) stream_71.add(string_literal45);

                    string_literal46=(Token)input.LT(1);
                    match(input,72,FOLLOW_72_in_updateExpr1060); if (failed) return retval;
                    if ( backtracking==0 ) stream_72.add(string_literal46);

                    pushFollow(FOLLOW_newRelation_in_updateExpr1062);
                    newRelation47=newRelation();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_newRelation.add(newRelation47.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:270:31: ( whereClause )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==Where) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:270:31: whereClause
                            {
                            pushFollow(FOLLOW_whereClause_in_updateExpr1064);
                            whereClause48=whereClause();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_whereClause.add(whereClause48.getTree());

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
                    // 271:4: -> ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:271:7: ^( UPDATE ^( NEW_RELATION newRelation ) ( ^( CONDITION whereClause ) )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(adaptor.create(UPDATE, "UPDATE"), root_1);

                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:271:16: ^( NEW_RELATION newRelation )
                        {
                        Object root_2 = (Object)adaptor.nil();
                        root_2 = (Object)adaptor.becomeRoot(adaptor.create(NEW_RELATION, "NEW_RELATION"), root_2);

                        adaptor.addChild(root_2, stream_newRelation.next());

                        adaptor.addChild(root_1, root_2);
                        }
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:271:44: ( ^( CONDITION whereClause ) )?
                        if ( stream_whereClause.hasNext() ) {
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:271:44: ^( CONDITION whereClause )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:274:1: newRelation : LParen tupleElement ( Comma tupleElement )* RParen -> ( tupleElement )+ ;
    public final newRelation_return newRelation() throws RecognitionException {
        newRelation_return retval = new newRelation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LParen49=null;
        Token Comma51=null;
        Token RParen53=null;
        tupleElement_return tupleElement50 = null;

        tupleElement_return tupleElement52 = null;


        Object LParen49_tree=null;
        Object Comma51_tree=null;
        Object RParen53_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_tupleElement=new RewriteRuleSubtreeStream(adaptor,"rule tupleElement");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:275:2: ( LParen tupleElement ( Comma tupleElement )* RParen -> ( tupleElement )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:275:4: LParen tupleElement ( Comma tupleElement )* RParen
            {
            LParen49=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_newRelation1100); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen49);

            pushFollow(FOLLOW_tupleElement_in_newRelation1102);
            tupleElement50=tupleElement();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_tupleElement.add(tupleElement50.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:275:24: ( Comma tupleElement )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==Comma) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:275:25: Comma tupleElement
            	    {
            	    Comma51=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_newRelation1105); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma51);

            	    pushFollow(FOLLOW_tupleElement_in_newRelation1107);
            	    tupleElement52=tupleElement();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_tupleElement.add(tupleElement52.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            RParen53=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_newRelation1111); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen53);


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
            // 276:3: -> ( tupleElement )+
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:279:1: tupleElement : ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )? ;
    public final tupleElement_return tupleElement() throws RecognitionException {
        tupleElement_return retval = new tupleElement_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EQUAL55=null;
        elementValue_return e = null;

        attributeName_return attributeName54 = null;


        Object EQUAL55_tree=null;
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_attributeName=new RewriteRuleSubtreeStream(adaptor,"rule attributeName");
        RewriteRuleSubtreeStream stream_elementValue=new RewriteRuleSubtreeStream(adaptor,"rule elementValue");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:280:2: ( ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )? )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:280:4: ( attributeName -> attributeName ) ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )?
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:280:4: ( attributeName -> attributeName )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:280:5: attributeName
            {
            pushFollow(FOLLOW_attributeName_in_tupleElement1131);
            attributeName54=attributeName();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_attributeName.add(attributeName54.getTree());

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
            // 280:19: -> attributeName
            {
                adaptor.addChild(root_0, stream_attributeName.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:280:37: ( EQUAL e= elementValue -> ^( NEW_VALUE $tupleElement elementValue ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==EQUAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:280:38: EQUAL e= elementValue
                    {
                    EQUAL55=(Token)input.LT(1);
                    match(input,EQUAL,FOLLOW_EQUAL_in_tupleElement1139); if (failed) return retval;
                    if ( backtracking==0 ) stream_EQUAL.add(EQUAL55);

                    pushFollow(FOLLOW_elementValue_in_tupleElement1143);
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
                    // 280:59: -> ^( NEW_VALUE $tupleElement elementValue )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:280:62: ^( NEW_VALUE $tupleElement elementValue )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:283:1: elementValue : ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) );
    public final elementValue_return elementValue() throws RecognitionException {
        elementValue_return retval = new elementValue_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal57=null;
        Token Comma59=null;
        Token char_literal61=null;
        literal_return literal56 = null;

        elementValue_return elementValue58 = null;

        elementValue_return elementValue60 = null;


        Object char_literal57_tree=null;
        Object Comma59_tree=null;
        Object char_literal61_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_elementValue=new RewriteRuleSubtreeStream(adaptor,"rule elementValue");
        RewriteRuleSubtreeStream stream_literal=new RewriteRuleSubtreeStream(adaptor,"rule literal");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:284:2: ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==Dot||(LA20_0>=Comma && LA20_0<=RParen)||LA20_0==Digits||LA20_0==StringLiteral||LA20_0==74) ) {
                alt20=1;
            }
            else if ( (LA20_0==73) ) {
                alt20=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("283:1: elementValue : ( literal -> ^( VALUE literal ) | '{' elementValue ( Comma elementValue )? '}' -> ^( VALUE_SET ( elementValue )+ ) );", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:284:4: literal
                    {
                    pushFollow(FOLLOW_literal_in_elementValue1169);
                    literal56=literal();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_literal.add(literal56.getTree());

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
                    // 285:4: -> ^( VALUE literal )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:285:7: ^( VALUE literal )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:286:4: '{' elementValue ( Comma elementValue )? '}'
                    {
                    char_literal57=(Token)input.LT(1);
                    match(input,73,FOLLOW_73_in_elementValue1185); if (failed) return retval;
                    if ( backtracking==0 ) stream_73.add(char_literal57);

                    pushFollow(FOLLOW_elementValue_in_elementValue1187);
                    elementValue58=elementValue();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_elementValue.add(elementValue58.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:286:21: ( Comma elementValue )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==Comma) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:286:22: Comma elementValue
                            {
                            Comma59=(Token)input.LT(1);
                            match(input,Comma,FOLLOW_Comma_in_elementValue1190); if (failed) return retval;
                            if ( backtracking==0 ) stream_Comma.add(Comma59);

                            pushFollow(FOLLOW_elementValue_in_elementValue1192);
                            elementValue60=elementValue();
                            _fsp--;
                            if (failed) return retval;
                            if ( backtracking==0 ) stream_elementValue.add(elementValue60.getTree());

                            }
                            break;

                    }

                    char_literal61=(Token)input.LT(1);
                    match(input,74,FOLLOW_74_in_elementValue1196); if (failed) return retval;
                    if ( backtracking==0 ) stream_74.add(char_literal61);


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
                    // 287:4: -> ^( VALUE_SET ( elementValue )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:287:7: ^( VALUE_SET ( elementValue )+ )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:291:1: exprSingle : ( selectExpr | subQuery );
    public final exprSingle_return exprSingle() throws RecognitionException {
        exprSingle_return retval = new exprSingle_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        selectExpr_return selectExpr62 = null;

        subQuery_return subQuery63 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:292:2: ( selectExpr | subQuery )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==Select) ) {
                alt21=1;
            }
            else if ( (LA21_0==LParen) ) {
                alt21=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("291:1: exprSingle : ( selectExpr | subQuery );", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:292:4: selectExpr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_selectExpr_in_exprSingle1221);
                    selectExpr62=selectExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, selectExpr62.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:293:4: subQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subQuery_in_exprSingle1226);
                    subQuery63=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subQuery63.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:296:1: subQuery : LParen selectExpr RParen -> selectExpr ;
    public final subQuery_return subQuery() throws RecognitionException {
        subQuery_return retval = new subQuery_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token LParen64=null;
        Token RParen66=null;
        selectExpr_return selectExpr65 = null;


        Object LParen64_tree=null;
        Object RParen66_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleSubtreeStream stream_selectExpr=new RewriteRuleSubtreeStream(adaptor,"rule selectExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:297:2: ( LParen selectExpr RParen -> selectExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:297:4: LParen selectExpr RParen
            {
            LParen64=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_subQuery1238); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen64);

            pushFollow(FOLLOW_selectExpr_in_subQuery1240);
            selectExpr65=selectExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_selectExpr.add(selectExpr65.getTree());
            RParen66=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_subQuery1242); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen66);


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
            // 297:29: -> selectExpr
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:301:1: selectExpr : Select selectTarget ( fromClause )? ( whereClause )? -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? ) ;
    public final selectExpr_return selectExpr() throws RecognitionException {
        selectExpr_return retval = new selectExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Select67=null;
        selectTarget_return selectTarget68 = null;

        fromClause_return fromClause69 = null;

        whereClause_return whereClause70 = null;


        Object Select67_tree=null;
        RewriteRuleTokenStream stream_Select=new RewriteRuleTokenStream(adaptor,"token Select");
        RewriteRuleSubtreeStream stream_whereClause=new RewriteRuleSubtreeStream(adaptor,"rule whereClause");
        RewriteRuleSubtreeStream stream_selectTarget=new RewriteRuleSubtreeStream(adaptor,"rule selectTarget");
        RewriteRuleSubtreeStream stream_fromClause=new RewriteRuleSubtreeStream(adaptor,"rule fromClause");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:2: ( Select selectTarget ( fromClause )? ( whereClause )? -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:4: Select selectTarget ( fromClause )? ( whereClause )?
            {
            Select67=(Token)input.LT(1);
            match(input,Select,FOLLOW_Select_in_selectExpr1263); if (failed) return retval;
            if ( backtracking==0 ) stream_Select.add(Select67);

            pushFollow(FOLLOW_selectTarget_in_selectExpr1265);
            selectTarget68=selectTarget();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_selectTarget.add(selectTarget68.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:24: ( fromClause )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==From) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:24: fromClause
                    {
                    pushFollow(FOLLOW_fromClause_in_selectExpr1267);
                    fromClause69=fromClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_fromClause.add(fromClause69.getTree());

                    }
                    break;

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:36: ( whereClause )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==Where) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:302:36: whereClause
                    {
                    pushFollow(FOLLOW_whereClause_in_selectExpr1270);
                    whereClause70=whereClause();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_whereClause.add(whereClause70.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: selectTarget, whereClause, fromClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            if ( backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 303:3: -> ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:303:6: ^( SELECTION selectTarget ( ^( INPUT fromClause ) )? ( ^( CONDITION whereClause ) )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(adaptor.create(SELECTION, "SELECTION"), root_1);

                adaptor.addChild(root_1, stream_selectTarget.next());
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:303:31: ( ^( INPUT fromClause ) )?
                if ( stream_fromClause.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:303:31: ^( INPUT fromClause )
                    {
                    Object root_2 = (Object)adaptor.nil();
                    root_2 = (Object)adaptor.becomeRoot(adaptor.create(INPUT, "INPUT"), root_2);

                    adaptor.addChild(root_2, stream_fromClause.next());

                    adaptor.addChild(root_1, root_2);
                    }

                }
                stream_fromClause.reset();
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:303:52: ( ^( CONDITION whereClause ) )?
                if ( stream_whereClause.hasNext() ) {
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:303:52: ^( CONDITION whereClause )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:307:1: selectTarget : ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL );
    public final selectTarget_return selectTarget() throws RecognitionException {
        selectTarget_return retval = new selectTarget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Comma72=null;
        Token Wildcard74=null;
        labelExpr_return labelExpr71 = null;

        labelExpr_return labelExpr73 = null;


        Object Comma72_tree=null;
        Object Wildcard74_tree=null;
        RewriteRuleTokenStream stream_Wildcard=new RewriteRuleTokenStream(adaptor,"token Wildcard");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:308:2: ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==EOF||LA25_0==Dot||(LA25_0>=Comma && LA25_0<=RParen)||(LA25_0>=Select && LA25_0<=Where)||LA25_0==Insert||(LA25_0>=Object && LA25_0<=Relationship)||LA25_0==Digits||LA25_0==StringLiteral||(LA25_0>=QName && LA25_0<=71)) ) {
                alt25=1;
            }
            else if ( (LA25_0==Wildcard) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("307:1: selectTarget : ( labelExpr ( Comma labelExpr )* -> ^( PROJECTION ( labelExpr )+ ) | Wildcard -> PROJECT_ALL );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:308:4: labelExpr ( Comma labelExpr )*
                    {
                    pushFollow(FOLLOW_labelExpr_in_selectTarget1307);
                    labelExpr71=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr71.getTree());
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:308:14: ( Comma labelExpr )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==Comma) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:308:15: Comma labelExpr
                    	    {
                    	    Comma72=(Token)input.LT(1);
                    	    match(input,Comma,FOLLOW_Comma_in_selectTarget1310); if (failed) return retval;
                    	    if ( backtracking==0 ) stream_Comma.add(Comma72);

                    	    pushFollow(FOLLOW_labelExpr_in_selectTarget1312);
                    	    labelExpr73=labelExpr();
                    	    _fsp--;
                    	    if (failed) return retval;
                    	    if ( backtracking==0 ) stream_labelExpr.add(labelExpr73.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop24;
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
                    // 308:33: -> ^( PROJECTION ( labelExpr )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:308:36: ^( PROJECTION ( labelExpr )+ )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:309:4: Wildcard
                    {
                    Wildcard74=(Token)input.LT(1);
                    match(input,Wildcard,FOLLOW_Wildcard_in_selectTarget1328); if (failed) return retval;
                    if ( backtracking==0 ) stream_Wildcard.add(Wildcard74);


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
                    // 309:13: -> PROJECT_ALL
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:312:1: fromClause : From fromTarget ( Comma fromTarget )* -> ( fromTarget )+ ;
    public final fromClause_return fromClause() throws RecognitionException {
        fromClause_return retval = new fromClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token From75=null;
        Token Comma77=null;
        fromTarget_return fromTarget76 = null;

        fromTarget_return fromTarget78 = null;


        Object From75_tree=null;
        Object Comma77_tree=null;
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleTokenStream stream_From=new RewriteRuleTokenStream(adaptor,"token From");
        RewriteRuleSubtreeStream stream_fromTarget=new RewriteRuleSubtreeStream(adaptor,"rule fromTarget");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:313:2: ( From fromTarget ( Comma fromTarget )* -> ( fromTarget )+ )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:313:4: From fromTarget ( Comma fromTarget )*
            {
            From75=(Token)input.LT(1);
            match(input,From,FOLLOW_From_in_fromClause1343); if (failed) return retval;
            if ( backtracking==0 ) stream_From.add(From75);

            pushFollow(FOLLOW_fromTarget_in_fromClause1345);
            fromTarget76=fromTarget();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_fromTarget.add(fromTarget76.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:313:20: ( Comma fromTarget )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Comma) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:313:21: Comma fromTarget
            	    {
            	    Comma77=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_fromClause1348); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma77);

            	    pushFollow(FOLLOW_fromTarget_in_fromClause1350);
            	    fromTarget78=fromTarget();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_fromTarget.add(fromTarget78.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
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
            // 313:40: -> ( fromTarget )+
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:316:1: fromTarget : ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )? ;
    public final fromTarget_return fromTarget() throws RecognitionException {
        fromTarget_return retval = new fromTarget_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal80=null;
        Token QName81=null;
        targetRelation_return targetRelation79 = null;


        Object string_literal80_tree=null;
        Object QName81_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_targetRelation=new RewriteRuleSubtreeStream(adaptor,"rule targetRelation");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:2: ( ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )? )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:4: ( targetRelation -> targetRelation ) ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )?
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:4: ( targetRelation -> targetRelation )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:5: targetRelation
            {
            pushFollow(FOLLOW_targetRelation_in_fromTarget1369);
            targetRelation79=targetRelation();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_targetRelation.add(targetRelation79.getTree());

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
            // 317:20: -> targetRelation
            {
                adaptor.addChild(root_0, stream_targetRelation.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:39: ( 'as' QName -> ^( ASSIGN_LABEL QName $fromTarget) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==75) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:40: 'as' QName
                    {
                    string_literal80=(Token)input.LT(1);
                    match(input,75,FOLLOW_75_in_fromTarget1377); if (failed) return retval;
                    if ( backtracking==0 ) stream_75.add(string_literal80);

                    QName81=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_fromTarget1379); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName81);


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
                    // 317:51: -> ^( ASSIGN_LABEL QName $fromTarget)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:317:54: ^( ASSIGN_LABEL QName $fromTarget)
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:320:1: targetRelation : ( QName -> ^( RELATION QName ) | subQuery );
    public final targetRelation_return targetRelation() throws RecognitionException {
        targetRelation_return retval = new targetRelation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName82=null;
        subQuery_return subQuery83 = null;


        Object QName82_tree=null;
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:321:2: ( QName -> ^( RELATION QName ) | subQuery )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==QName) ) {
                alt28=1;
            }
            else if ( (LA28_0==LParen) ) {
                alt28=2;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("320:1: targetRelation : ( QName -> ^( RELATION QName ) | subQuery );", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:321:4: QName
                    {
                    QName82=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_targetRelation1405); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName82);


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
                    // 321:10: -> ^( RELATION QName )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:321:13: ^( RELATION QName )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:322:4: subQuery
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_subQuery_in_targetRelation1418);
                    subQuery83=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, subQuery83.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:325:1: whereClause : Where orExpr ;
    public final whereClause_return whereClause() throws RecognitionException {
        whereClause_return retval = new whereClause_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token Where84=null;
        orExpr_return orExpr85 = null;


        Object Where84_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:326:2: ( Where orExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:326:4: Where orExpr
            {
            root_0 = (Object)adaptor.nil();

            Where84=(Token)input.LT(1);
            match(input,Where,FOLLOW_Where_in_whereClause1429); if (failed) return retval;
            pushFollow(FOLLOW_orExpr_in_whereClause1432);
            orExpr85=orExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, orExpr85.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:329:1: orExpr : ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )* ;
    public final orExpr_return orExpr() throws RecognitionException {
        orExpr_return retval = new orExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        andExpr_return a = null;

        andExpr_return andExpr86 = null;


        Object string_literal87_tree=null;
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_andExpr=new RewriteRuleSubtreeStream(adaptor,"rule andExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:330:2: ( ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:330:4: ( andExpr -> andExpr ) ( 'or' a= andExpr -> ^( OR $orExpr $a) )*
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:330:4: ( andExpr -> andExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:330:5: andExpr
            {
            pushFollow(FOLLOW_andExpr_in_orExpr1446);
            andExpr86=andExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_andExpr.add(andExpr86.getTree());

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
            // 330:13: -> andExpr
            {
                adaptor.addChild(root_0, stream_andExpr.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:330:25: ( 'or' a= andExpr -> ^( OR $orExpr $a) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==76) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:330:26: 'or' a= andExpr
            	    {
            	    string_literal87=(Token)input.LT(1);
            	    match(input,76,FOLLOW_76_in_orExpr1454); if (failed) return retval;
            	    if ( backtracking==0 ) stream_76.add(string_literal87);

            	    pushFollow(FOLLOW_andExpr_in_orExpr1458);
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
            	    // 330:41: -> ^( OR $orExpr $a)
            	    {
            	        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:330:44: ^( OR $orExpr $a)
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
            	    break loop29;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:333:1: andExpr : ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )* ;
    public final andExpr_return andExpr() throws RecognitionException {
        andExpr_return retval = new andExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal89=null;
        conditionExpr_return c = null;

        conditionExpr_return conditionExpr88 = null;


        Object string_literal89_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleSubtreeStream stream_conditionExpr=new RewriteRuleSubtreeStream(adaptor,"rule conditionExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:2: ( ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )* )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:4: ( conditionExpr -> conditionExpr ) ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )*
            {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:4: ( conditionExpr -> conditionExpr )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:5: conditionExpr
            {
            pushFollow(FOLLOW_conditionExpr_in_andExpr1486);
            conditionExpr88=conditionExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_conditionExpr.add(conditionExpr88.getTree());

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
            // 334:19: -> conditionExpr
            {
                adaptor.addChild(root_0, stream_conditionExpr.next());

            }

            }

            }

            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:37: ( 'and' c= conditionExpr -> ^( AND $andExpr $c) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==77) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:38: 'and' c= conditionExpr
            	    {
            	    string_literal89=(Token)input.LT(1);
            	    match(input,77,FOLLOW_77_in_andExpr1494); if (failed) return retval;
            	    if ( backtracking==0 ) stream_77.add(string_literal89);

            	    pushFollow(FOLLOW_conditionExpr_in_andExpr1498);
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
            	    // 334:60: -> ^( AND $andExpr $c)
            	    {
            	        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:334:63: ^( AND $andExpr $c)
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
            	    break loop30;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );
    public final conditionExpr_return conditionExpr() throws RecognitionException {
        conditionExpr_return retval = new conditionExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token In93=null;
        comparisonOp_return c = null;

        labelExpr_return labelExpr90 = null;

        labelExpr_return labelExpr91 = null;

        labelExpr_return labelExpr92 = null;

        subQuery_return subQuery94 = null;


        Object In93_tree=null;
        RewriteRuleTokenStream stream_In=new RewriteRuleTokenStream(adaptor,"token In");
        RewriteRuleSubtreeStream stream_subQuery=new RewriteRuleSubtreeStream(adaptor,"rule subQuery");
        RewriteRuleSubtreeStream stream_comparisonOp=new RewriteRuleSubtreeStream(adaptor,"rule comparisonOp");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:2: ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) )
            int alt31=2;
            switch ( input.LA(1) ) {
            case QName:
                {
                switch ( input.LA(2) ) {
                case LParen:
                    {
                    switch ( input.LA(3) ) {
                    case QName:
                        {
                        switch ( input.LA(4) ) {
                        case LParen:
                            {
                            int LA31_28 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 28, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Dot:
                            {
                            int LA31_29 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 29, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA31_30 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 30, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA31_31 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 31, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 17, input);

                            throw nvae;
                        }

                        }
                        break;
                    case Comma:
                        {
                        switch ( input.LA(4) ) {
                        case QName:
                            {
                            int LA31_32 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 32, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA31_33 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 33, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA31_34 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 34, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Digits:
                            {
                            int LA31_35 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 35, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Dot:
                            {
                            int LA31_36 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 36, input);

                                throw nvae;
                            }
                            }
                            break;
                        case StringLiteral:
                            {
                            int LA31_37 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 37, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 18, input);

                            throw nvae;
                        }

                        }
                        break;
                    case RParen:
                        {
                        int LA31_19 = input.LA(4);

                        if ( (LA31_19==In) ) {
                            alt31=2;
                        }
                        else if ( ((LA31_19>=EQUAL && LA31_19<=GEQ)||LA31_19==78) ) {
                            alt31=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 19, input);

                            throw nvae;
                        }
                        }
                        break;
                    case Digits:
                        {
                        switch ( input.LA(4) ) {
                        case Dot:
                            {
                            int LA31_40 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 40, input);

                                throw nvae;
                            }
                            }
                            break;
                        case Comma:
                            {
                            int LA31_41 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 41, input);

                                throw nvae;
                            }
                            }
                            break;
                        case RParen:
                            {
                            int LA31_42 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 42, input);

                                throw nvae;
                            }
                            }
                            break;
                        default:
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 20, input);

                            throw nvae;
                        }

                        }
                        break;
                    case Dot:
                        {
                        int LA31_21 = input.LA(4);

                        if ( (LA31_21==Digits) ) {
                            int LA31_43 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 43, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 21, input);

                            throw nvae;
                        }
                        }
                        break;
                    case StringLiteral:
                        {
                        int LA31_22 = input.LA(4);

                        if ( (LA31_22==Comma) ) {
                            int LA31_44 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 44, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA31_22==RParen) ) {
                            int LA31_45 = input.LA(5);

                            if ( (synpred1()) ) {
                                alt31=1;
                            }
                            else if ( (true) ) {
                                alt31=2;
                            }
                            else {
                                if (backtracking>0) {failed=true; return retval;}
                                NoViableAltException nvae =
                                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 45, input);

                                throw nvae;
                            }
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 22, input);

                            throw nvae;
                        }
                        }
                        break;
                    default:
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 7, input);

                        throw nvae;
                    }

                    }
                    break;
                case Dot:
                    {
                    int LA31_8 = input.LA(3);

                    if ( (LA31_8==Wildcard) ) {
                        int LA31_23 = input.LA(4);

                        if ( (LA31_23==In) ) {
                            alt31=2;
                        }
                        else if ( ((LA31_23>=EQUAL && LA31_23<=GEQ)||LA31_23==78) ) {
                            alt31=1;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 23, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA31_8==QName) ) {
                        int LA31_24 = input.LA(4);

                        if ( ((LA31_24>=EQUAL && LA31_24<=GEQ)||LA31_24==78) ) {
                            alt31=1;
                        }
                        else if ( (LA31_24==In) ) {
                            alt31=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 24, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 8, input);

                        throw nvae;
                    }
                    }
                    break;
                case In:
                    {
                    alt31=2;
                    }
                    break;
                case EQUAL:
                case NOT_EQUAL:
                case LESS:
                case LEQ:
                case GREATER:
                case GEQ:
                case 78:
                    {
                    alt31=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 1, input);

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
            case 78:
                {
                alt31=1;
                }
                break;
            case Digits:
                {
                switch ( input.LA(2) ) {
                case Dot:
                    {
                    int LA31_11 = input.LA(3);

                    if ( (LA31_11==Digits) ) {
                        int LA31_25 = input.LA(4);

                        if ( ((LA31_25>=EQUAL && LA31_25<=GEQ)||LA31_25==78) ) {
                            alt31=1;
                        }
                        else if ( (LA31_25==In) ) {
                            alt31=2;
                        }
                        else {
                            if (backtracking>0) {failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 25, input);

                            throw nvae;
                        }
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 11, input);

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
                case 78:
                    {
                    alt31=1;
                    }
                    break;
                case In:
                    {
                    alt31=2;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 3, input);

                    throw nvae;
                }

                }
                break;
            case Dot:
                {
                int LA31_4 = input.LA(2);

                if ( (LA31_4==Digits) ) {
                    int LA31_14 = input.LA(3);

                    if ( ((LA31_14>=EQUAL && LA31_14<=GEQ)||LA31_14==78) ) {
                        alt31=1;
                    }
                    else if ( (LA31_14==In) ) {
                        alt31=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 14, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 4, input);

                    throw nvae;
                }
                }
                break;
            case StringLiteral:
                {
                int LA31_5 = input.LA(2);

                if ( (LA31_5==In) ) {
                    alt31=2;
                }
                else if ( ((LA31_5>=EQUAL && LA31_5<=GEQ)||LA31_5==78) ) {
                    alt31=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 5, input);

                    throw nvae;
                }
                }
                break;
            case In:
                {
                alt31=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("338:1: conditionExpr options {backtrack=true; } : ( labelExpr c= comparisonOp labelExpr -> ^( COMPARE comparisonOp ( labelExpr )+ ) | labelExpr In subQuery -> ^( CONTAINED_IN labelExpr subQuery ) );", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:4: labelExpr c= comparisonOp labelExpr
                    {
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1534);
                    labelExpr90=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr90.getTree());
                    pushFollow(FOLLOW_comparisonOp_in_conditionExpr1538);
                    c=comparisonOp();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_comparisonOp.add(c.getTree());
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1540);
                    labelExpr91=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr91.getTree());

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
                    // 340:4: -> ^( COMPARE comparisonOp ( labelExpr )+ )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:340:7: ^( COMPARE comparisonOp ( labelExpr )+ )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:341:4: labelExpr In subQuery
                    {
                    pushFollow(FOLLOW_labelExpr_in_conditionExpr1560);
                    labelExpr92=labelExpr();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_labelExpr.add(labelExpr92.getTree());
                    In93=(Token)input.LT(1);
                    match(input,In,FOLLOW_In_in_conditionExpr1562); if (failed) return retval;
                    if ( backtracking==0 ) stream_In.add(In93);

                    pushFollow(FOLLOW_subQuery_in_conditionExpr1564);
                    subQuery94=subQuery();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_subQuery.add(subQuery94.getTree());

                    // AST REWRITE
                    // elements: labelExpr, subQuery
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    if ( backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"token retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 342:4: -> ^( CONTAINED_IN labelExpr subQuery )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:342:7: ^( CONTAINED_IN labelExpr subQuery )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:345:1: comparisonOp : ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' ) ;
    public final comparisonOp_return comparisonOp() throws RecognitionException {
        comparisonOp_return retval = new comparisonOp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set95=null;

        Object set95_tree=null;

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:345:13: ( ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:345:15: ( EQUAL | LEQ | GEQ | LESS | GREATER | NOT_EQUAL | 'like' )
            {
            root_0 = (Object)adaptor.nil();

            set95=(Token)input.LT(1);
            if ( (input.LA(1)>=EQUAL && input.LA(1)<=GEQ)||input.LA(1)==78 ) {
                input.consume();
                if ( backtracking==0 ) adaptor.addChild(root_0, adaptor.create(set95));
                errorRecovery=false;failed=false;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                MismatchedSetException mse =
                    new MismatchedSetException(null,input);
                recoverFromMismatchedSet(input,mse,FOLLOW_set_in_comparisonOp1586);    throw mse;
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:347:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );
    public final labelExpr_return labelExpr() throws RecognitionException {
        labelExpr_return retval = new labelExpr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        function_return function96 = null;

        attributeName_return attributeName97 = null;

        value_return value98 = null;


        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:2: ( function | attributeName | value -> ^( VALUE value ) )
            int alt32=3;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==QName) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==EOF||LA32_1==Dot||(LA32_1>=Comma && LA32_1<=RParen)||(LA32_1>=EQUAL && LA32_1<=GEQ)||(LA32_1>=Select && LA32_1<=Insert)||(LA32_1>=Object && LA32_1<=Relationship)||LA32_1==71||(LA32_1>=76 && LA32_1<=78)) ) {
                    alt32=2;
                }
                else if ( (LA32_1==LParen) ) {
                    alt32=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("347:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );", 32, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA32_0==EOF||LA32_0==Dot||(LA32_0>=Comma && LA32_0<=RParen)||(LA32_0>=EQUAL && LA32_0<=GEQ)||(LA32_0>=Select && LA32_0<=Insert)||(LA32_0>=Object && LA32_0<=Relationship)||LA32_0==Digits||LA32_0==StringLiteral||LA32_0==71||(LA32_0>=76 && LA32_0<=78)) ) {
                alt32=3;
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("347:1: labelExpr : ( function | attributeName | value -> ^( VALUE value ) );", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:348:4: function
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_function_in_labelExpr1622);
                    function96=function();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, function96.getTree());

                    }
                    break;
                case 2 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:349:4: attributeName
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_attributeName_in_labelExpr1628);
                    attributeName97=attributeName();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) adaptor.addChild(root_0, attributeName97.getTree());

                    }
                    break;
                case 3 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:350:4: value
                    {
                    pushFollow(FOLLOW_value_in_labelExpr1634);
                    value98=value();
                    _fsp--;
                    if (failed) return retval;
                    if ( backtracking==0 ) stream_value.add(value98.getTree());

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
                    // 350:10: -> ^( VALUE value )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:350:13: ^( VALUE value )
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:353:1: value : literal ;
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        literal_return literal99 = null;



        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:354:2: ( literal )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:354:4: literal
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_literal_in_value1655);
            literal99=literal();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) adaptor.addChild(root_0, literal99.getTree());

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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:357:1: attributeName : ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );
    public final attributeName_return attributeName() throws RecognitionException {
        attributeName_return retval = new attributeName_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token relation=null;
        Token attribute=null;
        Token QName100=null;
        Token Dot101=null;
        Token Dot102=null;
        Token Wildcard103=null;

        Object relation_tree=null;
        Object attribute_tree=null;
        Object QName100_tree=null;
        Object Dot101_tree=null;
        Object Dot102_tree=null;
        Object Wildcard103_tree=null;
        RewriteRuleTokenStream stream_Dot=new RewriteRuleTokenStream(adaptor,"token Dot");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_Wildcard=new RewriteRuleTokenStream(adaptor,"token Wildcard");

        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:358:2: ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) )
            int alt33=3;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==QName) ) {
                int LA33_1 = input.LA(2);

                if ( (LA33_1==Dot) ) {
                    int LA33_2 = input.LA(3);

                    if ( (LA33_2==Wildcard) ) {
                        alt33=3;
                    }
                    else if ( (LA33_2==QName) ) {
                        alt33=2;
                    }
                    else {
                        if (backtracking>0) {failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("357:1: attributeName : ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 33, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA33_1==EOF||(LA33_1>=Comma && LA33_1<=RParen)||(LA33_1>=EQUAL && LA33_1<=GEQ)||(LA33_1>=Select && LA33_1<=Insert)||(LA33_1>=Object && LA33_1<=Relationship)||LA33_1==71||(LA33_1>=76 && LA33_1<=78)) ) {
                    alt33=1;
                }
                else {
                    if (backtracking>0) {failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("357:1: attributeName : ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 33, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("357:1: attributeName : ( QName -> ^( ATTRIBUTE QName ) | relation= QName Dot attribute= QName -> ^( REF $relation $attribute) | relation= QName Dot Wildcard -> ^( REF_ALL $relation) );", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:358:4: QName
                    {
                    QName100=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1666); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(QName100);


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
                    // 358:10: -> ^( ATTRIBUTE QName )
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:358:13: ^( ATTRIBUTE QName )
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:359:4: relation= QName Dot attribute= QName
                    {
                    relation=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1681); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(relation);

                    Dot101=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_attributeName1683); if (failed) return retval;
                    if ( backtracking==0 ) stream_Dot.add(Dot101);

                    attribute=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1687); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(attribute);


                    // AST REWRITE
                    // elements: attribute, relation
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
                    // 359:39: -> ^( REF $relation $attribute)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:359:42: ^( REF $relation $attribute)
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
                    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:360:4: relation= QName Dot Wildcard
                    {
                    relation=(Token)input.LT(1);
                    match(input,QName,FOLLOW_QName_in_attributeName1706); if (failed) return retval;
                    if ( backtracking==0 ) stream_QName.add(relation);

                    Dot102=(Token)input.LT(1);
                    match(input,Dot,FOLLOW_Dot_in_attributeName1708); if (failed) return retval;
                    if ( backtracking==0 ) stream_Dot.add(Dot102);

                    Wildcard103=(Token)input.LT(1);
                    match(input,Wildcard,FOLLOW_Wildcard_in_attributeName1710); if (failed) return retval;
                    if ( backtracking==0 ) stream_Wildcard.add(Wildcard103);


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
                    // 360:32: -> ^( REF_ALL $relation)
                    {
                        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:360:35: ^( REF_ALL $relation)
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
    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:364:1: function : QName LParen labelExpr ( Comma labelExpr )* RParen -> ^( FUNCTION QName ( labelExpr )+ ) ;
    public final function_return function() throws RecognitionException {
        function_return retval = new function_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token QName104=null;
        Token LParen105=null;
        Token Comma107=null;
        Token RParen109=null;
        labelExpr_return labelExpr106 = null;

        labelExpr_return labelExpr108 = null;


        Object QName104_tree=null;
        Object LParen105_tree=null;
        Object Comma107_tree=null;
        Object RParen109_tree=null;
        RewriteRuleTokenStream stream_RParen=new RewriteRuleTokenStream(adaptor,"token RParen");
        RewriteRuleTokenStream stream_QName=new RewriteRuleTokenStream(adaptor,"token QName");
        RewriteRuleTokenStream stream_LParen=new RewriteRuleTokenStream(adaptor,"token LParen");
        RewriteRuleTokenStream stream_Comma=new RewriteRuleTokenStream(adaptor,"token Comma");
        RewriteRuleSubtreeStream stream_labelExpr=new RewriteRuleSubtreeStream(adaptor,"rule labelExpr");
        try {
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:365:2: ( QName LParen labelExpr ( Comma labelExpr )* RParen -> ^( FUNCTION QName ( labelExpr )+ ) )
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:365:4: QName LParen labelExpr ( Comma labelExpr )* RParen
            {
            QName104=(Token)input.LT(1);
            match(input,QName,FOLLOW_QName_in_function1733); if (failed) return retval;
            if ( backtracking==0 ) stream_QName.add(QName104);

            LParen105=(Token)input.LT(1);
            match(input,LParen,FOLLOW_LParen_in_function1735); if (failed) return retval;
            if ( backtracking==0 ) stream_LParen.add(LParen105);

            pushFollow(FOLLOW_labelExpr_in_function1737);
            labelExpr106=labelExpr();
            _fsp--;
            if (failed) return retval;
            if ( backtracking==0 ) stream_labelExpr.add(labelExpr106.getTree());
            // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:365:27: ( Comma labelExpr )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==Comma) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:365:28: Comma labelExpr
            	    {
            	    Comma107=(Token)input.LT(1);
            	    match(input,Comma,FOLLOW_Comma_in_function1740); if (failed) return retval;
            	    if ( backtracking==0 ) stream_Comma.add(Comma107);

            	    pushFollow(FOLLOW_labelExpr_in_function1742);
            	    labelExpr108=labelExpr();
            	    _fsp--;
            	    if (failed) return retval;
            	    if ( backtracking==0 ) stream_labelExpr.add(labelExpr108.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            RParen109=(Token)input.LT(1);
            match(input,RParen,FOLLOW_RParen_in_function1746); if (failed) return retval;
            if ( backtracking==0 ) stream_RParen.add(RParen109);


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
            // 366:2: -> ^( FUNCTION QName ( labelExpr )+ )
            {
                // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:366:5: ^( FUNCTION QName ( labelExpr )+ )
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
        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:4: ( labelExpr comparisonOp labelExpr )
        // F:\\cygwin\\home\\leo\\work\\workspace\\XerialJ\\xerial-storage\\src\\main\\java\\org\\xerial\\amoeba\\query\\AmoebaQuery.g:339:4: labelExpr comparisonOp labelExpr
        {
        pushFollow(FOLLOW_labelExpr_in_synpred11534);
        labelExpr();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_comparisonOp_in_synpred11538);
        comparisonOp();
        _fsp--;
        if (failed) return ;
        pushFollow(FOLLOW_labelExpr_in_synpred11540);
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


 

    public static final BitSet FOLLOW_Digits_in_integerLiteral647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Dot_in_decimalLiteral653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral658 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Dot_in_decimalLiteral660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Digits_in_decimalLiteral662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numericLiteral_in_literal673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_StringLiteral_in_literal686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_integerLiteral_in_numericLiteral706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_decimalLiteral_in_numericLiteral712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_lang727 = new BitSet(new long[]{0x1A20000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_objectDefExpr_in_expr748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_amoebaQuery_in_expr753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_relationshipExpr_in_expr758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Relationship_in_relationshipExpr769 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_QName_in_relationshipExpr773 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_HasMany_in_relationshipExpr775 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_objectList_in_relationshipExpr777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_qnameList799 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Comma_in_qnameList802 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_QName_in_qnameList804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_object_in_objectList823 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Comma_in_objectList826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_object_in_objectList828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_object846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Object_in_objectDefExpr864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_QName_in_objectDefExpr868 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LParen_in_objectDefExpr870 = new BitSet(new long[]{0x0010010000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_attributeDefExpr_in_objectDefExpr872 = new BitSet(new long[]{0x0010010000000000L});
    public static final BitSet FOLLOW_SPLIT_in_objectDefExpr876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_sortTargetList_in_objectDefExpr880 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RParen_in_objectDefExpr884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeDef_in_attributeDefExpr916 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Comma_in_attributeDefExpr919 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_attributeDef_in_attributeDefExpr921 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_QName_in_attributeDef939 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_DataType_in_attributeDef941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sortTarget_in_sortTargetList963 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Comma_in_sortTargetList966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_sortTarget_in_sortTargetList968 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_QName_in_sortTarget986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpr_in_amoebaQuery1004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_updateExpr_in_amoebaQuery1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Insert_in_updateExpr1021 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_newRelation_in_updateExpr1023 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_Into_in_updateExpr1026 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_targetRelation_in_updateExpr1028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_updateExpr1058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_updateExpr1060 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_newRelation_in_updateExpr1062 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_whereClause_in_updateExpr1064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LParen_in_newRelation1100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_tupleElement_in_newRelation1102 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_Comma_in_newRelation1105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_tupleElement_in_newRelation1107 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_RParen_in_newRelation1111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_tupleElement1131 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_EQUAL_in_tupleElement1139 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000212L});
    public static final BitSet FOLLOW_elementValue_in_tupleElement1143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_elementValue1169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_elementValue1185 = new BitSet(new long[]{0x000000A000000000L,0x0000000000000612L});
    public static final BitSet FOLLOW_elementValue_in_elementValue1187 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_Comma_in_elementValue1190 = new BitSet(new long[]{0x0000002000000000L,0x0000000000000612L});
    public static final BitSet FOLLOW_elementValue_in_elementValue1192 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_elementValue1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectExpr_in_exprSingle1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuery_in_exprSingle1226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LParen_in_subQuery1238 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_selectExpr_in_subQuery1240 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_RParen_in_subQuery1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Select_in_selectExpr1263 = new BitSet(new long[]{0x00C020A000000002L,0x0000000000000052L});
    public static final BitSet FOLLOW_selectTarget_in_selectExpr1265 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_fromClause_in_selectExpr1267 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_whereClause_in_selectExpr1270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_selectTarget1307 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Comma_in_selectTarget1310 = new BitSet(new long[]{0x000000A000000002L,0x0000000000000052L});
    public static final BitSet FOLLOW_labelExpr_in_selectTarget1312 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Wildcard_in_selectTarget1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_From_in_fromClause1343 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_fromTarget_in_fromClause1345 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_Comma_in_fromClause1348 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_fromTarget_in_fromClause1350 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_targetRelation_in_fromTarget1369 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_fromTarget1377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_QName_in_fromTarget1379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_targetRelation1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuery_in_targetRelation1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Where_in_whereClause1429 = new BitSet(new long[]{0x000FC02000000000L,0x0000000000004052L});
    public static final BitSet FOLLOW_orExpr_in_whereClause1432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1446 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_orExpr1454 = new BitSet(new long[]{0x000FC02000000000L,0x0000000000004052L});
    public static final BitSet FOLLOW_andExpr_in_orExpr1458 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_conditionExpr_in_andExpr1486 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_andExpr1494 = new BitSet(new long[]{0x000FC02000000000L,0x0000000000004052L});
    public static final BitSet FOLLOW_conditionExpr_in_andExpr1498 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1534 = new BitSet(new long[]{0x000FC00000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comparisonOp_in_conditionExpr1538 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000052L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_conditionExpr1560 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_In_in_conditionExpr1562 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_subQuery_in_conditionExpr1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_comparisonOp1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_labelExpr1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_labelExpr1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_value_in_labelExpr1634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_value1655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1681 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Dot_in_attributeName1683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_QName_in_attributeName1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_attributeName1706 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Dot_in_attributeName1708 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_Wildcard_in_attributeName1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QName_in_function1733 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LParen_in_function1735 = new BitSet(new long[]{0x000001A000000000L,0x0000000000000052L});
    public static final BitSet FOLLOW_labelExpr_in_function1737 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_Comma_in_function1740 = new BitSet(new long[]{0x000001A000000000L,0x0000000000000052L});
    public static final BitSet FOLLOW_labelExpr_in_function1742 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_RParen_in_function1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_labelExpr_in_synpred11534 = new BitSet(new long[]{0x000FC00000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_comparisonOp_in_synpred11538 = new BitSet(new long[]{0x0000002000000002L,0x0000000000000052L});
    public static final BitSet FOLLOW_labelExpr_in_synpred11540 = new BitSet(new long[]{0x0000000000000002L});

}