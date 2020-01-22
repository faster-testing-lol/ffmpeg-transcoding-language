package org.xtext.ftl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.ftl.services.FTLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFTLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'in'", "'\\''", "';'", "'out'", "'temp'", "'='", "'{'", "'}'", "'video'", "'sepia'", "'blur'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalFTLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalFTLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalFTLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalFTL.g"; }



     	private FTLGrammarAccess grammarAccess;

        public InternalFTLParser(TokenStream input, FTLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected FTLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalFTL.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalFTL.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalFTL.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalFTL.g:71:1: ruleProgram returns [EObject current=null] : ( () ( (lv_streams_1_0= ruleStream ) )* ( (lv_transforms_2_0= ruleTransform ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_streams_1_0 = null;

        EObject lv_transforms_2_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:77:2: ( ( () ( (lv_streams_1_0= ruleStream ) )* ( (lv_transforms_2_0= ruleTransform ) )* ) )
            // InternalFTL.g:78:2: ( () ( (lv_streams_1_0= ruleStream ) )* ( (lv_transforms_2_0= ruleTransform ) )* )
            {
            // InternalFTL.g:78:2: ( () ( (lv_streams_1_0= ruleStream ) )* ( (lv_transforms_2_0= ruleTransform ) )* )
            // InternalFTL.g:79:3: () ( (lv_streams_1_0= ruleStream ) )* ( (lv_transforms_2_0= ruleTransform ) )*
            {
            // InternalFTL.g:79:3: ()
            // InternalFTL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalFTL.g:86:3: ( (lv_streams_1_0= ruleStream ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||(LA1_0>=14 && LA1_0<=15)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFTL.g:87:4: (lv_streams_1_0= ruleStream )
            	    {
            	    // InternalFTL.g:87:4: (lv_streams_1_0= ruleStream )
            	    // InternalFTL.g:88:5: lv_streams_1_0= ruleStream
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getStreamsStreamParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_streams_1_0=ruleStream();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"streams",
            	    						lv_streams_1_0,
            	    						"org.xtext.ftl.FTL.Stream");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalFTL.g:105:3: ( (lv_transforms_2_0= ruleTransform ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFTL.g:106:4: (lv_transforms_2_0= ruleTransform )
            	    {
            	    // InternalFTL.g:106:4: (lv_transforms_2_0= ruleTransform )
            	    // InternalFTL.g:107:5: lv_transforms_2_0= ruleTransform
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getTransformsTransformParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_transforms_2_0=ruleTransform();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transforms",
            	    						lv_transforms_2_0,
            	    						"org.xtext.ftl.FTL.Transform");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleStream"
    // InternalFTL.g:128:1: entryRuleStream returns [EObject current=null] : iv_ruleStream= ruleStream EOF ;
    public final EObject entryRuleStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStream = null;


        try {
            // InternalFTL.g:128:47: (iv_ruleStream= ruleStream EOF )
            // InternalFTL.g:129:2: iv_ruleStream= ruleStream EOF
            {
             newCompositeNode(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStream=ruleStream();

            state._fsp--;

             current =iv_ruleStream; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalFTL.g:135:1: ruleStream returns [EObject current=null] : (this_In_0= ruleIn | this_OutputStream_1= ruleOutputStream ) ;
    public final EObject ruleStream() throws RecognitionException {
        EObject current = null;

        EObject this_In_0 = null;

        EObject this_OutputStream_1 = null;



        	enterRule();

        try {
            // InternalFTL.g:141:2: ( (this_In_0= ruleIn | this_OutputStream_1= ruleOutputStream ) )
            // InternalFTL.g:142:2: (this_In_0= ruleIn | this_OutputStream_1= ruleOutputStream )
            {
            // InternalFTL.g:142:2: (this_In_0= ruleIn | this_OutputStream_1= ruleOutputStream )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( ((LA3_0>=14 && LA3_0<=15)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalFTL.g:143:3: this_In_0= ruleIn
                    {

                    			newCompositeNode(grammarAccess.getStreamAccess().getInParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_In_0=ruleIn();

                    state._fsp--;


                    			current = this_In_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFTL.g:152:3: this_OutputStream_1= ruleOutputStream
                    {

                    			newCompositeNode(grammarAccess.getStreamAccess().getOutputStreamParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_OutputStream_1=ruleOutputStream();

                    state._fsp--;


                    			current = this_OutputStream_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleIn"
    // InternalFTL.g:164:1: entryRuleIn returns [EObject current=null] : iv_ruleIn= ruleIn EOF ;
    public final EObject entryRuleIn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIn = null;


        try {
            // InternalFTL.g:164:43: (iv_ruleIn= ruleIn EOF )
            // InternalFTL.g:165:2: iv_ruleIn= ruleIn EOF
            {
             newCompositeNode(grammarAccess.getInRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIn=ruleIn();

            state._fsp--;

             current =iv_ruleIn; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIn"


    // $ANTLR start "ruleIn"
    // InternalFTL.g:171:1: ruleIn returns [EObject current=null] : (otherlv_0= 'in' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' ) ;
    public final EObject ruleIn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFTL.g:177:2: ( (otherlv_0= 'in' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' ) )
            // InternalFTL.g:178:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' )
            {
            // InternalFTL.g:178:2: (otherlv_0= 'in' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' )
            // InternalFTL.g:179:3: otherlv_0= 'in' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getInAccess().getInKeyword_0());
            		
            // InternalFTL.g:183:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFTL.g:184:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFTL.g:184:4: (lv_name_1_0= RULE_STRING )
            // InternalFTL.g:185:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getInAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getInAccess().getApostropheKeyword_2());
            		
            // InternalFTL.g:205:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalFTL.g:206:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalFTL.g:206:4: (lv_path_3_0= RULE_STRING )
            // InternalFTL.g:207:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_path_3_0, grammarAccess.getInAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getInRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getInAccess().getApostropheKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getInAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIn"


    // $ANTLR start "entryRuleOutputStream"
    // InternalFTL.g:235:1: entryRuleOutputStream returns [EObject current=null] : iv_ruleOutputStream= ruleOutputStream EOF ;
    public final EObject entryRuleOutputStream() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOutputStream = null;


        try {
            // InternalFTL.g:235:53: (iv_ruleOutputStream= ruleOutputStream EOF )
            // InternalFTL.g:236:2: iv_ruleOutputStream= ruleOutputStream EOF
            {
             newCompositeNode(grammarAccess.getOutputStreamRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOutputStream=ruleOutputStream();

            state._fsp--;

             current =iv_ruleOutputStream; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOutputStream"


    // $ANTLR start "ruleOutputStream"
    // InternalFTL.g:242:1: ruleOutputStream returns [EObject current=null] : (this_Out_0= ruleOut | this_Temp_1= ruleTemp ) ;
    public final EObject ruleOutputStream() throws RecognitionException {
        EObject current = null;

        EObject this_Out_0 = null;

        EObject this_Temp_1 = null;



        	enterRule();

        try {
            // InternalFTL.g:248:2: ( (this_Out_0= ruleOut | this_Temp_1= ruleTemp ) )
            // InternalFTL.g:249:2: (this_Out_0= ruleOut | this_Temp_1= ruleTemp )
            {
            // InternalFTL.g:249:2: (this_Out_0= ruleOut | this_Temp_1= ruleTemp )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalFTL.g:250:3: this_Out_0= ruleOut
                    {

                    			newCompositeNode(grammarAccess.getOutputStreamAccess().getOutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Out_0=ruleOut();

                    state._fsp--;


                    			current = this_Out_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFTL.g:259:3: this_Temp_1= ruleTemp
                    {

                    			newCompositeNode(grammarAccess.getOutputStreamAccess().getTempParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Temp_1=ruleTemp();

                    state._fsp--;


                    			current = this_Temp_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOutputStream"


    // $ANTLR start "entryRuleOut"
    // InternalFTL.g:271:1: entryRuleOut returns [EObject current=null] : iv_ruleOut= ruleOut EOF ;
    public final EObject entryRuleOut() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOut = null;


        try {
            // InternalFTL.g:271:44: (iv_ruleOut= ruleOut EOF )
            // InternalFTL.g:272:2: iv_ruleOut= ruleOut EOF
            {
             newCompositeNode(grammarAccess.getOutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOut=ruleOut();

            state._fsp--;

             current =iv_ruleOut; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOut"


    // $ANTLR start "ruleOut"
    // InternalFTL.g:278:1: ruleOut returns [EObject current=null] : (otherlv_0= 'out' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' ) ;
    public final EObject ruleOut() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFTL.g:284:2: ( (otherlv_0= 'out' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' ) )
            // InternalFTL.g:285:2: (otherlv_0= 'out' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' )
            {
            // InternalFTL.g:285:2: (otherlv_0= 'out' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' )
            // InternalFTL.g:286:3: otherlv_0= 'out' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getOutAccess().getOutKeyword_0());
            		
            // InternalFTL.g:290:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFTL.g:291:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFTL.g:291:4: (lv_name_1_0= RULE_STRING )
            // InternalFTL.g:292:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getOutAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getOutAccess().getApostropheKeyword_2());
            		
            // InternalFTL.g:312:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalFTL.g:313:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalFTL.g:313:4: (lv_path_3_0= RULE_STRING )
            // InternalFTL.g:314:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_path_3_0, grammarAccess.getOutAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getOutAccess().getApostropheKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getOutAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOut"


    // $ANTLR start "entryRuleTemp"
    // InternalFTL.g:342:1: entryRuleTemp returns [EObject current=null] : iv_ruleTemp= ruleTemp EOF ;
    public final EObject entryRuleTemp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemp = null;


        try {
            // InternalFTL.g:342:45: (iv_ruleTemp= ruleTemp EOF )
            // InternalFTL.g:343:2: iv_ruleTemp= ruleTemp EOF
            {
             newCompositeNode(grammarAccess.getTempRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemp=ruleTemp();

            state._fsp--;

             current =iv_ruleTemp; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTemp"


    // $ANTLR start "ruleTemp"
    // InternalFTL.g:349:1: ruleTemp returns [EObject current=null] : (otherlv_0= 'temp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' ) ;
    public final EObject ruleTemp() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_path_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalFTL.g:355:2: ( (otherlv_0= 'temp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' ) )
            // InternalFTL.g:356:2: (otherlv_0= 'temp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' )
            {
            // InternalFTL.g:356:2: (otherlv_0= 'temp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';' )
            // InternalFTL.g:357:3: otherlv_0= 'temp' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= '\\'' ( (lv_path_3_0= RULE_STRING ) ) otherlv_4= '\\'' otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTempAccess().getTempKeyword_0());
            		
            // InternalFTL.g:361:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalFTL.g:362:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalFTL.g:362:4: (lv_name_1_0= RULE_STRING )
            // InternalFTL.g:363:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTempAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTempRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getTempAccess().getApostropheKeyword_2());
            		
            // InternalFTL.g:383:3: ( (lv_path_3_0= RULE_STRING ) )
            // InternalFTL.g:384:4: (lv_path_3_0= RULE_STRING )
            {
            // InternalFTL.g:384:4: (lv_path_3_0= RULE_STRING )
            // InternalFTL.g:385:5: lv_path_3_0= RULE_STRING
            {
            lv_path_3_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

            					newLeafNode(lv_path_3_0, grammarAccess.getTempAccess().getPathSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTempRule());
            					}
            					setWithLastConsumed(
            						current,
            						"path",
            						lv_path_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getTempAccess().getApostropheKeyword_4());
            		
            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getTempAccess().getSemicolonKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTemp"


    // $ANTLR start "entryRuleTransform"
    // InternalFTL.g:413:1: entryRuleTransform returns [EObject current=null] : iv_ruleTransform= ruleTransform EOF ;
    public final EObject entryRuleTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransform = null;


        try {
            // InternalFTL.g:413:50: (iv_ruleTransform= ruleTransform EOF )
            // InternalFTL.g:414:2: iv_ruleTransform= ruleTransform EOF
            {
             newCompositeNode(grammarAccess.getTransformRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransform=ruleTransform();

            state._fsp--;

             current =iv_ruleTransform; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransform"


    // $ANTLR start "ruleTransform"
    // InternalFTL.g:420:1: ruleTransform returns [EObject current=null] : ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransform() throws RecognitionException {
        EObject current = null;

        Token lv_output_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instruction_3_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:426:2: ( ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' ) )
            // InternalFTL.g:427:2: ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' )
            {
            // InternalFTL.g:427:2: ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' )
            // InternalFTL.g:428:3: ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}'
            {
            // InternalFTL.g:428:3: ( (lv_output_0_0= RULE_STRING ) )
            // InternalFTL.g:429:4: (lv_output_0_0= RULE_STRING )
            {
            // InternalFTL.g:429:4: (lv_output_0_0= RULE_STRING )
            // InternalFTL.g:430:5: lv_output_0_0= RULE_STRING
            {
            lv_output_0_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_output_0_0, grammarAccess.getTransformAccess().getOutputSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformRule());
            					}
            					setWithLastConsumed(
            						current,
            						"output",
            						lv_output_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFTL.g:454:3: ( (lv_instruction_3_0= ruleInstruction ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=19 && LA5_0<=21)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFTL.g:455:4: (lv_instruction_3_0= ruleInstruction )
            	    {
            	    // InternalFTL.g:455:4: (lv_instruction_3_0= ruleInstruction )
            	    // InternalFTL.g:456:5: lv_instruction_3_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getTransformAccess().getInstructionInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_instruction_3_0=ruleInstruction();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getTransformRule());
            	    					}
            	    					add(
            	    						current,
            	    						"instruction",
            	    						lv_instruction_3_0,
            	    						"org.xtext.ftl.FTL.Instruction");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransform"


    // $ANTLR start "entryRuleInstruction"
    // InternalFTL.g:481:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalFTL.g:481:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalFTL.g:482:2: iv_ruleInstruction= ruleInstruction EOF
            {
             newCompositeNode(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInstruction=ruleInstruction();

            state._fsp--;

             current =iv_ruleInstruction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalFTL.g:488:1: ruleInstruction returns [EObject current=null] : ( (this_Video_0= ruleVideo | this_Sepia_1= ruleSepia | this_Blur_2= ruleBlur ) otherlv_3= ';' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_Video_0 = null;

        EObject this_Sepia_1 = null;

        EObject this_Blur_2 = null;



        	enterRule();

        try {
            // InternalFTL.g:494:2: ( ( (this_Video_0= ruleVideo | this_Sepia_1= ruleSepia | this_Blur_2= ruleBlur ) otherlv_3= ';' ) )
            // InternalFTL.g:495:2: ( (this_Video_0= ruleVideo | this_Sepia_1= ruleSepia | this_Blur_2= ruleBlur ) otherlv_3= ';' )
            {
            // InternalFTL.g:495:2: ( (this_Video_0= ruleVideo | this_Sepia_1= ruleSepia | this_Blur_2= ruleBlur ) otherlv_3= ';' )
            // InternalFTL.g:496:3: (this_Video_0= ruleVideo | this_Sepia_1= ruleSepia | this_Blur_2= ruleBlur ) otherlv_3= ';'
            {
            // InternalFTL.g:496:3: (this_Video_0= ruleVideo | this_Sepia_1= ruleSepia | this_Blur_2= ruleBlur )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt6=1;
                }
                break;
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalFTL.g:497:4: this_Video_0= ruleVideo
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getVideoParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_7);
                    this_Video_0=ruleVideo();

                    state._fsp--;


                    				current = this_Video_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalFTL.g:506:4: this_Sepia_1= ruleSepia
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_Sepia_1=ruleSepia();

                    state._fsp--;


                    				current = this_Sepia_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalFTL.g:515:4: this_Blur_2= ruleBlur
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_7);
                    this_Blur_2=ruleBlur();

                    state._fsp--;


                    				current = this_Blur_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getInstructionAccess().getSemicolonKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleVideo"
    // InternalFTL.g:532:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalFTL.g:532:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalFTL.g:533:2: iv_ruleVideo= ruleVideo EOF
            {
             newCompositeNode(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVideo=ruleVideo();

            state._fsp--;

             current =iv_ruleVideo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalFTL.g:539:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_input_1_0=null;


        	enterRule();

        try {
            // InternalFTL.g:545:2: ( (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) ) )
            // InternalFTL.g:546:2: (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) )
            {
            // InternalFTL.g:546:2: (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) )
            // InternalFTL.g:547:3: otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
            		
            // InternalFTL.g:551:3: ( (lv_input_1_0= RULE_STRING ) )
            // InternalFTL.g:552:4: (lv_input_1_0= RULE_STRING )
            {
            // InternalFTL.g:552:4: (lv_input_1_0= RULE_STRING )
            // InternalFTL.g:553:5: lv_input_1_0= RULE_STRING
            {
            lv_input_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_input_1_0, grammarAccess.getVideoAccess().getInputSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVideoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"input",
            						lv_input_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleSepia"
    // InternalFTL.g:573:1: entryRuleSepia returns [EObject current=null] : iv_ruleSepia= ruleSepia EOF ;
    public final EObject entryRuleSepia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSepia = null;


        try {
            // InternalFTL.g:573:46: (iv_ruleSepia= ruleSepia EOF )
            // InternalFTL.g:574:2: iv_ruleSepia= ruleSepia EOF
            {
             newCompositeNode(grammarAccess.getSepiaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSepia=ruleSepia();

            state._fsp--;

             current =iv_ruleSepia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSepia"


    // $ANTLR start "ruleSepia"
    // InternalFTL.g:580:1: ruleSepia returns [EObject current=null] : ( () otherlv_1= 'sepia' ) ;
    public final EObject ruleSepia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:586:2: ( ( () otherlv_1= 'sepia' ) )
            // InternalFTL.g:587:2: ( () otherlv_1= 'sepia' )
            {
            // InternalFTL.g:587:2: ( () otherlv_1= 'sepia' )
            // InternalFTL.g:588:3: () otherlv_1= 'sepia'
            {
            // InternalFTL.g:588:3: ()
            // InternalFTL.g:589:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSepiaAccess().getSepiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSepiaAccess().getSepiaKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSepia"


    // $ANTLR start "entryRuleBlur"
    // InternalFTL.g:603:1: entryRuleBlur returns [EObject current=null] : iv_ruleBlur= ruleBlur EOF ;
    public final EObject entryRuleBlur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlur = null;


        try {
            // InternalFTL.g:603:45: (iv_ruleBlur= ruleBlur EOF )
            // InternalFTL.g:604:2: iv_ruleBlur= ruleBlur EOF
            {
             newCompositeNode(grammarAccess.getBlurRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBlur=ruleBlur();

            state._fsp--;

             current =iv_ruleBlur; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBlur"


    // $ANTLR start "ruleBlur"
    // InternalFTL.g:610:1: ruleBlur returns [EObject current=null] : (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBlur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_radius_1_0=null;


        	enterRule();

        try {
            // InternalFTL.g:616:2: ( (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) ) )
            // InternalFTL.g:617:2: (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) )
            {
            // InternalFTL.g:617:2: (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) )
            // InternalFTL.g:618:3: otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getBlurAccess().getBlurKeyword_0());
            		
            // InternalFTL.g:622:3: ( (lv_radius_1_0= RULE_INT ) )
            // InternalFTL.g:623:4: (lv_radius_1_0= RULE_INT )
            {
            // InternalFTL.g:623:4: (lv_radius_1_0= RULE_INT )
            // InternalFTL.g:624:5: lv_radius_1_0= RULE_INT
            {
            lv_radius_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_radius_1_0, grammarAccess.getBlurAccess().getRadiusINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"radius",
            						lv_radius_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBlur"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C812L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});

}