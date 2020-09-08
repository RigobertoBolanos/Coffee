/**
 * generated by Xtext 2.22.0
 */
package com.coffee.hlvl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Pair#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.coffee.hlvl.Pair#getVar1 <em>Var1</em>}</li>
 *   <li>{@link com.coffee.hlvl.Pair#getVar2 <em>Var2</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getPair()
 * @model
 * @generated
 */
public interface Pair extends Relation
{
  /**
   * Returns the value of the '<em><b>Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Operator</em>' attribute.
   * @see #setOperator(String)
   * @see com.coffee.hlvl.HlvlPackage#getPair_Operator()
   * @model
   * @generated
   */
  String getOperator();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Pair#getOperator <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Operator</em>' attribute.
   * @see #getOperator()
   * @generated
   */
  void setOperator(String value);

  /**
   * Returns the value of the '<em><b>Var1</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var1</em>' containment reference.
   * @see #setVar1(ReferencedElement)
   * @see com.coffee.hlvl.HlvlPackage#getPair_Var1()
   * @model containment="true"
   * @generated
   */
  ReferencedElement getVar1();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Pair#getVar1 <em>Var1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var1</em>' containment reference.
   * @see #getVar1()
   * @generated
   */
  void setVar1(ReferencedElement value);

  /**
   * Returns the value of the '<em><b>Var2</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Var2</em>' containment reference.
   * @see #setVar2(ReferencedElement)
   * @see com.coffee.hlvl.HlvlPackage#getPair_Var2()
   * @model containment="true"
   * @generated
   */
  ReferencedElement getVar2();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Pair#getVar2 <em>Var2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Var2</em>' containment reference.
   * @see #getVar2()
   * @generated
   */
  void setVar2(ReferencedElement value);

} // Pair
