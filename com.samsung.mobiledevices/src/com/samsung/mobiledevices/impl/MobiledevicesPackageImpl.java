/**
 */
package com.samsung.mobiledevices.impl;

import com.samsung.mobiledevices.MobileDevice;
import com.samsung.mobiledevices.MobileDevices;
import com.samsung.mobiledevices.MobiledevicesFactory;
import com.samsung.mobiledevices.MobiledevicesPackage;
import com.samsung.mobiledevices.Smartphone;
import com.samsung.mobiledevices.SmartphoneDevice;
import com.samsung.mobiledevices.Tablet;
import com.samsung.mobiledevices.TabletDevice;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobiledevicesPackageImpl extends EPackageImpl implements MobiledevicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileDevicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobileDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartphoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabletDeviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass smartphoneDeviceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.samsung.mobiledevices.MobiledevicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MobiledevicesPackageImpl() {
		super(eNS_URI, MobiledevicesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MobiledevicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MobiledevicesPackage init() {
		if (isInited) return (MobiledevicesPackage)EPackage.Registry.INSTANCE.getEPackage(MobiledevicesPackage.eNS_URI);

		// Obtain or create and register package
		MobiledevicesPackageImpl theMobiledevicesPackage = (MobiledevicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MobiledevicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MobiledevicesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMobiledevicesPackage.createPackageContents();

		// Initialize created meta-data
		theMobiledevicesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMobiledevicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MobiledevicesPackage.eNS_URI, theMobiledevicesPackage);
		return theMobiledevicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileDevices() {
		return mobileDevicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobileDevices_Mobiledevice() {
		return (EReference)mobileDevicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobileDevice() {
		return mobileDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileDevice_ScreenDiag() {
		return (EAttribute)mobileDeviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileDevice_BatteryCapacity() {
		return (EAttribute)mobileDeviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileDevice_DeviceName() {
		return (EAttribute)mobileDeviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobileDevice_CameraMpx() {
		return (EAttribute)mobileDeviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobileDevice__PowerOn() {
		return mobileDeviceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobileDevice__PowerOff() {
		return mobileDeviceEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMobileDevice__ConnectWiFi() {
		return mobileDeviceEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTablet() {
		return tabletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTablet_IsCellular() {
		return (EAttribute)tabletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTablet__TabletApp() {
		return tabletEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartphone() {
		return smartphoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartphone__SmartphoneApp() {
		return smartphoneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSmartphone__DoCall() {
		return smartphoneEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTabletDevice() {
		return tabletDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSmartphoneDevice() {
		return smartphoneDeviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobiledevicesFactory getMobiledevicesFactory() {
		return (MobiledevicesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mobileDevicesEClass = createEClass(MOBILE_DEVICES);
		createEReference(mobileDevicesEClass, MOBILE_DEVICES__MOBILEDEVICE);

		mobileDeviceEClass = createEClass(MOBILE_DEVICE);
		createEAttribute(mobileDeviceEClass, MOBILE_DEVICE__SCREEN_DIAG);
		createEAttribute(mobileDeviceEClass, MOBILE_DEVICE__BATTERY_CAPACITY);
		createEAttribute(mobileDeviceEClass, MOBILE_DEVICE__DEVICE_NAME);
		createEAttribute(mobileDeviceEClass, MOBILE_DEVICE__CAMERA_MPX);
		createEOperation(mobileDeviceEClass, MOBILE_DEVICE___POWER_ON);
		createEOperation(mobileDeviceEClass, MOBILE_DEVICE___POWER_OFF);
		createEOperation(mobileDeviceEClass, MOBILE_DEVICE___CONNECT_WI_FI);

		tabletEClass = createEClass(TABLET);
		createEAttribute(tabletEClass, TABLET__IS_CELLULAR);
		createEOperation(tabletEClass, TABLET___TABLET_APP);

		smartphoneEClass = createEClass(SMARTPHONE);
		createEOperation(smartphoneEClass, SMARTPHONE___SMARTPHONE_APP);
		createEOperation(smartphoneEClass, SMARTPHONE___DO_CALL);

		tabletDeviceEClass = createEClass(TABLET_DEVICE);

		smartphoneDeviceEClass = createEClass(SMARTPHONE_DEVICE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tabletEClass.getESuperTypes().add(this.getMobileDevice());
		smartphoneEClass.getESuperTypes().add(this.getMobileDevice());
		tabletDeviceEClass.getESuperTypes().add(this.getTablet());
		smartphoneDeviceEClass.getESuperTypes().add(this.getSmartphone());

		// Initialize classes, features, and operations; add parameters
		initEClass(mobileDevicesEClass, MobileDevices.class, "MobileDevices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobileDevices_Mobiledevice(), this.getMobileDevice(), null, "mobiledevice", null, 0, -1, MobileDevices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobileDeviceEClass, MobileDevice.class, "MobileDevice", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobileDevice_ScreenDiag(), ecorePackage.getEDouble(), "screenDiag", null, 0, 1, MobileDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobileDevice_BatteryCapacity(), ecorePackage.getEInt(), "batteryCapacity", null, 0, 1, MobileDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobileDevice_DeviceName(), ecorePackage.getEString(), "deviceName", null, 0, 1, MobileDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobileDevice_CameraMpx(), ecorePackage.getEInt(), "cameraMpx", null, 0, 1, MobileDevice.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMobileDevice__PowerOn(), null, "powerOn", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMobileDevice__PowerOff(), null, "powerOff", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMobileDevice__ConnectWiFi(), null, "connectWiFi", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tabletEClass, Tablet.class, "Tablet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTablet_IsCellular(), ecorePackage.getEBoolean(), "isCellular", null, 0, 1, Tablet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTablet__TabletApp(), null, "tabletApp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(smartphoneEClass, Smartphone.class, "Smartphone", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSmartphone__SmartphoneApp(), null, "smartphoneApp", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSmartphone__DoCall(), null, "doCall", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tabletDeviceEClass, TabletDevice.class, "TabletDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(smartphoneDeviceEClass, SmartphoneDevice.class, "SmartphoneDevice", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //MobiledevicesPackageImpl
