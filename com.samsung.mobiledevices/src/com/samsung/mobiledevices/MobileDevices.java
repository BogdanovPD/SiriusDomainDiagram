/**
 */
package com.samsung.mobiledevices;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobile Devices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.samsung.mobiledevices.MobileDevices#getMobiledevice <em>Mobiledevice</em>}</li>
 * </ul>
 *
 * @see com.samsung.mobiledevices.MobiledevicesPackage#getMobileDevices()
 * @model
 * @generated
 */
public interface MobileDevices extends EObject {
	/**
	 * Returns the value of the '<em><b>Mobiledevice</b></em>' containment reference list.
	 * The list contents are of type {@link com.samsung.mobiledevices.MobileDevice}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mobiledevice</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mobiledevice</em>' containment reference list.
	 * @see com.samsung.mobiledevices.MobiledevicesPackage#getMobileDevices_Mobiledevice()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobileDevice> getMobiledevice();

} // MobileDevices
