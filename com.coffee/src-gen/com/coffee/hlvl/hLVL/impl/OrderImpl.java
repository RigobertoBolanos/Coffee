/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.hLVL.impl;

import com.coffee.hlvl.hLVL.ElmDeclaration;
import com.coffee.hlvl.hLVL.HLVLPackage;
import com.coffee.hlvl.hLVL.ListOfIDs;
import com.coffee.hlvl.hLVL.Order;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.hLVL.impl.OrderImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.impl.OrderImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link com.coffee.hlvl.hLVL.impl.OrderImpl#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends RelationImpl implements Order
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected ElmDeclaration left;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected EList<ListOfIDs> right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrderImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HLVLPackage.Literals.ORDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HLVLPackage.ORDER__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration getLeft()
  {
    if (left != null && left.eIsProxy())
    {
      InternalEObject oldLeft = (InternalEObject)left;
      left = (ElmDeclaration)eResolveProxy(oldLeft);
      if (left != oldLeft)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, HLVLPackage.ORDER__LEFT, oldLeft, left));
      }
    }
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElmDeclaration basicGetLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(ElmDeclaration newLeft)
  {
    ElmDeclaration oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HLVLPackage.ORDER__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ListOfIDs> getRight()
  {
    if (right == null)
    {
      right = new EObjectContainmentEList<ListOfIDs>(ListOfIDs.class, this, HLVLPackage.ORDER__RIGHT);
    }
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case HLVLPackage.ORDER__RIGHT:
        return ((InternalEList<?>)getRight()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HLVLPackage.ORDER__OPERATOR:
        return getOperator();
      case HLVLPackage.ORDER__LEFT:
        if (resolve) return getLeft();
        return basicGetLeft();
      case HLVLPackage.ORDER__RIGHT:
        return getRight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HLVLPackage.ORDER__OPERATOR:
        setOperator((String)newValue);
        return;
      case HLVLPackage.ORDER__LEFT:
        setLeft((ElmDeclaration)newValue);
        return;
      case HLVLPackage.ORDER__RIGHT:
        getRight().clear();
        getRight().addAll((Collection<? extends ListOfIDs>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HLVLPackage.ORDER__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case HLVLPackage.ORDER__LEFT:
        setLeft((ElmDeclaration)null);
        return;
      case HLVLPackage.ORDER__RIGHT:
        getRight().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HLVLPackage.ORDER__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case HLVLPackage.ORDER__LEFT:
        return left != null;
      case HLVLPackage.ORDER__RIGHT:
        return right != null && !right.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //OrderImpl
