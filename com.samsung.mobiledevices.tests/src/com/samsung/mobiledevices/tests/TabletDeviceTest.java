/**
 */
package com.samsung.mobiledevices.tests;

import com.samsung.mobiledevices.MobiledevicesFactory;
import com.samsung.mobiledevices.TabletDevice;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Tablet Device</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TabletDeviceTest extends TabletTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TabletDeviceTest.class);
	}

	/**
	 * Constructs a new Tablet Device test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TabletDeviceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Tablet Device test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TabletDevice getFixture() {
		return (TabletDevice)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MobiledevicesFactory.eINSTANCE.createTabletDevice());
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

} //TabletDeviceTest
