/*
 * generated by Xtext 2.20.0
 */
package org.xtext.ftl.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.xtext.ftl.services.FTLGrammarAccess;

@SuppressWarnings("all")
public class FTLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected FTLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Transform___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2_GreaterThanSignKeyword_4_3__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (FTLGrammarAccess) access;
		match_Transform___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2_GreaterThanSignKeyword_4_3__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getTransformAccess().getLeftCurlyBracketKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getTransformAccess().getRightCurlyBracketKeyword_4_2()), new TokenAlias(false, false, grammarAccess.getTransformAccess().getGreaterThanSignKeyword_4_3()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Transform___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2_GreaterThanSignKeyword_4_3__q.equals(syntax))
				emit_Transform___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2_GreaterThanSignKeyword_4_3__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ('{' '}' '>')?
	 *
	 * This ambiguous syntax occurs at:
	 *     input+=Input '>' (ambiguity) output=STRING
	 */
	protected void emit_Transform___LeftCurlyBracketKeyword_4_0_RightCurlyBracketKeyword_4_2_GreaterThanSignKeyword_4_3__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
