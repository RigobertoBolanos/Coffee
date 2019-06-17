/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complex Implies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.ComplexImplies#getExp <em>Exp</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.ComplexImplies#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.hLVL.HLVLPackage#getComplexImplies()
 * @model
 * @generated
 */
public interface ComplexImplies extends Relation
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(Relational)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getComplexImplies_Exp()
   * @model containment="true"
   * @generated
   */
  Relational getExp();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.ComplexImplies#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(Relational value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference.
   * @see #setElements(ListOfIDs)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getComplexImplies_Elements()
   * @model containment="true"
   * @generated
   */
  ListOfIDs getElements();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.ComplexImplies#getElements <em>Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elements</em>' containment reference.
   * @see #getElements()
   * @generated
   */
  void setElements(ListOfIDs value);

} // ComplexImplies
