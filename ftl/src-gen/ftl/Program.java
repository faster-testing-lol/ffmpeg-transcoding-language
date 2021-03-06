/**
 */
package ftl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.Program#getTransforms <em>Transforms</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Transforms</b></em>' containment reference list.
	 * The list contents are of type {@link ftl.Transform}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transforms</em>' containment reference list.
	 * @see ftl.FtlPackage#getProgram_Transforms()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transform> getTransforms();

} // Program
