/**
 * generated by Xtext 2.22.0
 */
package com.coffee.hlvl.impl;

import com.coffee.hlvl.HlvlPackage;
import com.coffee.hlvl.Pair;
import com.coffee.hlvl.ReferencedElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pair</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.impl.PairImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link com.coffee.hlvl.impl.PairImpl#getVar1 <em>Var1</em>}</li>
 *   <li>{@link com.coffee.hlvl.impl.PairImpl#getVar2 <em>Var2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PairImpl extends RelationImpl implements Pair
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
   * The cached value of the '{@link #getVar1() <em>Var1</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar1()
   * @generated
   * @ordered
   */
  protected ReferencedElement var1;

  /**
   * The cached value of the '{@link #getVar2() <em>Var2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVar2()
   * @generated
   * @ordered
   */
  protected ReferencedElement var2;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PairImpl()
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
    return HlvlPackage.Literals.PAIR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.PAIR__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReferencedElement getVar1()
  {
    return var1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar1(ReferencedElement newVar1, NotificationChain msgs)
  {
    ReferencedElement oldVar1 = var1;
    var1 = newVar1;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HlvlPackage.PAIR__VAR1, oldVar1, newVar1);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar1(ReferencedElement newVar1)
  {
    if (newVar1 != var1)
    {
      NotificationChain msgs = null;
      if (var1 != null)
        msgs = ((InternalEObject)var1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HlvlPackage.PAIR__VAR1, null, msgs);
      if (newVar1 != null)
        msgs = ((InternalEObject)newVar1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HlvlPackage.PAIR__VAR1, null, msgs);
      msgs = basicSetVar1(newVar1, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.PAIR__VAR1, newVar1, newVar1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ReferencedElement getVar2()
  {
    return var2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVar2(ReferencedElement newVar2, NotificationChain msgs)
  {
    ReferencedElement oldVar2 = var2;
    var2 = newVar2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HlvlPackage.PAIR__VAR2, oldVar2, newVar2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVar2(ReferencedElement newVar2)
  {
    if (newVar2 != var2)
    {
      NotificationChain msgs = null;
      if (var2 != null)
        msgs = ((InternalEObject)var2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HlvlPackage.PAIR__VAR2, null, msgs);
      if (newVar2 != null)
        msgs = ((InternalEObject)newVar2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HlvlPackage.PAIR__VAR2, null, msgs);
      msgs = basicSetVar2(newVar2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.PAIR__VAR2, newVar2, newVar2));
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
      case HlvlPackage.PAIR__VAR1:
        return basicSetVar1(null, msgs);
      case HlvlPackage.PAIR__VAR2:
        return basicSetVar2(null, msgs);
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
      case HlvlPackage.PAIR__OPERATOR:
        return getOperator();
      case HlvlPackage.PAIR__VAR1:
        return getVar1();
      case HlvlPackage.PAIR__VAR2:
        return getVar2();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HlvlPackage.PAIR__OPERATOR:
        setOperator((String)newValue);
        return;
      case HlvlPackage.PAIR__VAR1:
        setVar1((ReferencedElement)newValue);
        return;
      case HlvlPackage.PAIR__VAR2:
        setVar2((ReferencedElement)newValue);
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
      case HlvlPackage.PAIR__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case HlvlPackage.PAIR__VAR1:
        setVar1((ReferencedElement)null);
        return;
      case HlvlPackage.PAIR__VAR2:
        setVar2((ReferencedElement)null);
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
      case HlvlPackage.PAIR__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case HlvlPackage.PAIR__VAR1:
        return var1 != null;
      case HlvlPackage.PAIR__VAR2:
        return var2 != null;
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

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //PairImpl
