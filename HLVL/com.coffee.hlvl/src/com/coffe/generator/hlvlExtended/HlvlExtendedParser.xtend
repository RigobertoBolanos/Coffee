package com.coffe.generator.hlvlExtended

import com.coffee.generator.AbstractHLVLParser
import com.coffee.generator.Dialect
import com.coffee.generator.HlvlGenerator
import com.coffee.generator.TransformationRules

class HlvlExtendedParser extends AbstractHLVLParser implements IHlvlExtendedParser {
	
	new(String name, Dialect dialect, TransformationRules transformationRules) {
		super(name, dialect)
		setTransformationRules(transformationRules)
	}
}
