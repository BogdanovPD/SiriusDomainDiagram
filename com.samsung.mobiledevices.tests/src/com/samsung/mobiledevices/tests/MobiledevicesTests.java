/**
 */
package com.samsung.mobiledevices.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>mobiledevices</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobiledevicesTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new MobiledevicesTests("mobiledevices Tests");
		suite.addTestSuite(TabletDeviceTest.class);
		suite.addTestSuite(SmartphoneDeviceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobiledevicesTests(String name) {
		super(name);
	}

} //MobiledevicesTests
