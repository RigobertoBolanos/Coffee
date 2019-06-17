/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.Group#getMin <em>Min</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.Group#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.hLVL.HLVLPackage#getGroup()
 * @model
 * @generated
 */
public interface Group extends Hierarchy
{
  /**
   * Returns the value of the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Min</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Min</em>' attribute.
   * @see #setMin(int)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getGroup_Min()
   * @model
   * @generated
   */
  int getMin();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Group#getMin <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Min</em>' attribute.
   * @see #getMin()
   * @generated
   */
  void setMin(int value);

  /**
   * Returns the value of the '<em><b>Max</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Max</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Max</em>' containment reference.
   * @see #setMax(Range)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getGroup_Max()
   * @model containment="true"
   * @generated
   */
  Range getMax();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Group#getMax <em>Max</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Max</em>' containment reference.
   * @see #getMax()
   * @generated
   */
  void setMax(Range value);

} // Group
