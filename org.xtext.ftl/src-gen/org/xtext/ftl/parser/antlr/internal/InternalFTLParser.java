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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "','", "'>'", "'{'", "'}'", "'video'", "'|'", "'audio'", "';'", "'start'", "'end'", "'fps'", "'negate'", "'echo'", "'mix'", "'sepia'", "'blur'", "'grayscale'", "'scale'", "'sharpen'", "'reverse'", "'concat'"
    };
    public static final int RULE_STRING=5;
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
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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
    // InternalFTL.g:71:1: ruleProgram returns [EObject current=null] : ( () ( (lv_transforms_1_0= ruleTransform ) )* ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_transforms_1_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:77:2: ( ( () ( (lv_transforms_1_0= ruleTransform ) )* ) )
            // InternalFTL.g:78:2: ( () ( (lv_transforms_1_0= ruleTransform ) )* )
            {
            // InternalFTL.g:78:2: ( () ( (lv_transforms_1_0= ruleTransform ) )* )
            // InternalFTL.g:79:3: () ( (lv_transforms_1_0= ruleTransform ) )*
            {
            // InternalFTL.g:79:3: ()
            // InternalFTL.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getProgramAccess().getProgramAction_0(),
            					current);
            			

            }

            // InternalFTL.g:86:3: ( (lv_transforms_1_0= ruleTransform ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16||LA1_0==18) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalFTL.g:87:4: (lv_transforms_1_0= ruleTransform )
            	    {
            	    // InternalFTL.g:87:4: (lv_transforms_1_0= ruleTransform )
            	    // InternalFTL.g:88:5: lv_transforms_1_0= ruleTransform
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getTransformsTransformParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_transforms_1_0=ruleTransform();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"transforms",
            	    						lv_transforms_1_0,
            	    						"org.xtext.ftl.FTL.Transform");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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


    // $ANTLR start "entryRuleFloat"
    // InternalFTL.g:109:1: entryRuleFloat returns [String current=null] : iv_ruleFloat= ruleFloat EOF ;
    public final String entryRuleFloat() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFloat = null;


        try {
            // InternalFTL.g:109:45: (iv_ruleFloat= ruleFloat EOF )
            // InternalFTL.g:110:2: iv_ruleFloat= ruleFloat EOF
            {
             newCompositeNode(grammarAccess.getFloatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFloat=ruleFloat();

            state._fsp--;

             current =iv_ruleFloat.getText(); 
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
    // $ANTLR end "entryRuleFloat"


    // $ANTLR start "ruleFloat"
    // InternalFTL.g:116:1: ruleFloat returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleFloat() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();

        try {
            // InternalFTL.g:122:2: ( (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT ) )
            // InternalFTL.g:123:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            {
            // InternalFTL.g:123:2: (this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT )
            // InternalFTL.g:124:3: this_INT_0= RULE_INT kw= '.' this_INT_2= RULE_INT
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            			current.merge(this_INT_0);
            		

            			newLeafNode(this_INT_0, grammarAccess.getFloatAccess().getINTTerminalRuleCall_0());
            		
            kw=(Token)match(input,11,FOLLOW_5); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getFloatAccess().getFullStopKeyword_1());
            		
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); 

            			current.merge(this_INT_2);
            		

            			newLeafNode(this_INT_2, grammarAccess.getFloatAccess().getINTTerminalRuleCall_2());
            		

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
    // $ANTLR end "ruleFloat"


    // $ANTLR start "entryRuleTransform"
    // InternalFTL.g:147:1: entryRuleTransform returns [EObject current=null] : iv_ruleTransform= ruleTransform EOF ;
    public final EObject entryRuleTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransform = null;


        try {
            // InternalFTL.g:147:50: (iv_ruleTransform= ruleTransform EOF )
            // InternalFTL.g:148:2: iv_ruleTransform= ruleTransform EOF
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
    // InternalFTL.g:154:1: ruleTransform returns [EObject current=null] : ( () ( (lv_input_1_0= ruleInput ) ) (otherlv_2= ',' ( (lv_input_3_0= ruleInput ) ) )* otherlv_4= '>' (otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) )* otherlv_7= '}' otherlv_8= '>' )? ( (lv_output_9_0= RULE_STRING ) ) ) ;
    public final EObject ruleTransform() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_output_9_0=null;
        EObject lv_input_1_0 = null;

        EObject lv_input_3_0 = null;

        EObject lv_instruction_6_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:160:2: ( ( () ( (lv_input_1_0= ruleInput ) ) (otherlv_2= ',' ( (lv_input_3_0= ruleInput ) ) )* otherlv_4= '>' (otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) )* otherlv_7= '}' otherlv_8= '>' )? ( (lv_output_9_0= RULE_STRING ) ) ) )
            // InternalFTL.g:161:2: ( () ( (lv_input_1_0= ruleInput ) ) (otherlv_2= ',' ( (lv_input_3_0= ruleInput ) ) )* otherlv_4= '>' (otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) )* otherlv_7= '}' otherlv_8= '>' )? ( (lv_output_9_0= RULE_STRING ) ) )
            {
            // InternalFTL.g:161:2: ( () ( (lv_input_1_0= ruleInput ) ) (otherlv_2= ',' ( (lv_input_3_0= ruleInput ) ) )* otherlv_4= '>' (otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) )* otherlv_7= '}' otherlv_8= '>' )? ( (lv_output_9_0= RULE_STRING ) ) )
            // InternalFTL.g:162:3: () ( (lv_input_1_0= ruleInput ) ) (otherlv_2= ',' ( (lv_input_3_0= ruleInput ) ) )* otherlv_4= '>' (otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) )* otherlv_7= '}' otherlv_8= '>' )? ( (lv_output_9_0= RULE_STRING ) )
            {
            // InternalFTL.g:162:3: ()
            // InternalFTL.g:163:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTransformAccess().getTransformAction_0(),
            					current);
            			

            }

            // InternalFTL.g:169:3: ( (lv_input_1_0= ruleInput ) )
            // InternalFTL.g:170:4: (lv_input_1_0= ruleInput )
            {
            // InternalFTL.g:170:4: (lv_input_1_0= ruleInput )
            // InternalFTL.g:171:5: lv_input_1_0= ruleInput
            {

            					newCompositeNode(grammarAccess.getTransformAccess().getInputInputParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_input_1_0=ruleInput();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTransformRule());
            					}
            					add(
            						current,
            						"input",
            						lv_input_1_0,
            						"org.xtext.ftl.FTL.Input");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalFTL.g:188:3: (otherlv_2= ',' ( (lv_input_3_0= ruleInput ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFTL.g:189:4: otherlv_2= ',' ( (lv_input_3_0= ruleInput ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_7); 

            	    				newLeafNode(otherlv_2, grammarAccess.getTransformAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalFTL.g:193:4: ( (lv_input_3_0= ruleInput ) )
            	    // InternalFTL.g:194:5: (lv_input_3_0= ruleInput )
            	    {
            	    // InternalFTL.g:194:5: (lv_input_3_0= ruleInput )
            	    // InternalFTL.g:195:6: lv_input_3_0= ruleInput
            	    {

            	    						newCompositeNode(grammarAccess.getTransformAccess().getInputInputParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_input_3_0=ruleInput();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTransformRule());
            	    						}
            	    						add(
            	    							current,
            	    							"input",
            	    							lv_input_3_0,
            	    							"org.xtext.ftl.FTL.Input");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTransformAccess().getGreaterThanSignKeyword_3());
            		
            // InternalFTL.g:217:3: (otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) )* otherlv_7= '}' otherlv_8= '>' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalFTL.g:218:4: otherlv_5= '{' ( (lv_instruction_6_0= ruleInstruction ) )* otherlv_7= '}' otherlv_8= '>'
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_9); 

                    				newLeafNode(otherlv_5, grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_4_0());
                    			
                    // InternalFTL.g:222:4: ( (lv_instruction_6_0= ruleInstruction ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>=20 && LA3_0<=32)) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalFTL.g:223:5: (lv_instruction_6_0= ruleInstruction )
                    	    {
                    	    // InternalFTL.g:223:5: (lv_instruction_6_0= ruleInstruction )
                    	    // InternalFTL.g:224:6: lv_instruction_6_0= ruleInstruction
                    	    {

                    	    						newCompositeNode(grammarAccess.getTransformAccess().getInstructionInstructionParserRuleCall_4_1_0());
                    	    					
                    	    pushFollow(FOLLOW_9);
                    	    lv_instruction_6_0=ruleInstruction();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getTransformRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"instruction",
                    	    							lv_instruction_6_0,
                    	    							"org.xtext.ftl.FTL.Instruction");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_7, grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_4_2());
                    			
                    otherlv_8=(Token)match(input,13,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getTransformAccess().getGreaterThanSignKeyword_4_3());
                    			

                    }
                    break;

            }

            // InternalFTL.g:250:3: ( (lv_output_9_0= RULE_STRING ) )
            // InternalFTL.g:251:4: (lv_output_9_0= RULE_STRING )
            {
            // InternalFTL.g:251:4: (lv_output_9_0= RULE_STRING )
            // InternalFTL.g:252:5: lv_output_9_0= RULE_STRING
            {
            lv_output_9_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_output_9_0, grammarAccess.getTransformAccess().getOutputSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransformRule());
            					}
            					setWithLastConsumed(
            						current,
            						"output",
            						lv_output_9_0,
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
    // $ANTLR end "ruleTransform"


    // $ANTLR start "entryRuleInput"
    // InternalFTL.g:272:1: entryRuleInput returns [EObject current=null] : iv_ruleInput= ruleInput EOF ;
    public final EObject entryRuleInput() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInput = null;


        try {
            // InternalFTL.g:272:46: (iv_ruleInput= ruleInput EOF )
            // InternalFTL.g:273:2: iv_ruleInput= ruleInput EOF
            {
             newCompositeNode(grammarAccess.getInputRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInput=ruleInput();

            state._fsp--;

             current =iv_ruleInput; 
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
    // $ANTLR end "entryRuleInput"


    // $ANTLR start "ruleInput"
    // InternalFTL.g:279:1: ruleInput returns [EObject current=null] : (this_Audio_0= ruleAudio | this_Video_1= ruleVideo ) ;
    public final EObject ruleInput() throws RecognitionException {
        EObject current = null;

        EObject this_Audio_0 = null;

        EObject this_Video_1 = null;



        	enterRule();

        try {
            // InternalFTL.g:285:2: ( (this_Audio_0= ruleAudio | this_Video_1= ruleVideo ) )
            // InternalFTL.g:286:2: (this_Audio_0= ruleAudio | this_Video_1= ruleVideo )
            {
            // InternalFTL.g:286:2: (this_Audio_0= ruleAudio | this_Video_1= ruleVideo )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            else if ( (LA5_0==16) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalFTL.g:287:3: this_Audio_0= ruleAudio
                    {

                    			newCompositeNode(grammarAccess.getInputAccess().getAudioParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Audio_0=ruleAudio();

                    state._fsp--;


                    			current = this_Audio_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalFTL.g:296:3: this_Video_1= ruleVideo
                    {

                    			newCompositeNode(grammarAccess.getInputAccess().getVideoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Video_1=ruleVideo();

                    state._fsp--;


                    			current = this_Video_1;
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
    // $ANTLR end "ruleInput"


    // $ANTLR start "entryRuleVideo"
    // InternalFTL.g:308:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalFTL.g:308:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalFTL.g:309:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalFTL.g:315:1: ruleVideo returns [EObject current=null] : ( () otherlv_1= 'video' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token lv_path_4_0=null;


        	enterRule();

        try {
            // InternalFTL.g:321:2: ( ( () otherlv_1= 'video' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )* ) )
            // InternalFTL.g:322:2: ( () otherlv_1= 'video' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )* )
            {
            // InternalFTL.g:322:2: ( () otherlv_1= 'video' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )* )
            // InternalFTL.g:323:3: () otherlv_1= 'video' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )*
            {
            // InternalFTL.g:323:3: ()
            // InternalFTL.g:324:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getVideoAccess().getVideoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getVideoAccess().getVideoKeyword_1());
            		
            // InternalFTL.g:334:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalFTL.g:335:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalFTL.g:335:4: (lv_path_2_0= RULE_STRING )
            // InternalFTL.g:336:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_path_2_0, grammarAccess.getVideoAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVideoRule());
            					}
            					addWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalFTL.g:352:3: (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFTL.g:353:4: otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getVideoAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalFTL.g:357:4: ( (lv_path_4_0= RULE_STRING ) )
            	    // InternalFTL.g:358:5: (lv_path_4_0= RULE_STRING )
            	    {
            	    // InternalFTL.g:358:5: (lv_path_4_0= RULE_STRING )
            	    // InternalFTL.g:359:6: lv_path_4_0= RULE_STRING
            	    {
            	    lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    						newLeafNode(lv_path_4_0, grammarAccess.getVideoAccess().getPathSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getVideoRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"path",
            	    							lv_path_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleAudio"
    // InternalFTL.g:380:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalFTL.g:380:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalFTL.g:381:2: iv_ruleAudio= ruleAudio EOF
            {
             newCompositeNode(grammarAccess.getAudioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAudio=ruleAudio();

            state._fsp--;

             current =iv_ruleAudio; 
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
    // $ANTLR end "entryRuleAudio"


    // $ANTLR start "ruleAudio"
    // InternalFTL.g:387:1: ruleAudio returns [EObject current=null] : ( () otherlv_1= 'audio' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )* ) ;
    public final EObject ruleAudio() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_path_2_0=null;
        Token otherlv_3=null;
        Token lv_path_4_0=null;


        	enterRule();

        try {
            // InternalFTL.g:393:2: ( ( () otherlv_1= 'audio' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )* ) )
            // InternalFTL.g:394:2: ( () otherlv_1= 'audio' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )* )
            {
            // InternalFTL.g:394:2: ( () otherlv_1= 'audio' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )* )
            // InternalFTL.g:395:3: () otherlv_1= 'audio' ( (lv_path_2_0= RULE_STRING ) ) (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )*
            {
            // InternalFTL.g:395:3: ()
            // InternalFTL.g:396:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAudioAccess().getAudioAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getAudioAccess().getAudioKeyword_1());
            		
            // InternalFTL.g:406:3: ( (lv_path_2_0= RULE_STRING ) )
            // InternalFTL.g:407:4: (lv_path_2_0= RULE_STRING )
            {
            // InternalFTL.g:407:4: (lv_path_2_0= RULE_STRING )
            // InternalFTL.g:408:5: lv_path_2_0= RULE_STRING
            {
            lv_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_path_2_0, grammarAccess.getAudioAccess().getPathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAudioRule());
            					}
            					addWithLastConsumed(
            						current,
            						"path",
            						lv_path_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalFTL.g:424:3: (otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalFTL.g:425:4: otherlv_3= '|' ( (lv_path_4_0= RULE_STRING ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getAudioAccess().getVerticalLineKeyword_3_0());
            	    			
            	    // InternalFTL.g:429:4: ( (lv_path_4_0= RULE_STRING ) )
            	    // InternalFTL.g:430:5: (lv_path_4_0= RULE_STRING )
            	    {
            	    // InternalFTL.g:430:5: (lv_path_4_0= RULE_STRING )
            	    // InternalFTL.g:431:6: lv_path_4_0= RULE_STRING
            	    {
            	    lv_path_4_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            	    						newLeafNode(lv_path_4_0, grammarAccess.getAudioAccess().getPathSTRINGTerminalRuleCall_3_1_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getAudioRule());
            	    						}
            	    						addWithLastConsumed(
            	    							current,
            	    							"path",
            	    							lv_path_4_0,
            	    							"org.eclipse.xtext.common.Terminals.STRING");
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleAudio"


    // $ANTLR start "entryRuleInstruction"
    // InternalFTL.g:452:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalFTL.g:452:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalFTL.g:453:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalFTL.g:459:1: ruleInstruction returns [EObject current=null] : ( (this_Sepia_0= ruleSepia | this_Blur_1= ruleBlur | this_Grayscale_2= ruleGrayscale | this_Scale_3= ruleScale | this_Sharpen_4= ruleSharpen | this_Reverse_5= ruleReverse | this_Mix_6= ruleMix | this_Echo_7= ruleEcho | this_Negate_8= ruleNegate | this_Fps_9= ruleFps | this_Start_10= ruleStart | this_End_11= ruleEnd | this_Concat_12= ruleConcat ) otherlv_13= ';' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_13=null;
        EObject this_Sepia_0 = null;

        EObject this_Blur_1 = null;

        EObject this_Grayscale_2 = null;

        EObject this_Scale_3 = null;

        EObject this_Sharpen_4 = null;

        EObject this_Reverse_5 = null;

        EObject this_Mix_6 = null;

        EObject this_Echo_7 = null;

        EObject this_Negate_8 = null;

        EObject this_Fps_9 = null;

        EObject this_Start_10 = null;

        EObject this_End_11 = null;

        EObject this_Concat_12 = null;



        	enterRule();

        try {
            // InternalFTL.g:465:2: ( ( (this_Sepia_0= ruleSepia | this_Blur_1= ruleBlur | this_Grayscale_2= ruleGrayscale | this_Scale_3= ruleScale | this_Sharpen_4= ruleSharpen | this_Reverse_5= ruleReverse | this_Mix_6= ruleMix | this_Echo_7= ruleEcho | this_Negate_8= ruleNegate | this_Fps_9= ruleFps | this_Start_10= ruleStart | this_End_11= ruleEnd | this_Concat_12= ruleConcat ) otherlv_13= ';' ) )
            // InternalFTL.g:466:2: ( (this_Sepia_0= ruleSepia | this_Blur_1= ruleBlur | this_Grayscale_2= ruleGrayscale | this_Scale_3= ruleScale | this_Sharpen_4= ruleSharpen | this_Reverse_5= ruleReverse | this_Mix_6= ruleMix | this_Echo_7= ruleEcho | this_Negate_8= ruleNegate | this_Fps_9= ruleFps | this_Start_10= ruleStart | this_End_11= ruleEnd | this_Concat_12= ruleConcat ) otherlv_13= ';' )
            {
            // InternalFTL.g:466:2: ( (this_Sepia_0= ruleSepia | this_Blur_1= ruleBlur | this_Grayscale_2= ruleGrayscale | this_Scale_3= ruleScale | this_Sharpen_4= ruleSharpen | this_Reverse_5= ruleReverse | this_Mix_6= ruleMix | this_Echo_7= ruleEcho | this_Negate_8= ruleNegate | this_Fps_9= ruleFps | this_Start_10= ruleStart | this_End_11= ruleEnd | this_Concat_12= ruleConcat ) otherlv_13= ';' )
            // InternalFTL.g:467:3: (this_Sepia_0= ruleSepia | this_Blur_1= ruleBlur | this_Grayscale_2= ruleGrayscale | this_Scale_3= ruleScale | this_Sharpen_4= ruleSharpen | this_Reverse_5= ruleReverse | this_Mix_6= ruleMix | this_Echo_7= ruleEcho | this_Negate_8= ruleNegate | this_Fps_9= ruleFps | this_Start_10= ruleStart | this_End_11= ruleEnd | this_Concat_12= ruleConcat ) otherlv_13= ';'
            {
            // InternalFTL.g:467:3: (this_Sepia_0= ruleSepia | this_Blur_1= ruleBlur | this_Grayscale_2= ruleGrayscale | this_Scale_3= ruleScale | this_Sharpen_4= ruleSharpen | this_Reverse_5= ruleReverse | this_Mix_6= ruleMix | this_Echo_7= ruleEcho | this_Negate_8= ruleNegate | this_Fps_9= ruleFps | this_Start_10= ruleStart | this_End_11= ruleEnd | this_Concat_12= ruleConcat )
            int alt8=13;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt8=1;
                }
                break;
            case 27:
                {
                alt8=2;
                }
                break;
            case 28:
                {
                alt8=3;
                }
                break;
            case 29:
                {
                alt8=4;
                }
                break;
            case 30:
                {
                alt8=5;
                }
                break;
            case 31:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            case 24:
                {
                alt8=8;
                }
                break;
            case 23:
                {
                alt8=9;
                }
                break;
            case 22:
                {
                alt8=10;
                }
                break;
            case 20:
                {
                alt8=11;
                }
                break;
            case 21:
                {
                alt8=12;
                }
                break;
            case 32:
                {
                alt8=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalFTL.g:468:4: this_Sepia_0= ruleSepia
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_13);
                    this_Sepia_0=ruleSepia();

                    state._fsp--;


                    				current = this_Sepia_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalFTL.g:477:4: this_Blur_1= ruleBlur
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_13);
                    this_Blur_1=ruleBlur();

                    state._fsp--;


                    				current = this_Blur_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalFTL.g:486:4: this_Grayscale_2= ruleGrayscale
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getGrayscaleParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_13);
                    this_Grayscale_2=ruleGrayscale();

                    state._fsp--;


                    				current = this_Grayscale_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalFTL.g:495:4: this_Scale_3= ruleScale
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getScaleParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_13);
                    this_Scale_3=ruleScale();

                    state._fsp--;


                    				current = this_Scale_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalFTL.g:504:4: this_Sharpen_4= ruleSharpen
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getSharpenParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_13);
                    this_Sharpen_4=ruleSharpen();

                    state._fsp--;


                    				current = this_Sharpen_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalFTL.g:513:4: this_Reverse_5= ruleReverse
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getReverseParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_13);
                    this_Reverse_5=ruleReverse();

                    state._fsp--;


                    				current = this_Reverse_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalFTL.g:522:4: this_Mix_6= ruleMix
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getMixParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_13);
                    this_Mix_6=ruleMix();

                    state._fsp--;


                    				current = this_Mix_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalFTL.g:531:4: this_Echo_7= ruleEcho
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getEchoParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_13);
                    this_Echo_7=ruleEcho();

                    state._fsp--;


                    				current = this_Echo_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 9 :
                    // InternalFTL.g:540:4: this_Negate_8= ruleNegate
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getNegateParserRuleCall_0_8());
                    			
                    pushFollow(FOLLOW_13);
                    this_Negate_8=ruleNegate();

                    state._fsp--;


                    				current = this_Negate_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 10 :
                    // InternalFTL.g:549:4: this_Fps_9= ruleFps
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getFpsParserRuleCall_0_9());
                    			
                    pushFollow(FOLLOW_13);
                    this_Fps_9=ruleFps();

                    state._fsp--;


                    				current = this_Fps_9;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 11 :
                    // InternalFTL.g:558:4: this_Start_10= ruleStart
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getStartParserRuleCall_0_10());
                    			
                    pushFollow(FOLLOW_13);
                    this_Start_10=ruleStart();

                    state._fsp--;


                    				current = this_Start_10;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 12 :
                    // InternalFTL.g:567:4: this_End_11= ruleEnd
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getEndParserRuleCall_0_11());
                    			
                    pushFollow(FOLLOW_13);
                    this_End_11=ruleEnd();

                    state._fsp--;


                    				current = this_End_11;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 13 :
                    // InternalFTL.g:576:4: this_Concat_12= ruleConcat
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getConcatParserRuleCall_0_12());
                    			
                    pushFollow(FOLLOW_13);
                    this_Concat_12=ruleConcat();

                    state._fsp--;


                    				current = this_Concat_12;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_13=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getInstructionAccess().getSemicolonKeyword_1());
            		

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


    // $ANTLR start "entryRuleStart"
    // InternalFTL.g:593:1: entryRuleStart returns [EObject current=null] : iv_ruleStart= ruleStart EOF ;
    public final EObject entryRuleStart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStart = null;


        try {
            // InternalFTL.g:593:46: (iv_ruleStart= ruleStart EOF )
            // InternalFTL.g:594:2: iv_ruleStart= ruleStart EOF
            {
             newCompositeNode(grammarAccess.getStartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStart=ruleStart();

            state._fsp--;

             current =iv_ruleStart; 
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
    // $ANTLR end "entryRuleStart"


    // $ANTLR start "ruleStart"
    // InternalFTL.g:600:1: ruleStart returns [EObject current=null] : ( () otherlv_1= 'start' ( (lv_time_2_0= ruleFloat ) ) ) ;
    public final EObject ruleStart() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:606:2: ( ( () otherlv_1= 'start' ( (lv_time_2_0= ruleFloat ) ) ) )
            // InternalFTL.g:607:2: ( () otherlv_1= 'start' ( (lv_time_2_0= ruleFloat ) ) )
            {
            // InternalFTL.g:607:2: ( () otherlv_1= 'start' ( (lv_time_2_0= ruleFloat ) ) )
            // InternalFTL.g:608:3: () otherlv_1= 'start' ( (lv_time_2_0= ruleFloat ) )
            {
            // InternalFTL.g:608:3: ()
            // InternalFTL.g:609:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getStartAccess().getStartAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getStartAccess().getStartKeyword_1());
            		
            // InternalFTL.g:619:3: ( (lv_time_2_0= ruleFloat ) )
            // InternalFTL.g:620:4: (lv_time_2_0= ruleFloat )
            {
            // InternalFTL.g:620:4: (lv_time_2_0= ruleFloat )
            // InternalFTL.g:621:5: lv_time_2_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getStartAccess().getTimeFloatParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_2_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStartRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.ftl.FTL.Float");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleStart"


    // $ANTLR start "entryRuleEnd"
    // InternalFTL.g:642:1: entryRuleEnd returns [EObject current=null] : iv_ruleEnd= ruleEnd EOF ;
    public final EObject entryRuleEnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEnd = null;


        try {
            // InternalFTL.g:642:44: (iv_ruleEnd= ruleEnd EOF )
            // InternalFTL.g:643:2: iv_ruleEnd= ruleEnd EOF
            {
             newCompositeNode(grammarAccess.getEndRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEnd=ruleEnd();

            state._fsp--;

             current =iv_ruleEnd; 
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
    // $ANTLR end "entryRuleEnd"


    // $ANTLR start "ruleEnd"
    // InternalFTL.g:649:1: ruleEnd returns [EObject current=null] : ( () otherlv_1= 'end' ( (lv_time_2_0= ruleFloat ) ) ) ;
    public final EObject ruleEnd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_time_2_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:655:2: ( ( () otherlv_1= 'end' ( (lv_time_2_0= ruleFloat ) ) ) )
            // InternalFTL.g:656:2: ( () otherlv_1= 'end' ( (lv_time_2_0= ruleFloat ) ) )
            {
            // InternalFTL.g:656:2: ( () otherlv_1= 'end' ( (lv_time_2_0= ruleFloat ) ) )
            // InternalFTL.g:657:3: () otherlv_1= 'end' ( (lv_time_2_0= ruleFloat ) )
            {
            // InternalFTL.g:657:3: ()
            // InternalFTL.g:658:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEndAccess().getEndAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEndAccess().getEndKeyword_1());
            		
            // InternalFTL.g:668:3: ( (lv_time_2_0= ruleFloat ) )
            // InternalFTL.g:669:4: (lv_time_2_0= ruleFloat )
            {
            // InternalFTL.g:669:4: (lv_time_2_0= ruleFloat )
            // InternalFTL.g:670:5: lv_time_2_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getEndAccess().getTimeFloatParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_time_2_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getEndRule());
            					}
            					set(
            						current,
            						"time",
            						lv_time_2_0,
            						"org.xtext.ftl.FTL.Float");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleEnd"


    // $ANTLR start "entryRuleFps"
    // InternalFTL.g:691:1: entryRuleFps returns [EObject current=null] : iv_ruleFps= ruleFps EOF ;
    public final EObject entryRuleFps() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFps = null;


        try {
            // InternalFTL.g:691:44: (iv_ruleFps= ruleFps EOF )
            // InternalFTL.g:692:2: iv_ruleFps= ruleFps EOF
            {
             newCompositeNode(grammarAccess.getFpsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFps=ruleFps();

            state._fsp--;

             current =iv_ruleFps; 
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
    // $ANTLR end "entryRuleFps"


    // $ANTLR start "ruleFps"
    // InternalFTL.g:698:1: ruleFps returns [EObject current=null] : ( () otherlv_1= 'fps' ( (lv_value_2_0= RULE_INT ) ) ) ;
    public final EObject ruleFps() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_value_2_0=null;


        	enterRule();

        try {
            // InternalFTL.g:704:2: ( ( () otherlv_1= 'fps' ( (lv_value_2_0= RULE_INT ) ) ) )
            // InternalFTL.g:705:2: ( () otherlv_1= 'fps' ( (lv_value_2_0= RULE_INT ) ) )
            {
            // InternalFTL.g:705:2: ( () otherlv_1= 'fps' ( (lv_value_2_0= RULE_INT ) ) )
            // InternalFTL.g:706:3: () otherlv_1= 'fps' ( (lv_value_2_0= RULE_INT ) )
            {
            // InternalFTL.g:706:3: ()
            // InternalFTL.g:707:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFpsAccess().getFpsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getFpsAccess().getFpsKeyword_1());
            		
            // InternalFTL.g:717:3: ( (lv_value_2_0= RULE_INT ) )
            // InternalFTL.g:718:4: (lv_value_2_0= RULE_INT )
            {
            // InternalFTL.g:718:4: (lv_value_2_0= RULE_INT )
            // InternalFTL.g:719:5: lv_value_2_0= RULE_INT
            {
            lv_value_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_value_2_0, grammarAccess.getFpsAccess().getValueINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFpsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_2_0,
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
    // $ANTLR end "ruleFps"


    // $ANTLR start "entryRuleNegate"
    // InternalFTL.g:739:1: entryRuleNegate returns [EObject current=null] : iv_ruleNegate= ruleNegate EOF ;
    public final EObject entryRuleNegate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegate = null;


        try {
            // InternalFTL.g:739:47: (iv_ruleNegate= ruleNegate EOF )
            // InternalFTL.g:740:2: iv_ruleNegate= ruleNegate EOF
            {
             newCompositeNode(grammarAccess.getNegateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNegate=ruleNegate();

            state._fsp--;

             current =iv_ruleNegate; 
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
    // $ANTLR end "entryRuleNegate"


    // $ANTLR start "ruleNegate"
    // InternalFTL.g:746:1: ruleNegate returns [EObject current=null] : ( () otherlv_1= 'negate' ) ;
    public final EObject ruleNegate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:752:2: ( ( () otherlv_1= 'negate' ) )
            // InternalFTL.g:753:2: ( () otherlv_1= 'negate' )
            {
            // InternalFTL.g:753:2: ( () otherlv_1= 'negate' )
            // InternalFTL.g:754:3: () otherlv_1= 'negate'
            {
            // InternalFTL.g:754:3: ()
            // InternalFTL.g:755:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getNegateAccess().getNegateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNegateAccess().getNegateKeyword_1());
            		

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
    // $ANTLR end "ruleNegate"


    // $ANTLR start "entryRuleEcho"
    // InternalFTL.g:769:1: entryRuleEcho returns [EObject current=null] : iv_ruleEcho= ruleEcho EOF ;
    public final EObject entryRuleEcho() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEcho = null;


        try {
            // InternalFTL.g:769:45: (iv_ruleEcho= ruleEcho EOF )
            // InternalFTL.g:770:2: iv_ruleEcho= ruleEcho EOF
            {
             newCompositeNode(grammarAccess.getEchoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEcho=ruleEcho();

            state._fsp--;

             current =iv_ruleEcho; 
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
    // $ANTLR end "entryRuleEcho"


    // $ANTLR start "ruleEcho"
    // InternalFTL.g:776:1: ruleEcho returns [EObject current=null] : ( () otherlv_1= 'echo' ( (lv_delay_2_0= RULE_INT ) ) ) ;
    public final EObject ruleEcho() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_delay_2_0=null;


        	enterRule();

        try {
            // InternalFTL.g:782:2: ( ( () otherlv_1= 'echo' ( (lv_delay_2_0= RULE_INT ) ) ) )
            // InternalFTL.g:783:2: ( () otherlv_1= 'echo' ( (lv_delay_2_0= RULE_INT ) ) )
            {
            // InternalFTL.g:783:2: ( () otherlv_1= 'echo' ( (lv_delay_2_0= RULE_INT ) ) )
            // InternalFTL.g:784:3: () otherlv_1= 'echo' ( (lv_delay_2_0= RULE_INT ) )
            {
            // InternalFTL.g:784:3: ()
            // InternalFTL.g:785:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getEchoAccess().getEchoAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getEchoAccess().getEchoKeyword_1());
            		
            // InternalFTL.g:795:3: ( (lv_delay_2_0= RULE_INT ) )
            // InternalFTL.g:796:4: (lv_delay_2_0= RULE_INT )
            {
            // InternalFTL.g:796:4: (lv_delay_2_0= RULE_INT )
            // InternalFTL.g:797:5: lv_delay_2_0= RULE_INT
            {
            lv_delay_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_delay_2_0, grammarAccess.getEchoAccess().getDelayINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEchoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"delay",
            						lv_delay_2_0,
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
    // $ANTLR end "ruleEcho"


    // $ANTLR start "entryRuleMix"
    // InternalFTL.g:817:1: entryRuleMix returns [EObject current=null] : iv_ruleMix= ruleMix EOF ;
    public final EObject entryRuleMix() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMix = null;


        try {
            // InternalFTL.g:817:44: (iv_ruleMix= ruleMix EOF )
            // InternalFTL.g:818:2: iv_ruleMix= ruleMix EOF
            {
             newCompositeNode(grammarAccess.getMixRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMix=ruleMix();

            state._fsp--;

             current =iv_ruleMix; 
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
    // $ANTLR end "entryRuleMix"


    // $ANTLR start "ruleMix"
    // InternalFTL.g:824:1: ruleMix returns [EObject current=null] : ( () otherlv_1= 'mix' ) ;
    public final EObject ruleMix() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:830:2: ( ( () otherlv_1= 'mix' ) )
            // InternalFTL.g:831:2: ( () otherlv_1= 'mix' )
            {
            // InternalFTL.g:831:2: ( () otherlv_1= 'mix' )
            // InternalFTL.g:832:3: () otherlv_1= 'mix'
            {
            // InternalFTL.g:832:3: ()
            // InternalFTL.g:833:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMixAccess().getMixAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,25,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMixAccess().getMixKeyword_1());
            		

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
    // $ANTLR end "ruleMix"


    // $ANTLR start "entryRuleSepia"
    // InternalFTL.g:847:1: entryRuleSepia returns [EObject current=null] : iv_ruleSepia= ruleSepia EOF ;
    public final EObject entryRuleSepia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSepia = null;


        try {
            // InternalFTL.g:847:46: (iv_ruleSepia= ruleSepia EOF )
            // InternalFTL.g:848:2: iv_ruleSepia= ruleSepia EOF
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
    // InternalFTL.g:854:1: ruleSepia returns [EObject current=null] : ( () otherlv_1= 'sepia' ) ;
    public final EObject ruleSepia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:860:2: ( ( () otherlv_1= 'sepia' ) )
            // InternalFTL.g:861:2: ( () otherlv_1= 'sepia' )
            {
            // InternalFTL.g:861:2: ( () otherlv_1= 'sepia' )
            // InternalFTL.g:862:3: () otherlv_1= 'sepia'
            {
            // InternalFTL.g:862:3: ()
            // InternalFTL.g:863:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSepiaAccess().getSepiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,26,FOLLOW_2); 

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
    // InternalFTL.g:877:1: entryRuleBlur returns [EObject current=null] : iv_ruleBlur= ruleBlur EOF ;
    public final EObject entryRuleBlur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlur = null;


        try {
            // InternalFTL.g:877:45: (iv_ruleBlur= ruleBlur EOF )
            // InternalFTL.g:878:2: iv_ruleBlur= ruleBlur EOF
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
    // InternalFTL.g:884:1: ruleBlur returns [EObject current=null] : ( () otherlv_1= 'blur' ( (lv_radius_2_0= RULE_INT ) ) ) ;
    public final EObject ruleBlur() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_radius_2_0=null;


        	enterRule();

        try {
            // InternalFTL.g:890:2: ( ( () otherlv_1= 'blur' ( (lv_radius_2_0= RULE_INT ) ) ) )
            // InternalFTL.g:891:2: ( () otherlv_1= 'blur' ( (lv_radius_2_0= RULE_INT ) ) )
            {
            // InternalFTL.g:891:2: ( () otherlv_1= 'blur' ( (lv_radius_2_0= RULE_INT ) ) )
            // InternalFTL.g:892:3: () otherlv_1= 'blur' ( (lv_radius_2_0= RULE_INT ) )
            {
            // InternalFTL.g:892:3: ()
            // InternalFTL.g:893:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getBlurAccess().getBlurAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,27,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getBlurAccess().getBlurKeyword_1());
            		
            // InternalFTL.g:903:3: ( (lv_radius_2_0= RULE_INT ) )
            // InternalFTL.g:904:4: (lv_radius_2_0= RULE_INT )
            {
            // InternalFTL.g:904:4: (lv_radius_2_0= RULE_INT )
            // InternalFTL.g:905:5: lv_radius_2_0= RULE_INT
            {
            lv_radius_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_radius_2_0, grammarAccess.getBlurAccess().getRadiusINTTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getBlurRule());
            					}
            					setWithLastConsumed(
            						current,
            						"radius",
            						lv_radius_2_0,
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


    // $ANTLR start "entryRuleGrayscale"
    // InternalFTL.g:925:1: entryRuleGrayscale returns [EObject current=null] : iv_ruleGrayscale= ruleGrayscale EOF ;
    public final EObject entryRuleGrayscale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrayscale = null;


        try {
            // InternalFTL.g:925:50: (iv_ruleGrayscale= ruleGrayscale EOF )
            // InternalFTL.g:926:2: iv_ruleGrayscale= ruleGrayscale EOF
            {
             newCompositeNode(grammarAccess.getGrayscaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGrayscale=ruleGrayscale();

            state._fsp--;

             current =iv_ruleGrayscale; 
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
    // $ANTLR end "entryRuleGrayscale"


    // $ANTLR start "ruleGrayscale"
    // InternalFTL.g:932:1: ruleGrayscale returns [EObject current=null] : ( () otherlv_1= 'grayscale' ) ;
    public final EObject ruleGrayscale() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:938:2: ( ( () otherlv_1= 'grayscale' ) )
            // InternalFTL.g:939:2: ( () otherlv_1= 'grayscale' )
            {
            // InternalFTL.g:939:2: ( () otherlv_1= 'grayscale' )
            // InternalFTL.g:940:3: () otherlv_1= 'grayscale'
            {
            // InternalFTL.g:940:3: ()
            // InternalFTL.g:941:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGrayscaleAccess().getGrayscaleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getGrayscaleAccess().getGrayscaleKeyword_1());
            		

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
    // $ANTLR end "ruleGrayscale"


    // $ANTLR start "entryRuleScale"
    // InternalFTL.g:955:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // InternalFTL.g:955:46: (iv_ruleScale= ruleScale EOF )
            // InternalFTL.g:956:2: iv_ruleScale= ruleScale EOF
            {
             newCompositeNode(grammarAccess.getScaleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScale=ruleScale();

            state._fsp--;

             current =iv_ruleScale; 
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
    // $ANTLR end "entryRuleScale"


    // $ANTLR start "ruleScale"
    // InternalFTL.g:962:1: ruleScale returns [EObject current=null] : (otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) ) ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_factor_1_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:968:2: ( (otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) ) ) )
            // InternalFTL.g:969:2: (otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) ) )
            {
            // InternalFTL.g:969:2: (otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) ) )
            // InternalFTL.g:970:3: otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) )
            {
            otherlv_0=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
            		
            // InternalFTL.g:974:3: ( (lv_factor_1_0= ruleFloat ) )
            // InternalFTL.g:975:4: (lv_factor_1_0= ruleFloat )
            {
            // InternalFTL.g:975:4: (lv_factor_1_0= ruleFloat )
            // InternalFTL.g:976:5: lv_factor_1_0= ruleFloat
            {

            					newCompositeNode(grammarAccess.getScaleAccess().getFactorFloatParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_factor_1_0=ruleFloat();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getScaleRule());
            					}
            					set(
            						current,
            						"factor",
            						lv_factor_1_0,
            						"org.xtext.ftl.FTL.Float");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleScale"


    // $ANTLR start "entryRuleSharpen"
    // InternalFTL.g:997:1: entryRuleSharpen returns [EObject current=null] : iv_ruleSharpen= ruleSharpen EOF ;
    public final EObject entryRuleSharpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSharpen = null;


        try {
            // InternalFTL.g:997:48: (iv_ruleSharpen= ruleSharpen EOF )
            // InternalFTL.g:998:2: iv_ruleSharpen= ruleSharpen EOF
            {
             newCompositeNode(grammarAccess.getSharpenRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSharpen=ruleSharpen();

            state._fsp--;

             current =iv_ruleSharpen; 
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
    // $ANTLR end "entryRuleSharpen"


    // $ANTLR start "ruleSharpen"
    // InternalFTL.g:1004:1: ruleSharpen returns [EObject current=null] : ( () otherlv_1= 'sharpen' ) ;
    public final EObject ruleSharpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:1010:2: ( ( () otherlv_1= 'sharpen' ) )
            // InternalFTL.g:1011:2: ( () otherlv_1= 'sharpen' )
            {
            // InternalFTL.g:1011:2: ( () otherlv_1= 'sharpen' )
            // InternalFTL.g:1012:3: () otherlv_1= 'sharpen'
            {
            // InternalFTL.g:1012:3: ()
            // InternalFTL.g:1013:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSharpenAccess().getSharpenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,30,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getSharpenAccess().getSharpenKeyword_1());
            		

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
    // $ANTLR end "ruleSharpen"


    // $ANTLR start "entryRuleReverse"
    // InternalFTL.g:1027:1: entryRuleReverse returns [EObject current=null] : iv_ruleReverse= ruleReverse EOF ;
    public final EObject entryRuleReverse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverse = null;


        try {
            // InternalFTL.g:1027:48: (iv_ruleReverse= ruleReverse EOF )
            // InternalFTL.g:1028:2: iv_ruleReverse= ruleReverse EOF
            {
             newCompositeNode(grammarAccess.getReverseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReverse=ruleReverse();

            state._fsp--;

             current =iv_ruleReverse; 
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
    // $ANTLR end "entryRuleReverse"


    // $ANTLR start "ruleReverse"
    // InternalFTL.g:1034:1: ruleReverse returns [EObject current=null] : ( () otherlv_1= 'reverse' ) ;
    public final EObject ruleReverse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:1040:2: ( ( () otherlv_1= 'reverse' ) )
            // InternalFTL.g:1041:2: ( () otherlv_1= 'reverse' )
            {
            // InternalFTL.g:1041:2: ( () otherlv_1= 'reverse' )
            // InternalFTL.g:1042:3: () otherlv_1= 'reverse'
            {
            // InternalFTL.g:1042:3: ()
            // InternalFTL.g:1043:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReverseAccess().getReverseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,31,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getReverseAccess().getReverseKeyword_1());
            		

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
    // $ANTLR end "ruleReverse"


    // $ANTLR start "entryRuleConcat"
    // InternalFTL.g:1057:1: entryRuleConcat returns [EObject current=null] : iv_ruleConcat= ruleConcat EOF ;
    public final EObject entryRuleConcat() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcat = null;


        try {
            // InternalFTL.g:1057:47: (iv_ruleConcat= ruleConcat EOF )
            // InternalFTL.g:1058:2: iv_ruleConcat= ruleConcat EOF
            {
             newCompositeNode(grammarAccess.getConcatRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConcat=ruleConcat();

            state._fsp--;

             current =iv_ruleConcat; 
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
    // $ANTLR end "entryRuleConcat"


    // $ANTLR start "ruleConcat"
    // InternalFTL.g:1064:1: ruleConcat returns [EObject current=null] : ( () otherlv_1= 'concat' ) ;
    public final EObject ruleConcat() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:1070:2: ( ( () otherlv_1= 'concat' ) )
            // InternalFTL.g:1071:2: ( () otherlv_1= 'concat' )
            {
            // InternalFTL.g:1071:2: ( () otherlv_1= 'concat' )
            // InternalFTL.g:1072:3: () otherlv_1= 'concat'
            {
            // InternalFTL.g:1072:3: ()
            // InternalFTL.g:1073:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConcatAccess().getConcatAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,32,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getConcatAccess().getConcatKeyword_1());
            		

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
    // $ANTLR end "ruleConcat"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000050002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000003000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000053000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000001FFF08000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});

}