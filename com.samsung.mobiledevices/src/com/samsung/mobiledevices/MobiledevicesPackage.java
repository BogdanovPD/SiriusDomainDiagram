/**
 */
package com.samsung.mobiledevices;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.samsung.mobiledevices.MobiledevicesFactory
 * @model kind="package"
 * @generated
 */
public interface MobiledevicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mobiledevices";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mobiledevices";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mobiledevices";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobiledevicesPackage eINSTANCE = com.samsung.mobiledevices.impl.MobiledevicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.samsung.mobiledevices.impl.MobileDevicesImpl <em>Mobile Devices</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.samsung.mobiledevices.impl.MobileDevicesImpl
	 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getMobileDevices()
	 * @generated
	 */
	int MOBILE_DEVICES = 0;

	/**
	 * The feature id for the '<em><b>Mobiledevice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICES__MOBILEDEVICE = 0;

	/**
	 * The number of structural features of the '<em>Mobile Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mobile Devices</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.samsung.mobiledevices.impl.MobileDeviceImpl <em>Mobile Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.samsung.mobiledevices.impl.MobileDeviceImpl
	 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getMobileDevice()
	 * @generated
	 */
	int MOBILE_DEVICE = 1;

	/**
	 * The feature id for the '<em><b>Screen Diag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__SCREEN_DIAG = 0;

	/**
	 * The feature id for the '<em><b>Battery Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__BATTERY_CAPACITY = 1;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__DEVICE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Camera Mpx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE__CAMERA_MPX = 3;

	/**
	 * The number of structural features of the '<em>Mobile Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Power On</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE___POWER_ON = 0;

	/**
	 * The operation id for the '<em>Power Off</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE___POWER_OFF = 1;

	/**
	 * The operation id for the '<em>Connect Wi Fi</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE___CONNECT_WI_FI = 2;

	/**
	 * The number of operations of the '<em>Mobile Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_DEVICE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link com.samsung.mobiledevices.impl.TabletImpl <em>Tablet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.samsung.mobiledevices.impl.TabletImpl
	 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getTablet()
	 * @generated
	 */
	int TABLET = 2;

	/**
	 * The feature id for the '<em><b>Screen Diag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET__SCREEN_DIAG = MOBILE_DEVICE__SCREEN_DIAG;

	/**
	 * The feature id for the '<em><b>Battery Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET__BATTERY_CAPACITY = MOBILE_DEVICE__BATTERY_CAPACITY;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET__DEVICE_NAME = MOBILE_DEVICE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Camera Mpx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET__CAMERA_MPX = MOBILE_DEVICE__CAMERA_MPX;

	/**
	 * The feature id for the '<em><b>Is Cellular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET__IS_CELLULAR = MOBILE_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Tablet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_FEATURE_COUNT = MOBILE_DEVICE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Power On</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET___POWER_ON = MOBILE_DEVICE___POWER_ON;

	/**
	 * The operation id for the '<em>Power Off</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET___POWER_OFF = MOBILE_DEVICE___POWER_OFF;

	/**
	 * The operation id for the '<em>Connect Wi Fi</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET___CONNECT_WI_FI = MOBILE_DEVICE___CONNECT_WI_FI;

	/**
	 * The operation id for the '<em>Tablet App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET___TABLET_APP = MOBILE_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tablet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_OPERATION_COUNT = MOBILE_DEVICE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.samsung.mobiledevices.impl.SmartphoneImpl <em>Smartphone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.samsung.mobiledevices.impl.SmartphoneImpl
	 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getSmartphone()
	 * @generated
	 */
	int SMARTPHONE = 3;

	/**
	 * The feature id for the '<em><b>Screen Diag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE__SCREEN_DIAG = MOBILE_DEVICE__SCREEN_DIAG;

	/**
	 * The feature id for the '<em><b>Battery Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE__BATTERY_CAPACITY = MOBILE_DEVICE__BATTERY_CAPACITY;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE__DEVICE_NAME = MOBILE_DEVICE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Camera Mpx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE__CAMERA_MPX = MOBILE_DEVICE__CAMERA_MPX;

	/**
	 * The number of structural features of the '<em>Smartphone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_FEATURE_COUNT = MOBILE_DEVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Power On</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE___POWER_ON = MOBILE_DEVICE___POWER_ON;

	/**
	 * The operation id for the '<em>Power Off</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE___POWER_OFF = MOBILE_DEVICE___POWER_OFF;

	/**
	 * The operation id for the '<em>Connect Wi Fi</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE___CONNECT_WI_FI = MOBILE_DEVICE___CONNECT_WI_FI;

	/**
	 * The operation id for the '<em>Smartphone App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE___SMARTPHONE_APP = MOBILE_DEVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Do Call</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE___DO_CALL = MOBILE_DEVICE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Smartphone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_OPERATION_COUNT = MOBILE_DEVICE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link com.samsung.mobiledevices.impl.TabletDeviceImpl <em>Tablet Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.samsung.mobiledevices.impl.TabletDeviceImpl
	 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getTabletDevice()
	 * @generated
	 */
	int TABLET_DEVICE = 4;

	/**
	 * The feature id for the '<em><b>Screen Diag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE__SCREEN_DIAG = TABLET__SCREEN_DIAG;

	/**
	 * The feature id for the '<em><b>Battery Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE__BATTERY_CAPACITY = TABLET__BATTERY_CAPACITY;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE__DEVICE_NAME = TABLET__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Camera Mpx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE__CAMERA_MPX = TABLET__CAMERA_MPX;

	/**
	 * The feature id for the '<em><b>Is Cellular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE__IS_CELLULAR = TABLET__IS_CELLULAR;

	/**
	 * The number of structural features of the '<em>Tablet Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE_FEATURE_COUNT = TABLET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Power On</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE___POWER_ON = TABLET___POWER_ON;

	/**
	 * The operation id for the '<em>Power Off</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE___POWER_OFF = TABLET___POWER_OFF;

	/**
	 * The operation id for the '<em>Connect Wi Fi</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE___CONNECT_WI_FI = TABLET___CONNECT_WI_FI;

	/**
	 * The operation id for the '<em>Tablet App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE___TABLET_APP = TABLET___TABLET_APP;

	/**
	 * The number of operations of the '<em>Tablet Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLET_DEVICE_OPERATION_COUNT = TABLET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.samsung.mobiledevices.impl.SmartphoneDeviceImpl <em>Smartphone Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.samsung.mobiledevices.impl.SmartphoneDeviceImpl
	 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getSmartphoneDevice()
	 * @generated
	 */
	int SMARTPHONE_DEVICE = 5;

	/**
	 * The feature id for the '<em><b>Screen Diag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE__SCREEN_DIAG = SMARTPHONE__SCREEN_DIAG;

	/**
	 * The feature id for the '<em><b>Battery Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE__BATTERY_CAPACITY = SMARTPHONE__BATTERY_CAPACITY;

	/**
	 * The feature id for the '<em><b>Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE__DEVICE_NAME = SMARTPHONE__DEVICE_NAME;

	/**
	 * The feature id for the '<em><b>Camera Mpx</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE__CAMERA_MPX = SMARTPHONE__CAMERA_MPX;

	/**
	 * The number of structural features of the '<em>Smartphone Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE_FEATURE_COUNT = SMARTPHONE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Power On</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE___POWER_ON = SMARTPHONE___POWER_ON;

	/**
	 * The operation id for the '<em>Power Off</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE___POWER_OFF = SMARTPHONE___POWER_OFF;

	/**
	 * The operation id for the '<em>Connect Wi Fi</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE___CONNECT_WI_FI = SMARTPHONE___CONNECT_WI_FI;

	/**
	 * The operation id for the '<em>Smartphone App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE___SMARTPHONE_APP = SMARTPHONE___SMARTPHONE_APP;

	/**
	 * The operation id for the '<em>Do Call</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE___DO_CALL = SMARTPHONE___DO_CALL;

	/**
	 * The number of operations of the '<em>Smartphone Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMARTPHONE_DEVICE_OPERATION_COUNT = SMARTPHONE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link com.samsung.mobiledevices.MobileDevices <em>Mobile Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Devices</em>'.
	 * @see com.samsung.mobiledevices.MobileDevices
	 * @generated
	 */
	EClass getMobileDevices();

	/**
	 * Returns the meta object for the containment reference list '{@link com.samsung.mobiledevices.MobileDevices#getMobiledevice <em>Mobiledevice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mobiledevice</em>'.
	 * @see com.samsung.mobiledevices.MobileDevices#getMobiledevice()
	 * @see #getMobileDevices()
	 * @generated
	 */
	EReference getMobileDevices_Mobiledevice();

	/**
	 * Returns the meta object for class '{@link com.samsung.mobiledevices.MobileDevice <em>Mobile Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Device</em>'.
	 * @see com.samsung.mobiledevices.MobileDevice
	 * @generated
	 */
	EClass getMobileDevice();

	/**
	 * Returns the meta object for the attribute '{@link com.samsung.mobiledevices.MobileDevice#getScreenDiag <em>Screen Diag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Screen Diag</em>'.
	 * @see com.samsung.mobiledevices.MobileDevice#getScreenDiag()
	 * @see #getMobileDevice()
	 * @generated
	 */
	EAttribute getMobileDevice_ScreenDiag();

	/**
	 * Returns the meta object for the attribute '{@link com.samsung.mobiledevices.MobileDevice#getBatteryCapacity <em>Battery Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battery Capacity</em>'.
	 * @see com.samsung.mobiledevices.MobileDevice#getBatteryCapacity()
	 * @see #getMobileDevice()
	 * @generated
	 */
	EAttribute getMobileDevice_BatteryCapacity();

	/**
	 * Returns the meta object for the attribute '{@link com.samsung.mobiledevices.MobileDevice#getDeviceName <em>Device Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Device Name</em>'.
	 * @see com.samsung.mobiledevices.MobileDevice#getDeviceName()
	 * @see #getMobileDevice()
	 * @generated
	 */
	EAttribute getMobileDevice_DeviceName();

	/**
	 * Returns the meta object for the attribute '{@link com.samsung.mobiledevices.MobileDevice#getCameraMpx <em>Camera Mpx</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Camera Mpx</em>'.
	 * @see com.samsung.mobiledevices.MobileDevice#getCameraMpx()
	 * @see #getMobileDevice()
	 * @generated
	 */
	EAttribute getMobileDevice_CameraMpx();

	/**
	 * Returns the meta object for the '{@link com.samsung.mobiledevices.MobileDevice#powerOn() <em>Power On</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Power On</em>' operation.
	 * @see com.samsung.mobiledevices.MobileDevice#powerOn()
	 * @generated
	 */
	EOperation getMobileDevice__PowerOn();

	/**
	 * Returns the meta object for the '{@link com.samsung.mobiledevices.MobileDevice#powerOff() <em>Power Off</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Power Off</em>' operation.
	 * @see com.samsung.mobiledevices.MobileDevice#powerOff()
	 * @generated
	 */
	EOperation getMobileDevice__PowerOff();

	/**
	 * Returns the meta object for the '{@link com.samsung.mobiledevices.MobileDevice#connectWiFi() <em>Connect Wi Fi</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect Wi Fi</em>' operation.
	 * @see com.samsung.mobiledevices.MobileDevice#connectWiFi()
	 * @generated
	 */
	EOperation getMobileDevice__ConnectWiFi();

	/**
	 * Returns the meta object for class '{@link com.samsung.mobiledevices.Tablet <em>Tablet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tablet</em>'.
	 * @see com.samsung.mobiledevices.Tablet
	 * @generated
	 */
	EClass getTablet();

	/**
	 * Returns the meta object for the attribute '{@link com.samsung.mobiledevices.Tablet#isIsCellular <em>Is Cellular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Cellular</em>'.
	 * @see com.samsung.mobiledevices.Tablet#isIsCellular()
	 * @see #getTablet()
	 * @generated
	 */
	EAttribute getTablet_IsCellular();

	/**
	 * Returns the meta object for the '{@link com.samsung.mobiledevices.Tablet#tabletApp() <em>Tablet App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Tablet App</em>' operation.
	 * @see com.samsung.mobiledevices.Tablet#tabletApp()
	 * @generated
	 */
	EOperation getTablet__TabletApp();

	/**
	 * Returns the meta object for class '{@link com.samsung.mobiledevices.Smartphone <em>Smartphone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smartphone</em>'.
	 * @see com.samsung.mobiledevices.Smartphone
	 * @generated
	 */
	EClass getSmartphone();

	/**
	 * Returns the meta object for the '{@link com.samsung.mobiledevices.Smartphone#smartphoneApp() <em>Smartphone App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Smartphone App</em>' operation.
	 * @see com.samsung.mobiledevices.Smartphone#smartphoneApp()
	 * @generated
	 */
	EOperation getSmartphone__SmartphoneApp();

	/**
	 * Returns the meta object for the '{@link com.samsung.mobiledevices.Smartphone#doCall() <em>Do Call</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Do Call</em>' operation.
	 * @see com.samsung.mobiledevices.Smartphone#doCall()
	 * @generated
	 */
	EOperation getSmartphone__DoCall();

	/**
	 * Returns the meta object for class '{@link com.samsung.mobiledevices.TabletDevice <em>Tablet Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tablet Device</em>'.
	 * @see com.samsung.mobiledevices.TabletDevice
	 * @generated
	 */
	EClass getTabletDevice();

	/**
	 * Returns the meta object for class '{@link com.samsung.mobiledevices.SmartphoneDevice <em>Smartphone Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Smartphone Device</em>'.
	 * @see com.samsung.mobiledevices.SmartphoneDevice
	 * @generated
	 */
	EClass getSmartphoneDevice();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MobiledevicesFactory getMobiledevicesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.samsung.mobiledevices.impl.MobileDevicesImpl <em>Mobile Devices</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.samsung.mobiledevices.impl.MobileDevicesImpl
		 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getMobileDevices()
		 * @generated
		 */
		EClass MOBILE_DEVICES = eINSTANCE.getMobileDevices();

		/**
		 * The meta object literal for the '<em><b>Mobiledevice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBILE_DEVICES__MOBILEDEVICE = eINSTANCE.getMobileDevices_Mobiledevice();

		/**
		 * The meta object literal for the '{@link com.samsung.mobiledevices.impl.MobileDeviceImpl <em>Mobile Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.samsung.mobiledevices.impl.MobileDeviceImpl
		 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getMobileDevice()
		 * @generated
		 */
		EClass MOBILE_DEVICE = eINSTANCE.getMobileDevice();

		/**
		 * The meta object literal for the '<em><b>Screen Diag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_DEVICE__SCREEN_DIAG = eINSTANCE.getMobileDevice_ScreenDiag();

		/**
		 * The meta object literal for the '<em><b>Battery Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_DEVICE__BATTERY_CAPACITY = eINSTANCE.getMobileDevice_BatteryCapacity();

		/**
		 * The meta object literal for the '<em><b>Device Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_DEVICE__DEVICE_NAME = eINSTANCE.getMobileDevice_DeviceName();

		/**
		 * The meta object literal for the '<em><b>Camera Mpx</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBILE_DEVICE__CAMERA_MPX = eINSTANCE.getMobileDevice_CameraMpx();

		/**
		 * The meta object literal for the '<em><b>Power On</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_DEVICE___POWER_ON = eINSTANCE.getMobileDevice__PowerOn();

		/**
		 * The meta object literal for the '<em><b>Power Off</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_DEVICE___POWER_OFF = eINSTANCE.getMobileDevice__PowerOff();

		/**
		 * The meta object literal for the '<em><b>Connect Wi Fi</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOBILE_DEVICE___CONNECT_WI_FI = eINSTANCE.getMobileDevice__ConnectWiFi();

		/**
		 * The meta object literal for the '{@link com.samsung.mobiledevices.impl.TabletImpl <em>Tablet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.samsung.mobiledevices.impl.TabletImpl
		 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getTablet()
		 * @generated
		 */
		EClass TABLET = eINSTANCE.getTablet();

		/**
		 * The meta object literal for the '<em><b>Is Cellular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLET__IS_CELLULAR = eINSTANCE.getTablet_IsCellular();

		/**
		 * The meta object literal for the '<em><b>Tablet App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLET___TABLET_APP = eINSTANCE.getTablet__TabletApp();

		/**
		 * The meta object literal for the '{@link com.samsung.mobiledevices.impl.SmartphoneImpl <em>Smartphone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.samsung.mobiledevices.impl.SmartphoneImpl
		 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getSmartphone()
		 * @generated
		 */
		EClass SMARTPHONE = eINSTANCE.getSmartphone();

		/**
		 * The meta object literal for the '<em><b>Smartphone App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMARTPHONE___SMARTPHONE_APP = eINSTANCE.getSmartphone__SmartphoneApp();

		/**
		 * The meta object literal for the '<em><b>Do Call</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SMARTPHONE___DO_CALL = eINSTANCE.getSmartphone__DoCall();

		/**
		 * The meta object literal for the '{@link com.samsung.mobiledevices.impl.TabletDeviceImpl <em>Tablet Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.samsung.mobiledevices.impl.TabletDeviceImpl
		 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getTabletDevice()
		 * @generated
		 */
		EClass TABLET_DEVICE = eINSTANCE.getTabletDevice();

		/**
		 * The meta object literal for the '{@link com.samsung.mobiledevices.impl.SmartphoneDeviceImpl <em>Smartphone Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.samsung.mobiledevices.impl.SmartphoneDeviceImpl
		 * @see com.samsung.mobiledevices.impl.MobiledevicesPackageImpl#getSmartphoneDevice()
		 * @generated
		 */
		EClass SMARTPHONE_DEVICE = eINSTANCE.getSmartphoneDevice();

	}

} //MobiledevicesPackage
