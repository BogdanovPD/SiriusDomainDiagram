/**
 */
package com.samsung.mobiledevices.impl;

import com.samsung.mobiledevices.MobiledevicesPackage;
import com.samsung.mobiledevices.Smartphone;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Smartphone</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SmartphoneImpl extends MobileDeviceImpl implements Smartphone {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SmartphoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobiledevicesPackage.Literals.SMARTPHONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void smartphoneApp() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void doCall() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MobiledevicesPackage.SMARTPHONE___SMARTPHONE_APP:
				smartphoneApp();
				return null;
			case MobiledevicesPackage.SMARTPHONE___DO_CALL:
				doCall();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SmartphoneImpl
