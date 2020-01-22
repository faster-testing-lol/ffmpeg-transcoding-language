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


    // $ANTLR start "entryRuleStream"
    // InternalFTL.g:78:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // InternalFTL.g:79:1: ( ruleStream EOF )
            // InternalFTL.g:80:1: ruleStream EOF
            {
             before(grammarAccess.getStreamRule()); 
            pushFollow(FOLLOW_1);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getStreamRule()); 
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
    // $ANTLR end "entryRuleStream"


    // $ANTLR start "ruleStream"
    // InternalFTL.g:87:1: ruleStream : ( ( rule__Stream__Alternatives ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:91:2: ( ( ( rule__Stream__Alternatives ) ) )
            // InternalFTL.g:92:2: ( ( rule__Stream__Alternatives ) )
            {
            // InternalFTL.g:92:2: ( ( rule__Stream__Alternatives ) )
            // InternalFTL.g:93:3: ( rule__Stream__Alternatives )
            {
             before(grammarAccess.getStreamAccess().getAlternatives()); 
            // InternalFTL.g:94:3: ( rule__Stream__Alternatives )
            // InternalFTL.g:94:4: rule__Stream__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Stream__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStreamAccess().getAlternatives()); 

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
    // $ANTLR end "ruleStream"


    // $ANTLR start "entryRuleIn"
    // InternalFTL.g:103:1: entryRuleIn : ruleIn EOF ;
    public final void entryRuleIn() throws RecognitionException {
        try {
            // InternalFTL.g:104:1: ( ruleIn EOF )
            // InternalFTL.g:105:1: ruleIn EOF
            {
             before(grammarAccess.getInRule()); 
            pushFollow(FOLLOW_1);
            ruleIn();

            state._fsp--;

             after(grammarAccess.getInRule()); 
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
    // $ANTLR end "entryRuleIn"


    // $ANTLR start "ruleIn"
    // InternalFTL.g:112:1: ruleIn : ( ( rule__In__Group__0 ) ) ;
    public final void ruleIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:116:2: ( ( ( rule__In__Group__0 ) ) )
            // InternalFTL.g:117:2: ( ( rule__In__Group__0 ) )
            {
            // InternalFTL.g:117:2: ( ( rule__In__Group__0 ) )
            // InternalFTL.g:118:3: ( rule__In__Group__0 )
            {
             before(grammarAccess.getInAccess().getGroup()); 
            // InternalFTL.g:119:3: ( rule__In__Group__0 )
            // InternalFTL.g:119:4: rule__In__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__In__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInAccess().getGroup()); 

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
    // $ANTLR end "ruleIn"


    // $ANTLR start "entryRuleOutputStream"
    // InternalFTL.g:128:1: entryRuleOutputStream : ruleOutputStream EOF ;
    public final void entryRuleOutputStream() throws RecognitionException {
        try {
            // InternalFTL.g:129:1: ( ruleOutputStream EOF )
            // InternalFTL.g:130:1: ruleOutputStream EOF
            {
             before(grammarAccess.getOutputStreamRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputStream();

            state._fsp--;

             after(grammarAccess.getOutputStreamRule()); 
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
    // $ANTLR end "entryRuleOutputStream"


    // $ANTLR start "ruleOutputStream"
    // InternalFTL.g:137:1: ruleOutputStream : ( ( rule__OutputStream__Alternatives ) ) ;
    public final void ruleOutputStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:141:2: ( ( ( rule__OutputStream__Alternatives ) ) )
            // InternalFTL.g:142:2: ( ( rule__OutputStream__Alternatives ) )
            {
            // InternalFTL.g:142:2: ( ( rule__OutputStream__Alternatives ) )
            // InternalFTL.g:143:3: ( rule__OutputStream__Alternatives )
            {
             before(grammarAccess.getOutputStreamAccess().getAlternatives()); 
            // InternalFTL.g:144:3: ( rule__OutputStream__Alternatives )
            // InternalFTL.g:144:4: rule__OutputStream__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OutputStream__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOutputStreamAccess().getAlternatives()); 

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
    // $ANTLR end "ruleOutputStream"


    // $ANTLR start "entryRuleOut"
    // InternalFTL.g:153:1: entryRuleOut : ruleOut EOF ;
    public final void entryRuleOut() throws RecognitionException {
        try {
            // InternalFTL.g:154:1: ( ruleOut EOF )
            // InternalFTL.g:155:1: ruleOut EOF
            {
             before(grammarAccess.getOutRule()); 
            pushFollow(FOLLOW_1);
            ruleOut();

            state._fsp--;

             after(grammarAccess.getOutRule()); 
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
    // $ANTLR end "entryRuleOut"


    // $ANTLR start "ruleOut"
    // InternalFTL.g:162:1: ruleOut : ( ( rule__Out__Group__0 ) ) ;
    public final void ruleOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:166:2: ( ( ( rule__Out__Group__0 ) ) )
            // InternalFTL.g:167:2: ( ( rule__Out__Group__0 ) )
            {
            // InternalFTL.g:167:2: ( ( rule__Out__Group__0 ) )
            // InternalFTL.g:168:3: ( rule__Out__Group__0 )
            {
             before(grammarAccess.getOutAccess().getGroup()); 
            // InternalFTL.g:169:3: ( rule__Out__Group__0 )
            // InternalFTL.g:169:4: rule__Out__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Out__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutAccess().getGroup()); 

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
    // $ANTLR end "ruleOut"


    // $ANTLR start "entryRuleTemp"
    // InternalFTL.g:178:1: entryRuleTemp : ruleTemp EOF ;
    public final void entryRuleTemp() throws RecognitionException {
        try {
            // InternalFTL.g:179:1: ( ruleTemp EOF )
            // InternalFTL.g:180:1: ruleTemp EOF
            {
             before(grammarAccess.getTempRule()); 
            pushFollow(FOLLOW_1);
            ruleTemp();

            state._fsp--;

             after(grammarAccess.getTempRule()); 
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
    // $ANTLR end "entryRuleTemp"


    // $ANTLR start "ruleTemp"
    // InternalFTL.g:187:1: ruleTemp : ( ( rule__Temp__Group__0 ) ) ;
    public final void ruleTemp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:191:2: ( ( ( rule__Temp__Group__0 ) ) )
            // InternalFTL.g:192:2: ( ( rule__Temp__Group__0 ) )
            {
            // InternalFTL.g:192:2: ( ( rule__Temp__Group__0 ) )
            // InternalFTL.g:193:3: ( rule__Temp__Group__0 )
            {
             before(grammarAccess.getTempAccess().getGroup()); 
            // InternalFTL.g:194:3: ( rule__Temp__Group__0 )
            // InternalFTL.g:194:4: rule__Temp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Temp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTempAccess().getGroup()); 

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
    // $ANTLR end "ruleTemp"


    // $ANTLR start "entryRuleTransform"
    // InternalFTL.g:203:1: entryRuleTransform : ruleTransform EOF ;
    public final void entryRuleTransform() throws RecognitionException {
        try {
            // InternalFTL.g:204:1: ( ruleTransform EOF )
            // InternalFTL.g:205:1: ruleTransform EOF
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
    // InternalFTL.g:212:1: ruleTransform : ( ( rule__Transform__Group__0 ) ) ;
    public final void ruleTransform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:216:2: ( ( ( rule__Transform__Group__0 ) ) )
            // InternalFTL.g:217:2: ( ( rule__Transform__Group__0 ) )
            {
            // InternalFTL.g:217:2: ( ( rule__Transform__Group__0 ) )
            // InternalFTL.g:218:3: ( rule__Transform__Group__0 )
            {
             before(grammarAccess.getTransformAccess().getGroup()); 
            // InternalFTL.g:219:3: ( rule__Transform__Group__0 )
            // InternalFTL.g:219:4: rule__Transform__Group__0
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
    // InternalFTL.g:228:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalFTL.g:229:1: ( ruleInstruction EOF )
            // InternalFTL.g:230:1: ruleInstruction EOF
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
    // InternalFTL.g:237:1: ruleInstruction : ( ( rule__Instruction__Group__0 ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:241:2: ( ( ( rule__Instruction__Group__0 ) ) )
            // InternalFTL.g:242:2: ( ( rule__Instruction__Group__0 ) )
            {
            // InternalFTL.g:242:2: ( ( rule__Instruction__Group__0 ) )
            // InternalFTL.g:243:3: ( rule__Instruction__Group__0 )
            {
             before(grammarAccess.getInstructionAccess().getGroup()); 
            // InternalFTL.g:244:3: ( rule__Instruction__Group__0 )
            // InternalFTL.g:244:4: rule__Instruction__Group__0
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
    // InternalFTL.g:253:1: entryRuleVideo : ruleVideo EOF ;
    public final void entryRuleVideo() throws RecognitionException {
        try {
            // InternalFTL.g:254:1: ( ruleVideo EOF )
            // InternalFTL.g:255:1: ruleVideo EOF
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
    // InternalFTL.g:262:1: ruleVideo : ( ( rule__Video__Group__0 ) ) ;
    public final void ruleVideo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:266:2: ( ( ( rule__Video__Group__0 ) ) )
            // InternalFTL.g:267:2: ( ( rule__Video__Group__0 ) )
            {
            // InternalFTL.g:267:2: ( ( rule__Video__Group__0 ) )
            // InternalFTL.g:268:3: ( rule__Video__Group__0 )
            {
             before(grammarAccess.getVideoAccess().getGroup()); 
            // InternalFTL.g:269:3: ( rule__Video__Group__0 )
            // InternalFTL.g:269:4: rule__Video__Group__0
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


    // $ANTLR start "entryRuleSepia"
    // InternalFTL.g:278:1: entryRuleSepia : ruleSepia EOF ;
    public final void entryRuleSepia() throws RecognitionException {
        try {
            // InternalFTL.g:279:1: ( ruleSepia EOF )
            // InternalFTL.g:280:1: ruleSepia EOF
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
    // InternalFTL.g:287:1: ruleSepia : ( ( rule__Sepia__Group__0 ) ) ;
    public final void ruleSepia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:291:2: ( ( ( rule__Sepia__Group__0 ) ) )
            // InternalFTL.g:292:2: ( ( rule__Sepia__Group__0 ) )
            {
            // InternalFTL.g:292:2: ( ( rule__Sepia__Group__0 ) )
            // InternalFTL.g:293:3: ( rule__Sepia__Group__0 )
            {
             before(grammarAccess.getSepiaAccess().getGroup()); 
            // InternalFTL.g:294:3: ( rule__Sepia__Group__0 )
            // InternalFTL.g:294:4: rule__Sepia__Group__0
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
    // InternalFTL.g:303:1: entryRuleBlur : ruleBlur EOF ;
    public final void entryRuleBlur() throws RecognitionException {
        try {
            // InternalFTL.g:304:1: ( ruleBlur EOF )
            // InternalFTL.g:305:1: ruleBlur EOF
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
    // InternalFTL.g:312:1: ruleBlur : ( ( rule__Blur__Group__0 ) ) ;
    public final void ruleBlur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:316:2: ( ( ( rule__Blur__Group__0 ) ) )
            // InternalFTL.g:317:2: ( ( rule__Blur__Group__0 ) )
            {
            // InternalFTL.g:317:2: ( ( rule__Blur__Group__0 ) )
            // InternalFTL.g:318:3: ( rule__Blur__Group__0 )
            {
             before(grammarAccess.getBlurAccess().getGroup()); 
            // InternalFTL.g:319:3: ( rule__Blur__Group__0 )
            // InternalFTL.g:319:4: rule__Blur__Group__0
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


    // $ANTLR start "rule__Stream__Alternatives"
    // InternalFTL.g:327:1: rule__Stream__Alternatives : ( ( ruleIn ) | ( ruleOutputStream ) );
    public final void rule__Stream__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:331:1: ( ( ruleIn ) | ( ruleOutputStream ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=14 && LA1_0<=15)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalFTL.g:332:2: ( ruleIn )
                    {
                    // InternalFTL.g:332:2: ( ruleIn )
                    // InternalFTL.g:333:3: ruleIn
                    {
                     before(grammarAccess.getStreamAccess().getInParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleIn();

                    state._fsp--;

                     after(grammarAccess.getStreamAccess().getInParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFTL.g:338:2: ( ruleOutputStream )
                    {
                    // InternalFTL.g:338:2: ( ruleOutputStream )
                    // InternalFTL.g:339:3: ruleOutputStream
                    {
                     before(grammarAccess.getStreamAccess().getOutputStreamParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOutputStream();

                    state._fsp--;

                     after(grammarAccess.getStreamAccess().getOutputStreamParserRuleCall_1()); 

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
    // $ANTLR end "rule__Stream__Alternatives"


    // $ANTLR start "rule__OutputStream__Alternatives"
    // InternalFTL.g:348:1: rule__OutputStream__Alternatives : ( ( ruleOut ) | ( ruleTemp ) );
    public final void rule__OutputStream__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:352:1: ( ( ruleOut ) | ( ruleTemp ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalFTL.g:353:2: ( ruleOut )
                    {
                    // InternalFTL.g:353:2: ( ruleOut )
                    // InternalFTL.g:354:3: ruleOut
                    {
                     before(grammarAccess.getOutputStreamAccess().getOutParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOut();

                    state._fsp--;

                     after(grammarAccess.getOutputStreamAccess().getOutParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalFTL.g:359:2: ( ruleTemp )
                    {
                    // InternalFTL.g:359:2: ( ruleTemp )
                    // InternalFTL.g:360:3: ruleTemp
                    {
                     before(grammarAccess.getOutputStreamAccess().getTempParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTemp();

                    state._fsp--;

                     after(grammarAccess.getOutputStreamAccess().getTempParserRuleCall_1()); 

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
    // $ANTLR end "rule__OutputStream__Alternatives"


    // $ANTLR start "rule__Instruction__Alternatives_0"
    // InternalFTL.g:369:1: rule__Instruction__Alternatives_0 : ( ( ruleVideo ) | ( ruleSepia ) | ( ruleBlur ) );
    public final void rule__Instruction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:373:1: ( ( ruleVideo ) | ( ruleSepia ) | ( ruleBlur ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt3=1;
                }
                break;
            case 20:
                {
                alt3=2;
                }
                break;
            case 21:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalFTL.g:374:2: ( ruleVideo )
                    {
                    // InternalFTL.g:374:2: ( ruleVideo )
                    // InternalFTL.g:375:3: ruleVideo
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
                    // InternalFTL.g:380:2: ( ruleSepia )
                    {
                    // InternalFTL.g:380:2: ( ruleSepia )
                    // InternalFTL.g:381:3: ruleSepia
                    {
                     before(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSepia();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalFTL.g:386:2: ( ruleBlur )
                    {
                    // InternalFTL.g:386:2: ( ruleBlur )
                    // InternalFTL.g:387:3: ruleBlur
                    {
                     before(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBlur();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_2()); 

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
    // InternalFTL.g:396:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:400:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalFTL.g:401:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalFTL.g:408:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:412:1: ( ( () ) )
            // InternalFTL.g:413:1: ( () )
            {
            // InternalFTL.g:413:1: ( () )
            // InternalFTL.g:414:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalFTL.g:415:2: ()
            // InternalFTL.g:415:3: 
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
    // InternalFTL.g:423:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:427:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalFTL.g:428:2: rule__Program__Group__1__Impl rule__Program__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Program__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Program__Group__2();

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
    // InternalFTL.g:435:1: rule__Program__Group__1__Impl : ( ( rule__Program__StreamsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:439:1: ( ( ( rule__Program__StreamsAssignment_1 )* ) )
            // InternalFTL.g:440:1: ( ( rule__Program__StreamsAssignment_1 )* )
            {
            // InternalFTL.g:440:1: ( ( rule__Program__StreamsAssignment_1 )* )
            // InternalFTL.g:441:2: ( rule__Program__StreamsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getStreamsAssignment_1()); 
            // InternalFTL.g:442:2: ( rule__Program__StreamsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11||(LA4_0>=14 && LA4_0<=15)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalFTL.g:442:3: rule__Program__StreamsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Program__StreamsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getStreamsAssignment_1()); 

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


    // $ANTLR start "rule__Program__Group__2"
    // InternalFTL.g:450:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:454:1: ( rule__Program__Group__2__Impl )
            // InternalFTL.g:455:2: rule__Program__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Program__Group__2__Impl();

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
    // $ANTLR end "rule__Program__Group__2"


    // $ANTLR start "rule__Program__Group__2__Impl"
    // InternalFTL.g:461:1: rule__Program__Group__2__Impl : ( ( rule__Program__TransformsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:465:1: ( ( ( rule__Program__TransformsAssignment_2 )* ) )
            // InternalFTL.g:466:1: ( ( rule__Program__TransformsAssignment_2 )* )
            {
            // InternalFTL.g:466:1: ( ( rule__Program__TransformsAssignment_2 )* )
            // InternalFTL.g:467:2: ( rule__Program__TransformsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getTransformsAssignment_2()); 
            // InternalFTL.g:468:2: ( rule__Program__TransformsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalFTL.g:468:3: rule__Program__TransformsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Program__TransformsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getTransformsAssignment_2()); 

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
    // $ANTLR end "rule__Program__Group__2__Impl"


    // $ANTLR start "rule__In__Group__0"
    // InternalFTL.g:477:1: rule__In__Group__0 : rule__In__Group__0__Impl rule__In__Group__1 ;
    public final void rule__In__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:481:1: ( rule__In__Group__0__Impl rule__In__Group__1 )
            // InternalFTL.g:482:2: rule__In__Group__0__Impl rule__In__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__In__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__In__Group__1();

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
    // $ANTLR end "rule__In__Group__0"


    // $ANTLR start "rule__In__Group__0__Impl"
    // InternalFTL.g:489:1: rule__In__Group__0__Impl : ( 'in' ) ;
    public final void rule__In__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:493:1: ( ( 'in' ) )
            // InternalFTL.g:494:1: ( 'in' )
            {
            // InternalFTL.g:494:1: ( 'in' )
            // InternalFTL.g:495:2: 'in'
            {
             before(grammarAccess.getInAccess().getInKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getInAccess().getInKeyword_0()); 

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
    // $ANTLR end "rule__In__Group__0__Impl"


    // $ANTLR start "rule__In__Group__1"
    // InternalFTL.g:504:1: rule__In__Group__1 : rule__In__Group__1__Impl rule__In__Group__2 ;
    public final void rule__In__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:508:1: ( rule__In__Group__1__Impl rule__In__Group__2 )
            // InternalFTL.g:509:2: rule__In__Group__1__Impl rule__In__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__In__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__In__Group__2();

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
    // $ANTLR end "rule__In__Group__1"


    // $ANTLR start "rule__In__Group__1__Impl"
    // InternalFTL.g:516:1: rule__In__Group__1__Impl : ( ( rule__In__NameAssignment_1 ) ) ;
    public final void rule__In__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:520:1: ( ( ( rule__In__NameAssignment_1 ) ) )
            // InternalFTL.g:521:1: ( ( rule__In__NameAssignment_1 ) )
            {
            // InternalFTL.g:521:1: ( ( rule__In__NameAssignment_1 ) )
            // InternalFTL.g:522:2: ( rule__In__NameAssignment_1 )
            {
             before(grammarAccess.getInAccess().getNameAssignment_1()); 
            // InternalFTL.g:523:2: ( rule__In__NameAssignment_1 )
            // InternalFTL.g:523:3: rule__In__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__In__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__In__Group__1__Impl"


    // $ANTLR start "rule__In__Group__2"
    // InternalFTL.g:531:1: rule__In__Group__2 : rule__In__Group__2__Impl rule__In__Group__3 ;
    public final void rule__In__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:535:1: ( rule__In__Group__2__Impl rule__In__Group__3 )
            // InternalFTL.g:536:2: rule__In__Group__2__Impl rule__In__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__In__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__In__Group__3();

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
    // $ANTLR end "rule__In__Group__2"


    // $ANTLR start "rule__In__Group__2__Impl"
    // InternalFTL.g:543:1: rule__In__Group__2__Impl : ( '\\'' ) ;
    public final void rule__In__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:547:1: ( ( '\\'' ) )
            // InternalFTL.g:548:1: ( '\\'' )
            {
            // InternalFTL.g:548:1: ( '\\'' )
            // InternalFTL.g:549:2: '\\''
            {
             before(grammarAccess.getInAccess().getApostropheKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInAccess().getApostropheKeyword_2()); 

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
    // $ANTLR end "rule__In__Group__2__Impl"


    // $ANTLR start "rule__In__Group__3"
    // InternalFTL.g:558:1: rule__In__Group__3 : rule__In__Group__3__Impl rule__In__Group__4 ;
    public final void rule__In__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:562:1: ( rule__In__Group__3__Impl rule__In__Group__4 )
            // InternalFTL.g:563:2: rule__In__Group__3__Impl rule__In__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__In__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__In__Group__4();

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
    // $ANTLR end "rule__In__Group__3"


    // $ANTLR start "rule__In__Group__3__Impl"
    // InternalFTL.g:570:1: rule__In__Group__3__Impl : ( ( rule__In__PathAssignment_3 ) ) ;
    public final void rule__In__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:574:1: ( ( ( rule__In__PathAssignment_3 ) ) )
            // InternalFTL.g:575:1: ( ( rule__In__PathAssignment_3 ) )
            {
            // InternalFTL.g:575:1: ( ( rule__In__PathAssignment_3 ) )
            // InternalFTL.g:576:2: ( rule__In__PathAssignment_3 )
            {
             before(grammarAccess.getInAccess().getPathAssignment_3()); 
            // InternalFTL.g:577:2: ( rule__In__PathAssignment_3 )
            // InternalFTL.g:577:3: rule__In__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__In__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInAccess().getPathAssignment_3()); 

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
    // $ANTLR end "rule__In__Group__3__Impl"


    // $ANTLR start "rule__In__Group__4"
    // InternalFTL.g:585:1: rule__In__Group__4 : rule__In__Group__4__Impl rule__In__Group__5 ;
    public final void rule__In__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:589:1: ( rule__In__Group__4__Impl rule__In__Group__5 )
            // InternalFTL.g:590:2: rule__In__Group__4__Impl rule__In__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__In__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__In__Group__5();

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
    // $ANTLR end "rule__In__Group__4"


    // $ANTLR start "rule__In__Group__4__Impl"
    // InternalFTL.g:597:1: rule__In__Group__4__Impl : ( '\\'' ) ;
    public final void rule__In__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:601:1: ( ( '\\'' ) )
            // InternalFTL.g:602:1: ( '\\'' )
            {
            // InternalFTL.g:602:1: ( '\\'' )
            // InternalFTL.g:603:2: '\\''
            {
             before(grammarAccess.getInAccess().getApostropheKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getInAccess().getApostropheKeyword_4()); 

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
    // $ANTLR end "rule__In__Group__4__Impl"


    // $ANTLR start "rule__In__Group__5"
    // InternalFTL.g:612:1: rule__In__Group__5 : rule__In__Group__5__Impl ;
    public final void rule__In__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:616:1: ( rule__In__Group__5__Impl )
            // InternalFTL.g:617:2: rule__In__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__In__Group__5__Impl();

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
    // $ANTLR end "rule__In__Group__5"


    // $ANTLR start "rule__In__Group__5__Impl"
    // InternalFTL.g:623:1: rule__In__Group__5__Impl : ( ';' ) ;
    public final void rule__In__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:627:1: ( ( ';' ) )
            // InternalFTL.g:628:1: ( ';' )
            {
            // InternalFTL.g:628:1: ( ';' )
            // InternalFTL.g:629:2: ';'
            {
             before(grammarAccess.getInAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getInAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__In__Group__5__Impl"


    // $ANTLR start "rule__Out__Group__0"
    // InternalFTL.g:639:1: rule__Out__Group__0 : rule__Out__Group__0__Impl rule__Out__Group__1 ;
    public final void rule__Out__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:643:1: ( rule__Out__Group__0__Impl rule__Out__Group__1 )
            // InternalFTL.g:644:2: rule__Out__Group__0__Impl rule__Out__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Out__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Out__Group__1();

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
    // $ANTLR end "rule__Out__Group__0"


    // $ANTLR start "rule__Out__Group__0__Impl"
    // InternalFTL.g:651:1: rule__Out__Group__0__Impl : ( 'out' ) ;
    public final void rule__Out__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:655:1: ( ( 'out' ) )
            // InternalFTL.g:656:1: ( 'out' )
            {
            // InternalFTL.g:656:1: ( 'out' )
            // InternalFTL.g:657:2: 'out'
            {
             before(grammarAccess.getOutAccess().getOutKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOutAccess().getOutKeyword_0()); 

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
    // $ANTLR end "rule__Out__Group__0__Impl"


    // $ANTLR start "rule__Out__Group__1"
    // InternalFTL.g:666:1: rule__Out__Group__1 : rule__Out__Group__1__Impl rule__Out__Group__2 ;
    public final void rule__Out__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:670:1: ( rule__Out__Group__1__Impl rule__Out__Group__2 )
            // InternalFTL.g:671:2: rule__Out__Group__1__Impl rule__Out__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Out__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Out__Group__2();

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
    // $ANTLR end "rule__Out__Group__1"


    // $ANTLR start "rule__Out__Group__1__Impl"
    // InternalFTL.g:678:1: rule__Out__Group__1__Impl : ( ( rule__Out__NameAssignment_1 ) ) ;
    public final void rule__Out__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:682:1: ( ( ( rule__Out__NameAssignment_1 ) ) )
            // InternalFTL.g:683:1: ( ( rule__Out__NameAssignment_1 ) )
            {
            // InternalFTL.g:683:1: ( ( rule__Out__NameAssignment_1 ) )
            // InternalFTL.g:684:2: ( rule__Out__NameAssignment_1 )
            {
             before(grammarAccess.getOutAccess().getNameAssignment_1()); 
            // InternalFTL.g:685:2: ( rule__Out__NameAssignment_1 )
            // InternalFTL.g:685:3: rule__Out__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Out__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Out__Group__1__Impl"


    // $ANTLR start "rule__Out__Group__2"
    // InternalFTL.g:693:1: rule__Out__Group__2 : rule__Out__Group__2__Impl rule__Out__Group__3 ;
    public final void rule__Out__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:697:1: ( rule__Out__Group__2__Impl rule__Out__Group__3 )
            // InternalFTL.g:698:2: rule__Out__Group__2__Impl rule__Out__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Out__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Out__Group__3();

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
    // $ANTLR end "rule__Out__Group__2"


    // $ANTLR start "rule__Out__Group__2__Impl"
    // InternalFTL.g:705:1: rule__Out__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Out__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:709:1: ( ( '\\'' ) )
            // InternalFTL.g:710:1: ( '\\'' )
            {
            // InternalFTL.g:710:1: ( '\\'' )
            // InternalFTL.g:711:2: '\\''
            {
             before(grammarAccess.getOutAccess().getApostropheKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOutAccess().getApostropheKeyword_2()); 

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
    // $ANTLR end "rule__Out__Group__2__Impl"


    // $ANTLR start "rule__Out__Group__3"
    // InternalFTL.g:720:1: rule__Out__Group__3 : rule__Out__Group__3__Impl rule__Out__Group__4 ;
    public final void rule__Out__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:724:1: ( rule__Out__Group__3__Impl rule__Out__Group__4 )
            // InternalFTL.g:725:2: rule__Out__Group__3__Impl rule__Out__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Out__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Out__Group__4();

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
    // $ANTLR end "rule__Out__Group__3"


    // $ANTLR start "rule__Out__Group__3__Impl"
    // InternalFTL.g:732:1: rule__Out__Group__3__Impl : ( ( rule__Out__PathAssignment_3 ) ) ;
    public final void rule__Out__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:736:1: ( ( ( rule__Out__PathAssignment_3 ) ) )
            // InternalFTL.g:737:1: ( ( rule__Out__PathAssignment_3 ) )
            {
            // InternalFTL.g:737:1: ( ( rule__Out__PathAssignment_3 ) )
            // InternalFTL.g:738:2: ( rule__Out__PathAssignment_3 )
            {
             before(grammarAccess.getOutAccess().getPathAssignment_3()); 
            // InternalFTL.g:739:2: ( rule__Out__PathAssignment_3 )
            // InternalFTL.g:739:3: rule__Out__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Out__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutAccess().getPathAssignment_3()); 

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
    // $ANTLR end "rule__Out__Group__3__Impl"


    // $ANTLR start "rule__Out__Group__4"
    // InternalFTL.g:747:1: rule__Out__Group__4 : rule__Out__Group__4__Impl rule__Out__Group__5 ;
    public final void rule__Out__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:751:1: ( rule__Out__Group__4__Impl rule__Out__Group__5 )
            // InternalFTL.g:752:2: rule__Out__Group__4__Impl rule__Out__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Out__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Out__Group__5();

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
    // $ANTLR end "rule__Out__Group__4"


    // $ANTLR start "rule__Out__Group__4__Impl"
    // InternalFTL.g:759:1: rule__Out__Group__4__Impl : ( '\\'' ) ;
    public final void rule__Out__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:763:1: ( ( '\\'' ) )
            // InternalFTL.g:764:1: ( '\\'' )
            {
            // InternalFTL.g:764:1: ( '\\'' )
            // InternalFTL.g:765:2: '\\''
            {
             before(grammarAccess.getOutAccess().getApostropheKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOutAccess().getApostropheKeyword_4()); 

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
    // $ANTLR end "rule__Out__Group__4__Impl"


    // $ANTLR start "rule__Out__Group__5"
    // InternalFTL.g:774:1: rule__Out__Group__5 : rule__Out__Group__5__Impl ;
    public final void rule__Out__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:778:1: ( rule__Out__Group__5__Impl )
            // InternalFTL.g:779:2: rule__Out__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Out__Group__5__Impl();

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
    // $ANTLR end "rule__Out__Group__5"


    // $ANTLR start "rule__Out__Group__5__Impl"
    // InternalFTL.g:785:1: rule__Out__Group__5__Impl : ( ';' ) ;
    public final void rule__Out__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:789:1: ( ( ';' ) )
            // InternalFTL.g:790:1: ( ';' )
            {
            // InternalFTL.g:790:1: ( ';' )
            // InternalFTL.g:791:2: ';'
            {
             before(grammarAccess.getOutAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOutAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Out__Group__5__Impl"


    // $ANTLR start "rule__Temp__Group__0"
    // InternalFTL.g:801:1: rule__Temp__Group__0 : rule__Temp__Group__0__Impl rule__Temp__Group__1 ;
    public final void rule__Temp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:805:1: ( rule__Temp__Group__0__Impl rule__Temp__Group__1 )
            // InternalFTL.g:806:2: rule__Temp__Group__0__Impl rule__Temp__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Temp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Temp__Group__1();

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
    // $ANTLR end "rule__Temp__Group__0"


    // $ANTLR start "rule__Temp__Group__0__Impl"
    // InternalFTL.g:813:1: rule__Temp__Group__0__Impl : ( 'temp' ) ;
    public final void rule__Temp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:817:1: ( ( 'temp' ) )
            // InternalFTL.g:818:1: ( 'temp' )
            {
            // InternalFTL.g:818:1: ( 'temp' )
            // InternalFTL.g:819:2: 'temp'
            {
             before(grammarAccess.getTempAccess().getTempKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTempAccess().getTempKeyword_0()); 

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
    // $ANTLR end "rule__Temp__Group__0__Impl"


    // $ANTLR start "rule__Temp__Group__1"
    // InternalFTL.g:828:1: rule__Temp__Group__1 : rule__Temp__Group__1__Impl rule__Temp__Group__2 ;
    public final void rule__Temp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:832:1: ( rule__Temp__Group__1__Impl rule__Temp__Group__2 )
            // InternalFTL.g:833:2: rule__Temp__Group__1__Impl rule__Temp__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Temp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Temp__Group__2();

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
    // $ANTLR end "rule__Temp__Group__1"


    // $ANTLR start "rule__Temp__Group__1__Impl"
    // InternalFTL.g:840:1: rule__Temp__Group__1__Impl : ( ( rule__Temp__NameAssignment_1 ) ) ;
    public final void rule__Temp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:844:1: ( ( ( rule__Temp__NameAssignment_1 ) ) )
            // InternalFTL.g:845:1: ( ( rule__Temp__NameAssignment_1 ) )
            {
            // InternalFTL.g:845:1: ( ( rule__Temp__NameAssignment_1 ) )
            // InternalFTL.g:846:2: ( rule__Temp__NameAssignment_1 )
            {
             before(grammarAccess.getTempAccess().getNameAssignment_1()); 
            // InternalFTL.g:847:2: ( rule__Temp__NameAssignment_1 )
            // InternalFTL.g:847:3: rule__Temp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Temp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTempAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Temp__Group__1__Impl"


    // $ANTLR start "rule__Temp__Group__2"
    // InternalFTL.g:855:1: rule__Temp__Group__2 : rule__Temp__Group__2__Impl rule__Temp__Group__3 ;
    public final void rule__Temp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:859:1: ( rule__Temp__Group__2__Impl rule__Temp__Group__3 )
            // InternalFTL.g:860:2: rule__Temp__Group__2__Impl rule__Temp__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Temp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Temp__Group__3();

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
    // $ANTLR end "rule__Temp__Group__2"


    // $ANTLR start "rule__Temp__Group__2__Impl"
    // InternalFTL.g:867:1: rule__Temp__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Temp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:871:1: ( ( '\\'' ) )
            // InternalFTL.g:872:1: ( '\\'' )
            {
            // InternalFTL.g:872:1: ( '\\'' )
            // InternalFTL.g:873:2: '\\''
            {
             before(grammarAccess.getTempAccess().getApostropheKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTempAccess().getApostropheKeyword_2()); 

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
    // $ANTLR end "rule__Temp__Group__2__Impl"


    // $ANTLR start "rule__Temp__Group__3"
    // InternalFTL.g:882:1: rule__Temp__Group__3 : rule__Temp__Group__3__Impl rule__Temp__Group__4 ;
    public final void rule__Temp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:886:1: ( rule__Temp__Group__3__Impl rule__Temp__Group__4 )
            // InternalFTL.g:887:2: rule__Temp__Group__3__Impl rule__Temp__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Temp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Temp__Group__4();

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
    // $ANTLR end "rule__Temp__Group__3"


    // $ANTLR start "rule__Temp__Group__3__Impl"
    // InternalFTL.g:894:1: rule__Temp__Group__3__Impl : ( ( rule__Temp__PathAssignment_3 ) ) ;
    public final void rule__Temp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:898:1: ( ( ( rule__Temp__PathAssignment_3 ) ) )
            // InternalFTL.g:899:1: ( ( rule__Temp__PathAssignment_3 ) )
            {
            // InternalFTL.g:899:1: ( ( rule__Temp__PathAssignment_3 ) )
            // InternalFTL.g:900:2: ( rule__Temp__PathAssignment_3 )
            {
             before(grammarAccess.getTempAccess().getPathAssignment_3()); 
            // InternalFTL.g:901:2: ( rule__Temp__PathAssignment_3 )
            // InternalFTL.g:901:3: rule__Temp__PathAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Temp__PathAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTempAccess().getPathAssignment_3()); 

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
    // $ANTLR end "rule__Temp__Group__3__Impl"


    // $ANTLR start "rule__Temp__Group__4"
    // InternalFTL.g:909:1: rule__Temp__Group__4 : rule__Temp__Group__4__Impl rule__Temp__Group__5 ;
    public final void rule__Temp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:913:1: ( rule__Temp__Group__4__Impl rule__Temp__Group__5 )
            // InternalFTL.g:914:2: rule__Temp__Group__4__Impl rule__Temp__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Temp__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Temp__Group__5();

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
    // $ANTLR end "rule__Temp__Group__4"


    // $ANTLR start "rule__Temp__Group__4__Impl"
    // InternalFTL.g:921:1: rule__Temp__Group__4__Impl : ( '\\'' ) ;
    public final void rule__Temp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:925:1: ( ( '\\'' ) )
            // InternalFTL.g:926:1: ( '\\'' )
            {
            // InternalFTL.g:926:1: ( '\\'' )
            // InternalFTL.g:927:2: '\\''
            {
             before(grammarAccess.getTempAccess().getApostropheKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getTempAccess().getApostropheKeyword_4()); 

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
    // $ANTLR end "rule__Temp__Group__4__Impl"


    // $ANTLR start "rule__Temp__Group__5"
    // InternalFTL.g:936:1: rule__Temp__Group__5 : rule__Temp__Group__5__Impl ;
    public final void rule__Temp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:940:1: ( rule__Temp__Group__5__Impl )
            // InternalFTL.g:941:2: rule__Temp__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Temp__Group__5__Impl();

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
    // $ANTLR end "rule__Temp__Group__5"


    // $ANTLR start "rule__Temp__Group__5__Impl"
    // InternalFTL.g:947:1: rule__Temp__Group__5__Impl : ( ';' ) ;
    public final void rule__Temp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:951:1: ( ( ';' ) )
            // InternalFTL.g:952:1: ( ';' )
            {
            // InternalFTL.g:952:1: ( ';' )
            // InternalFTL.g:953:2: ';'
            {
             before(grammarAccess.getTempAccess().getSemicolonKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getTempAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__Temp__Group__5__Impl"


    // $ANTLR start "rule__Transform__Group__0"
    // InternalFTL.g:963:1: rule__Transform__Group__0 : rule__Transform__Group__0__Impl rule__Transform__Group__1 ;
    public final void rule__Transform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:967:1: ( rule__Transform__Group__0__Impl rule__Transform__Group__1 )
            // InternalFTL.g:968:2: rule__Transform__Group__0__Impl rule__Transform__Group__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalFTL.g:975:1: rule__Transform__Group__0__Impl : ( ( rule__Transform__OutputAssignment_0 ) ) ;
    public final void rule__Transform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:979:1: ( ( ( rule__Transform__OutputAssignment_0 ) ) )
            // InternalFTL.g:980:1: ( ( rule__Transform__OutputAssignment_0 ) )
            {
            // InternalFTL.g:980:1: ( ( rule__Transform__OutputAssignment_0 ) )
            // InternalFTL.g:981:2: ( rule__Transform__OutputAssignment_0 )
            {
             before(grammarAccess.getTransformAccess().getOutputAssignment_0()); 
            // InternalFTL.g:982:2: ( rule__Transform__OutputAssignment_0 )
            // InternalFTL.g:982:3: rule__Transform__OutputAssignment_0
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
    // InternalFTL.g:990:1: rule__Transform__Group__1 : rule__Transform__Group__1__Impl rule__Transform__Group__2 ;
    public final void rule__Transform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:994:1: ( rule__Transform__Group__1__Impl rule__Transform__Group__2 )
            // InternalFTL.g:995:2: rule__Transform__Group__1__Impl rule__Transform__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalFTL.g:1002:1: rule__Transform__Group__1__Impl : ( '=' ) ;
    public final void rule__Transform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1006:1: ( ( '=' ) )
            // InternalFTL.g:1007:1: ( '=' )
            {
            // InternalFTL.g:1007:1: ( '=' )
            // InternalFTL.g:1008:2: '='
            {
             before(grammarAccess.getTransformAccess().getEqualsSignKeyword_1()); 
            match(input,16,FOLLOW_2); 
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
    // InternalFTL.g:1017:1: rule__Transform__Group__2 : rule__Transform__Group__2__Impl rule__Transform__Group__3 ;
    public final void rule__Transform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1021:1: ( rule__Transform__Group__2__Impl rule__Transform__Group__3 )
            // InternalFTL.g:1022:2: rule__Transform__Group__2__Impl rule__Transform__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalFTL.g:1029:1: rule__Transform__Group__2__Impl : ( '{' ) ;
    public final void rule__Transform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1033:1: ( ( '{' ) )
            // InternalFTL.g:1034:1: ( '{' )
            {
            // InternalFTL.g:1034:1: ( '{' )
            // InternalFTL.g:1035:2: '{'
            {
             before(grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalFTL.g:1044:1: rule__Transform__Group__3 : rule__Transform__Group__3__Impl rule__Transform__Group__4 ;
    public final void rule__Transform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1048:1: ( rule__Transform__Group__3__Impl rule__Transform__Group__4 )
            // InternalFTL.g:1049:2: rule__Transform__Group__3__Impl rule__Transform__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalFTL.g:1056:1: rule__Transform__Group__3__Impl : ( ( rule__Transform__InstructionAssignment_3 )* ) ;
    public final void rule__Transform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1060:1: ( ( ( rule__Transform__InstructionAssignment_3 )* ) )
            // InternalFTL.g:1061:1: ( ( rule__Transform__InstructionAssignment_3 )* )
            {
            // InternalFTL.g:1061:1: ( ( rule__Transform__InstructionAssignment_3 )* )
            // InternalFTL.g:1062:2: ( rule__Transform__InstructionAssignment_3 )*
            {
             before(grammarAccess.getTransformAccess().getInstructionAssignment_3()); 
            // InternalFTL.g:1063:2: ( rule__Transform__InstructionAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=19 && LA6_0<=21)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalFTL.g:1063:3: rule__Transform__InstructionAssignment_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Transform__InstructionAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalFTL.g:1071:1: rule__Transform__Group__4 : rule__Transform__Group__4__Impl ;
    public final void rule__Transform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1075:1: ( rule__Transform__Group__4__Impl )
            // InternalFTL.g:1076:2: rule__Transform__Group__4__Impl
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
    // InternalFTL.g:1082:1: rule__Transform__Group__4__Impl : ( '}' ) ;
    public final void rule__Transform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1086:1: ( ( '}' ) )
            // InternalFTL.g:1087:1: ( '}' )
            {
            // InternalFTL.g:1087:1: ( '}' )
            // InternalFTL.g:1088:2: '}'
            {
             before(grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
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
    // InternalFTL.g:1098:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1102:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // InternalFTL.g:1103:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalFTL.g:1110:1: rule__Instruction__Group__0__Impl : ( ( rule__Instruction__Alternatives_0 ) ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1114:1: ( ( ( rule__Instruction__Alternatives_0 ) ) )
            // InternalFTL.g:1115:1: ( ( rule__Instruction__Alternatives_0 ) )
            {
            // InternalFTL.g:1115:1: ( ( rule__Instruction__Alternatives_0 ) )
            // InternalFTL.g:1116:2: ( rule__Instruction__Alternatives_0 )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives_0()); 
            // InternalFTL.g:1117:2: ( rule__Instruction__Alternatives_0 )
            // InternalFTL.g:1117:3: rule__Instruction__Alternatives_0
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
    // InternalFTL.g:1125:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1129:1: ( rule__Instruction__Group__1__Impl )
            // InternalFTL.g:1130:2: rule__Instruction__Group__1__Impl
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
    // InternalFTL.g:1136:1: rule__Instruction__Group__1__Impl : ( ';' ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1140:1: ( ( ';' ) )
            // InternalFTL.g:1141:1: ( ';' )
            {
            // InternalFTL.g:1141:1: ( ';' )
            // InternalFTL.g:1142:2: ';'
            {
             before(grammarAccess.getInstructionAccess().getSemicolonKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalFTL.g:1152:1: rule__Video__Group__0 : rule__Video__Group__0__Impl rule__Video__Group__1 ;
    public final void rule__Video__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1156:1: ( rule__Video__Group__0__Impl rule__Video__Group__1 )
            // InternalFTL.g:1157:2: rule__Video__Group__0__Impl rule__Video__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalFTL.g:1164:1: rule__Video__Group__0__Impl : ( 'video' ) ;
    public final void rule__Video__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1168:1: ( ( 'video' ) )
            // InternalFTL.g:1169:1: ( 'video' )
            {
            // InternalFTL.g:1169:1: ( 'video' )
            // InternalFTL.g:1170:2: 'video'
            {
             before(grammarAccess.getVideoAccess().getVideoKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalFTL.g:1179:1: rule__Video__Group__1 : rule__Video__Group__1__Impl ;
    public final void rule__Video__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1183:1: ( rule__Video__Group__1__Impl )
            // InternalFTL.g:1184:2: rule__Video__Group__1__Impl
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
    // InternalFTL.g:1190:1: rule__Video__Group__1__Impl : ( ( rule__Video__InputAssignment_1 ) ) ;
    public final void rule__Video__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1194:1: ( ( ( rule__Video__InputAssignment_1 ) ) )
            // InternalFTL.g:1195:1: ( ( rule__Video__InputAssignment_1 ) )
            {
            // InternalFTL.g:1195:1: ( ( rule__Video__InputAssignment_1 ) )
            // InternalFTL.g:1196:2: ( rule__Video__InputAssignment_1 )
            {
             before(grammarAccess.getVideoAccess().getInputAssignment_1()); 
            // InternalFTL.g:1197:2: ( rule__Video__InputAssignment_1 )
            // InternalFTL.g:1197:3: rule__Video__InputAssignment_1
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


    // $ANTLR start "rule__Sepia__Group__0"
    // InternalFTL.g:1206:1: rule__Sepia__Group__0 : rule__Sepia__Group__0__Impl rule__Sepia__Group__1 ;
    public final void rule__Sepia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1210:1: ( rule__Sepia__Group__0__Impl rule__Sepia__Group__1 )
            // InternalFTL.g:1211:2: rule__Sepia__Group__0__Impl rule__Sepia__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalFTL.g:1218:1: rule__Sepia__Group__0__Impl : ( () ) ;
    public final void rule__Sepia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1222:1: ( ( () ) )
            // InternalFTL.g:1223:1: ( () )
            {
            // InternalFTL.g:1223:1: ( () )
            // InternalFTL.g:1224:2: ()
            {
             before(grammarAccess.getSepiaAccess().getSepiaAction_0()); 
            // InternalFTL.g:1225:2: ()
            // InternalFTL.g:1225:3: 
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
    // InternalFTL.g:1233:1: rule__Sepia__Group__1 : rule__Sepia__Group__1__Impl ;
    public final void rule__Sepia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1237:1: ( rule__Sepia__Group__1__Impl )
            // InternalFTL.g:1238:2: rule__Sepia__Group__1__Impl
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
    // InternalFTL.g:1244:1: rule__Sepia__Group__1__Impl : ( 'sepia' ) ;
    public final void rule__Sepia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1248:1: ( ( 'sepia' ) )
            // InternalFTL.g:1249:1: ( 'sepia' )
            {
            // InternalFTL.g:1249:1: ( 'sepia' )
            // InternalFTL.g:1250:2: 'sepia'
            {
             before(grammarAccess.getSepiaAccess().getSepiaKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalFTL.g:1260:1: rule__Blur__Group__0 : rule__Blur__Group__0__Impl rule__Blur__Group__1 ;
    public final void rule__Blur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1264:1: ( rule__Blur__Group__0__Impl rule__Blur__Group__1 )
            // InternalFTL.g:1265:2: rule__Blur__Group__0__Impl rule__Blur__Group__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalFTL.g:1272:1: rule__Blur__Group__0__Impl : ( 'blur' ) ;
    public final void rule__Blur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1276:1: ( ( 'blur' ) )
            // InternalFTL.g:1277:1: ( 'blur' )
            {
            // InternalFTL.g:1277:1: ( 'blur' )
            // InternalFTL.g:1278:2: 'blur'
            {
             before(grammarAccess.getBlurAccess().getBlurKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalFTL.g:1287:1: rule__Blur__Group__1 : rule__Blur__Group__1__Impl ;
    public final void rule__Blur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1291:1: ( rule__Blur__Group__1__Impl )
            // InternalFTL.g:1292:2: rule__Blur__Group__1__Impl
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
    // InternalFTL.g:1298:1: rule__Blur__Group__1__Impl : ( ( rule__Blur__RadiusAssignment_1 ) ) ;
    public final void rule__Blur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1302:1: ( ( ( rule__Blur__RadiusAssignment_1 ) ) )
            // InternalFTL.g:1303:1: ( ( rule__Blur__RadiusAssignment_1 ) )
            {
            // InternalFTL.g:1303:1: ( ( rule__Blur__RadiusAssignment_1 ) )
            // InternalFTL.g:1304:2: ( rule__Blur__RadiusAssignment_1 )
            {
             before(grammarAccess.getBlurAccess().getRadiusAssignment_1()); 
            // InternalFTL.g:1305:2: ( rule__Blur__RadiusAssignment_1 )
            // InternalFTL.g:1305:3: rule__Blur__RadiusAssignment_1
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


    // $ANTLR start "rule__Program__StreamsAssignment_1"
    // InternalFTL.g:1314:1: rule__Program__StreamsAssignment_1 : ( ruleStream ) ;
    public final void rule__Program__StreamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1318:1: ( ( ruleStream ) )
            // InternalFTL.g:1319:2: ( ruleStream )
            {
            // InternalFTL.g:1319:2: ( ruleStream )
            // InternalFTL.g:1320:3: ruleStream
            {
             before(grammarAccess.getProgramAccess().getStreamsStreamParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStream();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getStreamsStreamParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Program__StreamsAssignment_1"


    // $ANTLR start "rule__Program__TransformsAssignment_2"
    // InternalFTL.g:1329:1: rule__Program__TransformsAssignment_2 : ( ruleTransform ) ;
    public final void rule__Program__TransformsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1333:1: ( ( ruleTransform ) )
            // InternalFTL.g:1334:2: ( ruleTransform )
            {
            // InternalFTL.g:1334:2: ( ruleTransform )
            // InternalFTL.g:1335:3: ruleTransform
            {
             before(grammarAccess.getProgramAccess().getTransformsTransformParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTransform();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getTransformsTransformParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Program__TransformsAssignment_2"


    // $ANTLR start "rule__In__NameAssignment_1"
    // InternalFTL.g:1344:1: rule__In__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__In__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1348:1: ( ( RULE_STRING ) )
            // InternalFTL.g:1349:2: ( RULE_STRING )
            {
            // InternalFTL.g:1349:2: ( RULE_STRING )
            // InternalFTL.g:1350:3: RULE_STRING
            {
             before(grammarAccess.getInAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__In__NameAssignment_1"


    // $ANTLR start "rule__In__PathAssignment_3"
    // InternalFTL.g:1359:1: rule__In__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__In__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1363:1: ( ( RULE_STRING ) )
            // InternalFTL.g:1364:2: ( RULE_STRING )
            {
            // InternalFTL.g:1364:2: ( RULE_STRING )
            // InternalFTL.g:1365:3: RULE_STRING
            {
             before(grammarAccess.getInAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getInAccess().getPathSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__In__PathAssignment_3"


    // $ANTLR start "rule__Out__NameAssignment_1"
    // InternalFTL.g:1374:1: rule__Out__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Out__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1378:1: ( ( RULE_STRING ) )
            // InternalFTL.g:1379:2: ( RULE_STRING )
            {
            // InternalFTL.g:1379:2: ( RULE_STRING )
            // InternalFTL.g:1380:3: RULE_STRING
            {
             before(grammarAccess.getOutAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Out__NameAssignment_1"


    // $ANTLR start "rule__Out__PathAssignment_3"
    // InternalFTL.g:1389:1: rule__Out__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Out__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1393:1: ( ( RULE_STRING ) )
            // InternalFTL.g:1394:2: ( RULE_STRING )
            {
            // InternalFTL.g:1394:2: ( RULE_STRING )
            // InternalFTL.g:1395:3: RULE_STRING
            {
             before(grammarAccess.getOutAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getOutAccess().getPathSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Out__PathAssignment_3"


    // $ANTLR start "rule__Temp__NameAssignment_1"
    // InternalFTL.g:1404:1: rule__Temp__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Temp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1408:1: ( ( RULE_STRING ) )
            // InternalFTL.g:1409:2: ( RULE_STRING )
            {
            // InternalFTL.g:1409:2: ( RULE_STRING )
            // InternalFTL.g:1410:3: RULE_STRING
            {
             before(grammarAccess.getTempAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTempAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Temp__NameAssignment_1"


    // $ANTLR start "rule__Temp__PathAssignment_3"
    // InternalFTL.g:1419:1: rule__Temp__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Temp__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1423:1: ( ( RULE_STRING ) )
            // InternalFTL.g:1424:2: ( RULE_STRING )
            {
            // InternalFTL.g:1424:2: ( RULE_STRING )
            // InternalFTL.g:1425:3: RULE_STRING
            {
             before(grammarAccess.getTempAccess().getPathSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getTempAccess().getPathSTRINGTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Temp__PathAssignment_3"


    // $ANTLR start "rule__Transform__OutputAssignment_0"
    // InternalFTL.g:1434:1: rule__Transform__OutputAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Transform__OutputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1438:1: ( ( RULE_STRING ) )
            // InternalFTL.g:1439:2: ( RULE_STRING )
            {
            // InternalFTL.g:1439:2: ( RULE_STRING )
            // InternalFTL.g:1440:3: RULE_STRING
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
    // InternalFTL.g:1449:1: rule__Transform__InstructionAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Transform__InstructionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1453:1: ( ( ruleInstruction ) )
            // InternalFTL.g:1454:2: ( ruleInstruction )
            {
            // InternalFTL.g:1454:2: ( ruleInstruction )
            // InternalFTL.g:1455:3: ruleInstruction
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
    // InternalFTL.g:1464:1: rule__Video__InputAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Video__InputAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1468:1: ( ( RULE_STRING ) )
            // InternalFTL.g:1469:2: ( RULE_STRING )
            {
            // InternalFTL.g:1469:2: ( RULE_STRING )
            // InternalFTL.g:1470:3: RULE_STRING
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


    // $ANTLR start "rule__Blur__RadiusAssignment_1"
    // InternalFTL.g:1479:1: rule__Blur__RadiusAssignment_1 : ( RULE_INT ) ;
    public final void rule__Blur__RadiusAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalFTL.g:1483:1: ( ( RULE_INT ) )
            // InternalFTL.g:1484:2: ( RULE_INT )
            {
            // InternalFTL.g:1484:2: ( RULE_INT )
            // InternalFTL.g:1485:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000000000C810L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000000000000C802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});

}