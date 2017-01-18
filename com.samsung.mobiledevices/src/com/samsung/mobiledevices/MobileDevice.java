/**
 */
package com.samsung.mobiledevices;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobile Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.samsung.mobiledevices.MobileDevice#getScreenDiag <em>Screen Diag</em>}</li>
 *   <li>{@link com.samsung.mobiledevices.MobileDevice#getBatteryCapacity <em>Battery Capacity</em>}</li>
 *   <li>{@link com.samsung.mobiledevices.MobileDevice#getDeviceName <em>Device Name</em>}</li>
 *   <li>{@link com.samsung.mobiledevices.MobileDevice#getCameraMpx <em>Camera Mpx</em>}</li>
 * </ul>
 *
 * @see com.samsung.mobiledevices.MobiledevicesPackage#getMobileDevice()
 * @model abstract="true"
 * @generated
 */
public interface MobileDevice extends EObject {
	/**
	 * Returns the value of the '<em><b>Screen Diag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Screen Diag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Screen Diag</em>' attribute.
	 * @see #setScreenDiag(double)
	 * @see com.samsung.mobiledevices.MobiledevicesPackage#getMobileDevice_ScreenDiag()
	 * @model
	 * @generated
	 */
	double getScreenDiag();

	/**
	 * Sets the value of the '{@link com.samsung.mobiledevices.MobileDevice#getScreenDiag <em>Screen Diag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Screen Diag</em>' attribute.
	 * @see #getScreenDiag()
	 * @generated
	 */
	void setScreenDiag(double value);

	/**
	 * Returns the value of the '<em><b>Battery Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battery Capacity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battery Capacity</em>' attribute.
	 * @see #setBatteryCapacity(int)
	 * @see com.samsung.mobiledevices.MobiledevicesPackage#getMobileDevice_BatteryCapacity()
	 * @model
	 * @generated
	 */
	int getBatteryCapacity();

	/**
	 * Sets the value of the '{@link com.samsung.mobiledevices.MobileDevice#getBatteryCapacity <em>Battery Capacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battery Capacity</em>' attribute.
	 * @see #getBatteryCapacity()
	 * @generated
	 */
	void setBatteryCapacity(int value);

	/**
	 * Returns the value of the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Device Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Device Name</em>' attribute.
	 * @see #setDeviceName(String)
	 * @see com.samsung.mobiledevices.MobiledevicesPackage#getMobileDevice_DeviceName()
	 * @model
	 * @generated
	 */
	String getDeviceName();

	/**
	 * Sets the value of the '{@link com.samsung.mobiledevices.MobileDevice#getDeviceName <em>Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device Name</em>' attribute.
	 * @see #getDeviceName()
	 * @generated
	 */
	void setDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Camera Mpx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Camera Mpx</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Camera Mpx</em>' attribute.
	 * @see #setCameraMpx(int)
	 * @see com.samsung.mobiledevices.MobiledevicesPackage#getMobileDevice_CameraMpx()
	 * @model
	 * @generated
	 */
	int getCameraMpx();

	/**
	 * Sets the value of the '{@link com.samsung.mobiledevices.MobileDevice#getCameraMpx <em>Camera Mpx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Camera Mpx</em>' attribute.
	 * @see #getCameraMpx()
	 * @generated
	 */
	void setCameraMpx(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void powerOn();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void powerOff();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void connectWiFi();

} // MobileDevice
