/**
 */
package com.samsung.mobiledevices;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.samsung.mobiledevices.MobiledevicesPackage
 * @generated
 */
public interface MobiledevicesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobiledevicesFactory eINSTANCE = com.samsung.mobiledevices.impl.MobiledevicesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mobile Devices</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Devices</em>'.
	 * @generated
	 */
	MobileDevices createMobileDevices();

	/**
	 * Returns a new object of class '<em>Tablet Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tablet Device</em>'.
	 * @generated
	 */
	TabletDevice createTabletDevice();

	/**
	 * Returns a new object of class '<em>Smartphone Device</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Smartphone Device</em>'.
	 * @generated
	 */
	SmartphoneDevice createSmartphoneDevice();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MobiledevicesPackage getMobiledevicesPackage();

} //MobiledevicesFactory
