/**
 */
package ftl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ftl.FtlFactory
 * @model kind="package"
 * @generated
 */
public interface FtlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ftl";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ftl";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ftl";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtlPackage eINSTANCE = ftl.impl.FtlPackageImpl.init();

	/**
	 * The meta object id for the '{@link ftl.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.ProgramImpl
	 * @see ftl.impl.FtlPackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TRANSFORMS = 0;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftl.impl.TransformImpl <em>Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.TransformImpl
	 * @see ftl.impl.FtlPackageImpl#getTransform()
	 * @generated
	 */
	int TRANSFORM = 1;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__INSTRUCTION = 0;

	/**
	 * The feature id for the '<em><b>Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__OUTPUT = 1;

	/**
	 * The feature id for the '<em><b>Input</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__INPUT = 2;

	/**
	 * The number of structural features of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Transform</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftl.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.InstructionImpl
	 * @see ftl.impl.FtlPackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftl.impl.SepiaImpl <em>Sepia</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.SepiaImpl
	 * @see ftl.impl.FtlPackageImpl#getSepia()
	 * @generated
	 */
	int SEPIA = 3;

	/**
	 * The number of structural features of the '<em>Sepia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPIA_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sepia</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEPIA_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.BlurImpl <em>Blur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.BlurImpl
	 * @see ftl.impl.FtlPackageImpl#getBlur()
	 * @generated
	 */
	int BLUR = 4;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR__RADIUS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Blur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Blur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.FpsImpl <em>Fps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.FpsImpl
	 * @see ftl.impl.FtlPackageImpl#getFps()
	 * @generated
	 */
	int FPS = 5;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPS__VALUE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Fps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPS_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Fps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FPS_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.VideoImpl <em>Video</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.VideoImpl
	 * @see ftl.impl.FtlPackageImpl#getVideo()
	 * @generated
	 */
	int VIDEO = 11;

	/**
	 * The meta object id for the '{@link ftl.impl.AudioImpl <em>Audio</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.AudioImpl
	 * @see ftl.impl.FtlPackageImpl#getAudio()
	 * @generated
	 */
	int AUDIO = 12;

	/**
	 * The meta object id for the '{@link ftl.impl.NegateImpl <em>Negate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.NegateImpl
	 * @see ftl.impl.FtlPackageImpl#getNegate()
	 * @generated
	 */
	int NEGATE = 13;

	/**
	 * The meta object id for the '{@link ftl.impl.EchoImpl <em>Echo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.EchoImpl
	 * @see ftl.impl.FtlPackageImpl#getEcho()
	 * @generated
	 */
	int ECHO = 14;

	/**
	 * The meta object id for the '{@link ftl.impl.MixImpl <em>Mix</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.MixImpl
	 * @see ftl.impl.FtlPackageImpl#getMix()
	 * @generated
	 */
	int MIX = 15;

	/**
	 * The meta object id for the '{@link ftl.impl.StartImpl <em>Start</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.StartImpl
	 * @see ftl.impl.FtlPackageImpl#getStart()
	 * @generated
	 */
	int START = 16;

	/**
	 * The meta object id for the '{@link ftl.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.EndImpl
	 * @see ftl.impl.FtlPackageImpl#getEnd()
	 * @generated
	 */
	int END = 17;

	/**
	 * The meta object id for the '{@link ftl.impl.GrayscaleImpl <em>Grayscale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.GrayscaleImpl
	 * @see ftl.impl.FtlPackageImpl#getGrayscale()
	 * @generated
	 */
	int GRAYSCALE = 6;

	/**
	 * The number of structural features of the '<em>Grayscale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAYSCALE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Grayscale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAYSCALE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.ReverseImpl <em>Reverse</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.ReverseImpl
	 * @see ftl.impl.FtlPackageImpl#getReverse()
	 * @generated
	 */
	int REVERSE = 7;

	/**
	 * The number of structural features of the '<em>Reverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reverse</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVERSE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.ScaleImpl <em>Scale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.ScaleImpl
	 * @see ftl.impl.FtlPackageImpl#getScale()
	 * @generated
	 */
	int SCALE = 8;

	/**
	 * The feature id for the '<em><b>Factor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE__FACTOR = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Scale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCALE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.SharpenImpl <em>Sharpen</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.SharpenImpl
	 * @see ftl.impl.FtlPackageImpl#getSharpen()
	 * @generated
	 */
	int SHARPEN = 9;

	/**
	 * The number of structural features of the '<em>Sharpen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARPEN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sharpen</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHARPEN_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.InputImpl
	 * @see ftl.impl.FtlPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 10;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PATH = 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO__PATH = INPUT__PATH;

	/**
	 * The number of structural features of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Video</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIDEO_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO__PATH = INPUT__PATH;

	/**
	 * The number of structural features of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_FEATURE_COUNT = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Audio</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUDIO_OPERATION_COUNT = INPUT_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Negate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEGATE_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Delay</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHO__DELAY = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Echo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Echo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ECHO_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Mix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mix</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIX_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START__TIME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TIME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.ConcatImpl <em>Concat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.ConcatImpl
	 * @see ftl.impl.FtlPackageImpl#getConcat()
	 * @generated
	 */
	int CONCAT = 18;

	/**
	 * The number of structural features of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Concat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCAT_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ftl.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see ftl.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the containment reference list '{@link ftl.Program#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transforms</em>'.
	 * @see ftl.Program#getTransforms()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Transforms();

	/**
	 * Returns the meta object for class '{@link ftl.Transform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transform</em>'.
	 * @see ftl.Transform
	 * @generated
	 */
	EClass getTransform();

	/**
	 * Returns the meta object for the containment reference list '{@link ftl.Transform#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instruction</em>'.
	 * @see ftl.Transform#getInstruction()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Instruction();

	/**
	 * Returns the meta object for the attribute '{@link ftl.Transform#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Output</em>'.
	 * @see ftl.Transform#getOutput()
	 * @see #getTransform()
	 * @generated
	 */
	EAttribute getTransform_Output();

	/**
	 * Returns the meta object for the containment reference list '{@link ftl.Transform#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Input</em>'.
	 * @see ftl.Transform#getInput()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Input();

	/**
	 * Returns the meta object for class '{@link ftl.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see ftl.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link ftl.Sepia <em>Sepia</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sepia</em>'.
	 * @see ftl.Sepia
	 * @generated
	 */
	EClass getSepia();

	/**
	 * Returns the meta object for class '{@link ftl.Blur <em>Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blur</em>'.
	 * @see ftl.Blur
	 * @generated
	 */
	EClass getBlur();

	/**
	 * Returns the meta object for the attribute '{@link ftl.Blur#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see ftl.Blur#getRadius()
	 * @see #getBlur()
	 * @generated
	 */
	EAttribute getBlur_Radius();

	/**
	 * Returns the meta object for class '{@link ftl.Fps <em>Fps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fps</em>'.
	 * @see ftl.Fps
	 * @generated
	 */
	EClass getFps();

	/**
	 * Returns the meta object for the attribute '{@link ftl.Fps#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see ftl.Fps#getValue()
	 * @see #getFps()
	 * @generated
	 */
	EAttribute getFps_Value();

	/**
	 * Returns the meta object for class '{@link ftl.Video <em>Video</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Video</em>'.
	 * @see ftl.Video
	 * @generated
	 */
	EClass getVideo();

	/**
	 * Returns the meta object for class '{@link ftl.Audio <em>Audio</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Audio</em>'.
	 * @see ftl.Audio
	 * @generated
	 */
	EClass getAudio();

	/**
	 * Returns the meta object for class '{@link ftl.Negate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Negate</em>'.
	 * @see ftl.Negate
	 * @generated
	 */
	EClass getNegate();

	/**
	 * Returns the meta object for class '{@link ftl.Echo <em>Echo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Echo</em>'.
	 * @see ftl.Echo
	 * @generated
	 */
	EClass getEcho();

	/**
	 * Returns the meta object for the attribute '{@link ftl.Echo#getDelay <em>Delay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delay</em>'.
	 * @see ftl.Echo#getDelay()
	 * @see #getEcho()
	 * @generated
	 */
	EAttribute getEcho_Delay();

	/**
	 * Returns the meta object for class '{@link ftl.Mix <em>Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mix</em>'.
	 * @see ftl.Mix
	 * @generated
	 */
	EClass getMix();

	/**
	 * Returns the meta object for class '{@link ftl.Start <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start</em>'.
	 * @see ftl.Start
	 * @generated
	 */
	EClass getStart();

	/**
	 * Returns the meta object for the attribute '{@link ftl.Start#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see ftl.Start#getTime()
	 * @see #getStart()
	 * @generated
	 */
	EAttribute getStart_Time();

	/**
	 * Returns the meta object for class '{@link ftl.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see ftl.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the meta object for the attribute '{@link ftl.End#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see ftl.End#getTime()
	 * @see #getEnd()
	 * @generated
	 */
	EAttribute getEnd_Time();

	/**
	 * Returns the meta object for class '{@link ftl.Concat <em>Concat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concat</em>'.
	 * @see ftl.Concat
	 * @generated
	 */
	EClass getConcat();

	/**
	 * Returns the meta object for class '{@link ftl.Grayscale <em>Grayscale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grayscale</em>'.
	 * @see ftl.Grayscale
	 * @generated
	 */
	EClass getGrayscale();

	/**
	 * Returns the meta object for class '{@link ftl.Reverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reverse</em>'.
	 * @see ftl.Reverse
	 * @generated
	 */
	EClass getReverse();

	/**
	 * Returns the meta object for class '{@link ftl.Scale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scale</em>'.
	 * @see ftl.Scale
	 * @generated
	 */
	EClass getScale();

	/**
	 * Returns the meta object for the attribute '{@link ftl.Scale#getFactor <em>Factor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Factor</em>'.
	 * @see ftl.Scale#getFactor()
	 * @see #getScale()
	 * @generated
	 */
	EAttribute getScale_Factor();

	/**
	 * Returns the meta object for class '{@link ftl.Sharpen <em>Sharpen</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sharpen</em>'.
	 * @see ftl.Sharpen
	 * @generated
	 */
	EClass getSharpen();

	/**
	 * Returns the meta object for class '{@link ftl.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see ftl.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute list '{@link ftl.Input#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Path</em>'.
	 * @see ftl.Input#getPath()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Path();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FtlFactory getFtlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ftl.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.ProgramImpl
		 * @see ftl.impl.FtlPackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TRANSFORMS = eINSTANCE.getProgram_Transforms();

		/**
		 * The meta object literal for the '{@link ftl.impl.TransformImpl <em>Transform</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.TransformImpl
		 * @see ftl.impl.FtlPackageImpl#getTransform()
		 * @generated
		 */
		EClass TRANSFORM = eINSTANCE.getTransform();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__INSTRUCTION = eINSTANCE.getTransform_Instruction();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORM__OUTPUT = eINSTANCE.getTransform_Output();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__INPUT = eINSTANCE.getTransform_Input();

		/**
		 * The meta object literal for the '{@link ftl.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.InstructionImpl
		 * @see ftl.impl.FtlPackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link ftl.impl.SepiaImpl <em>Sepia</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.SepiaImpl
		 * @see ftl.impl.FtlPackageImpl#getSepia()
		 * @generated
		 */
		EClass SEPIA = eINSTANCE.getSepia();

		/**
		 * The meta object literal for the '{@link ftl.impl.BlurImpl <em>Blur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.BlurImpl
		 * @see ftl.impl.FtlPackageImpl#getBlur()
		 * @generated
		 */
		EClass BLUR = eINSTANCE.getBlur();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLUR__RADIUS = eINSTANCE.getBlur_Radius();

		/**
		 * The meta object literal for the '{@link ftl.impl.FpsImpl <em>Fps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.FpsImpl
		 * @see ftl.impl.FtlPackageImpl#getFps()
		 * @generated
		 */
		EClass FPS = eINSTANCE.getFps();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FPS__VALUE = eINSTANCE.getFps_Value();

		/**
		 * The meta object literal for the '{@link ftl.impl.VideoImpl <em>Video</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.VideoImpl
		 * @see ftl.impl.FtlPackageImpl#getVideo()
		 * @generated
		 */
		EClass VIDEO = eINSTANCE.getVideo();

		/**
		 * The meta object literal for the '{@link ftl.impl.AudioImpl <em>Audio</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.AudioImpl
		 * @see ftl.impl.FtlPackageImpl#getAudio()
		 * @generated
		 */
		EClass AUDIO = eINSTANCE.getAudio();

		/**
		 * The meta object literal for the '{@link ftl.impl.NegateImpl <em>Negate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.NegateImpl
		 * @see ftl.impl.FtlPackageImpl#getNegate()
		 * @generated
		 */
		EClass NEGATE = eINSTANCE.getNegate();

		/**
		 * The meta object literal for the '{@link ftl.impl.EchoImpl <em>Echo</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.EchoImpl
		 * @see ftl.impl.FtlPackageImpl#getEcho()
		 * @generated
		 */
		EClass ECHO = eINSTANCE.getEcho();

		/**
		 * The meta object literal for the '<em><b>Delay</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ECHO__DELAY = eINSTANCE.getEcho_Delay();

		/**
		 * The meta object literal for the '{@link ftl.impl.MixImpl <em>Mix</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.MixImpl
		 * @see ftl.impl.FtlPackageImpl#getMix()
		 * @generated
		 */
		EClass MIX = eINSTANCE.getMix();

		/**
		 * The meta object literal for the '{@link ftl.impl.StartImpl <em>Start</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.StartImpl
		 * @see ftl.impl.FtlPackageImpl#getStart()
		 * @generated
		 */
		EClass START = eINSTANCE.getStart();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START__TIME = eINSTANCE.getStart_Time();

		/**
		 * The meta object literal for the '{@link ftl.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.EndImpl
		 * @see ftl.impl.FtlPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END__TIME = eINSTANCE.getEnd_Time();

		/**
		 * The meta object literal for the '{@link ftl.impl.ConcatImpl <em>Concat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.ConcatImpl
		 * @see ftl.impl.FtlPackageImpl#getConcat()
		 * @generated
		 */
		EClass CONCAT = eINSTANCE.getConcat();

		/**
		 * The meta object literal for the '{@link ftl.impl.GrayscaleImpl <em>Grayscale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.GrayscaleImpl
		 * @see ftl.impl.FtlPackageImpl#getGrayscale()
		 * @generated
		 */
		EClass GRAYSCALE = eINSTANCE.getGrayscale();

		/**
		 * The meta object literal for the '{@link ftl.impl.ReverseImpl <em>Reverse</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.ReverseImpl
		 * @see ftl.impl.FtlPackageImpl#getReverse()
		 * @generated
		 */
		EClass REVERSE = eINSTANCE.getReverse();

		/**
		 * The meta object literal for the '{@link ftl.impl.ScaleImpl <em>Scale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.ScaleImpl
		 * @see ftl.impl.FtlPackageImpl#getScale()
		 * @generated
		 */
		EClass SCALE = eINSTANCE.getScale();

		/**
		 * The meta object literal for the '<em><b>Factor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCALE__FACTOR = eINSTANCE.getScale_Factor();

		/**
		 * The meta object literal for the '{@link ftl.impl.SharpenImpl <em>Sharpen</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.SharpenImpl
		 * @see ftl.impl.FtlPackageImpl#getSharpen()
		 * @generated
		 */
		EClass SHARPEN = eINSTANCE.getSharpen();

		/**
		 * The meta object literal for the '{@link ftl.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.InputImpl
		 * @see ftl.impl.FtlPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__PATH = eINSTANCE.getInput_Path();

	}

} //FtlPackage
