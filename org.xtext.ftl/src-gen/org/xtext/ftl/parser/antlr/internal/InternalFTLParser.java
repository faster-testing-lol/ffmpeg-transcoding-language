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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'='", "'{'", "'}'", "';'", "'video'", "'audio'", "'sepia'", "'blur'", "'grayscale'", "'scale'", "'sharpen'", "'reverse'"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=4;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
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
    // InternalFTL.g:154:1: ruleTransform returns [EObject current=null] : ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' ) ;
    public final EObject ruleTransform() throws RecognitionException {
        EObject current = null;

        Token lv_output_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_instruction_3_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:160:2: ( ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' ) )
            // InternalFTL.g:161:2: ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' )
            {
            // InternalFTL.g:161:2: ( ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}' )
            // InternalFTL.g:162:3: ( (lv_output_0_0= RULE_STRING ) ) otherlv_1= '=' otherlv_2= '{' ( (lv_instruction_3_0= ruleInstruction ) )* otherlv_4= '}'
            {
            // InternalFTL.g:162:3: ( (lv_output_0_0= RULE_STRING ) )
            // InternalFTL.g:163:4: (lv_output_0_0= RULE_STRING )
            {
            // InternalFTL.g:163:4: (lv_output_0_0= RULE_STRING )
            // InternalFTL.g:164:5: lv_output_0_0= RULE_STRING
            {
            lv_output_0_0=(Token)match(input,RULE_STRING,FOLLOW_6); 

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

            otherlv_1=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getTransformAccess().getEqualsSignKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalFTL.g:188:3: ( (lv_instruction_3_0= ruleInstruction ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=16 && LA2_0<=23)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFTL.g:189:4: (lv_instruction_3_0= ruleInstruction )
            	    {
            	    // InternalFTL.g:189:4: (lv_instruction_3_0= ruleInstruction )
            	    // InternalFTL.g:190:5: lv_instruction_3_0= ruleInstruction
            	    {

            	    					newCompositeNode(grammarAccess.getTransformAccess().getInstructionInstructionParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
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

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

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
    // InternalFTL.g:215:1: entryRuleInstruction returns [EObject current=null] : iv_ruleInstruction= ruleInstruction EOF ;
    public final EObject entryRuleInstruction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstruction = null;


        try {
            // InternalFTL.g:215:52: (iv_ruleInstruction= ruleInstruction EOF )
            // InternalFTL.g:216:2: iv_ruleInstruction= ruleInstruction EOF
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
    // InternalFTL.g:222:1: ruleInstruction returns [EObject current=null] : ( (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur | this_Grayscale_4= ruleGrayscale | this_Scale_5= ruleScale | this_Sharpen_6= ruleSharpen | this_Reverse_7= ruleReverse ) otherlv_8= ';' ) ;
    public final EObject ruleInstruction() throws RecognitionException {
        EObject current = null;

        Token otherlv_8=null;
        EObject this_Video_0 = null;

        EObject this_Audio_1 = null;

        EObject this_Sepia_2 = null;

        EObject this_Blur_3 = null;

        EObject this_Grayscale_4 = null;

        EObject this_Scale_5 = null;

        EObject this_Sharpen_6 = null;

        EObject this_Reverse_7 = null;



        	enterRule();

        try {
            // InternalFTL.g:228:2: ( ( (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur | this_Grayscale_4= ruleGrayscale | this_Scale_5= ruleScale | this_Sharpen_6= ruleSharpen | this_Reverse_7= ruleReverse ) otherlv_8= ';' ) )
            // InternalFTL.g:229:2: ( (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur | this_Grayscale_4= ruleGrayscale | this_Scale_5= ruleScale | this_Sharpen_6= ruleSharpen | this_Reverse_7= ruleReverse ) otherlv_8= ';' )
            {
            // InternalFTL.g:229:2: ( (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur | this_Grayscale_4= ruleGrayscale | this_Scale_5= ruleScale | this_Sharpen_6= ruleSharpen | this_Reverse_7= ruleReverse ) otherlv_8= ';' )
            // InternalFTL.g:230:3: (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur | this_Grayscale_4= ruleGrayscale | this_Scale_5= ruleScale | this_Sharpen_6= ruleSharpen | this_Reverse_7= ruleReverse ) otherlv_8= ';'
            {
            // InternalFTL.g:230:3: (this_Video_0= ruleVideo | this_Audio_1= ruleAudio | this_Sepia_2= ruleSepia | this_Blur_3= ruleBlur | this_Grayscale_4= ruleGrayscale | this_Scale_5= ruleScale | this_Sharpen_6= ruleSharpen | this_Reverse_7= ruleReverse )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 18:
                {
                alt3=3;
                }
                break;
            case 19:
                {
                alt3=4;
                }
                break;
            case 20:
                {
                alt3=5;
                }
                break;
            case 21:
                {
                alt3=6;
                }
                break;
            case 22:
                {
                alt3=7;
                }
                break;
            case 23:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFTL.g:231:4: this_Video_0= ruleVideo
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getVideoParserRuleCall_0_0());
                    			
                    pushFollow(FOLLOW_9);
                    this_Video_0=ruleVideo();

                    state._fsp--;


                    				current = this_Video_0;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 2 :
                    // InternalFTL.g:240:4: this_Audio_1= ruleAudio
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getAudioParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_9);
                    this_Audio_1=ruleAudio();

                    state._fsp--;


                    				current = this_Audio_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 3 :
                    // InternalFTL.g:249:4: this_Sepia_2= ruleSepia
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_2());
                    			
                    pushFollow(FOLLOW_9);
                    this_Sepia_2=ruleSepia();

                    state._fsp--;


                    				current = this_Sepia_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 4 :
                    // InternalFTL.g:258:4: this_Blur_3= ruleBlur
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_3());
                    			
                    pushFollow(FOLLOW_9);
                    this_Blur_3=ruleBlur();

                    state._fsp--;


                    				current = this_Blur_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 5 :
                    // InternalFTL.g:267:4: this_Grayscale_4= ruleGrayscale
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getGrayscaleParserRuleCall_0_4());
                    			
                    pushFollow(FOLLOW_9);
                    this_Grayscale_4=ruleGrayscale();

                    state._fsp--;


                    				current = this_Grayscale_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 6 :
                    // InternalFTL.g:276:4: this_Scale_5= ruleScale
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getScaleParserRuleCall_0_5());
                    			
                    pushFollow(FOLLOW_9);
                    this_Scale_5=ruleScale();

                    state._fsp--;


                    				current = this_Scale_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 7 :
                    // InternalFTL.g:285:4: this_Sharpen_6= ruleSharpen
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getSharpenParserRuleCall_0_6());
                    			
                    pushFollow(FOLLOW_9);
                    this_Sharpen_6=ruleSharpen();

                    state._fsp--;


                    				current = this_Sharpen_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;
                case 8 :
                    // InternalFTL.g:294:4: this_Reverse_7= ruleReverse
                    {

                    				newCompositeNode(grammarAccess.getInstructionAccess().getReverseParserRuleCall_0_7());
                    			
                    pushFollow(FOLLOW_9);
                    this_Reverse_7=ruleReverse();

                    state._fsp--;


                    				current = this_Reverse_7;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getInstructionAccess().getSemicolonKeyword_1());
            		

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
    // InternalFTL.g:311:1: entryRuleVideo returns [EObject current=null] : iv_ruleVideo= ruleVideo EOF ;
    public final EObject entryRuleVideo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideo = null;


        try {
            // InternalFTL.g:311:46: (iv_ruleVideo= ruleVideo EOF )
            // InternalFTL.g:312:2: iv_ruleVideo= ruleVideo EOF
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
    // InternalFTL.g:318:1: ruleVideo returns [EObject current=null] : (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleVideo() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_input_1_0=null;


        	enterRule();

        try {
            // InternalFTL.g:324:2: ( (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) ) )
            // InternalFTL.g:325:2: (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) )
            {
            // InternalFTL.g:325:2: (otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) ) )
            // InternalFTL.g:326:3: otherlv_0= 'video' ( (lv_input_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getVideoAccess().getVideoKeyword_0());
            		
            // InternalFTL.g:330:3: ( (lv_input_1_0= RULE_STRING ) )
            // InternalFTL.g:331:4: (lv_input_1_0= RULE_STRING )
            {
            // InternalFTL.g:331:4: (lv_input_1_0= RULE_STRING )
            // InternalFTL.g:332:5: lv_input_1_0= RULE_STRING
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
    // InternalFTL.g:352:1: entryRuleAudio returns [EObject current=null] : iv_ruleAudio= ruleAudio EOF ;
    public final EObject entryRuleAudio() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAudio = null;


        try {
            // InternalFTL.g:352:46: (iv_ruleAudio= ruleAudio EOF )
            // InternalFTL.g:353:2: iv_ruleAudio= ruleAudio EOF
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
    // InternalFTL.g:359:1: ruleAudio returns [EObject current=null] : (otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleAudio() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_input_1_0=null;


        	enterRule();

        try {
            // InternalFTL.g:365:2: ( (otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) ) ) )
            // InternalFTL.g:366:2: (otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) ) )
            {
            // InternalFTL.g:366:2: (otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) ) )
            // InternalFTL.g:367:3: otherlv_0= 'audio' ( (lv_input_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getAudioAccess().getAudioKeyword_0());
            		
            // InternalFTL.g:371:3: ( (lv_input_1_0= RULE_STRING ) )
            // InternalFTL.g:372:4: (lv_input_1_0= RULE_STRING )
            {
            // InternalFTL.g:372:4: (lv_input_1_0= RULE_STRING )
            // InternalFTL.g:373:5: lv_input_1_0= RULE_STRING
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
    // InternalFTL.g:393:1: entryRuleSepia returns [EObject current=null] : iv_ruleSepia= ruleSepia EOF ;
    public final EObject entryRuleSepia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSepia = null;


        try {
            // InternalFTL.g:393:46: (iv_ruleSepia= ruleSepia EOF )
            // InternalFTL.g:394:2: iv_ruleSepia= ruleSepia EOF
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
    // InternalFTL.g:400:1: ruleSepia returns [EObject current=null] : ( () otherlv_1= 'sepia' ) ;
    public final EObject ruleSepia() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:406:2: ( ( () otherlv_1= 'sepia' ) )
            // InternalFTL.g:407:2: ( () otherlv_1= 'sepia' )
            {
            // InternalFTL.g:407:2: ( () otherlv_1= 'sepia' )
            // InternalFTL.g:408:3: () otherlv_1= 'sepia'
            {
            // InternalFTL.g:408:3: ()
            // InternalFTL.g:409:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSepiaAccess().getSepiaAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

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
    // InternalFTL.g:423:1: entryRuleBlur returns [EObject current=null] : iv_ruleBlur= ruleBlur EOF ;
    public final EObject entryRuleBlur() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBlur = null;


        try {
            // InternalFTL.g:423:45: (iv_ruleBlur= ruleBlur EOF )
            // InternalFTL.g:424:2: iv_ruleBlur= ruleBlur EOF
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
    // InternalFTL.g:430:1: ruleBlur returns [EObject current=null] : (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) ) ;
    public final EObject ruleBlur() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_radius_1_0=null;


        	enterRule();

        try {
            // InternalFTL.g:436:2: ( (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) ) )
            // InternalFTL.g:437:2: (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) )
            {
            // InternalFTL.g:437:2: (otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) ) )
            // InternalFTL.g:438:3: otherlv_0= 'blur' ( (lv_radius_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getBlurAccess().getBlurKeyword_0());
            		
            // InternalFTL.g:442:3: ( (lv_radius_1_0= RULE_INT ) )
            // InternalFTL.g:443:4: (lv_radius_1_0= RULE_INT )
            {
            // InternalFTL.g:443:4: (lv_radius_1_0= RULE_INT )
            // InternalFTL.g:444:5: lv_radius_1_0= RULE_INT
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


    // $ANTLR start "entryRuleGrayscale"
    // InternalFTL.g:464:1: entryRuleGrayscale returns [EObject current=null] : iv_ruleGrayscale= ruleGrayscale EOF ;
    public final EObject entryRuleGrayscale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrayscale = null;


        try {
            // InternalFTL.g:464:50: (iv_ruleGrayscale= ruleGrayscale EOF )
            // InternalFTL.g:465:2: iv_ruleGrayscale= ruleGrayscale EOF
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
    // InternalFTL.g:471:1: ruleGrayscale returns [EObject current=null] : ( () otherlv_1= 'grayscale' ) ;
    public final EObject ruleGrayscale() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:477:2: ( ( () otherlv_1= 'grayscale' ) )
            // InternalFTL.g:478:2: ( () otherlv_1= 'grayscale' )
            {
            // InternalFTL.g:478:2: ( () otherlv_1= 'grayscale' )
            // InternalFTL.g:479:3: () otherlv_1= 'grayscale'
            {
            // InternalFTL.g:479:3: ()
            // InternalFTL.g:480:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getGrayscaleAccess().getGrayscaleAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

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
    // InternalFTL.g:494:1: entryRuleScale returns [EObject current=null] : iv_ruleScale= ruleScale EOF ;
    public final EObject entryRuleScale() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScale = null;


        try {
            // InternalFTL.g:494:46: (iv_ruleScale= ruleScale EOF )
            // InternalFTL.g:495:2: iv_ruleScale= ruleScale EOF
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
    // InternalFTL.g:501:1: ruleScale returns [EObject current=null] : (otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) ) ) ;
    public final EObject ruleScale() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_factor_1_0 = null;



        	enterRule();

        try {
            // InternalFTL.g:507:2: ( (otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) ) ) )
            // InternalFTL.g:508:2: (otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) ) )
            {
            // InternalFTL.g:508:2: (otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) ) )
            // InternalFTL.g:509:3: otherlv_0= 'scale' ( (lv_factor_1_0= ruleFloat ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getScaleAccess().getScaleKeyword_0());
            		
            // InternalFTL.g:513:3: ( (lv_factor_1_0= ruleFloat ) )
            // InternalFTL.g:514:4: (lv_factor_1_0= ruleFloat )
            {
            // InternalFTL.g:514:4: (lv_factor_1_0= ruleFloat )
            // InternalFTL.g:515:5: lv_factor_1_0= ruleFloat
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
    // InternalFTL.g:536:1: entryRuleSharpen returns [EObject current=null] : iv_ruleSharpen= ruleSharpen EOF ;
    public final EObject entryRuleSharpen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSharpen = null;


        try {
            // InternalFTL.g:536:48: (iv_ruleSharpen= ruleSharpen EOF )
            // InternalFTL.g:537:2: iv_ruleSharpen= ruleSharpen EOF
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
    // InternalFTL.g:543:1: ruleSharpen returns [EObject current=null] : ( () otherlv_1= 'sharpen' ) ;
    public final EObject ruleSharpen() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:549:2: ( ( () otherlv_1= 'sharpen' ) )
            // InternalFTL.g:550:2: ( () otherlv_1= 'sharpen' )
            {
            // InternalFTL.g:550:2: ( () otherlv_1= 'sharpen' )
            // InternalFTL.g:551:3: () otherlv_1= 'sharpen'
            {
            // InternalFTL.g:551:3: ()
            // InternalFTL.g:552:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSharpenAccess().getSharpenAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalFTL.g:566:1: entryRuleReverse returns [EObject current=null] : iv_ruleReverse= ruleReverse EOF ;
    public final EObject entryRuleReverse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverse = null;


        try {
            // InternalFTL.g:566:48: (iv_ruleReverse= ruleReverse EOF )
            // InternalFTL.g:567:2: iv_ruleReverse= ruleReverse EOF
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
    // InternalFTL.g:573:1: ruleReverse returns [EObject current=null] : ( () otherlv_1= 'reverse' ) ;
    public final EObject ruleReverse() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalFTL.g:579:2: ( ( () otherlv_1= 'reverse' ) )
            // InternalFTL.g:580:2: ( () otherlv_1= 'reverse' )
            {
            // InternalFTL.g:580:2: ( () otherlv_1= 'reverse' )
            // InternalFTL.g:581:3: () otherlv_1= 'reverse'
            {
            // InternalFTL.g:581:3: ()
            // InternalFTL.g:582:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getReverseAccess().getReverseAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,23,FOLLOW_2); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000FF4000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});

}