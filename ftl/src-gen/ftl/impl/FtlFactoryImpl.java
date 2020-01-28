/**
 */
package ftl.impl;

import ftl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FtlFactoryImpl extends EFactoryImpl implements FtlFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FtlFactory init() {
		try {
			FtlFactory theFtlFactory = (FtlFactory) EPackage.Registry.INSTANCE.getEFactory(FtlPackage.eNS_URI);
			if (theFtlFactory != null) {
				return theFtlFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FtlFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtlFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FtlPackage.PROGRAM:
			return createProgram();
		case FtlPackage.TRANSFORM:
			return createTransform();
		case FtlPackage.SEPIA:
			return createSepia();
		case FtlPackage.BLUR:
			return createBlur();
		case FtlPackage.FPS:
			return createFps();
		case FtlPackage.GRAYSCALE:
			return createGrayscale();
		case FtlPackage.REVERSE:
			return createReverse();
		case FtlPackage.SCALE:
			return createScale();
		case FtlPackage.SHARPEN:
			return createSharpen();
		case FtlPackage.VIDEO:
			return createVideo();
		case FtlPackage.AUDIO:
			return createAudio();
		case FtlPackage.NEGATE:
			return createNegate();
		case FtlPackage.ECHO:
			return createEcho();
		case FtlPackage.MIX:
			return createMix();
		case FtlPackage.START:
			return createStart();
		case FtlPackage.END:
			return createEnd();
		case FtlPackage.CONCAT:
			return createConcat();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Transform createTransform() {
		TransformImpl transform = new TransformImpl();
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sepia createSepia() {
		SepiaImpl sepia = new SepiaImpl();
		return sepia;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Blur createBlur() {
		BlurImpl blur = new BlurImpl();
		return blur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fps createFps() {
		FpsImpl fps = new FpsImpl();
		return fps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Video createVideo() {
		VideoImpl video = new VideoImpl();
		return video;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Audio createAudio() {
		AudioImpl audio = new AudioImpl();
		return audio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Negate createNegate() {
		NegateImpl negate = new NegateImpl();
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Echo createEcho() {
		EchoImpl echo = new EchoImpl();
		return echo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mix createMix() {
		MixImpl mix = new MixImpl();
		return mix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start createStart() {
		StartImpl start = new StartImpl();
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End createEnd() {
		EndImpl end = new EndImpl();
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concat createConcat() {
		ConcatImpl concat = new ConcatImpl();
		return concat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grayscale createGrayscale() {
		GrayscaleImpl grayscale = new GrayscaleImpl();
		return grayscale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Reverse createReverse() {
		ReverseImpl reverse = new ReverseImpl();
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scale createScale() {
		ScaleImpl scale = new ScaleImpl();
		return scale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sharpen createSharpen() {
		SharpenImpl sharpen = new SharpenImpl();
		return sharpen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FtlPackage getFtlPackage() {
		return (FtlPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FtlPackage getPackage() {
		return FtlPackage.eINSTANCE;
	}

} //FtlFactoryImpl
