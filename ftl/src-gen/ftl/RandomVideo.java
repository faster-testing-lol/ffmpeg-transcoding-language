/**
 */
package ftl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Random Video</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.RandomVideo#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getRandomVideo()
 * @model
 * @generated
 */
public interface RandomVideo extends Input {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute list.
	 * @see ftl.FtlPackage#getRandomVideo_Options()
	 * @model required="true" upper="10"
	 * @generated
	 */
	EList<String> getOptions();

} // RandomVideo
