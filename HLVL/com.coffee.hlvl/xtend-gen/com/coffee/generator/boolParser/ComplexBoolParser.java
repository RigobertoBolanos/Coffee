package com.coffee.generator.boolParser;

import com.coffee.generator.AbstractHLVLParser;
import com.coffee.generator.Dialect;
import com.coffee.generator.boolParser.ComplexBooleanRules;
import com.coffee.hlvl.Relation;

@SuppressWarnings("all")
public class ComplexBoolParser extends AbstractHLVLParser {
  public ComplexBoolParser(final String name, final Dialect dialect) {
    super(name, dialect);
    ComplexBooleanRules _complexBooleanRules = new ComplexBooleanRules(dialect);
    this.setTransformationRules(_complexBooleanRules);
  }
  
  /**
   * This method parses a variability relation individually.
   * First, the type of variability relation is determined, then a call to the transfromationRules object
   * is performed to transform each variability relation into a set of constraints considering the type of problem.
   * @param rel is a variability relation
   */
  @Override
  public CharSequence parseRelation(final Relation rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from ReferencedElement to ElmDeclaration"
      + "\nType mismatch: cannot convert from ReferencedElement to ElmDeclaration"
      + "\nType mismatch: cannot convert from ReferencedElement to ElmDeclaration"
      + "\nType mismatch: cannot convert from ReferencedElement to ElmDeclaration");
  }
}
