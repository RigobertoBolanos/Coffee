package com.coffee.generator;

import java.util.Iterator;

import com.coffee.hlvl.Decomposition;
import com.coffee.hlvl.ElmDeclaration;
import com.coffee.hlvl.Group;
import com.coffee.hlvl.Model;
import com.coffee.hlvl.RelDeclaration;

/**
 * type of problem can be 
 * BASIC_BOOL, for models with the basic constructs and translated into boolean problems
 * BASIC_INT, for models with the basic constructs and translated into integer problems
 * ATTRIBUTE, for models with attributes
 * MULTIPLICITY for models with multiplicities
 * Modified on july 2019 
 * 
 * Modified on september 2nd 2020
 *  * HLVL_EXTENDED, for models that use scalability mecanisms
*/
public enum Dialect {
	BASIC_BOOL,
	BASIC_INT,
	COMPLEX_BOOL,
	COMPLEX_INT,
	ATTRIBUTE,
	MULTIPLICITY,
	HLVL_EXTENDED_BOOLEAN,
	HLVL_EXTENDED_INTEGER;
	
	/**
	 * instantiable is a flag for determine if the variability model has multiplicities
	 */
	private static boolean instantiable = false;
	/**
	 * attributes is a flag for determine if the variability model has attributes 
	 */
	private static boolean attributes = false;
	
	public static Dialect findDialect(Model model) {
		/*
		 * A problem is BASIC iff it doesn't have multiplicity or [n,m] groups and:
		 * 1. All elements of type boolean
		 * 3. decompositions with cardinality: [0, 1], [1,1]
		 * 4. groups with cardinality: [1, 1], [1,*]
		 * 5. boolean expressions
		 * 
		 * A problem is of type Multiplicity iff
		 * 1. decompositions with cardinality [n,m]
		 * 
		 * A problem is HLVL-EXTENDED when mecanisms for scalability are specified:
		 * 1. extended models for inheritence
		 * 
		 * else it is an ATTIRBUTE
		 */
		// FIXME arreglar lo de los atributos
		boolean allElementsBooleanNotAttributes = allElementsBoolean(model);
		boolean basicRelationsNotMultiplicity = booleanRelations(model);

		if (hasScalabilityMecanism(model)) { // HLVL-E
			if (allElementsBooleanNotAttributes && basicRelationsNotMultiplicity) {
				return Dialect.HLVL_EXTENDED_BOOLEAN;
			} //else if (existInstantiable()) {
			//return Dialect.HLVL_EXTENDED_INTEGER;
		} else if (allElementsBooleanNotAttributes && basicRelationsNotMultiplicity) {
			return Dialect.BASIC_BOOL;
		} else if (existInstantiable()) {
			return Dialect.MULTIPLICITY;
		}
		
		return Dialect.ATTRIBUTE;
	}

	/**
	 * Method to determine the type of the variables 
	 * If there are one variable that cannot be mapped into a boolean
	 * variable, then the method returns CSP. 
	 * @param model
	 * @return true if all elements are booleans
	 */
	public static boolean allElementsBoolean(Model model) {
		boolean isBoolean = true;
		for (ElmDeclaration element : model.getElements()) {
			attributes = (element.getAtt() == null);
			if (element.getDataType() == "integer" || element.getDataType() == "symbolic" || element.getAtt() != null) {
				isBoolean = false;
				return isBoolean;
			}
		}
		return isBoolean;
	}

	/**
	 * Method to determine the type of the constraints 
	 * If there are one constraint that cannot be mapped into a boolean
	 * constraint, then the method returns false. 
	 * @param model
	 * @return true if all constraints can be mapped to boolean
	 */
	public static boolean booleanRelations(Model model) {
		boolean allBoolean = true;

		for (RelDeclaration rel : model.getRelations()) {
			// if a relation is of type multi-instantions, 
			// the problem cannot be boolean
			if(rel.getExp() instanceof Decomposition) {
				int min = ((Decomposition)(rel.getExp())).getMin();
				int max = ((Decomposition)(rel.getExp())).getMax();
				
				if(!(min == 1 && max == 1) && //[1,1]
					!(min == 0 && max == 1)) // && //[0..1]
				{
					instantiable = true;
					return false;
				}
					
			} else if (rel.getExp() instanceof Group) {
				int min = ((Group)(rel.getExp())).getMin();
				int numChildren = ((Group)(rel.getExp())).getChildren().getValues().size();
				int max;
				if (((Group)(rel.getExp())).getMax().getValue() == "*") {
					max = numChildren;
				} else {
					max = Integer.parseInt(((Group)(rel.getExp())).getMax().getValue());
				}

				if (!(min == 1 && max == 1) && // [1,1] 
				!(min == 1 && (max == numChildren)) // && //[1,n] , [1,*]
				) {
					return false;
				}
			}
				
		}
		// if the loop is finished, then the model has all boolean relations
		return allBoolean;
	}

	public static boolean existInstantiable() {
		return instantiable;
	}

	/**
	 * HLVL-E
	 * Method that defines if a model specifies the HLVL-EXTENDED dialect, that is:
	 * 1. Uses inheritance
	 * @param model: abstract representation of the model
	 * @return true if the model specifies one of the previous mecanism, false otherwise
	 */
	public static boolean hasScalabilityMecanism(Model model) {

		boolean isHlvlExtended = false;
		if (model.getExtendedModels() != null && !model.getExtendedModels().isEmpty()) {
			isHlvlExtended = true;
		}
		return isHlvlExtended;
	}

}
