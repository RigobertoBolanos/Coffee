/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.Visibility#getCondition <em>Condition</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.Visibility#getList <em>List</em>}</li>
 * </ul>
 *
 * @see com.coffee.hlvl.hLVL.HLVLPackage#getVisibility()
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
   * @see #setCondition(Relational)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getVisibility_Condition()
   * @model containment="true"
   * @generated
   */
  Relational getCondition();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Visibility#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(Relational value);

  /**
   * Returns the value of the '<em><b>List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>List</em>' containment reference.
   * @see #setList(ListOfRelRefs)
   * @see com.coffee.hlvl.hLVL.HLVLPackage#getVisibility_List()
   * @model containment="true"
   * @generated
   */
  ListOfRelRefs getList();

  /**
   * Sets the value of the '{@link com.coffee.hlvl.hLVL.Visibility#getList <em>List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>List</em>' containment reference.
   * @see #getList()
   * @generated
   */
  void setList(ListOfRelRefs value);

} // Visibility
