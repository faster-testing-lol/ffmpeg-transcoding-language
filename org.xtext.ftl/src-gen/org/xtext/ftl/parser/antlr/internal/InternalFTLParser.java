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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'{'", "'}'", "';'", "'video'", "'audio'", "'sepia'", "'blur'"
    };
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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

                if ( (LA1_0==RULE_STRING) ) {
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


    // $ANTLR start "entryRuleTransform"
    // InternalFTL.g:109:1: entryRuleTransform returns [EObject current=null] : iv_ruleTransform= ruleTransform EOF ;
    public final EObject entryRuleTransform() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransform = null;


        try {
            // InternalFTL.g:109:50: (iv_ruleTransform= ruleTransform EOF )
            // InternalFTL.g:110:2: iv_ruleTransform= ruleTransform EOF
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
    // InternalFTL.g:116:1: ruleTransform returns [EObject current=null] : ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransform() throws RecognitionException {
        EObject current = null;

        Token lv_output_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instruction_3_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:122:2: ( ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' ) )
            // InternalFTL.g:123:2: ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' )
            {
            // InternalFTL.g:123:2: ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' )
            // InternalFTL.g:124:3: ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}'
            {
            // InternalFTL.g:124:3: ( (lv_output_0_0= RULE_STRING ) )
            // InternalFTL.g:125:4: (lv_output_0_0= RULE_STRING )
            {
            // InternalFTL.g:125:4: (lv_output_0_0= RULE_STRING )
            // InternalFTL.g:126:5: lv_output_0_0= RULE_STRING
            {
            lv_output_0_0=(Token)match(input,RULE_STRING,FOLLOW_4); 

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

            otherlv_1=(Token)match(input,11,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFTL.g:150:3: ( (lv_instruction_3_0= ruleInstruction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=15 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFTL.g:151:4: (lv_instruction_3_0= ruleInstruction )
            	    {
            	    // InternalFTL.g:151:4: (lv_instruction_3_0= ruleInstruction )
            	    // InternalFTL.g:152:5: lv_instruction_3_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getTransformAccess().getInstructionInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break loop2;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

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
    // InternalFTL.g:177:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalFTL.g:177:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalFTL.g:178:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalFTL.g:184:1: ruleInstruction returns [EObject current=null] : ( (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur ) otherlv_4= ';' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        EObject this_Video_0 = null;

        EObject this_Audio_1 = null;

        EObject this_Sepia_2 = null;

        EObject this_Blur_3 = null;



        	enterRule();

        try {
            // InternalFTL.g:190:2: ( ( (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur ) otherlv_4= ';' ) )
            // InternalFTL.g:191:2: ( (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur ) otherlv_4= ';' )
            {
            // InternalFTL.g:191:2: ( (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur ) otherlv_4= ';' )
            // InternalFTL.g:192:3: (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur ) otherlv_4= ';'
            {
            // InternalFTL.g:192:3: (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFTL.g:193:4: this_Video_0= ruleVideo
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
                    // InternalFTL.g:202:4: this_Audio_1= ruleAudio
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getAudioParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_7);
                    this_Audio_1=ruleAudio();

                    state._fsp--;


                    				current = this_Audio_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalFTL.g:211:4: this_Sepia_2= ruleSepia
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_7);
                    this_Sepia_2=ruleSepia();

                    state._fsp--;


                    				current = this_Sepia_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalFTL.g:220:4: this_Blur_3= ruleBlur
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_7);
                    this_Blur_3=ruleBlur();

                    state._fsp--;


                    				current = this_Blur_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getInstructionAccess().getSemicolonKeyword_1());
            		

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
    // InternalFTL.g:237:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalFTL.g:237:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalFTL.g:238:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalFTL.g:244:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_input_1_0=null;


        	enterRule();

        try {
            // InternalFTL.g:250:2: ( (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) ) )
            // InternalFTL.g:251:2: (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) )
            {
            // InternalFTL.g:251:2: (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) )
            // InternalFTL.g:252:3: otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
            		
            // InternalFTL.g:256:3: ( (lv_input_1_0= RULE_STRING ) )
            // InternalFTL.g:257:4: (lv_input_1_0= RULE_STRING )
            {
            // InternalFTL.g:257:4: (lv_input_1_0= RULE_STRING )
            // InternalFTL.g:258:5: lv_input_1_0= RULE_STRING
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


    // $ANTLR start "entryRuleAudio"
    // InternalFTL.g:278:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalFTL.g:278:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalFTL.g:279:2: iv_ruleAudio= ruleAudio EOF
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
    // InternalFTL.g:285:1: ruleAudio returns [EObject current=null] : (otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAudio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_input_1_0=null;


        	enterRule();

        try {
            // InternalFTL.g:291:2: ( (otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) ) ) )
            // InternalFTL.g:292:2: (otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) ) )
            {
            // InternalFTL.g:292:2: (otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) ) )
            // InternalFTL.g:293:3: otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioAccess().getAudioKeyword_0());
            		
            // InternalFTL.g:297:3: ( (lv_input_1_0= RULE_STRING ) )
            // InternalFTL.g:298:4: (lv_input_1_0= RULE_STRING )
            {
            // InternalFTL.g:298:4: (lv_input_1_0= RULE_STRING )
            // InternalFTL.g:299:5: lv_input_1_0= RULE_STRING
            {
            lv_input_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_input_1_0, grammarAccess.getAudioAccess().getInputSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAudioRule());
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
    // $ANTLR end "ruleAudio"


    // $ANTLR start "entryRuleSepia"
    // InternalFTL.g:319:1: entryRuleSepia returns [EObject current=null] : iv_ruleSepia= ruleSepia EOF ;
    public final EObject entryRuleSepia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSepia = null;


        try {
            // InternalFTL.g:319:46: (iv_ruleSepia= ruleSepia EOF )
            // InternalFTL.g:320:2: iv_ruleSepia= ruleSepia EOF
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
    // InternalFTL.g:326:1: ruleSepia returns [EObject current=null] : ( () otherlv_1= 'sepia' ) ;
    public final EObject ruleSepia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:332:2: ( ( () otherlv_1= 'sepia' ) )
            // InternalFTL.g:333:2: ( () otherlv_1= 'sepia' )
            {
            // InternalFTL.g:333:2: ( () otherlv_1= 'sepia' )
            // InternalFTL.g:334:3: () otherlv_1= 'sepia'
            {
            // InternalFTL.g:334:3: ()
            // InternalFTL.g:335:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSepiaAccess().getSepiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

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
    // InternalFTL.g:349:1: entryRuleBlur returns [EObject current=null] : iv_ruleBlur= ruleBlur EOF ;
    public final EObject entryRuleBlur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlur = null;


        try {
            // InternalFTL.g:349:45: (iv_ruleBlur= ruleBlur EOF )
            // InternalFTL.g:350:2: iv_ruleBlur= ruleBlur EOF
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
    // InternalFTL.g:356:1: ruleBlur returns [EObject current=null] : (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBlur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_radius_1_0=null;


        	enterRule();

        try {
            // InternalFTL.g:362:2: ( (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) ) )
            // InternalFTL.g:363:2: (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) )
            {
            // InternalFTL.g:363:2: (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) )
            // InternalFTL.g:364:3: otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getBlurAccess().getBlurKeyword_0());
            		
            // InternalFTL.g:368:3: ( (lv_radius_1_0= RULE_INT ) )
            // InternalFTL.g:369:4: (lv_radius_1_0= RULE_INT )
            {
            // InternalFTL.g:369:4: (lv_radius_1_0= RULE_INT )
            // InternalFTL.g:370:5: lv_radius_1_0= RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});

}