/**
 */
package ftl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ftl.Transform#getInputs <em>Inputs</em>}</li>
 *   <li>{@link ftl.Transform#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link ftl.Transform#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getTransform()
 * @model
 * @generated
 */
public interface Transform extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link ftl.Stream}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see ftl.FtlPackage#getTransform_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<Stream> getInputs();

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' reference list.
	 * The list contents are of type {@link ftl.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instruction</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' reference list.
	 * @see ftl.FtlPackage#getTransform_Instruction()
	 * @model
	 * @generated
	 */
	EList<Instruction> getInstruction();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Output</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' reference.
	 * @see #setOutput(OutputStream)
	 * @see ftl.FtlPackage#getTransform_Output()
	 * @model required="true"
	 * @generated
	 */
	OutputStream getOutput();

	/**
	 * Sets the value of the '{@link ftl.Transform#getOutput <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' reference.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(OutputStream value);

} // Transform
