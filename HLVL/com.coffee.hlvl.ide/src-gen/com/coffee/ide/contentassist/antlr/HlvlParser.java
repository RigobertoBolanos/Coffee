/*
 * generated by Xtext 2.12.0
 */
package com.coffee.ide.contentassist.antlr;

import com.coffee.ide.contentassist.antlr.internal.InternalHlvlParser;
import com.coffee.services.HlvlGrammarAccess;
import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class HlvlParser extends AbstractContentAssistParser {

	@Inject
	private HlvlGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalHlvlParser createParser() {
		InternalHlvlParser result = new InternalHlvlParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getElmDeclarationAccess().getDataTypeAlternatives_2_0(), "rule__ElmDeclaration__DataTypeAlternatives_2_0");
					put(grammarAccess.getDeclarationAccess().getAlternatives(), "rule__Declaration__Alternatives");
					put(grammarAccess.getOptionsDeclarationAccess().getAlternatives(), "rule__OptionsDeclaration__Alternatives");
					put(grammarAccess.getRelationAccess().getAlternatives(), "rule__Relation__Alternatives");
					put(grammarAccess.getPairAccess().getOperatorAlternatives_0_0(), "rule__Pair__OperatorAlternatives_0_0");
					put(grammarAccess.getVarListAccess().getOperatorAlternatives_0_0(), "rule__VarList__OperatorAlternatives_0_0");
					put(grammarAccess.getWildcardAccess().getAlternatives(), "rule__Wildcard__Alternatives");
					put(grammarAccess.getOrderAccess().getAlternatives(), "rule__Order__Alternatives");
					put(grammarAccess.getEqualityAccess().getOpAlternatives_1_1_0(), "rule__Equality__OpAlternatives_1_1_0");
					put(grammarAccess.getComparisonAccess().getOpAlternatives_1_1_0(), "rule__Comparison__OpAlternatives_1_1_0");
					put(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0(), "rule__PlusOrMinus__Alternatives_1_0");
					put(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_1_0(), "rule__MulOrDiv__OpAlternatives_1_1_0");
					put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
					put(grammarAccess.getPrimaryAccess().getOpAlternatives_2_1_0(), "rule__Primary__OpAlternatives_2_1_0");
					put(grammarAccess.getPrimaryAccess().getOpAlternatives_5_1_0(), "rule__Primary__OpAlternatives_5_1_0");
					put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
					put(grammarAccess.getAtomicAccess().getValueAlternatives_0_1_0(), "rule__Atomic__ValueAlternatives_0_1_0");
					put(grammarAccess.getSampleAccess().getAlternatives(), "rule__Sample__Alternatives");
					put(grammarAccess.getOperationNameAccess().getAlternatives(), "rule__OperationName__Alternatives");
					put(grammarAccess.getNamedItemAccess().getAlternatives(), "rule__NamedItem__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_6(), "rule__Model__Group_6__0");
					put(grammarAccess.getElmDeclarationAccess().getGroup(), "rule__ElmDeclaration__Group__0");
					put(grammarAccess.getElmDeclarationAccess().getGroup_5(), "rule__ElmDeclaration__Group_5__0");
					put(grammarAccess.getConstantDeclAccess().getGroup(), "rule__ConstantDecl__Group__0");
					put(grammarAccess.getConstantDeclAccess().getGroup_1(), "rule__ConstantDecl__Group_1__0");
					put(grammarAccess.getVariableDeclAccess().getGroup(), "rule__VariableDecl__Group__0");
					put(grammarAccess.getVariableDeclAccess().getGroup_1(), "rule__VariableDecl__Group_1__0");
					put(grammarAccess.getIntervalAccess().getGroup(), "rule__Interval__Group__0");
					put(grammarAccess.getEnumerationAccess().getGroup(), "rule__Enumeration__Group__0");
					put(grammarAccess.getRelDeclarationAccess().getGroup(), "rule__RelDeclaration__Group__0");
					put(grammarAccess.getCommonAccess().getGroup(), "rule__Common__Group__0");
					put(grammarAccess.getPairAccess().getGroup(), "rule__Pair__Group__0");
					put(grammarAccess.getComplexImpliesAccess().getGroup(), "rule__ComplexImplies__Group__0");
					put(grammarAccess.getComplexMutexAccess().getGroup(), "rule__ComplexMutex__Group__0");
					put(grammarAccess.getVarListAccess().getGroup(), "rule__VarList__Group__0");
					put(grammarAccess.getDecompositionAccess().getGroup(), "rule__Decomposition__Group__0");
					put(grammarAccess.getGroupAccess().getGroup(), "rule__Group__Group__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getVisibilityAccess().getGroup(), "rule__Visibility__Group__0");
					put(grammarAccess.getOrderAccess().getGroup_1(), "rule__Order__Group_1__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getIffAccess().getGroup(), "rule__Iff__Group__0");
					put(grammarAccess.getIffAccess().getGroup_1(), "rule__Iff__Group_1__0");
					put(grammarAccess.getImpliesAccess().getGroup(), "rule__Implies__Group__0");
					put(grammarAccess.getImpliesAccess().getGroup_1(), "rule__Implies__Group_1__0");
					put(grammarAccess.getOrAccess().getGroup(), "rule__Or__Group__0");
					put(grammarAccess.getOrAccess().getGroup_1(), "rule__Or__Group_1__0");
					put(grammarAccess.getAndAccess().getGroup(), "rule__And__Group__0");
					put(grammarAccess.getAndAccess().getGroup_1(), "rule__And__Group_1__0");
					put(grammarAccess.getEqualityAccess().getGroup(), "rule__Equality__Group__0");
					put(grammarAccess.getEqualityAccess().getGroup_1(), "rule__Equality__Group_1__0");
					put(grammarAccess.getComparisonAccess().getGroup(), "rule__Comparison__Group__0");
					put(grammarAccess.getComparisonAccess().getGroup_1(), "rule__Comparison__Group_1__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup(), "rule__PlusOrMinus__Group__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1(), "rule__PlusOrMinus__Group_1__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0(), "rule__PlusOrMinus__Group_1_0_0__0");
					put(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1(), "rule__PlusOrMinus__Group_1_0_1__0");
					put(grammarAccess.getMulOrDivAccess().getGroup(), "rule__MulOrDiv__Group__0");
					put(grammarAccess.getMulOrDivAccess().getGroup_1(), "rule__MulOrDiv__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_0(), "rule__Primary__Group_0__0");
					put(grammarAccess.getPrimaryAccess().getGroup_1(), "rule__Primary__Group_1__0");
					put(grammarAccess.getPrimaryAccess().getGroup_2(), "rule__Primary__Group_2__0");
					put(grammarAccess.getPrimaryAccess().getGroup_3(), "rule__Primary__Group_3__0");
					put(grammarAccess.getPrimaryAccess().getGroup_4(), "rule__Primary__Group_4__0");
					put(grammarAccess.getPrimaryAccess().getGroup_5(), "rule__Primary__Group_5__0");
					put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
					put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
					put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
					put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
					put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
					put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
					put(grammarAccess.getOperationsAccess().getGroup(), "rule__Operations__Group__0");
					put(grammarAccess.getOperationsAccess().getGroup_1(), "rule__Operations__Group_1__0");
					put(grammarAccess.getSampleAccess().getGroup_0(), "rule__Sample__Group_0__0");
					put(grammarAccess.getSampleAccess().getGroup_1(), "rule__Sample__Group_1__0");
					put(grammarAccess.getListOfValuesAccess().getGroup(), "rule__ListOfValues__Group__0");
					put(grammarAccess.getListOfValuesAccess().getGroup_1(), "rule__ListOfValues__Group_1__0");
					put(grammarAccess.getListOfIDsAccess().getGroup(), "rule__ListOfIDs__Group__0");
					put(grammarAccess.getListOfIDsAccess().getGroup_2(), "rule__ListOfIDs__Group_2__0");
					put(grammarAccess.getListOfRelRefsAccess().getGroup(), "rule__ListOfRelRefs__Group__0");
					put(grammarAccess.getListOfRelRefsAccess().getGroup_2(), "rule__ListOfRelRefs__Group_2__0");
					put(grammarAccess.getMixedListAccess().getGroup(), "rule__MixedList__Group__0");
					put(grammarAccess.getMixedListAccess().getGroup_2(), "rule__MixedList__Group_2__0");
					put(grammarAccess.getValuationAccess().getGroup(), "rule__Valuation__Group__0");
					put(grammarAccess.getListOfValuationAccess().getGroup(), "rule__ListOfValuation__Group__0");
					put(grammarAccess.getListOfValuationAccess().getGroup_1(), "rule__ListOfValuation__Group_1__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getElementsAssignment_3(), "rule__Model__ElementsAssignment_3");
					put(grammarAccess.getModelAccess().getRelationsAssignment_5(), "rule__Model__RelationsAssignment_5");
					put(grammarAccess.getModelAccess().getOperationsAssignment_6_1(), "rule__Model__OperationsAssignment_6_1");
					put(grammarAccess.getElmDeclarationAccess().getAttAssignment_1(), "rule__ElmDeclaration__AttAssignment_1");
					put(grammarAccess.getElmDeclarationAccess().getDataTypeAssignment_2(), "rule__ElmDeclaration__DataTypeAssignment_2");
					put(grammarAccess.getElmDeclarationAccess().getNameAssignment_3(), "rule__ElmDeclaration__NameAssignment_3");
					put(grammarAccess.getElmDeclarationAccess().getDeclarationAssignment_4(), "rule__ElmDeclaration__DeclarationAssignment_4");
					put(grammarAccess.getElmDeclarationAccess().getCommentAssignment_5_2(), "rule__ElmDeclaration__CommentAssignment_5_2");
					put(grammarAccess.getConstantDeclAccess().getValueAssignment_1_1(), "rule__ConstantDecl__ValueAssignment_1_1");
					put(grammarAccess.getVariableDeclAccess().getVariantsAssignment_1_1(), "rule__VariableDecl__VariantsAssignment_1_1");
					put(grammarAccess.getIntervalAccess().getStartAssignment_0(), "rule__Interval__StartAssignment_0");
					put(grammarAccess.getIntervalAccess().getEndAssignment_2(), "rule__Interval__EndAssignment_2");
					put(grammarAccess.getEnumerationAccess().getListAssignment_1(), "rule__Enumeration__ListAssignment_1");
					put(grammarAccess.getRelDeclarationAccess().getNameAssignment_1(), "rule__RelDeclaration__NameAssignment_1");
					put(grammarAccess.getRelDeclarationAccess().getExpAssignment_3(), "rule__RelDeclaration__ExpAssignment_3");
					put(grammarAccess.getCommonAccess().getElementsAssignment_3(), "rule__Common__ElementsAssignment_3");
					put(grammarAccess.getPairAccess().getOperatorAssignment_0(), "rule__Pair__OperatorAssignment_0");
					put(grammarAccess.getPairAccess().getVar1Assignment_2(), "rule__Pair__Var1Assignment_2");
					put(grammarAccess.getPairAccess().getVar2Assignment_4(), "rule__Pair__Var2Assignment_4");
					put(grammarAccess.getComplexImpliesAccess().getExpAssignment_3(), "rule__ComplexImplies__ExpAssignment_3");
					put(grammarAccess.getComplexImpliesAccess().getElementsAssignment_7(), "rule__ComplexImplies__ElementsAssignment_7");
					put(grammarAccess.getComplexMutexAccess().getExpAssignment_3(), "rule__ComplexMutex__ExpAssignment_3");
					put(grammarAccess.getComplexMutexAccess().getElementsAssignment_7(), "rule__ComplexMutex__ElementsAssignment_7");
					put(grammarAccess.getVarListAccess().getOperatorAssignment_0(), "rule__VarList__OperatorAssignment_0");
					put(grammarAccess.getVarListAccess().getVar1Assignment_2(), "rule__VarList__Var1Assignment_2");
					put(grammarAccess.getVarListAccess().getListAssignment_5(), "rule__VarList__ListAssignment_5");
					put(grammarAccess.getDecompositionAccess().getParentAssignment_3(), "rule__Decomposition__ParentAssignment_3");
					put(grammarAccess.getDecompositionAccess().getChildrenAssignment_6(), "rule__Decomposition__ChildrenAssignment_6");
					put(grammarAccess.getDecompositionAccess().getMinAssignment_10(), "rule__Decomposition__MinAssignment_10");
					put(grammarAccess.getDecompositionAccess().getMaxAssignment_12(), "rule__Decomposition__MaxAssignment_12");
					put(grammarAccess.getGroupAccess().getParentAssignment_3(), "rule__Group__ParentAssignment_3");
					put(grammarAccess.getGroupAccess().getChildrenAssignment_6(), "rule__Group__ChildrenAssignment_6");
					put(grammarAccess.getGroupAccess().getMinAssignment_10(), "rule__Group__MinAssignment_10");
					put(grammarAccess.getGroupAccess().getMaxAssignment_12(), "rule__Group__MaxAssignment_12");
					put(grammarAccess.getRangeAccess().getValueAssignment_1(), "rule__Range__ValueAssignment_1");
					put(grammarAccess.getVisibilityAccess().getConditionAssignment_2(), "rule__Visibility__ConditionAssignment_2");
					put(grammarAccess.getVisibilityAccess().getListAssignment_5(), "rule__Visibility__ListAssignment_5");
					put(grammarAccess.getOrderAccess().getOperatorAssignment_0(), "rule__Order__OperatorAssignment_0");
					put(grammarAccess.getOrderAccess().getLeftAssignment_1_1(), "rule__Order__LeftAssignment_1_1");
					put(grammarAccess.getOrderAccess().getRightAssignment_1_4(), "rule__Order__RightAssignment_1_4");
					put(grammarAccess.getConstraintAccess().getExpAssignment_2(), "rule__Constraint__ExpAssignment_2");
					put(grammarAccess.getIffAccess().getRightAssignment_1_2(), "rule__Iff__RightAssignment_1_2");
					put(grammarAccess.getImpliesAccess().getRightAssignment_1_2(), "rule__Implies__RightAssignment_1_2");
					put(grammarAccess.getOrAccess().getRightAssignment_1_2(), "rule__Or__RightAssignment_1_2");
					put(grammarAccess.getAndAccess().getRightAssignment_1_2(), "rule__And__RightAssignment_1_2");
					put(grammarAccess.getEqualityAccess().getOpAssignment_1_1(), "rule__Equality__OpAssignment_1_1");
					put(grammarAccess.getEqualityAccess().getRightAssignment_1_2(), "rule__Equality__RightAssignment_1_2");
					put(grammarAccess.getComparisonAccess().getOpAssignment_1_1(), "rule__Comparison__OpAssignment_1_1");
					put(grammarAccess.getComparisonAccess().getRightAssignment_1_2(), "rule__Comparison__RightAssignment_1_2");
					put(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1(), "rule__PlusOrMinus__RightAssignment_1_1");
					put(grammarAccess.getMulOrDivAccess().getOpAssignment_1_1(), "rule__MulOrDiv__OpAssignment_1_1");
					put(grammarAccess.getMulOrDivAccess().getRightAssignment_1_2(), "rule__MulOrDiv__RightAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_1_2(), "rule__Primary__ExpressionAssignment_1_2");
					put(grammarAccess.getPrimaryAccess().getOpAssignment_2_1(), "rule__Primary__OpAssignment_2_1");
					put(grammarAccess.getPrimaryAccess().getExpressionAssignment_2_2(), "rule__Primary__ExpressionAssignment_2_2");
					put(grammarAccess.getPrimaryAccess().getElementAssignment_3_3(), "rule__Primary__ElementAssignment_3_3");
					put(grammarAccess.getPrimaryAccess().getNumberAssignment_3_5(), "rule__Primary__NumberAssignment_3_5");
					put(grammarAccess.getPrimaryAccess().getElementAssignment_4_3(), "rule__Primary__ElementAssignment_4_3");
					put(grammarAccess.getPrimaryAccess().getOpAssignment_5_1(), "rule__Primary__OpAssignment_5_1");
					put(grammarAccess.getPrimaryAccess().getLeftAssignment_5_3(), "rule__Primary__LeftAssignment_5_3");
					put(grammarAccess.getPrimaryAccess().getRightAssignment_5_5(), "rule__Primary__RightAssignment_5_5");
					put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
					put(grammarAccess.getAtomicAccess().getVariableAssignment_1_1(), "rule__Atomic__VariableAssignment_1_1");
					put(grammarAccess.getAtomicAccess().getAttributeAssignment_2_1(), "rule__Atomic__AttributeAssignment_2_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
					put(grammarAccess.getAtomicAccess().getValueAssignment_4_1(), "rule__Atomic__ValueAssignment_4_1");
					put(grammarAccess.getQualifiedNameAccess().getElementAssignment_0(), "rule__QualifiedName__ElementAssignment_0");
					put(grammarAccess.getQualifiedNameAccess().getAttAssignment_2(), "rule__QualifiedName__AttAssignment_2");
					put(grammarAccess.getOperationsAccess().getOpAssignment_0(), "rule__Operations__OpAssignment_0");
					put(grammarAccess.getOperationsAccess().getOpAssignment_1_1(), "rule__Operations__OpAssignment_1_1");
					put(grammarAccess.getSampleAccess().getNameAssignment_0_1(), "rule__Sample__NameAssignment_0_1");
					put(grammarAccess.getSampleAccess().getValuationsAssignment_1_3(), "rule__Sample__ValuationsAssignment_1_3");
					put(grammarAccess.getListOfValuesAccess().getValuesAssignment_0(), "rule__ListOfValues__ValuesAssignment_0");
					put(grammarAccess.getListOfValuesAccess().getValuesAssignment_1_1(), "rule__ListOfValues__ValuesAssignment_1_1");
					put(grammarAccess.getListOfIDsAccess().getValuesAssignment_1(), "rule__ListOfIDs__ValuesAssignment_1");
					put(grammarAccess.getListOfIDsAccess().getValuesAssignment_2_1(), "rule__ListOfIDs__ValuesAssignment_2_1");
					put(grammarAccess.getListOfRelRefsAccess().getIdsAssignment_1(), "rule__ListOfRelRefs__IdsAssignment_1");
					put(grammarAccess.getListOfRelRefsAccess().getIdsAssignment_2_1(), "rule__ListOfRelRefs__IdsAssignment_2_1");
					put(grammarAccess.getMixedListAccess().getIdsAssignment_1(), "rule__MixedList__IdsAssignment_1");
					put(grammarAccess.getMixedListAccess().getIdsAssignment_2_1(), "rule__MixedList__IdsAssignment_2_1");
					put(grammarAccess.getValuationAccess().getElementAssignment_1(), "rule__Valuation__ElementAssignment_1");
					put(grammarAccess.getValuationAccess().getValueAssignment_3(), "rule__Valuation__ValueAssignment_3");
					put(grammarAccess.getListOfValuationAccess().getPairsAssignment_0(), "rule__ListOfValuation__PairsAssignment_0");
					put(grammarAccess.getListOfValuationAccess().getPairsAssignment_1_1(), "rule__ListOfValuation__PairsAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public HlvlGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HlvlGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
