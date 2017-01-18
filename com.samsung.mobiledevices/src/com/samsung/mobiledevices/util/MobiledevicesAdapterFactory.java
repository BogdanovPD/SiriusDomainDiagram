/**
 */
package com.samsung.mobiledevices.util;

import com.samsung.mobiledevices.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.samsung.mobiledevices.MobiledevicesPackage
 * @generated
 */
public class MobiledevicesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobiledevicesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobiledevicesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MobiledevicesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobiledevicesSwitch<Adapter> modelSwitch =
		new MobiledevicesSwitch<Adapter>() {
			@Override
			public Adapter caseMobileDevices(MobileDevices object) {
				return createMobileDevicesAdapter();
			}
			@Override
			public Adapter caseMobileDevice(MobileDevice object) {
				return createMobileDeviceAdapter();
			}
			@Override
			public Adapter caseTablet(Tablet object) {
				return createTabletAdapter();
			}
			@Override
			public Adapter caseSmartphone(Smartphone object) {
				return createSmartphoneAdapter();
			}
			@Override
			public Adapter caseTabletDevice(TabletDevice object) {
				return createTabletDeviceAdapter();
			}
			@Override
			public Adapter caseSmartphoneDevice(SmartphoneDevice object) {
				return createSmartphoneDeviceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.samsung.mobiledevices.MobileDevices <em>Mobile Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.samsung.mobiledevices.MobileDevices
	 * @generated
	 */
	public Adapter createMobileDevicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.samsung.mobiledevices.MobileDevice <em>Mobile Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.samsung.mobiledevices.MobileDevice
	 * @generated
	 */
	public Adapter createMobileDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.samsung.mobiledevices.Tablet <em>Tablet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.samsung.mobiledevices.Tablet
	 * @generated
	 */
	public Adapter createTabletAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.samsung.mobiledevices.Smartphone <em>Smartphone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.samsung.mobiledevices.Smartphone
	 * @generated
	 */
	public Adapter createSmartphoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.samsung.mobiledevices.TabletDevice <em>Tablet Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.samsung.mobiledevices.TabletDevice
	 * @generated
	 */
	public Adapter createTabletDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.samsung.mobiledevices.SmartphoneDevice <em>Smartphone Device</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.samsung.mobiledevices.SmartphoneDevice
	 * @generated
	 */
	public Adapter createSmartphoneDeviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //MobiledevicesAdapterFactory
