/**
 */
package com.samsung.mobiledevices.tests;

import com.samsung.mobiledevices.MobiledevicesFactory;
import com.samsung.mobiledevices.SmartphoneDevice;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Smartphone Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SmartphoneDeviceTest extends SmartphoneTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SmartphoneDeviceTest.class);
	}

	/**
	 * Constructs a new Smartphone Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartphoneDeviceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Smartphone Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SmartphoneDevice getFixture() {
		return (SmartphoneDevice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MobiledevicesFactory.eINSTANCE.createSmartphoneDevice());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SmartphoneDeviceTest
