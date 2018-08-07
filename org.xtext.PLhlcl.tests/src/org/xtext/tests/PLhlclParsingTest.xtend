/*
 * generated by Xtext 2.12.0
 */
package org.xtext.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.pLhlcl.Model
import org.xtext.pLhlcl.PLhlclPackage

/**
 * Class to test the product lines grammar and its parsing
 * @author Angela Villota
 * @version CP-HLCL V2
 * July 2018
 */
@RunWith(XtextRunner)
@InjectWith(PLhlclInjectorProvider)
class PLhlclParsingTest {
	@Inject
	ParseHelper<Model> parseHelper
	@Inject extension ParseHelper
	@Inject extension ValidationTestHelper
	
/*********************************************************************************************************
 * Methods to test the parser
 * 
 */	
/**
 * Method to test the interpretation of an empty program
 */
	@Test
	def void emptyModel() {
		// model is a program in PLEC
		val model = 
		'''
		model empty
		variables:
		constraints:
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
	}
	
/**
 * Declaring a boolean var without domain
 */
	@Test
	def void booleanVar() {
		// model is a program in PLEC
		val model = 
		'''
		model m1
		variables:
		boolean A 
		constraints:
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
	}

/**
 * Declaring an integer var with an enumeration
 */
	@Test
	def void integerVarEnum() {
		// model is a program in PLEC
		val model = 
		'''
		model m1
		variables:
		integer A values: [10, 20, 30, 40]
		constraints:
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
	}

/**
 * Declaring an integer var with an enumeration
 */
	@Test
	def void integerVarInterval() {
		// model is a program in PLEC
		val model = 
		'''
		model m1
		variables:
		integer A values: 1..100
		constraints:
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
	}
	
/**
 * Declaring boolean instanciable variables
 */
	@Test
	def void boolInstantiable() {
		// model is a program in PLEC
		val model = 
		'''
		model m1
		variables:
		instantiable [2,5] boolean A
		constraints:
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		printErrors(empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
		
	}
/**
 * Declaring integer instanciable interval variable
 */
	@Test
	def void integerIntervalInstantiable() {
		// model is a program in PLEC
		val model = 
		'''
		model m1
		variables:
		instantiable [2,5] integer A values: 1..100 
		constraints:
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
	}

/**
 * Declaring integer instanciable enumeration variable
 */
	@Test
	def void integerEnumerationInstantiable() {
		// model is a program in PLEC
		val model = 
		'''
		model m1
		variables:
		instantiable [2,5] integer A values: [10, 20, 30, 40] 
		constraints:
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
		printErrors( empty)
	}

/**
 * Declaring structural relations
 */
	@Test
	def void structural() {
		// model is a program in PLEC
		val model = 
		'''
		model m1
		variables:
		boolean GPL
		boolean GType
		boolean Weight
		boolean Search
		boolean Algorithms
		constraints:
		c1: structural: GPL variants: [GType, GPL, Weight, Search, Algorithms] 
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		printErrors( empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
	}

	@Test
	def void structuralCard() {
		// model is a program in PLEC
		val model = 
		'''
		model GPL
		variables:
		boolean GType
		boolean Weight
		boolean Search
		boolean Algorithms
		constraints:
		c1: structural: GPL variants: [GType, GPL, Weight, Search, Algorithms] card:[1,1]
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		printErrors( empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
	}
/**
 * Declaring attributes
 */
	@Test
	def void attributes() {
		// model is a program in PLEC
		val model = 
		'''
		model m1
		variables:
		boolean GPL
		boolean GType
		boolean Weight
		boolean Search
		boolean Algorithms
		integer Memory values: [2, 4, 8, 16, 32]
		constraints:
		c1: attributes: [Memory] of Search 
		'''
		//empty is an empty model
		val empty = parseHelper.parse(model)
		Assert.assertNotNull(empty)
		printErrors( empty)
		Assert.assertTrue(empty.eResource.errors.isEmpty)
	}


/**
 * Declaring requires relations
 */
 	@Test
	def void requires() {
		// model is a program in PLEC
		val program = 
		'''
		model GPL
		variables:
		boolean GType
		boolean Weight
		boolean Search
		boolean Algorithms
		constraints:
		c1: GType requires Search
		'''
		
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		printErrors(model)
		Assert.assertTrue(model.eResource.errors.isEmpty)
	}
 /**
 * Declaring excludes relations
 */
 	 	@Test
	def void excludes() {
		// model is a program in PLEC
		val program = 
		'''
		model GPL
		variables:
		boolean GType
		boolean Weight
		boolean Search
		boolean Algorithms
		constraints:
		c1: GType excludes Search
		'''
		
		val model = parseHelper.parse(program)
		Assert.assertNotNull(model)
		printErrors(model)
		Assert.assertTrue(model.eResource.errors.isEmpty)
	}
/*****************************************************************************************************
 * Testing errors and validations
 */
	@Test
	def void integerNoDomainError(){
		val model= 
		'''
		model m1
		variables:
		integer A 
		constraints: 
		'''.parse
		model.assertError(PLhlclPackage::eINSTANCE.varDeclaration, 
			null,
			 "A variants declaration is required for variable 'A'"
		)
	}
	
		@Test
	def void stringNoDomainError(){
		val model= 
		'''
		model m1
		variables:
		symbolic A 
		constraints: 
		'''.parse
		model.assertError(PLhlclPackage::eINSTANCE.varDeclaration, 
			null,
			 "A variants declaration is required for variable 'A'"
		)
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
