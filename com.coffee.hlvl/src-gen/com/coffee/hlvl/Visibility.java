/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.Visibility#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.coffee.hlvl.Visibility#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.HlvlPackage#getVisibility()
 * @model
 * @generated
 */
public interface Visibility extends Relation
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(ConsExpression)
   * @see com.coffee.hlvl.HlvlPackage#getVisibility_Condition()
   * @model containment="true"
   * @generated
   */
  ConsExpression getCondition();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.Visibility#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(ConsExpression value);

  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link com.coffee.hlvl.ListOfRelRefs}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see com.coffee.hlvl.HlvlPackage#getVisibility_Children()
   * @model containment="true"
   * @generated
   */
  EList<ListOfRelRefs> getChildren();

} // Visibility
