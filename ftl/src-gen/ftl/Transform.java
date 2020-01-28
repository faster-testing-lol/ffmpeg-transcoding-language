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
 *   <li>{@link ftl.Transform#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link ftl.Transform#getOutput <em>Output</em>}</li>
 *   <li>{@link ftl.Transform#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @see ftl.FtlPackage#getTransform()
 * @model
 * @generated
 */
public interface Transform extends EObject {
	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link ftl.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference list.
	 * @see ftl.FtlPackage#getTransform_Instruction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstruction();

	/**
	 * Returns the value of the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output</em>' attribute.
	 * @see #setOutput(String)
	 * @see ftl.FtlPackage#getTransform_Output()
	 * @model
	 * @generated
	 */
	String getOutput();

	/**
	 * Sets the value of the '{@link ftl.Transform#getOutput <em>Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output</em>' attribute.
	 * @see #getOutput()
	 * @generated
	 */
	void setOutput(String value);

	/**
	 * Returns the value of the '<em><b>Input</b></em>' containment reference list.
	 * The list contents are of type {@link ftl.Input}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' containment reference list.
	 * @see ftl.FtlPackage#getTransform_Input()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Input> getInput();

} // Transform
