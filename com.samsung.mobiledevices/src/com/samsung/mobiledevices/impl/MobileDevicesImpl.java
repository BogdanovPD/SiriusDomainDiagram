/**
 */
package com.samsung.mobiledevices.impl;

import com.samsung.mobiledevices.MobileDevice;
import com.samsung.mobiledevices.MobileDevices;
import com.samsung.mobiledevices.MobiledevicesPackage;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile Devices</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.samsung.mobiledevices.impl.MobileDevicesImpl#getMobiledevice <em>Mobiledevice</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobileDevicesImpl extends MinimalEObjectImpl.Container implements MobileDevices {
	/**
	 * The cached value of the '{@link #getMobiledevice() <em>Mobiledevice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobiledevice()
	 * @generated
	 * @ordered
	 */
	protected EList<MobileDevice> mobiledevice;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileDevicesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobiledevicesPackage.Literals.MOBILE_DEVICES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobileDevice> getMobiledevice() {
		if (mobiledevice == null) {
			mobiledevice = new EObjectContainmentEList<MobileDevice>(MobileDevice.class, this, MobiledevicesPackage.MOBILE_DEVICES__MOBILEDEVICE);
		}
		return mobiledevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobiledevicesPackage.MOBILE_DEVICES__MOBILEDEVICE:
				return ((InternalEList<?>)getMobiledevice()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobiledevicesPackage.MOBILE_DEVICES__MOBILEDEVICE:
				return getMobiledevice();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobiledevicesPackage.MOBILE_DEVICES__MOBILEDEVICE:
				getMobiledevice().clear();
				getMobiledevice().addAll((Collection<? extends MobileDevice>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobiledevicesPackage.MOBILE_DEVICES__MOBILEDEVICE:
				getMobiledevice().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobiledevicesPackage.MOBILE_DEVICES__MOBILEDEVICE:
				return mobiledevice != null && !mobiledevice.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MobileDevicesImpl
