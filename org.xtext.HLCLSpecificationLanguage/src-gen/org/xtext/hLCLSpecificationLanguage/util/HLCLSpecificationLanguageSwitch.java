/**
 * generated by Xtext 2.12.0
 */
package org.xtext.hLCLSpecificationLanguage.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.hLCLSpecificationLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.hLCLSpecificationLanguage.HLCLSpecificationLanguagePackage
 * @generated
 */
public class HLCLSpecificationLanguageSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static HLCLSpecificationLanguagePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HLCLSpecificationLanguageSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = HLCLSpecificationLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case HLCLSpecificationLanguagePackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.VAR_DECLARATION:
      {
        VarDeclaration varDeclaration = (VarDeclaration)theEObject;
        T result = caseVarDeclaration(varDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.VARIANT_DECLARATION:
      {
        VariantDeclaration variantDeclaration = (VariantDeclaration)theEObject;
        T result = caseVariantDeclaration(variantDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.VARIANTS_INTERVAL:
      {
        variantsInterval variantsInterval = (variantsInterval)theEObject;
        T result = casevariantsInterval(variantsInterval);
        if (result == null) result = caseVariantDeclaration(variantsInterval);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.VARIANTS_ENUMERATION:
      {
        variantsEnumeration variantsEnumeration = (variantsEnumeration)theEObject;
        T result = casevariantsEnumeration(variantsEnumeration);
        if (result == null) result = caseVariantDeclaration(variantsEnumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.ENUMERATION:
      {
        Enumeration enumeration = (Enumeration)theEObject;
        T result = caseEnumeration(enumeration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.CONSTRAINT:
      {
        Constraint constraint = (Constraint)theEObject;
        T result = caseConstraint(constraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.CONS_EXPRESSION:
      {
        ConsExpression consExpression = (ConsExpression)theEObject;
        T result = caseConsExpression(consExpression);
        if (result == null) result = caseExpression(consExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.ID_CONS:
      {
        IDCons idCons = (IDCons)theEObject;
        T result = caseIDCons(idCons);
        if (result == null) result = caseConsExpression(idCons);
        if (result == null) result = caseExpression(idCons);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.REFINEMENT:
      {
        Refinement refinement = (Refinement)theEObject;
        T result = caseRefinement(refinement);
        if (result == null) result = caseConsExpression(refinement);
        if (result == null) result = caseExpression(refinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseRefinement(assignment);
        if (result == null) result = caseConsExpression(assignment);
        if (result == null) result = caseExpression(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.VAR_REFINEMENT:
      {
        VarRefinement varRefinement = (VarRefinement)theEObject;
        T result = caseVarRefinement(varRefinement);
        if (result == null) result = caseRefinement(varRefinement);
        if (result == null) result = caseConsExpression(varRefinement);
        if (result == null) result = caseExpression(varRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.SET_REFINEMENT:
      {
        SetRefinement setRefinement = (SetRefinement)theEObject;
        T result = caseSetRefinement(setRefinement);
        if (result == null) result = caseRefinement(setRefinement);
        if (result == null) result = caseConsExpression(setRefinement);
        if (result == null) result = caseExpression(setRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = caseConsExpression(rule);
        if (result == null) result = caseExpression(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.FODA_UN:
      {
        FodaUN fodaUN = (FodaUN)theEObject;
        T result = caseFodaUN(fodaUN);
        if (result == null) result = caseConsExpression(fodaUN);
        if (result == null) result = caseExpression(fodaUN);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.FODA_BIN:
      {
        FodaBin fodaBin = (FodaBin)theEObject;
        T result = caseFodaBin(fodaBin);
        if (result == null) result = caseConsExpression(fodaBin);
        if (result == null) result = caseExpression(fodaBin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.FODA_NARY:
      {
        FodaNary fodaNary = (FodaNary)theEObject;
        T result = caseFodaNary(fodaNary);
        if (result == null) result = caseConsExpression(fodaNary);
        if (result == null) result = caseExpression(fodaNary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.LIST_OF_VALUES:
      {
        ListOfValues listOfValues = (ListOfValues)theEObject;
        T result = caseListOfValues(listOfValues);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case HLCLSpecificationLanguagePackage.LIST_OF_IDS:
      {
        ListOfIDs listOfIDs = (ListOfIDs)theEObject;
        T result = caseListOfIDs(listOfIDs);
        if (result == null) result = caseEnumeration(listOfIDs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarDeclaration(VarDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Variant Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Variant Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVariantDeclaration(VariantDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variants Interval</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variants Interval</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariantsInterval(variantsInterval object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>variants Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>variants Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevariantsEnumeration(variantsEnumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Enumeration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEnumeration(Enumeration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstraint(Constraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cons Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cons Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsExpression(ConsExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID Cons</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID Cons</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIDCons(IDCons object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefinement(Refinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Var Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Var Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVarRefinement(VarRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetRefinement(SetRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foda UN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foda UN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFodaUN(FodaUN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foda Bin</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foda Bin</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFodaBin(FodaBin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Foda Nary</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Foda Nary</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFodaNary(FodaNary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Of Values</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Of Values</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListOfValues(ListOfValues object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Of IDs</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Of IDs</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListOfIDs(ListOfIDs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //HLCLSpecificationLanguageSwitch
