/**
 */
package ftl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Echo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.Echo#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getEcho()
 * @model
 * @generated
 */
public interface Echo extends Instruction {
	/**
	 * Returns the value of the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay</em>' attribute.
	 * @see #setDelay(int)
	 * @see ftl.FtlPackage#getEcho_Delay()
	 * @model
	 * @generated
	 */
	int getDelay();

	/**
	 * Sets the value of the '{@link ftl.Echo#getDelay <em>Delay</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delay</em>' attribute.
	 * @see #getDelay()
	 * @generated
	 */
	void setDelay(int value);

} // Echo
