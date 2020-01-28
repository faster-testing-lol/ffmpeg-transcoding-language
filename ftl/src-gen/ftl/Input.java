/**
 */
package ftl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.Input#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getInput()
 * @model abstract="true"
 * @generated
 */
public interface Input extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute list.
	 * @see ftl.FtlPackage#getInput_Path()
	 * @model required="true" upper="10"
	 * @generated
	 */
	EList<String> getPath();

} // Input
