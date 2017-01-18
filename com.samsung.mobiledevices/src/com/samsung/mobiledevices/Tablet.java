/**
 */
package com.samsung.mobiledevices;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tablet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.samsung.mobiledevices.Tablet#isIsCellular <em>Is Cellular</em>}</li>
 * </ul>
 *
 * @see com.samsung.mobiledevices.MobiledevicesPackage#getTablet()
 * @model abstract="true"
 * @generated
 */
public interface Tablet extends MobileDevice {
	/**
	 * Returns the value of the '<em><b>Is Cellular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Cellular</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Cellular</em>' attribute.
	 * @see #setIsCellular(boolean)
	 * @see com.samsung.mobiledevices.MobiledevicesPackage#getTablet_IsCellular()
	 * @model
	 * @generated
	 */
	boolean isIsCellular();

	/**
	 * Sets the value of the '{@link com.samsung.mobiledevices.Tablet#isIsCellular <em>Is Cellular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Cellular</em>' attribute.
	 * @see #isIsCellular()
	 * @generated
	 */
	void setIsCellular(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void tabletApp();

} // Tablet
