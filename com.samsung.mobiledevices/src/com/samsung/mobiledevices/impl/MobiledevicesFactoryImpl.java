/**
 */
package com.samsung.mobiledevices.impl;

import com.samsung.mobiledevices.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobiledevicesFactoryImpl extends EFactoryImpl implements MobiledevicesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobiledevicesFactory init() {
		try {
			MobiledevicesFactory theMobiledevicesFactory = (MobiledevicesFactory)EPackage.Registry.INSTANCE.getEFactory(MobiledevicesPackage.eNS_URI);
			if (theMobiledevicesFactory != null) {
				return theMobiledevicesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MobiledevicesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobiledevicesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MobiledevicesPackage.MOBILE_DEVICES: return createMobileDevices();
			case MobiledevicesPackage.TABLET_DEVICE: return createTabletDevice();
			case MobiledevicesPackage.SMARTPHONE_DEVICE: return createSmartphoneDevice();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileDevices createMobileDevices() {
		MobileDevicesImpl mobileDevices = new MobileDevicesImpl();
		return mobileDevices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabletDevice createTabletDevice() {
		TabletDeviceImpl tabletDevice = new TabletDeviceImpl();
		return tabletDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartphoneDevice createSmartphoneDevice() {
		SmartphoneDeviceImpl smartphoneDevice = new SmartphoneDeviceImpl();
		return smartphoneDevice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobiledevicesPackage getMobiledevicesPackage() {
		return (MobiledevicesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MobiledevicesPackage getPackage() {
		return MobiledevicesPackage.eINSTANCE;
	}

} //MobiledevicesFactoryImpl
