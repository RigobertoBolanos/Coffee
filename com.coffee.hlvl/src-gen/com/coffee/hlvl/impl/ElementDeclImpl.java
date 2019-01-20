/**
 * generated by Xtext 2.12.0
 */
package com.coffee.hlvl.impl;

import com.coffee.hlvl.ElementDecl;
import com.coffee.hlvl.HlvlPackage;
import com.coffee.hlvl.OptionsDeclaration;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.coffee.hlvl.impl.ElementDeclImpl#getVariants <em>Variants</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementDeclImpl extends VariableDeclImpl implements ElementDecl
{
  /**
   * The cached value of the '{@link #getVariants() <em>Variants</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariants()
   * @generated
   * @ordered
   */
  protected OptionsDeclaration variants;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementDeclImpl()
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
    return HlvlPackage.Literals.ELEMENT_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionsDeclaration getVariants()
  {
    return variants;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetVariants(OptionsDeclaration newVariants, NotificationChain msgs)
  {
    OptionsDeclaration oldVariants = variants;
    variants = newVariants;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, HlvlPackage.ELEMENT_DECL__VARIANTS, oldVariants, newVariants);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setVariants(OptionsDeclaration newVariants)
  {
    if (newVariants != variants)
    {
      NotificationChain msgs = null;
      if (variants != null)
        msgs = ((InternalEObject)variants).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - HlvlPackage.ELEMENT_DECL__VARIANTS, null, msgs);
      if (newVariants != null)
        msgs = ((InternalEObject)newVariants).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - HlvlPackage.ELEMENT_DECL__VARIANTS, null, msgs);
      msgs = basicSetVariants(newVariants, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HlvlPackage.ELEMENT_DECL__VARIANTS, newVariants, newVariants));
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
      case HlvlPackage.ELEMENT_DECL__VARIANTS:
        return basicSetVariants(null, msgs);
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
      case HlvlPackage.ELEMENT_DECL__VARIANTS:
        return getVariants();
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
      case HlvlPackage.ELEMENT_DECL__VARIANTS:
        setVariants((OptionsDeclaration)newValue);
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
      case HlvlPackage.ELEMENT_DECL__VARIANTS:
        setVariants((OptionsDeclaration)null);
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
      case HlvlPackage.ELEMENT_DECL__VARIANTS:
        return variants != null;
    }
    return super.eIsSet(featureID);
  }

} //ElementDeclImpl
