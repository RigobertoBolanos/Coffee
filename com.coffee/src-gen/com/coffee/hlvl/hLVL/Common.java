/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.Common#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.hLVL.HLVLPackage#getCommon()
 * @model
 * @generated
 */
public interface Common extends Relation
{
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
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getCommon_Elements()
   * @model containment="true"
   * @generated
   */
  ListOfIDs getElements();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Common#getElements <em>Elements</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Elements</em>' containment reference.
   * @see #getElements()
   * @generated
   */
  void setElements(ListOfIDs value);

} // Common
