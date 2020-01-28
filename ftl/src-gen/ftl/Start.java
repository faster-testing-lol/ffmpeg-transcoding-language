/**
 */
package ftl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.Start#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getStart()
 * @model
 * @generated
 */
public interface Start extends Instruction {

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(float)
	 * @see ftl.FtlPackage#getStart_Time()
	 * @model
	 * @generated
	 */
	float getTime();

	/**
	 * Sets the value of the '{@link ftl.Start#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(float value);
} // Start
