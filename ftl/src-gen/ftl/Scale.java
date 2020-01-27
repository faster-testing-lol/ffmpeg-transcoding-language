/**
 */
package ftl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Scale</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.Scale#getFactor <em>Factor</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getScale()
 * @model
 * @generated
 */
public interface Scale extends Instruction {
	/**
	 * Returns the value of the '<em><b>Factor</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factor</em>' attribute.
	 * @see #setFactor(float)
	 * @see ftl.FtlPackage#getScale_Factor()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	float getFactor();

	/**
	 * Sets the value of the '{@link ftl.Scale#getFactor <em>Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factor</em>' attribute.
	 * @see #getFactor()
	 * @generated
	 */
	void setFactor(float value);

} // Scale
