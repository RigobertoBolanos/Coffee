package com.coffe.generator.hlvlExtended

import java.util.Map
import com.coffee.generator.Dialect
import com.coffee.generator.TransformationRules
import com.coffee.generator.integerParser.BasicIntegerParser
import com.coffee.generator.integerParser.BasicIntegerRules
import com.coffee.hlvl.Decomposition
import com.coffee.hlvl.ElmDeclaration
import com.coffee.hlvl.Group
import com.coffee.hlvl.Model
import com.coffee.hlvl.Relational
import com.coffee.hlvl.VarList

class HlvlExtendedIntegerRules extends BasicIntegerRules implements IHlvlExtendedRules {
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
}
