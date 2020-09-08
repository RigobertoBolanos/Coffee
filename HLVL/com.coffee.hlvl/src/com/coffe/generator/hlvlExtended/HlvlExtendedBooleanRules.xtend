package com.coffe.generator.hlvlExtended

import java.util.Map
import com.coffee.generator.Dialect
import com.coffee.generator.TransformationRules
import com.coffee.generator.boolParser.BasicBooleanRules
import com.coffee.hlvl.Decomposition
import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.Group
import com.coffee.hlvl.Model
import com.coffee.hlvl.Relational
import com.coffee.hlvl.VarList

class HlvlExtendedBooleanRules extends BasicBooleanRules implements IHlvlExtendedRules {
	new(Dialect dialect) {
		super(dialect) // TODO Auto-generated constructor stub
	}

	override CharSequence getImpliesList(VarList rel) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getMutexList(VarList rel) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getImpliesPair(ElmDeclaration left, ElmDeclaration right) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getMutexPair(ElmDeclaration left, ElmDeclaration right) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getConstant(ElmDeclaration element) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getElement(ElmDeclaration element) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getCoreSingle(ElmDeclaration element) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getDecomposition(Decomposition rel, Map<String, ElmDeclaration> parents) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getGroup(Group rel, Map<String, ElmDeclaration> parents) {
		// TODO Auto-generated method stub
		return null
	}

	override CharSequence getExpression(Relational rel) {
		// TODO Auto-generated method stub
		return null
	}
}
