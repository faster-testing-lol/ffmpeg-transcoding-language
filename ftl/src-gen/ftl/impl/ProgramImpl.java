/**
 */
package ftl.impl;

import ftl.FtlPackage;
import ftl.Program;
import ftl.Stream;
import ftl.Transform;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ftl.impl.ProgramImpl#getStreams <em>Streams</em>}</li>
 *   <li>{@link ftl.impl.ProgramImpl#getTransforms <em>Transforms</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getStreams() <em>Streams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreams()
	 * @generated
	 * @ordered
	 */
	protected EList<Stream> streams;

	/**
	 * The cached value of the '{@link #getTransforms() <em>Transforms</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransforms()
	 * @generated
	 * @ordered
	 */
	protected EList<Transform> transforms;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FtlPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Stream> getStreams() {
		if (streams == null) {
			streams = new EObjectContainmentEList<Stream>(Stream.class, this, FtlPackage.PROGRAM__STREAMS);
		}
		return streams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Transform> getTransforms() {
		if (transforms == null) {
			transforms = new EObjectContainmentEList<Transform>(Transform.class, this, FtlPackage.PROGRAM__TRANSFORMS);
		}
		return transforms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FtlPackage.PROGRAM__STREAMS:
			return ((InternalEList<?>) getStreams()).basicRemove(otherEnd, msgs);
		case FtlPackage.PROGRAM__TRANSFORMS:
			return ((InternalEList<?>) getTransforms()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FtlPackage.PROGRAM__STREAMS:
			return getStreams();
		case FtlPackage.PROGRAM__TRANSFORMS:
			return getTransforms();
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
		case FtlPackage.PROGRAM__STREAMS:
			getStreams().clear();
			getStreams().addAll((Collection<? extends Stream>) newValue);
			return;
		case FtlPackage.PROGRAM__TRANSFORMS:
			getTransforms().clear();
			getTransforms().addAll((Collection<? extends Transform>) newValue);
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
		case FtlPackage.PROGRAM__STREAMS:
			getStreams().clear();
			return;
		case FtlPackage.PROGRAM__TRANSFORMS:
			getTransforms().clear();
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
		case FtlPackage.PROGRAM__STREAMS:
			return streams != null && !streams.isEmpty();
		case FtlPackage.PROGRAM__TRANSFORMS:
			return transforms != null && !transforms.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
