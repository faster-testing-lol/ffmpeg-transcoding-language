package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'sepia'", "'in'", "'\\''", "';'", "'out'", "'temp'", "'='", "'{'", "'}'", "'blur'"
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

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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
    // InternalMyDsl.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgram EOF )
            // InternalMyDsl.g:55:1: ruleProgram EOF
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
    // InternalMyDsl.g:62:1: ruleProgram : ( ( rule__Program__Group__0 ) ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Program__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Program__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Program__Group__0 )
            {
             before(grammarAccess.getProgramAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Program__Group__0 )
            // InternalMyDsl.g:69:4: rule__Program__Group__0
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
    // InternalMyDsl.g:78:1: entryRuleStream : ruleStream EOF ;
    public final void entryRuleStream() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleStream EOF )
            // InternalMyDsl.g:80:1: ruleStream EOF
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
    // InternalMyDsl.g:87:1: ruleStream : ( ( rule__Stream__Alternatives ) ) ;
    public final void ruleStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Stream__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Stream__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Stream__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Stream__Alternatives )
            {
             before(grammarAccess.getStreamAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Stream__Alternatives )
            // InternalMyDsl.g:94:4: rule__Stream__Alternatives
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
    // InternalMyDsl.g:103:1: entryRuleIn : ruleIn EOF ;
    public final void entryRuleIn() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleIn EOF )
            // InternalMyDsl.g:105:1: ruleIn EOF
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
    // InternalMyDsl.g:112:1: ruleIn : ( ( rule__In__Group__0 ) ) ;
    public final void ruleIn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__In__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__In__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__In__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__In__Group__0 )
            {
             before(grammarAccess.getInAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__In__Group__0 )
            // InternalMyDsl.g:119:4: rule__In__Group__0
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
    // InternalMyDsl.g:128:1: entryRuleOutputStream : ruleOutputStream EOF ;
    public final void entryRuleOutputStream() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleOutputStream EOF )
            // InternalMyDsl.g:130:1: ruleOutputStream EOF
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
    // InternalMyDsl.g:137:1: ruleOutputStream : ( ( rule__OutputStream__Alternatives ) ) ;
    public final void ruleOutputStream() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__OutputStream__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__OutputStream__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__OutputStream__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__OutputStream__Alternatives )
            {
             before(grammarAccess.getOutputStreamAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__OutputStream__Alternatives )
            // InternalMyDsl.g:144:4: rule__OutputStream__Alternatives
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
    // InternalMyDsl.g:153:1: entryRuleOut : ruleOut EOF ;
    public final void entryRuleOut() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleOut EOF )
            // InternalMyDsl.g:155:1: ruleOut EOF
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
    // InternalMyDsl.g:162:1: ruleOut : ( ( rule__Out__Group__0 ) ) ;
    public final void ruleOut() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Out__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Out__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Out__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Out__Group__0 )
            {
             before(grammarAccess.getOutAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Out__Group__0 )
            // InternalMyDsl.g:169:4: rule__Out__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleTemp : ruleTemp EOF ;
    public final void entryRuleTemp() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleTemp EOF )
            // InternalMyDsl.g:180:1: ruleTemp EOF
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
    // InternalMyDsl.g:187:1: ruleTemp : ( ( rule__Temp__Group__0 ) ) ;
    public final void ruleTemp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Temp__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Temp__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Temp__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Temp__Group__0 )
            {
             before(grammarAccess.getTempAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Temp__Group__0 )
            // InternalMyDsl.g:194:4: rule__Temp__Group__0
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
    // InternalMyDsl.g:203:1: entryRuleTransform : ruleTransform EOF ;
    public final void entryRuleTransform() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleTransform EOF )
            // InternalMyDsl.g:205:1: ruleTransform EOF
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
    // InternalMyDsl.g:212:1: ruleTransform : ( ( rule__Transform__Group__0 ) ) ;
    public final void ruleTransform() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Transform__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Transform__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Transform__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Transform__Group__0 )
            {
             before(grammarAccess.getTransformAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Transform__Group__0 )
            // InternalMyDsl.g:219:4: rule__Transform__Group__0
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
    // InternalMyDsl.g:228:1: entryRuleInstruction : ruleInstruction EOF ;
    public final void entryRuleInstruction() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleInstruction EOF )
            // InternalMyDsl.g:230:1: ruleInstruction EOF
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
    // InternalMyDsl.g:237:1: ruleInstruction : ( ( rule__Instruction__Group__0 ) ) ;
    public final void ruleInstruction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Instruction__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Instruction__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Instruction__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Instruction__Group__0 )
            {
             before(grammarAccess.getInstructionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Instruction__Group__0 )
            // InternalMyDsl.g:244:4: rule__Instruction__Group__0
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


    // $ANTLR start "entryRuleSepia"
    // InternalMyDsl.g:253:1: entryRuleSepia : ruleSepia EOF ;
    public final void entryRuleSepia() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleSepia EOF )
            // InternalMyDsl.g:255:1: ruleSepia EOF
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
    // InternalMyDsl.g:262:1: ruleSepia : ( 'sepia' ) ;
    public final void ruleSepia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( 'sepia' ) )
            // InternalMyDsl.g:267:2: ( 'sepia' )
            {
            // InternalMyDsl.g:267:2: ( 'sepia' )
            // InternalMyDsl.g:268:3: 'sepia'
            {
             before(grammarAccess.getSepiaAccess().getSepiaKeyword()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSepiaAccess().getSepiaKeyword()); 

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
    // InternalMyDsl.g:278:1: entryRuleBlur : ruleBlur EOF ;
    public final void entryRuleBlur() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleBlur EOF )
            // InternalMyDsl.g:280:1: ruleBlur EOF
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
    // InternalMyDsl.g:287:1: ruleBlur : ( ( rule__Blur__Group__0 ) ) ;
    public final void ruleBlur() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Blur__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Blur__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Blur__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Blur__Group__0 )
            {
             before(grammarAccess.getBlurAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Blur__Group__0 )
            // InternalMyDsl.g:294:4: rule__Blur__Group__0
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
    // InternalMyDsl.g:302:1: rule__Stream__Alternatives : ( ( ruleIn ) | ( ruleOutputStream ) );
    public final void rule__Stream__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:306:1: ( ( ruleIn ) | ( ruleOutputStream ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=15 && LA1_0<=16)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:307:2: ( ruleIn )
                    {
                    // InternalMyDsl.g:307:2: ( ruleIn )
                    // InternalMyDsl.g:308:3: ruleIn
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
                    // InternalMyDsl.g:313:2: ( ruleOutputStream )
                    {
                    // InternalMyDsl.g:313:2: ( ruleOutputStream )
                    // InternalMyDsl.g:314:3: ruleOutputStream
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
    // InternalMyDsl.g:323:1: rule__OutputStream__Alternatives : ( ( ruleOut ) | ( ruleTemp ) );
    public final void rule__OutputStream__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:327:1: ( ( ruleOut ) | ( ruleTemp ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:328:2: ( ruleOut )
                    {
                    // InternalMyDsl.g:328:2: ( ruleOut )
                    // InternalMyDsl.g:329:3: ruleOut
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
                    // InternalMyDsl.g:334:2: ( ruleTemp )
                    {
                    // InternalMyDsl.g:334:2: ( ruleTemp )
                    // InternalMyDsl.g:335:3: ruleTemp
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
    // InternalMyDsl.g:344:1: rule__Instruction__Alternatives_0 : ( ( ruleSepia ) | ( ruleBlur ) );
    public final void rule__Instruction__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:348:1: ( ( ruleSepia ) | ( ruleBlur ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==20) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:349:2: ( ruleSepia )
                    {
                    // InternalMyDsl.g:349:2: ( ruleSepia )
                    // InternalMyDsl.g:350:3: ruleSepia
                    {
                     before(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSepia();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getSepiaParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:355:2: ( ruleBlur )
                    {
                    // InternalMyDsl.g:355:2: ( ruleBlur )
                    // InternalMyDsl.g:356:3: ruleBlur
                    {
                     before(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_2);
                    ruleBlur();

                    state._fsp--;

                     after(grammarAccess.getInstructionAccess().getBlurParserRuleCall_0_1()); 

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
    // InternalMyDsl.g:365:1: rule__Program__Group__0 : rule__Program__Group__0__Impl rule__Program__Group__1 ;
    public final void rule__Program__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:369:1: ( rule__Program__Group__0__Impl rule__Program__Group__1 )
            // InternalMyDsl.g:370:2: rule__Program__Group__0__Impl rule__Program__Group__1
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
    // InternalMyDsl.g:377:1: rule__Program__Group__0__Impl : ( () ) ;
    public final void rule__Program__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:381:1: ( ( () ) )
            // InternalMyDsl.g:382:1: ( () )
            {
            // InternalMyDsl.g:382:1: ( () )
            // InternalMyDsl.g:383:2: ()
            {
             before(grammarAccess.getProgramAccess().getProgramAction_0()); 
            // InternalMyDsl.g:384:2: ()
            // InternalMyDsl.g:384:3: 
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
    // InternalMyDsl.g:392:1: rule__Program__Group__1 : rule__Program__Group__1__Impl rule__Program__Group__2 ;
    public final void rule__Program__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:396:1: ( rule__Program__Group__1__Impl rule__Program__Group__2 )
            // InternalMyDsl.g:397:2: rule__Program__Group__1__Impl rule__Program__Group__2
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
    // InternalMyDsl.g:404:1: rule__Program__Group__1__Impl : ( ( rule__Program__StreamsAssignment_1 )* ) ;
    public final void rule__Program__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:408:1: ( ( ( rule__Program__StreamsAssignment_1 )* ) )
            // InternalMyDsl.g:409:1: ( ( rule__Program__StreamsAssignment_1 )* )
            {
            // InternalMyDsl.g:409:1: ( ( rule__Program__StreamsAssignment_1 )* )
            // InternalMyDsl.g:410:2: ( rule__Program__StreamsAssignment_1 )*
            {
             before(grammarAccess.getProgramAccess().getStreamsAssignment_1()); 
            // InternalMyDsl.g:411:2: ( rule__Program__StreamsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==12||(LA4_0>=15 && LA4_0<=16)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:411:3: rule__Program__StreamsAssignment_1
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
    // InternalMyDsl.g:419:1: rule__Program__Group__2 : rule__Program__Group__2__Impl ;
    public final void rule__Program__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:423:1: ( rule__Program__Group__2__Impl )
            // InternalMyDsl.g:424:2: rule__Program__Group__2__Impl
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
    // InternalMyDsl.g:430:1: rule__Program__Group__2__Impl : ( ( rule__Program__TransformsAssignment_2 )* ) ;
    public final void rule__Program__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:434:1: ( ( ( rule__Program__TransformsAssignment_2 )* ) )
            // InternalMyDsl.g:435:1: ( ( rule__Program__TransformsAssignment_2 )* )
            {
            // InternalMyDsl.g:435:1: ( ( rule__Program__TransformsAssignment_2 )* )
            // InternalMyDsl.g:436:2: ( rule__Program__TransformsAssignment_2 )*
            {
             before(grammarAccess.getProgramAccess().getTransformsAssignment_2()); 
            // InternalMyDsl.g:437:2: ( rule__Program__TransformsAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:437:3: rule__Program__TransformsAssignment_2
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
    // InternalMyDsl.g:446:1: rule__In__Group__0 : rule__In__Group__0__Impl rule__In__Group__1 ;
    public final void rule__In__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:450:1: ( rule__In__Group__0__Impl rule__In__Group__1 )
            // InternalMyDsl.g:451:2: rule__In__Group__0__Impl rule__In__Group__1
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
    // InternalMyDsl.g:458:1: rule__In__Group__0__Impl : ( 'in' ) ;
    public final void rule__In__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:462:1: ( ( 'in' ) )
            // InternalMyDsl.g:463:1: ( 'in' )
            {
            // InternalMyDsl.g:463:1: ( 'in' )
            // InternalMyDsl.g:464:2: 'in'
            {
             before(grammarAccess.getInAccess().getInKeyword_0()); 
            match(input,12,FOLLOW_2); 
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
    // InternalMyDsl.g:473:1: rule__In__Group__1 : rule__In__Group__1__Impl rule__In__Group__2 ;
    public final void rule__In__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:477:1: ( rule__In__Group__1__Impl rule__In__Group__2 )
            // InternalMyDsl.g:478:2: rule__In__Group__1__Impl rule__In__Group__2
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
    // InternalMyDsl.g:485:1: rule__In__Group__1__Impl : ( ( rule__In__NameAssignment_1 ) ) ;
    public final void rule__In__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:489:1: ( ( ( rule__In__NameAssignment_1 ) ) )
            // InternalMyDsl.g:490:1: ( ( rule__In__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:490:1: ( ( rule__In__NameAssignment_1 ) )
            // InternalMyDsl.g:491:2: ( rule__In__NameAssignment_1 )
            {
             before(grammarAccess.getInAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:492:2: ( rule__In__NameAssignment_1 )
            // InternalMyDsl.g:492:3: rule__In__NameAssignment_1
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
    // InternalMyDsl.g:500:1: rule__In__Group__2 : rule__In__Group__2__Impl rule__In__Group__3 ;
    public final void rule__In__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:504:1: ( rule__In__Group__2__Impl rule__In__Group__3 )
            // InternalMyDsl.g:505:2: rule__In__Group__2__Impl rule__In__Group__3
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
    // InternalMyDsl.g:512:1: rule__In__Group__2__Impl : ( '\\'' ) ;
    public final void rule__In__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:1: ( ( '\\'' ) )
            // InternalMyDsl.g:517:1: ( '\\'' )
            {
            // InternalMyDsl.g:517:1: ( '\\'' )
            // InternalMyDsl.g:518:2: '\\''
            {
             before(grammarAccess.getInAccess().getApostropheKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:527:1: rule__In__Group__3 : rule__In__Group__3__Impl rule__In__Group__4 ;
    public final void rule__In__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:531:1: ( rule__In__Group__3__Impl rule__In__Group__4 )
            // InternalMyDsl.g:532:2: rule__In__Group__3__Impl rule__In__Group__4
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
    // InternalMyDsl.g:539:1: rule__In__Group__3__Impl : ( ( rule__In__PathAssignment_3 ) ) ;
    public final void rule__In__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:543:1: ( ( ( rule__In__PathAssignment_3 ) ) )
            // InternalMyDsl.g:544:1: ( ( rule__In__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:544:1: ( ( rule__In__PathAssignment_3 ) )
            // InternalMyDsl.g:545:2: ( rule__In__PathAssignment_3 )
            {
             before(grammarAccess.getInAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:546:2: ( rule__In__PathAssignment_3 )
            // InternalMyDsl.g:546:3: rule__In__PathAssignment_3
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
    // InternalMyDsl.g:554:1: rule__In__Group__4 : rule__In__Group__4__Impl rule__In__Group__5 ;
    public final void rule__In__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:558:1: ( rule__In__Group__4__Impl rule__In__Group__5 )
            // InternalMyDsl.g:559:2: rule__In__Group__4__Impl rule__In__Group__5
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
    // InternalMyDsl.g:566:1: rule__In__Group__4__Impl : ( '\\'' ) ;
    public final void rule__In__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:570:1: ( ( '\\'' ) )
            // InternalMyDsl.g:571:1: ( '\\'' )
            {
            // InternalMyDsl.g:571:1: ( '\\'' )
            // InternalMyDsl.g:572:2: '\\''
            {
             before(grammarAccess.getInAccess().getApostropheKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:581:1: rule__In__Group__5 : rule__In__Group__5__Impl ;
    public final void rule__In__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:585:1: ( rule__In__Group__5__Impl )
            // InternalMyDsl.g:586:2: rule__In__Group__5__Impl
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
    // InternalMyDsl.g:592:1: rule__In__Group__5__Impl : ( ';' ) ;
    public final void rule__In__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:596:1: ( ( ';' ) )
            // InternalMyDsl.g:597:1: ( ';' )
            {
            // InternalMyDsl.g:597:1: ( ';' )
            // InternalMyDsl.g:598:2: ';'
            {
             before(grammarAccess.getInAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:608:1: rule__Out__Group__0 : rule__Out__Group__0__Impl rule__Out__Group__1 ;
    public final void rule__Out__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:612:1: ( rule__Out__Group__0__Impl rule__Out__Group__1 )
            // InternalMyDsl.g:613:2: rule__Out__Group__0__Impl rule__Out__Group__1
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
    // InternalMyDsl.g:620:1: rule__Out__Group__0__Impl : ( 'out' ) ;
    public final void rule__Out__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:624:1: ( ( 'out' ) )
            // InternalMyDsl.g:625:1: ( 'out' )
            {
            // InternalMyDsl.g:625:1: ( 'out' )
            // InternalMyDsl.g:626:2: 'out'
            {
             before(grammarAccess.getOutAccess().getOutKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalMyDsl.g:635:1: rule__Out__Group__1 : rule__Out__Group__1__Impl rule__Out__Group__2 ;
    public final void rule__Out__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:639:1: ( rule__Out__Group__1__Impl rule__Out__Group__2 )
            // InternalMyDsl.g:640:2: rule__Out__Group__1__Impl rule__Out__Group__2
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
    // InternalMyDsl.g:647:1: rule__Out__Group__1__Impl : ( ( rule__Out__NameAssignment_1 ) ) ;
    public final void rule__Out__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:651:1: ( ( ( rule__Out__NameAssignment_1 ) ) )
            // InternalMyDsl.g:652:1: ( ( rule__Out__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:652:1: ( ( rule__Out__NameAssignment_1 ) )
            // InternalMyDsl.g:653:2: ( rule__Out__NameAssignment_1 )
            {
             before(grammarAccess.getOutAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:654:2: ( rule__Out__NameAssignment_1 )
            // InternalMyDsl.g:654:3: rule__Out__NameAssignment_1
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
    // InternalMyDsl.g:662:1: rule__Out__Group__2 : rule__Out__Group__2__Impl rule__Out__Group__3 ;
    public final void rule__Out__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:1: ( rule__Out__Group__2__Impl rule__Out__Group__3 )
            // InternalMyDsl.g:667:2: rule__Out__Group__2__Impl rule__Out__Group__3
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
    // InternalMyDsl.g:674:1: rule__Out__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Out__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:678:1: ( ( '\\'' ) )
            // InternalMyDsl.g:679:1: ( '\\'' )
            {
            // InternalMyDsl.g:679:1: ( '\\'' )
            // InternalMyDsl.g:680:2: '\\''
            {
             before(grammarAccess.getOutAccess().getApostropheKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:689:1: rule__Out__Group__3 : rule__Out__Group__3__Impl rule__Out__Group__4 ;
    public final void rule__Out__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:693:1: ( rule__Out__Group__3__Impl rule__Out__Group__4 )
            // InternalMyDsl.g:694:2: rule__Out__Group__3__Impl rule__Out__Group__4
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
    // InternalMyDsl.g:701:1: rule__Out__Group__3__Impl : ( ( rule__Out__PathAssignment_3 ) ) ;
    public final void rule__Out__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:705:1: ( ( ( rule__Out__PathAssignment_3 ) ) )
            // InternalMyDsl.g:706:1: ( ( rule__Out__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:706:1: ( ( rule__Out__PathAssignment_3 ) )
            // InternalMyDsl.g:707:2: ( rule__Out__PathAssignment_3 )
            {
             before(grammarAccess.getOutAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:708:2: ( rule__Out__PathAssignment_3 )
            // InternalMyDsl.g:708:3: rule__Out__PathAssignment_3
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
    // InternalMyDsl.g:716:1: rule__Out__Group__4 : rule__Out__Group__4__Impl rule__Out__Group__5 ;
    public final void rule__Out__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:720:1: ( rule__Out__Group__4__Impl rule__Out__Group__5 )
            // InternalMyDsl.g:721:2: rule__Out__Group__4__Impl rule__Out__Group__5
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
    // InternalMyDsl.g:728:1: rule__Out__Group__4__Impl : ( '\\'' ) ;
    public final void rule__Out__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:732:1: ( ( '\\'' ) )
            // InternalMyDsl.g:733:1: ( '\\'' )
            {
            // InternalMyDsl.g:733:1: ( '\\'' )
            // InternalMyDsl.g:734:2: '\\''
            {
             before(grammarAccess.getOutAccess().getApostropheKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:743:1: rule__Out__Group__5 : rule__Out__Group__5__Impl ;
    public final void rule__Out__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:747:1: ( rule__Out__Group__5__Impl )
            // InternalMyDsl.g:748:2: rule__Out__Group__5__Impl
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
    // InternalMyDsl.g:754:1: rule__Out__Group__5__Impl : ( ';' ) ;
    public final void rule__Out__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:758:1: ( ( ';' ) )
            // InternalMyDsl.g:759:1: ( ';' )
            {
            // InternalMyDsl.g:759:1: ( ';' )
            // InternalMyDsl.g:760:2: ';'
            {
             before(grammarAccess.getOutAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:770:1: rule__Temp__Group__0 : rule__Temp__Group__0__Impl rule__Temp__Group__1 ;
    public final void rule__Temp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:774:1: ( rule__Temp__Group__0__Impl rule__Temp__Group__1 )
            // InternalMyDsl.g:775:2: rule__Temp__Group__0__Impl rule__Temp__Group__1
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
    // InternalMyDsl.g:782:1: rule__Temp__Group__0__Impl : ( 'temp' ) ;
    public final void rule__Temp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:786:1: ( ( 'temp' ) )
            // InternalMyDsl.g:787:1: ( 'temp' )
            {
            // InternalMyDsl.g:787:1: ( 'temp' )
            // InternalMyDsl.g:788:2: 'temp'
            {
             before(grammarAccess.getTempAccess().getTempKeyword_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalMyDsl.g:797:1: rule__Temp__Group__1 : rule__Temp__Group__1__Impl rule__Temp__Group__2 ;
    public final void rule__Temp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( rule__Temp__Group__1__Impl rule__Temp__Group__2 )
            // InternalMyDsl.g:802:2: rule__Temp__Group__1__Impl rule__Temp__Group__2
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
    // InternalMyDsl.g:809:1: rule__Temp__Group__1__Impl : ( ( rule__Temp__NameAssignment_1 ) ) ;
    public final void rule__Temp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( ( rule__Temp__NameAssignment_1 ) ) )
            // InternalMyDsl.g:814:1: ( ( rule__Temp__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:814:1: ( ( rule__Temp__NameAssignment_1 ) )
            // InternalMyDsl.g:815:2: ( rule__Temp__NameAssignment_1 )
            {
             before(grammarAccess.getTempAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:816:2: ( rule__Temp__NameAssignment_1 )
            // InternalMyDsl.g:816:3: rule__Temp__NameAssignment_1
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
    // InternalMyDsl.g:824:1: rule__Temp__Group__2 : rule__Temp__Group__2__Impl rule__Temp__Group__3 ;
    public final void rule__Temp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( rule__Temp__Group__2__Impl rule__Temp__Group__3 )
            // InternalMyDsl.g:829:2: rule__Temp__Group__2__Impl rule__Temp__Group__3
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
    // InternalMyDsl.g:836:1: rule__Temp__Group__2__Impl : ( '\\'' ) ;
    public final void rule__Temp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( '\\'' ) )
            // InternalMyDsl.g:841:1: ( '\\'' )
            {
            // InternalMyDsl.g:841:1: ( '\\'' )
            // InternalMyDsl.g:842:2: '\\''
            {
             before(grammarAccess.getTempAccess().getApostropheKeyword_2()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:851:1: rule__Temp__Group__3 : rule__Temp__Group__3__Impl rule__Temp__Group__4 ;
    public final void rule__Temp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( rule__Temp__Group__3__Impl rule__Temp__Group__4 )
            // InternalMyDsl.g:856:2: rule__Temp__Group__3__Impl rule__Temp__Group__4
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
    // InternalMyDsl.g:863:1: rule__Temp__Group__3__Impl : ( ( rule__Temp__PathAssignment_3 ) ) ;
    public final void rule__Temp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( ( ( rule__Temp__PathAssignment_3 ) ) )
            // InternalMyDsl.g:868:1: ( ( rule__Temp__PathAssignment_3 ) )
            {
            // InternalMyDsl.g:868:1: ( ( rule__Temp__PathAssignment_3 ) )
            // InternalMyDsl.g:869:2: ( rule__Temp__PathAssignment_3 )
            {
             before(grammarAccess.getTempAccess().getPathAssignment_3()); 
            // InternalMyDsl.g:870:2: ( rule__Temp__PathAssignment_3 )
            // InternalMyDsl.g:870:3: rule__Temp__PathAssignment_3
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
    // InternalMyDsl.g:878:1: rule__Temp__Group__4 : rule__Temp__Group__4__Impl rule__Temp__Group__5 ;
    public final void rule__Temp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( rule__Temp__Group__4__Impl rule__Temp__Group__5 )
            // InternalMyDsl.g:883:2: rule__Temp__Group__4__Impl rule__Temp__Group__5
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
    // InternalMyDsl.g:890:1: rule__Temp__Group__4__Impl : ( '\\'' ) ;
    public final void rule__Temp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( '\\'' ) )
            // InternalMyDsl.g:895:1: ( '\\'' )
            {
            // InternalMyDsl.g:895:1: ( '\\'' )
            // InternalMyDsl.g:896:2: '\\''
            {
             before(grammarAccess.getTempAccess().getApostropheKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalMyDsl.g:905:1: rule__Temp__Group__5 : rule__Temp__Group__5__Impl ;
    public final void rule__Temp__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( rule__Temp__Group__5__Impl )
            // InternalMyDsl.g:910:2: rule__Temp__Group__5__Impl
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
    // InternalMyDsl.g:916:1: rule__Temp__Group__5__Impl : ( ';' ) ;
    public final void rule__Temp__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:920:1: ( ( ';' ) )
            // InternalMyDsl.g:921:1: ( ';' )
            {
            // InternalMyDsl.g:921:1: ( ';' )
            // InternalMyDsl.g:922:2: ';'
            {
             before(grammarAccess.getTempAccess().getSemicolonKeyword_5()); 
            match(input,14,FOLLOW_2); 
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
    // InternalMyDsl.g:932:1: rule__Transform__Group__0 : rule__Transform__Group__0__Impl rule__Transform__Group__1 ;
    public final void rule__Transform__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( rule__Transform__Group__0__Impl rule__Transform__Group__1 )
            // InternalMyDsl.g:937:2: rule__Transform__Group__0__Impl rule__Transform__Group__1
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
    // InternalMyDsl.g:944:1: rule__Transform__Group__0__Impl : ( ( rule__Transform__OutputAssignment_0 ) ) ;
    public final void rule__Transform__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( ( rule__Transform__OutputAssignment_0 ) ) )
            // InternalMyDsl.g:949:1: ( ( rule__Transform__OutputAssignment_0 ) )
            {
            // InternalMyDsl.g:949:1: ( ( rule__Transform__OutputAssignment_0 ) )
            // InternalMyDsl.g:950:2: ( rule__Transform__OutputAssignment_0 )
            {
             before(grammarAccess.getTransformAccess().getOutputAssignment_0()); 
            // InternalMyDsl.g:951:2: ( rule__Transform__OutputAssignment_0 )
            // InternalMyDsl.g:951:3: rule__Transform__OutputAssignment_0
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
    // InternalMyDsl.g:959:1: rule__Transform__Group__1 : rule__Transform__Group__1__Impl rule__Transform__Group__2 ;
    public final void rule__Transform__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( rule__Transform__Group__1__Impl rule__Transform__Group__2 )
            // InternalMyDsl.g:964:2: rule__Transform__Group__1__Impl rule__Transform__Group__2
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
    // InternalMyDsl.g:971:1: rule__Transform__Group__1__Impl : ( '=' ) ;
    public final void rule__Transform__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:975:1: ( ( '=' ) )
            // InternalMyDsl.g:976:1: ( '=' )
            {
            // InternalMyDsl.g:976:1: ( '=' )
            // InternalMyDsl.g:977:2: '='
            {
             before(grammarAccess.getTransformAccess().getEqualsSignKeyword_1()); 
            match(input,17,FOLLOW_2); 
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
    // InternalMyDsl.g:986:1: rule__Transform__Group__2 : rule__Transform__Group__2__Impl rule__Transform__Group__3 ;
    public final void rule__Transform__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:990:1: ( rule__Transform__Group__2__Impl rule__Transform__Group__3 )
            // InternalMyDsl.g:991:2: rule__Transform__Group__2__Impl rule__Transform__Group__3
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
    // InternalMyDsl.g:998:1: rule__Transform__Group__2__Impl : ( '{' ) ;
    public final void rule__Transform__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1002:1: ( ( '{' ) )
            // InternalMyDsl.g:1003:1: ( '{' )
            {
            // InternalMyDsl.g:1003:1: ( '{' )
            // InternalMyDsl.g:1004:2: '{'
            {
             before(grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalMyDsl.g:1013:1: rule__Transform__Group__3 : rule__Transform__Group__3__Impl rule__Transform__Group__4 ;
    public final void rule__Transform__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1017:1: ( rule__Transform__Group__3__Impl rule__Transform__Group__4 )
            // InternalMyDsl.g:1018:2: rule__Transform__Group__3__Impl rule__Transform__Group__4
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
    // InternalMyDsl.g:1025:1: rule__Transform__Group__3__Impl : ( ( rule__Transform__InstructionAssignment_3 )* ) ;
    public final void rule__Transform__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1029:1: ( ( ( rule__Transform__InstructionAssignment_3 )* ) )
            // InternalMyDsl.g:1030:1: ( ( rule__Transform__InstructionAssignment_3 )* )
            {
            // InternalMyDsl.g:1030:1: ( ( rule__Transform__InstructionAssignment_3 )* )
            // InternalMyDsl.g:1031:2: ( rule__Transform__InstructionAssignment_3 )*
            {
             before(grammarAccess.getTransformAccess().getInstructionAssignment_3()); 
            // InternalMyDsl.g:1032:2: ( rule__Transform__InstructionAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11||LA6_0==20) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:1032:3: rule__Transform__InstructionAssignment_3
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
    // InternalMyDsl.g:1040:1: rule__Transform__Group__4 : rule__Transform__Group__4__Impl ;
    public final void rule__Transform__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1044:1: ( rule__Transform__Group__4__Impl )
            // InternalMyDsl.g:1045:2: rule__Transform__Group__4__Impl
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
    // InternalMyDsl.g:1051:1: rule__Transform__Group__4__Impl : ( '}' ) ;
    public final void rule__Transform__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1055:1: ( ( '}' ) )
            // InternalMyDsl.g:1056:1: ( '}' )
            {
            // InternalMyDsl.g:1056:1: ( '}' )
            // InternalMyDsl.g:1057:2: '}'
            {
             before(grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_4()); 
            match(input,19,FOLLOW_2); 
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
    // InternalMyDsl.g:1067:1: rule__Instruction__Group__0 : rule__Instruction__Group__0__Impl rule__Instruction__Group__1 ;
    public final void rule__Instruction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1071:1: ( rule__Instruction__Group__0__Impl rule__Instruction__Group__1 )
            // InternalMyDsl.g:1072:2: rule__Instruction__Group__0__Impl rule__Instruction__Group__1
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
    // InternalMyDsl.g:1079:1: rule__Instruction__Group__0__Impl : ( ( rule__Instruction__Alternatives_0 ) ) ;
    public final void rule__Instruction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1083:1: ( ( ( rule__Instruction__Alternatives_0 ) ) )
            // InternalMyDsl.g:1084:1: ( ( rule__Instruction__Alternatives_0 ) )
            {
            // InternalMyDsl.g:1084:1: ( ( rule__Instruction__Alternatives_0 ) )
            // InternalMyDsl.g:1085:2: ( rule__Instruction__Alternatives_0 )
            {
             before(grammarAccess.getInstructionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:1086:2: ( rule__Instruction__Alternatives_0 )
            // InternalMyDsl.g:1086:3: rule__Instruction__Alternatives_0
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
    // InternalMyDsl.g:1094:1: rule__Instruction__Group__1 : rule__Instruction__Group__1__Impl ;
    public final void rule__Instruction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( rule__Instruction__Group__1__Impl )
            // InternalMyDsl.g:1099:2: rule__Instruction__Group__1__Impl
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
    // InternalMyDsl.g:1105:1: rule__Instruction__Group__1__Impl : ( ';' ) ;
    public final void rule__Instruction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1109:1: ( ( ';' ) )
            // InternalMyDsl.g:1110:1: ( ';' )
            {
            // InternalMyDsl.g:1110:1: ( ';' )
            // InternalMyDsl.g:1111:2: ';'
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


    // $ANTLR start "rule__Blur__Group__0"
    // InternalMyDsl.g:1121:1: rule__Blur__Group__0 : rule__Blur__Group__0__Impl rule__Blur__Group__1 ;
    public final void rule__Blur__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1125:1: ( rule__Blur__Group__0__Impl rule__Blur__Group__1 )
            // InternalMyDsl.g:1126:2: rule__Blur__Group__0__Impl rule__Blur__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1133:1: rule__Blur__Group__0__Impl : ( 'blur' ) ;
    public final void rule__Blur__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1137:1: ( ( 'blur' ) )
            // InternalMyDsl.g:1138:1: ( 'blur' )
            {
            // InternalMyDsl.g:1138:1: ( 'blur' )
            // InternalMyDsl.g:1139:2: 'blur'
            {
             before(grammarAccess.getBlurAccess().getBlurKeyword_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalMyDsl.g:1148:1: rule__Blur__Group__1 : rule__Blur__Group__1__Impl ;
    public final void rule__Blur__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( rule__Blur__Group__1__Impl )
            // InternalMyDsl.g:1153:2: rule__Blur__Group__1__Impl
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
    // InternalMyDsl.g:1159:1: rule__Blur__Group__1__Impl : ( ( rule__Blur__RadiusAssignment_1 ) ) ;
    public final void rule__Blur__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1163:1: ( ( ( rule__Blur__RadiusAssignment_1 ) ) )
            // InternalMyDsl.g:1164:1: ( ( rule__Blur__RadiusAssignment_1 ) )
            {
            // InternalMyDsl.g:1164:1: ( ( rule__Blur__RadiusAssignment_1 ) )
            // InternalMyDsl.g:1165:2: ( rule__Blur__RadiusAssignment_1 )
            {
             before(grammarAccess.getBlurAccess().getRadiusAssignment_1()); 
            // InternalMyDsl.g:1166:2: ( rule__Blur__RadiusAssignment_1 )
            // InternalMyDsl.g:1166:3: rule__Blur__RadiusAssignment_1
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
    // InternalMyDsl.g:1175:1: rule__Program__StreamsAssignment_1 : ( ruleStream ) ;
    public final void rule__Program__StreamsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( ( ruleStream ) )
            // InternalMyDsl.g:1180:2: ( ruleStream )
            {
            // InternalMyDsl.g:1180:2: ( ruleStream )
            // InternalMyDsl.g:1181:3: ruleStream
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
    // InternalMyDsl.g:1190:1: rule__Program__TransformsAssignment_2 : ( ruleTransform ) ;
    public final void rule__Program__TransformsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( ( ruleTransform ) )
            // InternalMyDsl.g:1195:2: ( ruleTransform )
            {
            // InternalMyDsl.g:1195:2: ( ruleTransform )
            // InternalMyDsl.g:1196:3: ruleTransform
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
    // InternalMyDsl.g:1205:1: rule__In__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__In__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1209:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1210:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1210:2: ( RULE_STRING )
            // InternalMyDsl.g:1211:3: RULE_STRING
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
    // InternalMyDsl.g:1220:1: rule__In__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__In__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1224:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1225:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1225:2: ( RULE_STRING )
            // InternalMyDsl.g:1226:3: RULE_STRING
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
    // InternalMyDsl.g:1235:1: rule__Out__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Out__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1239:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1240:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1240:2: ( RULE_STRING )
            // InternalMyDsl.g:1241:3: RULE_STRING
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
    // InternalMyDsl.g:1250:1: rule__Out__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Out__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1254:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1255:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1255:2: ( RULE_STRING )
            // InternalMyDsl.g:1256:3: RULE_STRING
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
    // InternalMyDsl.g:1265:1: rule__Temp__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Temp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1269:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1270:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1270:2: ( RULE_STRING )
            // InternalMyDsl.g:1271:3: RULE_STRING
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
    // InternalMyDsl.g:1280:1: rule__Temp__PathAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Temp__PathAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1284:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1285:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1285:2: ( RULE_STRING )
            // InternalMyDsl.g:1286:3: RULE_STRING
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
    // InternalMyDsl.g:1295:1: rule__Transform__OutputAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Transform__OutputAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1299:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:1300:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:1300:2: ( RULE_STRING )
            // InternalMyDsl.g:1301:3: RULE_STRING
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
    // InternalMyDsl.g:1310:1: rule__Transform__InstructionAssignment_3 : ( ruleInstruction ) ;
    public final void rule__Transform__InstructionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( ( ruleInstruction ) )
            // InternalMyDsl.g:1315:2: ( ruleInstruction )
            {
            // InternalMyDsl.g:1315:2: ( ruleInstruction )
            // InternalMyDsl.g:1316:3: ruleInstruction
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


    // $ANTLR start "rule__Blur__RadiusAssignment_1"
    // InternalMyDsl.g:1325:1: rule__Blur__RadiusAssignment_1 : ( RULE_INT ) ;
    public final void rule__Blur__RadiusAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:1330:2: ( RULE_INT )
            {
            // InternalMyDsl.g:1330:2: ( RULE_INT )
            // InternalMyDsl.g:1331:3: RULE_INT
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000019010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000019002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180800L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100802L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});

}