/**
 */
package com.samsung.mobiledevices.impl;

import com.samsung.mobiledevices.MobileDevice;
import com.samsung.mobiledevices.MobiledevicesPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile Device</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.samsung.mobiledevices.impl.MobileDeviceImpl#getScreenDiag <em>Screen Diag</em>}</li>
 *   <li>{@link com.samsung.mobiledevices.impl.MobileDeviceImpl#getBatteryCapacity <em>Battery Capacity</em>}</li>
 *   <li>{@link com.samsung.mobiledevices.impl.MobileDeviceImpl#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link com.samsung.mobiledevices.impl.MobileDeviceImpl#getCameraMpx <em>Camera Mpx</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MobileDeviceImpl extends MinimalEObjectImpl.Container implements MobileDevice {
	/**
	 * The default value of the '{@link #getScreenDiag() <em>Screen Diag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenDiag()
	 * @generated
	 * @ordered
	 */
	protected static final double SCREEN_DIAG_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScreenDiag() <em>Screen Diag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScreenDiag()
	 * @generated
	 * @ordered
	 */
	protected double screenDiag = SCREEN_DIAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getBatteryCapacity() <em>Battery Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryCapacity()
	 * @generated
	 * @ordered
	 */
	protected static final int BATTERY_CAPACITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBatteryCapacity() <em>Battery Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteryCapacity()
	 * @generated
	 * @ordered
	 */
	protected int batteryCapacity = BATTERY_CAPACITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected static final String DEVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeviceName() <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceName()
	 * @generated
	 * @ordered
	 */
	protected String deviceName = DEVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCameraMpx() <em>Camera Mpx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraMpx()
	 * @generated
	 * @ordered
	 */
	protected static final int CAMERA_MPX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCameraMpx() <em>Camera Mpx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCameraMpx()
	 * @generated
	 * @ordered
	 */
	protected int cameraMpx = CAMERA_MPX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileDeviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobiledevicesPackage.Literals.MOBILE_DEVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScreenDiag() {
		return screenDiag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScreenDiag(double newScreenDiag) {
		double oldScreenDiag = screenDiag;
		screenDiag = newScreenDiag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobiledevicesPackage.MOBILE_DEVICE__SCREEN_DIAG, oldScreenDiag, screenDiag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBatteryCapacity(int newBatteryCapacity) {
		int oldBatteryCapacity = batteryCapacity;
		batteryCapacity = newBatteryCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobiledevicesPackage.MOBILE_DEVICE__BATTERY_CAPACITY, oldBatteryCapacity, batteryCapacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeviceName() {
		return deviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceName(String newDeviceName) {
		String oldDeviceName = deviceName;
		deviceName = newDeviceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobiledevicesPackage.MOBILE_DEVICE__DEVICE_NAME, oldDeviceName, deviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCameraMpx() {
		return cameraMpx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCameraMpx(int newCameraMpx) {
		int oldCameraMpx = cameraMpx;
		cameraMpx = newCameraMpx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobiledevicesPackage.MOBILE_DEVICE__CAMERA_MPX, oldCameraMpx, cameraMpx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void powerOn() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void powerOff() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connectWiFi() {
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
			case MobiledevicesPackage.MOBILE_DEVICE__SCREEN_DIAG:
				return getScreenDiag();
			case MobiledevicesPackage.MOBILE_DEVICE__BATTERY_CAPACITY:
				return getBatteryCapacity();
			case MobiledevicesPackage.MOBILE_DEVICE__DEVICE_NAME:
				return getDeviceName();
			case MobiledevicesPackage.MOBILE_DEVICE__CAMERA_MPX:
				return getCameraMpx();
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
			case MobiledevicesPackage.MOBILE_DEVICE__SCREEN_DIAG:
				setScreenDiag((Double)newValue);
				return;
			case MobiledevicesPackage.MOBILE_DEVICE__BATTERY_CAPACITY:
				setBatteryCapacity((Integer)newValue);
				return;
			case MobiledevicesPackage.MOBILE_DEVICE__DEVICE_NAME:
				setDeviceName((String)newValue);
				return;
			case MobiledevicesPackage.MOBILE_DEVICE__CAMERA_MPX:
				setCameraMpx((Integer)newValue);
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
			case MobiledevicesPackage.MOBILE_DEVICE__SCREEN_DIAG:
				setScreenDiag(SCREEN_DIAG_EDEFAULT);
				return;
			case MobiledevicesPackage.MOBILE_DEVICE__BATTERY_CAPACITY:
				setBatteryCapacity(BATTERY_CAPACITY_EDEFAULT);
				return;
			case MobiledevicesPackage.MOBILE_DEVICE__DEVICE_NAME:
				setDeviceName(DEVICE_NAME_EDEFAULT);
				return;
			case MobiledevicesPackage.MOBILE_DEVICE__CAMERA_MPX:
				setCameraMpx(CAMERA_MPX_EDEFAULT);
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
			case MobiledevicesPackage.MOBILE_DEVICE__SCREEN_DIAG:
				return screenDiag != SCREEN_DIAG_EDEFAULT;
			case MobiledevicesPackage.MOBILE_DEVICE__BATTERY_CAPACITY:
				return batteryCapacity != BATTERY_CAPACITY_EDEFAULT;
			case MobiledevicesPackage.MOBILE_DEVICE__DEVICE_NAME:
				return DEVICE_NAME_EDEFAULT == null ? deviceName != null : !DEVICE_NAME_EDEFAULT.equals(deviceName);
			case MobiledevicesPackage.MOBILE_DEVICE__CAMERA_MPX:
				return cameraMpx != CAMERA_MPX_EDEFAULT;
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
			case MobiledevicesPackage.MOBILE_DEVICE___POWER_ON:
				powerOn();
				return null;
			case MobiledevicesPackage.MOBILE_DEVICE___POWER_OFF:
				powerOff();
				return null;
			case MobiledevicesPackage.MOBILE_DEVICE___CONNECT_WI_FI:
				connectWiFi();
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
		result.append(" (screenDiag: ");
		result.append(screenDiag);
		result.append(", batteryCapacity: ");
		result.append(batteryCapacity);
		result.append(", deviceName: ");
		result.append(deviceName);
		result.append(", cameraMpx: ");
		result.append(cameraMpx);
		result.append(')');
		return result.toString();
	}

} //MobileDeviceImpl
