/**
 */
package ftl.impl;

import ftl.FtlPackage;
import ftl.Instruction;
import ftl.OutputStream;
import ftl.Stream;
import ftl.Transform;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transform</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftl.impl.TransformImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link ftl.impl.TransformImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link ftl.impl.TransformImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransformImpl extends MinimalEObjectImpl.Container implements Transform {
	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Stream> inputs;

	/**
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instruction;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected OutputStream output;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtlPackage.Literals.TRANSFORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stream> getInputs() {
		if (inputs == null) {
			inputs = new EObjectResolvingEList<Stream>(Stream.class, this, FtlPackage.TRANSFORM__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Instruction> getInstruction() {
		if (instruction == null) {
			instruction = new EObjectResolvingEList<Instruction>(Instruction.class, this,
					FtlPackage.TRANSFORM__INSTRUCTION);
		}
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OutputStream getOutput() {
		if (output != null && output.eIsProxy()) {
			InternalEObject oldOutput = (InternalEObject) output;
			output = (OutputStream) eResolveProxy(oldOutput);
			if (output != oldOutput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FtlPackage.TRANSFORM__OUTPUT, oldOutput,
							output));
			}
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputStream basicGetOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOutput(OutputStream newOutput) {
		OutputStream oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FtlPackage.TRANSFORM__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FtlPackage.TRANSFORM__INPUTS:
			return getInputs();
		case FtlPackage.TRANSFORM__INSTRUCTION:
			return getInstruction();
		case FtlPackage.TRANSFORM__OUTPUT:
			if (resolve)
				return getOutput();
			return basicGetOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FtlPackage.TRANSFORM__INPUTS:
			getInputs().clear();
			getInputs().addAll((Collection<? extends Stream>) newValue);
			return;
		case FtlPackage.TRANSFORM__INSTRUCTION:
			getInstruction().clear();
			getInstruction().addAll((Collection<? extends Instruction>) newValue);
			return;
		case FtlPackage.TRANSFORM__OUTPUT:
			setOutput((OutputStream) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FtlPackage.TRANSFORM__INPUTS:
			getInputs().clear();
			return;
		case FtlPackage.TRANSFORM__INSTRUCTION:
			getInstruction().clear();
			return;
		case FtlPackage.TRANSFORM__OUTPUT:
			setOutput((OutputStream) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FtlPackage.TRANSFORM__INPUTS:
			return inputs != null && !inputs.isEmpty();
		case FtlPackage.TRANSFORM__INSTRUCTION:
			return instruction != null && !instruction.isEmpty();
		case FtlPackage.TRANSFORM__OUTPUT:
			return output != null;
		}
		return super.eIsSet(featureID);
	}

} //TransformImpl
