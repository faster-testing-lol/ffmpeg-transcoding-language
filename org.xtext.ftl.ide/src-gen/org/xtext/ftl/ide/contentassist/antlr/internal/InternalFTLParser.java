package org.xtext.ftl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.ftl.services.FTLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalFTLParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(FTLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalFTL.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalFTL.g:54:1: ( ruleProgram EOF )
            // InternalFTL.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalFTL.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalFTL.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalFTL.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalFTL.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalFTL.g:69:3: ( rule__Program__Group__0 )
            // InternalFTL.g:69:4: rule__Program__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProgramAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleTransform"
    // InternalFTL.g:78:1: entryRuleTransform : ruleTransform EOF ;
    public final void entryRuleTransform() throws RecognitionException {
        try {
            // InternalFTL.g:79:1: ( ruleTransform EOF )
            // InternalFTL.g:80:1: ruleTransform EOF
            {
             before(grammarAccess.getTransformRule()); 
            pushFollow(FOLLOW_1);
            ruleTransform();

            state._fsp--;

             after(grammarAccess.getTransformRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransform"


    // $ANTLR start "ruleTransform"
    // InternalFTL.g:87:1: ruleTransform : ( ( rule__Transform__Group__0 ) ) ;
    public final void ruleTransform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:91:2: ( ( ( rule__Transform__Group__0 ) ) )
            // InternalFTL.g:92:2: ( ( rule__Transform__Group__0 ) )
            {
            // InternalFTL.g:92:2: ( ( rule__Transform__Group__0 ) )
            // InternalFTL.g:93:3: ( rule__Transform__Group__0 )
            {
             before(grammarAccess.getTransformAccess().getGroup()); 
            // InternalFTL.g:94:3: ( rule__Transform__Group__0 )
            // InternalFTL.g:94:4: rule__Transform__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Transform__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransformAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransform"


    // $ANTLR start "entryRuleInstruction"
    // InternalFTL.g:103:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalFTL.g:104:1: ( ruleInstruction EOF )
            // InternalFTL.g:105:1: ruleInstruction EOF
            {
             before(grammarAccess.getInstructionRule()); 
            pushFollow(FOLLOW_1);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getInstructionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInstruction"


    // $ANTLR start "ruleInstruction"
    // InternalFTL.g:112:1: ruleInstruction : ( ( rule__Instruction__Group__0 ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:116:2: ( ( ( rule__Instruction__Group__0 ) ) )
            // InternalFTL.g:117:2: ( ( rule__Instruction__Group__0 ) )
            {
            // InternalFTL.g:117:2: ( ( rule__Instruction__Group__0 ) )
            // InternalFTL.g:118:3: ( rule__Instruction__Group__0 )
            {
             before(grammarAccess.getInstructionAccess().getGroup()); 
            // InternalFTL.g:119:3: ( rule__Instruction__Group__0 )
            // InternalFTL.g:119:4: rule__Instruction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInstruction"


    // $ANTLR start "entryRuleVideo"
    // InternalFTL.g:128:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalFTL.g:129:1: ( ruleVideo EOF )
            // InternalFTL.g:130:1: ruleVideo EOF
            {
             before(grammarAccess.getVideoRule()); 
            pushFollow(FOLLOW_1);
            ruleVideo();

            state._fsp--;

             after(grammarAccess.getVideoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVideo"


    // $ANTLR start "ruleVideo"
    // InternalFTL.g:137:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:141:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalFTL.g:142:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalFTL.g:142:2: ( ( rule__Video__Group__0 ) )
            // InternalFTL.g:143:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalFTL.g:144:3: ( rule__Video__Group__0 )
            // InternalFTL.g:144:4: rule__Video__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideo"


    // $ANTLR start "entryRuleAudio"
    // InternalFTL.g:153:1: entryRuleAudio : ruleAudio EOF ;
    public final void entryRuleAudio() throws RecognitionException {
        try {
            // InternalFTL.g:154:1: ( ruleAudio EOF )
            // InternalFTL.g:155:1: ruleAudio EOF
            {
             before(grammarAccess.getAudioRule()); 
            pushFollow(FOLLOW_1);
            ruleAudio();

            state._fsp--;

             after(grammarAccess.getAudioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAudio"


    // $ANTLR start "ruleAudio"
    // InternalFTL.g:162:1: ruleAudio : ( ( rule__Audio__Group__0 ) ) ;
    public final void ruleAudio() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:166:2: ( ( ( rule__Audio__Group__0 ) ) )
            // InternalFTL.g:167:2: ( ( rule__Audio__Group__0 ) )
            {
            // InternalFTL.g:167:2: ( ( rule__Audio__Group__0 ) )
            // InternalFTL.g:168:3: ( rule__Audio__Group__0 )
            {
             before(grammarAccess.getAudioAccess().getGroup()); 
            // InternalFTL.g:169:3: ( rule__Audio__Group__0 )
            // InternalFTL.g:169:4: rule__Audio__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAudio"


    // $ANTLR start "entryRuleSepia"
    // InternalFTL.g:178:1: entryRuleSepia : ruleSepia EOF ;
    public final void entryRuleSepia() throws RecognitionException {
        try {
            // InternalFTL.g:179:1: ( ruleSepia EOF )
            // InternalFTL.g:180:1: ruleSepia EOF
            {
             before(grammarAccess.getSepiaRule()); 
            pushFollow(FOLLOW_1);
            ruleSepia();

            state._fsp--;

             after(grammarAccess.getSepiaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSepia"


    // $ANTLR start "ruleSepia"
    // InternalFTL.g:187:1: ruleSepia : ( ( rule__Sepia__Group__0 ) ) ;
    public final void ruleSepia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:191:2: ( ( ( rule__Sepia__Group__0 ) ) )
            // InternalFTL.g:192:2: ( ( rule__Sepia__Group__0 ) )
            {
            // InternalFTL.g:192:2: ( ( rule__Sepia__Group__0 ) )
            // InternalFTL.g:193:3: ( rule__Sepia__Group__0 )
            {
             before(grammarAccess.getSepiaAccess().getGroup()); 
            // InternalFTL.g:194:3: ( rule__Sepia__Group__0 )
            // InternalFTL.g:194:4: rule__Sepia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sepia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSepiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSepia"


    // $ANTLR start "entryRuleBlur"
    // InternalFTL.g:203:1: entryRuleBlur : ruleBlur EOF ;
    public final void entryRuleBlur() throws RecognitionException {
        try {
            // InternalFTL.g:204:1: ( ruleBlur EOF )
            // InternalFTL.g:205:1: ruleBlur EOF
            {
             before(grammarAccess.getBlurRule()); 
            pushFollow(FOLLOW_1);
            ruleBlur();

            state._fsp--;

             after(grammarAccess.getBlurRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBlur"


    // $ANTLR start "ruleBlur"
    // InternalFTL.g:212:1: ruleBlur : ( ( rule__Blur__Group__0 ) ) ;
    public final void ruleBlur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:216:2: ( ( ( rule__Blur__Group__0 ) ) )
            // InternalFTL.g:217:2: ( ( rule__Blur__Group__0 ) )
            {
            // InternalFTL.g:217:2: ( ( rule__Blur__Group__0 ) )
            // InternalFTL.g:218:3: ( rule__Blur__Group__0 )
            {
             before(grammarAccess.getBlurAccess().getGroup()); 
            // InternalFTL.g:219:3: ( rule__Blur__Group__0 )
            // InternalFTL.g:219:4: rule__Blur__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Blur__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBlurAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBlur"


    // $ANTLR start "rule__Instruction__Alternatives_0"
    // InternalFTL.g:227:1: rule__Instruction__Alternatives_0 : ( ( ruleVideo ) | ( ruleAudio ) | ( ruleSepia ) | ( ruleBlur ) );
    public final void rule__Instruction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:231:1: ( ( ruleVideo ) | ( ruleAudio ) | ( ruleSepia ) | ( ruleBlur ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalFTL.g:232:2: ( ruleVideo )
                    {
                    // InternalFTL.g:232:2: ( ruleVideo )
                    // InternalFTL.g:233:3: ruleVideo
                    {
                     before(grammarAccess.getInstructionAccess().getVideoParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVideo();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getVideoParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFTL.g:238:2: ( ruleAudio )
                    {
                    // InternalFTL.g:238:2: ( ruleAudio )
                    // InternalFTL.g:239:3: ruleAudio
                    {
                     before(grammarAccess.getInstructionAccess().getAudioParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAudio();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getAudioParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFTL.g:244:2: ( ruleSepia )
                    {
                    // InternalFTL.g:244:2: ( ruleSepia )
                    // InternalFTL.g:245:3: ruleSepia
                    {
                     before(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleSepia();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalFTL.g:250:2: ( ruleBlur )
                    {
                    // InternalFTL.g:250:2: ( ruleBlur )
                    // InternalFTL.g:251:3: ruleBlur
                    {
                     before(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_3()); 
                    pushFollow(FOLLOW_2);
                    ruleBlur();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Alternatives_0"


    // $ANTLR start "rule__Program__Group__0"
    // InternalFTL.g:260:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:264:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalFTL.g:265:2: rule__Program__Group__0__Impl rule__Program__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0"


    // $ANTLR start "rule__Program__Group__0__Impl"
    // InternalFTL.g:272:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:276:1: ( ( () ) )
            // InternalFTL.g:277:1: ( () )
            {
            // InternalFTL.g:277:1: ( () )
            // InternalFTL.g:278:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalFTL.g:279:2: ()
            // InternalFTL.g:279:3: 
            {
            }

             after(grammarAccess.getProgramAccess().getProgramAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__0__Impl"


    // $ANTLR start "rule__Program__Group__1"
    // InternalFTL.g:287:1: rule__Program__Group__1 : rule__Program__Group__1__Impl ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:291:1: ( rule__Program__Group__1__Impl )
            // InternalFTL.g:292:2: rule__Program__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1"


    // $ANTLR start "rule__Program__Group__1__Impl"
    // InternalFTL.g:298:1: rule__Program__Group__1__Impl : ( ( rule__Program__TransformsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:302:1: ( ( ( rule__Program__TransformsAssignment_1 )* ) )
            // InternalFTL.g:303:1: ( ( rule__Program__TransformsAssignment_1 )* )
            {
            // InternalFTL.g:303:1: ( ( rule__Program__TransformsAssignment_1 )* )
            // InternalFTL.g:304:2: ( rule__Program__TransformsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getTransformsAssignment_1()); 
            // InternalFTL.g:305:2: ( rule__Program__TransformsAssignment_1 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_STRING) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalFTL.g:305:3: rule__Program__TransformsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__TransformsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getTransformsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Group__1__Impl"


    // $ANTLR start "rule__Transform__Group__0"
    // InternalFTL.g:314:1: rule__Transform__Group__0 : rule__Transform__Group__0__Impl rule__Transform__Group__1 ;
    public final void rule__Transform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:318:1: ( rule__Transform__Group__0__Impl rule__Transform__Group__1 )
            // InternalFTL.g:319:2: rule__Transform__Group__0__Impl rule__Transform__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Transform__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transform__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__0"


    // $ANTLR start "rule__Transform__Group__0__Impl"
    // InternalFTL.g:326:1: rule__Transform__Group__0__Impl : ( ( rule__Transform__OutputAssignment_0 ) ) ;
    public final void rule__Transform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:330:1: ( ( ( rule__Transform__OutputAssignment_0 ) ) )
            // InternalFTL.g:331:1: ( ( rule__Transform__OutputAssignment_0 ) )
            {
            // InternalFTL.g:331:1: ( ( rule__Transform__OutputAssignment_0 ) )
            // InternalFTL.g:332:2: ( rule__Transform__OutputAssignment_0 )
            {
             before(grammarAccess.getTransformAccess().getOutputAssignment_0()); 
            // InternalFTL.g:333:2: ( rule__Transform__OutputAssignment_0 )
            // InternalFTL.g:333:3: rule__Transform__OutputAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Transform__OutputAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTransformAccess().getOutputAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__0__Impl"


    // $ANTLR start "rule__Transform__Group__1"
    // InternalFTL.g:341:1: rule__Transform__Group__1 : rule__Transform__Group__1__Impl rule__Transform__Group__2 ;
    public final void rule__Transform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:345:1: ( rule__Transform__Group__1__Impl rule__Transform__Group__2 )
            // InternalFTL.g:346:2: rule__Transform__Group__1__Impl rule__Transform__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__Transform__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transform__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__1"


    // $ANTLR start "rule__Transform__Group__1__Impl"
    // InternalFTL.g:353:1: rule__Transform__Group__1__Impl : ( '=' ) ;
    public final void rule__Transform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:357:1: ( ( '=' ) )
            // InternalFTL.g:358:1: ( '=' )
            {
            // InternalFTL.g:358:1: ( '=' )
            // InternalFTL.g:359:2: '='
            {
             before(grammarAccess.getTransformAccess().getEqualsSignKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getTransformAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__1__Impl"


    // $ANTLR start "rule__Transform__Group__2"
    // InternalFTL.g:368:1: rule__Transform__Group__2 : rule__Transform__Group__2__Impl rule__Transform__Group__3 ;
    public final void rule__Transform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:372:1: ( rule__Transform__Group__2__Impl rule__Transform__Group__3 )
            // InternalFTL.g:373:2: rule__Transform__Group__2__Impl rule__Transform__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Transform__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transform__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__2"


    // $ANTLR start "rule__Transform__Group__2__Impl"
    // InternalFTL.g:380:1: rule__Transform__Group__2__Impl : ( '{' ) ;
    public final void rule__Transform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:384:1: ( ( '{' ) )
            // InternalFTL.g:385:1: ( '{' )
            {
            // InternalFTL.g:385:1: ( '{' )
            // InternalFTL.g:386:2: '{'
            {
             before(grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__2__Impl"


    // $ANTLR start "rule__Transform__Group__3"
    // InternalFTL.g:395:1: rule__Transform__Group__3 : rule__Transform__Group__3__Impl rule__Transform__Group__4 ;
    public final void rule__Transform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:399:1: ( rule__Transform__Group__3__Impl rule__Transform__Group__4 )
            // InternalFTL.g:400:2: rule__Transform__Group__3__Impl rule__Transform__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Transform__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Transform__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__3"


    // $ANTLR start "rule__Transform__Group__3__Impl"
    // InternalFTL.g:407:1: rule__Transform__Group__3__Impl : ( ( rule__Transform__InstructionAssignment_3 )* ) ;
    public final void rule__Transform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:411:1: ( ( ( rule__Transform__InstructionAssignment_3 )* ) )
            // InternalFTL.g:412:1: ( ( rule__Transform__InstructionAssignment_3 )* )
            {
            // InternalFTL.g:412:1: ( ( rule__Transform__InstructionAssignment_3 )* )
            // InternalFTL.g:413:2: ( rule__Transform__InstructionAssignment_3 )*
            {
             before(grammarAccess.getTransformAccess().getInstructionAssignment_3()); 
            // InternalFTL.g:414:2: ( rule__Transform__InstructionAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=15 && LA3_0<=18)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalFTL.g:414:3: rule__Transform__InstructionAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Transform__InstructionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getTransformAccess().getInstructionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__3__Impl"


    // $ANTLR start "rule__Transform__Group__4"
    // InternalFTL.g:422:1: rule__Transform__Group__4 : rule__Transform__Group__4__Impl ;
    public final void rule__Transform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:426:1: ( rule__Transform__Group__4__Impl )
            // InternalFTL.g:427:2: rule__Transform__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Transform__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__4"


    // $ANTLR start "rule__Transform__Group__4__Impl"
    // InternalFTL.g:433:1: rule__Transform__Group__4__Impl : ( '}' ) ;
    public final void rule__Transform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:437:1: ( ( '}' ) )
            // InternalFTL.g:438:1: ( '}' )
            {
            // InternalFTL.g:438:1: ( '}' )
            // InternalFTL.g:439:2: '}'
            {
             before(grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__Group__4__Impl"


    // $ANTLR start "rule__Instruction__Group__0"
    // InternalFTL.g:449:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:453:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // InternalFTL.g:454:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Instruction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Instruction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__0"


    // $ANTLR start "rule__Instruction__Group__0__Impl"
    // InternalFTL.g:461:1: rule__Instruction__Group__0__Impl : ( ( rule__Instruction__Alternatives_0 ) ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:465:1: ( ( ( rule__Instruction__Alternatives_0 ) ) )
            // InternalFTL.g:466:1: ( ( rule__Instruction__Alternatives_0 ) )
            {
            // InternalFTL.g:466:1: ( ( rule__Instruction__Alternatives_0 ) )
            // InternalFTL.g:467:2: ( rule__Instruction__Alternatives_0 )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives_0()); 
            // InternalFTL.g:468:2: ( rule__Instruction__Alternatives_0 )
            // InternalFTL.g:468:3: rule__Instruction__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInstructionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__0__Impl"


    // $ANTLR start "rule__Instruction__Group__1"
    // InternalFTL.g:476:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:480:1: ( rule__Instruction__Group__1__Impl )
            // InternalFTL.g:481:2: rule__Instruction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Instruction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__1"


    // $ANTLR start "rule__Instruction__Group__1__Impl"
    // InternalFTL.g:487:1: rule__Instruction__Group__1__Impl : ( ';' ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:491:1: ( ( ';' ) )
            // InternalFTL.g:492:1: ( ';' )
            {
            // InternalFTL.g:492:1: ( ';' )
            // InternalFTL.g:493:2: ';'
            {
             before(grammarAccess.getInstructionAccess().getSemicolonKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getInstructionAccess().getSemicolonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Instruction__Group__1__Impl"


    // $ANTLR start "rule__Video__Group__0"
    // InternalFTL.g:503:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:507:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalFTL.g:508:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Video__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Video__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0"


    // $ANTLR start "rule__Video__Group__0__Impl"
    // InternalFTL.g:515:1: rule__Video__Group__0__Impl : ( 'video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:519:1: ( ( 'video' ) )
            // InternalFTL.g:520:1: ( 'video' )
            {
            // InternalFTL.g:520:1: ( 'video' )
            // InternalFTL.g:521:2: 'video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getVideoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__0__Impl"


    // $ANTLR start "rule__Video__Group__1"
    // InternalFTL.g:530:1: rule__Video__Group__1 : rule__Video__Group__1__Impl ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:534:1: ( rule__Video__Group__1__Impl )
            // InternalFTL.g:535:2: rule__Video__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Video__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1"


    // $ANTLR start "rule__Video__Group__1__Impl"
    // InternalFTL.g:541:1: rule__Video__Group__1__Impl : ( ( rule__Video__InputAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:545:1: ( ( ( rule__Video__InputAssignment_1 ) ) )
            // InternalFTL.g:546:1: ( ( rule__Video__InputAssignment_1 ) )
            {
            // InternalFTL.g:546:1: ( ( rule__Video__InputAssignment_1 ) )
            // InternalFTL.g:547:2: ( rule__Video__InputAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getInputAssignment_1()); 
            // InternalFTL.g:548:2: ( rule__Video__InputAssignment_1 )
            // InternalFTL.g:548:3: rule__Video__InputAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Video__InputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVideoAccess().getInputAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__Group__1__Impl"


    // $ANTLR start "rule__Audio__Group__0"
    // InternalFTL.g:557:1: rule__Audio__Group__0 : rule__Audio__Group__0__Impl rule__Audio__Group__1 ;
    public final void rule__Audio__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:561:1: ( rule__Audio__Group__0__Impl rule__Audio__Group__1 )
            // InternalFTL.g:562:2: rule__Audio__Group__0__Impl rule__Audio__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Audio__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Audio__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__0"


    // $ANTLR start "rule__Audio__Group__0__Impl"
    // InternalFTL.g:569:1: rule__Audio__Group__0__Impl : ( 'audio' ) ;
    public final void rule__Audio__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:573:1: ( ( 'audio' ) )
            // InternalFTL.g:574:1: ( 'audio' )
            {
            // InternalFTL.g:574:1: ( 'audio' )
            // InternalFTL.g:575:2: 'audio'
            {
             before(grammarAccess.getAudioAccess().getAudioKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getAudioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__0__Impl"


    // $ANTLR start "rule__Audio__Group__1"
    // InternalFTL.g:584:1: rule__Audio__Group__1 : rule__Audio__Group__1__Impl ;
    public final void rule__Audio__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:588:1: ( rule__Audio__Group__1__Impl )
            // InternalFTL.g:589:2: rule__Audio__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Audio__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__1"


    // $ANTLR start "rule__Audio__Group__1__Impl"
    // InternalFTL.g:595:1: rule__Audio__Group__1__Impl : ( ( rule__Audio__InputAssignment_1 ) ) ;
    public final void rule__Audio__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:599:1: ( ( ( rule__Audio__InputAssignment_1 ) ) )
            // InternalFTL.g:600:1: ( ( rule__Audio__InputAssignment_1 ) )
            {
            // InternalFTL.g:600:1: ( ( rule__Audio__InputAssignment_1 ) )
            // InternalFTL.g:601:2: ( rule__Audio__InputAssignment_1 )
            {
             before(grammarAccess.getAudioAccess().getInputAssignment_1()); 
            // InternalFTL.g:602:2: ( rule__Audio__InputAssignment_1 )
            // InternalFTL.g:602:3: rule__Audio__InputAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Audio__InputAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAudioAccess().getInputAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__Group__1__Impl"


    // $ANTLR start "rule__Sepia__Group__0"
    // InternalFTL.g:611:1: rule__Sepia__Group__0 : rule__Sepia__Group__0__Impl rule__Sepia__Group__1 ;
    public final void rule__Sepia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:615:1: ( rule__Sepia__Group__0__Impl rule__Sepia__Group__1 )
            // InternalFTL.g:616:2: rule__Sepia__Group__0__Impl rule__Sepia__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Sepia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sepia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sepia__Group__0"


    // $ANTLR start "rule__Sepia__Group__0__Impl"
    // InternalFTL.g:623:1: rule__Sepia__Group__0__Impl : ( () ) ;
    public final void rule__Sepia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:627:1: ( ( () ) )
            // InternalFTL.g:628:1: ( () )
            {
            // InternalFTL.g:628:1: ( () )
            // InternalFTL.g:629:2: ()
            {
             before(grammarAccess.getSepiaAccess().getSepiaAction_0()); 
            // InternalFTL.g:630:2: ()
            // InternalFTL.g:630:3: 
            {
            }

             after(grammarAccess.getSepiaAccess().getSepiaAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sepia__Group__0__Impl"


    // $ANTLR start "rule__Sepia__Group__1"
    // InternalFTL.g:638:1: rule__Sepia__Group__1 : rule__Sepia__Group__1__Impl ;
    public final void rule__Sepia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:642:1: ( rule__Sepia__Group__1__Impl )
            // InternalFTL.g:643:2: rule__Sepia__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sepia__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sepia__Group__1"


    // $ANTLR start "rule__Sepia__Group__1__Impl"
    // InternalFTL.g:649:1: rule__Sepia__Group__1__Impl : ( 'sepia' ) ;
    public final void rule__Sepia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:653:1: ( ( 'sepia' ) )
            // InternalFTL.g:654:1: ( 'sepia' )
            {
            // InternalFTL.g:654:1: ( 'sepia' )
            // InternalFTL.g:655:2: 'sepia'
            {
             before(grammarAccess.getSepiaAccess().getSepiaKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSepiaAccess().getSepiaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sepia__Group__1__Impl"


    // $ANTLR start "rule__Blur__Group__0"
    // InternalFTL.g:665:1: rule__Blur__Group__0 : rule__Blur__Group__0__Impl rule__Blur__Group__1 ;
    public final void rule__Blur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:669:1: ( rule__Blur__Group__0__Impl rule__Blur__Group__1 )
            // InternalFTL.g:670:2: rule__Blur__Group__0__Impl rule__Blur__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Blur__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Blur__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blur__Group__0"


    // $ANTLR start "rule__Blur__Group__0__Impl"
    // InternalFTL.g:677:1: rule__Blur__Group__0__Impl : ( 'blur' ) ;
    public final void rule__Blur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:681:1: ( ( 'blur' ) )
            // InternalFTL.g:682:1: ( 'blur' )
            {
            // InternalFTL.g:682:1: ( 'blur' )
            // InternalFTL.g:683:2: 'blur'
            {
             before(grammarAccess.getBlurAccess().getBlurKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getBlurAccess().getBlurKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blur__Group__0__Impl"


    // $ANTLR start "rule__Blur__Group__1"
    // InternalFTL.g:692:1: rule__Blur__Group__1 : rule__Blur__Group__1__Impl ;
    public final void rule__Blur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:696:1: ( rule__Blur__Group__1__Impl )
            // InternalFTL.g:697:2: rule__Blur__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Blur__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blur__Group__1"


    // $ANTLR start "rule__Blur__Group__1__Impl"
    // InternalFTL.g:703:1: rule__Blur__Group__1__Impl : ( ( rule__Blur__RadiusAssignment_1 ) ) ;
    public final void rule__Blur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:707:1: ( ( ( rule__Blur__RadiusAssignment_1 ) ) )
            // InternalFTL.g:708:1: ( ( rule__Blur__RadiusAssignment_1 ) )
            {
            // InternalFTL.g:708:1: ( ( rule__Blur__RadiusAssignment_1 ) )
            // InternalFTL.g:709:2: ( rule__Blur__RadiusAssignment_1 )
            {
             before(grammarAccess.getBlurAccess().getRadiusAssignment_1()); 
            // InternalFTL.g:710:2: ( rule__Blur__RadiusAssignment_1 )
            // InternalFTL.g:710:3: rule__Blur__RadiusAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Blur__RadiusAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBlurAccess().getRadiusAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blur__Group__1__Impl"


    // $ANTLR start "rule__Program__TransformsAssignment_1"
    // InternalFTL.g:719:1: rule__Program__TransformsAssignment_1 : ( ruleTransform ) ;
    public final void rule__Program__TransformsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:723:1: ( ( ruleTransform ) )
            // InternalFTL.g:724:2: ( ruleTransform )
            {
            // InternalFTL.g:724:2: ( ruleTransform )
            // InternalFTL.g:725:3: ruleTransform
            {
             before(grammarAccess.getProgramAccess().getTransformsTransformParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTransform();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getTransformsTransformParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__TransformsAssignment_1"


    // $ANTLR start "rule__Transform__OutputAssignment_0"
    // InternalFTL.g:734:1: rule__Transform__OutputAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Transform__OutputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:738:1: ( ( RULE_STRING ) )
            // InternalFTL.g:739:2: ( RULE_STRING )
            {
            // InternalFTL.g:739:2: ( RULE_STRING )
            // InternalFTL.g:740:3: RULE_STRING
            {
             before(grammarAccess.getTransformAccess().getOutputSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTransformAccess().getOutputSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__OutputAssignment_0"


    // $ANTLR start "rule__Transform__InstructionAssignment_3"
    // InternalFTL.g:749:1: rule__Transform__InstructionAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Transform__InstructionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:753:1: ( ( ruleInstruction ) )
            // InternalFTL.g:754:2: ( ruleInstruction )
            {
            // InternalFTL.g:754:2: ( ruleInstruction )
            // InternalFTL.g:755:3: ruleInstruction
            {
             before(grammarAccess.getTransformAccess().getInstructionInstructionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleInstruction();

            state._fsp--;

             after(grammarAccess.getTransformAccess().getInstructionInstructionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transform__InstructionAssignment_3"


    // $ANTLR start "rule__Video__InputAssignment_1"
    // InternalFTL.g:764:1: rule__Video__InputAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Video__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:768:1: ( ( RULE_STRING ) )
            // InternalFTL.g:769:2: ( RULE_STRING )
            {
            // InternalFTL.g:769:2: ( RULE_STRING )
            // InternalFTL.g:770:3: RULE_STRING
            {
             before(grammarAccess.getVideoAccess().getInputSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getVideoAccess().getInputSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Video__InputAssignment_1"


    // $ANTLR start "rule__Audio__InputAssignment_1"
    // InternalFTL.g:779:1: rule__Audio__InputAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Audio__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:783:1: ( ( RULE_STRING ) )
            // InternalFTL.g:784:2: ( RULE_STRING )
            {
            // InternalFTL.g:784:2: ( RULE_STRING )
            // InternalFTL.g:785:3: RULE_STRING
            {
             before(grammarAccess.getAudioAccess().getInputSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAudioAccess().getInputSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Audio__InputAssignment_1"


    // $ANTLR start "rule__Blur__RadiusAssignment_1"
    // InternalFTL.g:794:1: rule__Blur__RadiusAssignment_1 : ( RULE_INT ) ;
    public final void rule__Blur__RadiusAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:798:1: ( ( RULE_INT ) )
            // InternalFTL.g:799:2: ( RULE_INT )
            {
            // InternalFTL.g:799:2: ( RULE_INT )
            // InternalFTL.g:800:3: RULE_INT
            {
             before(grammarAccess.getBlurAccess().getRadiusINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBlurAccess().getRadiusINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Blur__RadiusAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000007A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000078002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});

}