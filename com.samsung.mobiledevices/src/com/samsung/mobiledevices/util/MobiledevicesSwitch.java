/**
 */
package com.samsung.mobiledevices.util;

import com.samsung.mobiledevices.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.samsung.mobiledevices.MobiledevicesPackage
 * @generated
 */
public class MobiledevicesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobiledevicesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobiledevicesSwitch() {
		if (modelPackage == null) {
			modelPackage = MobiledevicesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MobiledevicesPackage.MOBILE_DEVICES: {
				MobileDevices mobileDevices = (MobileDevices)theEObject;
				T result = caseMobileDevices(mobileDevices);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobiledevicesPackage.MOBILE_DEVICE: {
				MobileDevice mobileDevice = (MobileDevice)theEObject;
				T result = caseMobileDevice(mobileDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobiledevicesPackage.TABLET: {
				Tablet tablet = (Tablet)theEObject;
				T result = caseTablet(tablet);
				if (result == null) result = caseMobileDevice(tablet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobiledevicesPackage.SMARTPHONE: {
				Smartphone smartphone = (Smartphone)theEObject;
				T result = caseSmartphone(smartphone);
				if (result == null) result = caseMobileDevice(smartphone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobiledevicesPackage.TABLET_DEVICE: {
				TabletDevice tabletDevice = (TabletDevice)theEObject;
				T result = caseTabletDevice(tabletDevice);
				if (result == null) result = caseTablet(tabletDevice);
				if (result == null) result = caseMobileDevice(tabletDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobiledevicesPackage.SMARTPHONE_DEVICE: {
				SmartphoneDevice smartphoneDevice = (SmartphoneDevice)theEObject;
				T result = caseSmartphoneDevice(smartphoneDevice);
				if (result == null) result = caseSmartphone(smartphoneDevice);
				if (result == null) result = caseMobileDevice(smartphoneDevice);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile Devices</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile Devices</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileDevices(MobileDevices object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobileDevice(MobileDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tablet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tablet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTablet(Tablet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smartphone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smartphone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartphone(Smartphone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tablet Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tablet Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTabletDevice(TabletDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Smartphone Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Smartphone Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmartphoneDevice(SmartphoneDevice object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MobiledevicesSwitch
