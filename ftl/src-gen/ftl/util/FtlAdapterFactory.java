/**
 */
package ftl.util;

import ftl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ftl.FtlPackage
 * @generated
 */
public class FtlAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FtlPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtlAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FtlPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FtlSwitch<Adapter> modelSwitch = new FtlSwitch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseTransform(Transform object) {
			return createTransformAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseSepia(Sepia object) {
			return createSepiaAdapter();
		}

		@Override
		public Adapter caseBlur(Blur object) {
			return createBlurAdapter();
		}

		@Override
		public Adapter caseFps(Fps object) {
			return createFpsAdapter();
		}

		@Override
		public Adapter caseGrayscale(Grayscale object) {
			return createGrayscaleAdapter();
		}

		@Override
		public Adapter caseReverse(Reverse object) {
			return createReverseAdapter();
		}

		@Override
		public Adapter caseScale(Scale object) {
			return createScaleAdapter();
		}

		@Override
		public Adapter caseSharpen(Sharpen object) {
			return createSharpenAdapter();
		}

		@Override
		public Adapter caseInput(Input object) {
			return createInputAdapter();
		}

		@Override
		public Adapter caseVideo(Video object) {
			return createVideoAdapter();
		}

		@Override
		public Adapter caseAudio(Audio object) {
			return createAudioAdapter();
		}

		@Override
		public Adapter caseNegate(Negate object) {
			return createNegateAdapter();
		}

		@Override
		public Adapter caseEcho(Echo object) {
			return createEchoAdapter();
		}

		@Override
		public Adapter caseMix(Mix object) {
			return createMixAdapter();
		}

		@Override
		public Adapter caseStart(Start object) {
			return createStartAdapter();
		}

		@Override
		public Adapter caseEnd(End object) {
			return createEndAdapter();
		}

		@Override
		public Adapter caseConcat(Concat object) {
			return createConcatAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Transform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Transform
	 * @generated
	 */
	public Adapter createTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Sepia <em>Sepia</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Sepia
	 * @generated
	 */
	public Adapter createSepiaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Blur <em>Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Blur
	 * @generated
	 */
	public Adapter createBlurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Fps <em>Fps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Fps
	 * @generated
	 */
	public Adapter createFpsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Video
	 * @generated
	 */
	public Adapter createVideoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Audio
	 * @generated
	 */
	public Adapter createAudioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Negate
	 * @generated
	 */
	public Adapter createNegateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Echo <em>Echo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Echo
	 * @generated
	 */
	public Adapter createEchoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Mix <em>Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Mix
	 * @generated
	 */
	public Adapter createMixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Start
	 * @generated
	 */
	public Adapter createStartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.End
	 * @generated
	 */
	public Adapter createEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Concat
	 * @generated
	 */
	public Adapter createConcatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Grayscale <em>Grayscale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Grayscale
	 * @generated
	 */
	public Adapter createGrayscaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Reverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Reverse
	 * @generated
	 */
	public Adapter createReverseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Scale
	 * @generated
	 */
	public Adapter createScaleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Sharpen <em>Sharpen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Sharpen
	 * @generated
	 */
	public Adapter createSharpenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ftl.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ftl.Input
	 * @generated
	 */
	public Adapter createInputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FtlAdapterFactory
