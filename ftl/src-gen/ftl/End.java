/**
 */
package ftl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.End#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getEnd()
 * @model
 * @generated
 */
public interface End extends Instruction {

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(float)
	 * @see ftl.FtlPackage#getEnd_Time()
	 * @model
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link ftl.End#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);
} // End
