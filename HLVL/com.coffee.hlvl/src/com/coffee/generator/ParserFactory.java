package com.coffee.generator;

import com.coffee.generator.boolParser.BasicBoolParser;
import com.coffee.generator.boolParser.ComplexBoolParser;
import com.coffee.generator.integerParser.AttributesParser;
import com.coffee.generator.integerParser.BasicIntegerParser;
import com.coffee.generator.integerParser.ComplexIntegerParser;

/**
 * Simple factory for creating concrete instances of code generators
 * for the High Level Variability Language (HLVL)
 * @author Angela Villota
 * @version HLVL 1.4
 * May 2019  
 * Modify on september 2nd, Case for hlvl extended added
 */

public class ParserFactory {
	 static public IHLVLParser getParser(Dialect dialect, String modelName ) {
		IHLVLParser generator=null;
		switch(dialect) {
		case BASIC_BOOL:
			generator= new BasicBoolParser(modelName, dialect);
			break;
		case BASIC_INT:
			generator= new BasicIntegerParser(modelName, dialect);
			break;
		case COMPLEX_BOOL:
			generator= new ComplexBoolParser(modelName, dialect);
			break;
		case COMPLEX_INT:
			generator= new ComplexIntegerParser(modelName, dialect);
			break;
		//HLVL-E: Case for hlvl extended added
//		case HLVL_EXTENDED_BOOLEAN:
//			generator= new HlvlExtendedParser(modelName, dialect);
//			break;
//		case HLVL_EXTENDED_INTEGER:
//			generator= new HlvlExtendedParser(modelName, dialect);
//			break;
		default:
			generator= new AttributesParser(modelName, dialect);	
		}
		return generator;
	}

}
