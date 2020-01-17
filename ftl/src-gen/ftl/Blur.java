/**
 */
package ftl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Blur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.Blur#getRadius <em>Radius</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getBlur()
 * @model
 * @generated
 */
public interface Blur extends Instruction {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see ftl.FtlPackage#getBlur_Radius()
	 * @model
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link ftl.Blur#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

} // Blur
