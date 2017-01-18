/**
 */
package com.samsung.mobiledevices.impl;

import com.samsung.mobiledevices.MobiledevicesPackage;
import com.samsung.mobiledevices.Tablet;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tablet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.samsung.mobiledevices.impl.TabletImpl#isIsCellular <em>Is Cellular</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TabletImpl extends MobileDeviceImpl implements Tablet {
	/**
	 * The default value of the '{@link #isIsCellular() <em>Is Cellular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCellular()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CELLULAR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCellular() <em>Is Cellular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCellular()
	 * @generated
	 * @ordered
	 */
	protected boolean isCellular = IS_CELLULAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TabletImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobiledevicesPackage.Literals.TABLET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCellular() {
		return isCellular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCellular(boolean newIsCellular) {
		boolean oldIsCellular = isCellular;
		isCellular = newIsCellular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobiledevicesPackage.TABLET__IS_CELLULAR, oldIsCellular, isCellular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void tabletApp() {
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobiledevicesPackage.TABLET__IS_CELLULAR:
				return isIsCellular();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobiledevicesPackage.TABLET__IS_CELLULAR:
				setIsCellular((Boolean)newValue);
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
			case MobiledevicesPackage.TABLET__IS_CELLULAR:
				setIsCellular(IS_CELLULAR_EDEFAULT);
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
			case MobiledevicesPackage.TABLET__IS_CELLULAR:
				return isCellular != IS_CELLULAR_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case MobiledevicesPackage.TABLET___TABLET_APP:
				tabletApp();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isCellular: ");
		result.append(isCellular);
		result.append(')');
		return result.toString();
	}

} //TabletImpl
