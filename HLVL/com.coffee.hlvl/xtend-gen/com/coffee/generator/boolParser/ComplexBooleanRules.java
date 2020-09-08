package com.coffee.generator.boolParser;

import com.coffee.generator.ComplexTransformationRules;
import com.coffee.generator.Dialect;
import com.coffee.generator.boolParser.BasicBooleanRules;
import com.coffee.generator.commons.IMiniZincConstants;
import com.coffee.generator.expressionsParser.BooleanExpressionsParser;
import com.coffee.hlvl.ComplexImplies;
import com.coffee.hlvl.ComplexMutex;
import com.coffee.hlvl.Visibility;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;

/**
 * class implementing the boolean transformation rules for in Benavides2010
 * for obtaining the HLCL representation in the MiniZinc language.
 * This class implements TransformationRules
 * @author Angela Villota
 * @version HLVL V1.4
 * August 2018
 * updated on May 2019
 * modified on July 2019 to comply with the modifications in the syntax method: getDecomposition
 * fixed a bug in the group with cardinality [1,1]
 */
@SuppressWarnings("all")
public class ComplexBooleanRules extends BasicBooleanRules implements IMiniZincConstants, ComplexTransformationRules {
  /**
   * integer variable to produce the identifiers for the variables and constraints
   * in visibility relations
   */
  private int visibilityIdCounter;
  
  private BooleanExpressionsParser expressionsParser;
  
  public ComplexBooleanRules(final Dialect dialect) {
    super(dialect);
    BooleanExpressionsParser _booleanExpressionsParser = new BooleanExpressionsParser();
    this.expressionsParser = _booleanExpressionsParser;
    this.expressionsParser.setDialect(dialect);
    this.visibilityIdCounter = 0;
  }
  
  @Override
  public CharSequence getVisibility(final Visibility rel, final List<CharSequence> relations) {
    String _xblockexpression = null;
    {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var bool: B");
      _builder.append(this.visibilityIdCounter);
      _builder.append(IMiniZincConstants.SEMICOLON);
      _builder.newLineIfNotEmpty();
      _builder.append("constraint ");
      CharSequence _parse = this.expressionsParser.parse(rel.getCondition());
      _builder.append(_parse);
      _builder.append(" -> B");
      _builder.append(this.visibilityIdCounter);
      _builder.append(IMiniZincConstants.SEMICOLON);
      _builder.newLineIfNotEmpty();
      String out = _builder.toString();
      for (final CharSequence r : relations) {
        String _out = out;
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("constraint B");
        _builder_1.append(this.visibilityIdCounter);
        _builder_1.append("  <-> ");
        CharSequence _subSequence = r.subSequence(10, r.length());
        _builder_1.append(_subSequence);
        _builder_1.newLineIfNotEmpty();
        out = (_out + _builder_1);
      }
      this.visibilityIdCounter++;
      _xblockexpression = out;
    }
    return _xblockexpression;
  }
  
  @Override
  public CharSequence getComplexImplies(final ComplexImplies rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type ReferencedElement");
  }
  
  @Override
  public CharSequence getComplexMutex(final ComplexMutex rel) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field name is undefined for the type ReferencedElement");
  }
}
