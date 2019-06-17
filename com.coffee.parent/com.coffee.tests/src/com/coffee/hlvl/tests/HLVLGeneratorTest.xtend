/*
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.tests

import com.coffee.hlvl.hLVL.Model
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import com.coffee.hlvl.generator.ParserFactory
import com.coffee.hlvl.generator.Dialect

@RunWith(XtextRunner)
@InjectWith(HLVLInjectorProvider)
class HLVLGeneratorTest {
	@Inject
	ParseHelper<Model> parseHelper
	
	
	@Test
	def void boolParser() {
		// An empty hlvl program
		val hlvlProgram = 
		'''
		model empty
		elements:
		boolean A
		boolean B
		relations:
		r1: common(A,B)
		'''
		//This verifies that the models is syntactically correct
		val model = parseHelper.parse(hlvlProgram)
		Assert.assertNotNull(model)
		printErrors(model)
		
		Assert.assertTrue(model.eResource.errors.isEmpty)
		Assert.assertTrue(model.eResource.errors.isEmpty)	
		
		// Expected code
		val expected=
		'''
		% Autogenerated code form the Coffee framework
		% Author: avillota
		% Variables from elements definitions 
		var bool : A ;
		var bool : B ;
		% Variables and constraints from the variability relations definition
		constraint A = true ;
		constraint B = true ;
		% The solving parameters from the parameters files
		'''
		//Obtained code
		val parser= ParserFactory.getParser(Dialect.BOOL, model.name);
		val actual= parser.parseModel(model)
		
		//Assert
		Assert.assertEquals(expected.toString, actual.toString)
	}
	
	@Test
	def void attParser() {
		// An empty hlvl program
		val hlvlProgram = 
		'''
		model empty
		elements:
		boolean A
		boolean B
		relations:
		r1: common(A,B)
		'''
		//This verifies that the models is syntactically correct
		val model = parseHelper.parse(hlvlProgram)
		Assert.assertNotNull(model)
		printErrors(model)
		
		Assert.assertTrue(model.eResource.errors.isEmpty)
		Assert.assertTrue(model.eResource.errors.isEmpty)	
		
		// Expected code
		val expected=
		'''
		% Autogenerated code form the Coffee framework
		% Author: avillota
		% Variables from elements definitions 
		var bool : A ;
		var bool : B ;
		% Variables and constraints from the variability relations definition
		constraint A = true ;
		constraint B = true ;
		% The solving parameters from the parameters files
		'''
		//Obtained code
		val parser= ParserFactory.getParser(Dialect.ATT, model.name);
		val actual= parser.parseModel(model)
		
		println(actual)
		//Assert
		Assert.assertEquals(expected.toString, actual.toString)
	}
	
/**********************************************************************************************************
* Auxiliar methods for testing
*/

	/**to print the parsing errors */
	def void printErrors(Model model){
		if (!model.eResource.errors.isEmpty){
			for (element : model.eResource.errors) {
				println( element.message)
			}
		}
		
	}
	
}
