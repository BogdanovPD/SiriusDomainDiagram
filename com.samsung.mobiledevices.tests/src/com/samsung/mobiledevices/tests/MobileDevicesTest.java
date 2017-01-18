/**
 */
package com.samsung.mobiledevices.tests;

import com.samsung.mobiledevices.MobileDevices;
import com.samsung.mobiledevices.MobiledevicesFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Mobile Devices</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobileDevicesTest extends TestCase {

	/**
	 * The fixture for this Mobile Devices test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileDevices fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MobileDevicesTest.class);
	}

	/**
	 * Constructs a new Mobile Devices test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobileDevicesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Mobile Devices test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MobileDevices fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Mobile Devices test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobileDevices getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MobiledevicesFactory.eINSTANCE.createMobileDevices());
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

} //MobileDevicesTest
