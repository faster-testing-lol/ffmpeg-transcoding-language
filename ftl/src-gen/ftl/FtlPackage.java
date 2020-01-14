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
	 * The feature id for the '<em><b>Streams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STREAMS = 0;

	/**
	 * The feature id for the '<em><b>Transforms</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__TRANSFORMS = 1;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftl.impl.StreamImpl <em>Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.StreamImpl
	 * @see ftl.impl.FtlPackageImpl#getStream()
	 * @generated
	 */
	int STREAM = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM__PATH = 0;

	/**
	 * The number of structural features of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STREAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ftl.impl.InImpl <em>In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.InImpl
	 * @see ftl.impl.FtlPackageImpl#getIn()
	 * @generated
	 */
	int IN = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__PATH = STREAM__PATH;

	/**
	 * The number of structural features of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FEATURE_COUNT = STREAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OPERATION_COUNT = STREAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.OutputStreamImpl <em>Output Stream</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.OutputStreamImpl
	 * @see ftl.impl.FtlPackageImpl#getOutputStream()
	 * @generated
	 */
	int OUTPUT_STREAM = 6;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STREAM__PATH = STREAM__PATH;

	/**
	 * The number of structural features of the '<em>Output Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STREAM_FEATURE_COUNT = STREAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Output Stream</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_STREAM_OPERATION_COUNT = STREAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.OutImpl <em>Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.OutImpl
	 * @see ftl.impl.FtlPackageImpl#getOut()
	 * @generated
	 */
	int OUT = 2;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT__PATH = OUTPUT_STREAM__PATH;

	/**
	 * The number of structural features of the '<em>Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_FEATURE_COUNT = OUTPUT_STREAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_OPERATION_COUNT = OUTPUT_STREAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.TempImpl <em>Temp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.TempImpl
	 * @see ftl.impl.FtlPackageImpl#getTemp()
	 * @generated
	 */
	int TEMP = 3;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP__PATH = OUTPUT_STREAM__PATH;

	/**
	 * The number of structural features of the '<em>Temp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_FEATURE_COUNT = OUTPUT_STREAM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Temp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMP_OPERATION_COUNT = OUTPUT_STREAM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.TransformImpl <em>Transform</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.TransformImpl
	 * @see ftl.impl.FtlPackageImpl#getTransform()
	 * @generated
	 */
	int TRANSFORM = 5;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__INPUTS = 0;

	/**
	 * The feature id for the '<em><b>Instruction</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__INSTRUCTION = 1;

	/**
	 * The feature id for the '<em><b>Output</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORM__OUTPUT = 2;

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
	int INSTRUCTION = 7;

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
	int SEPIA = 8;

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
	int BLUR = 9;

	/**
	 * The number of structural features of the '<em>Blur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Blur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLUR_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ftl.impl.framesImpl <em>frames</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ftl.impl.framesImpl
	 * @see ftl.impl.FtlPackageImpl#getframes()
	 * @generated
	 */
	int FRAMES = 10;

	/**
	 * The number of structural features of the '<em>frames</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>frames</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRAMES_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

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
	 * Returns the meta object for the reference list '{@link ftl.Program#getStreams <em>Streams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Streams</em>'.
	 * @see ftl.Program#getStreams()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Streams();

	/**
	 * Returns the meta object for the reference list '{@link ftl.Program#getTransforms <em>Transforms</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Transforms</em>'.
	 * @see ftl.Program#getTransforms()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Transforms();

	/**
	 * Returns the meta object for class '{@link ftl.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In</em>'.
	 * @see ftl.In
	 * @generated
	 */
	EClass getIn();

	/**
	 * Returns the meta object for class '{@link ftl.Out <em>Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out</em>'.
	 * @see ftl.Out
	 * @generated
	 */
	EClass getOut();

	/**
	 * Returns the meta object for class '{@link ftl.Temp <em>Temp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temp</em>'.
	 * @see ftl.Temp
	 * @generated
	 */
	EClass getTemp();

	/**
	 * Returns the meta object for class '{@link ftl.Stream <em>Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stream</em>'.
	 * @see ftl.Stream
	 * @generated
	 */
	EClass getStream();

	/**
	 * Returns the meta object for the attribute '{@link ftl.Stream#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ftl.Stream#getPath()
	 * @see #getStream()
	 * @generated
	 */
	EAttribute getStream_Path();

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
	 * Returns the meta object for the reference list '{@link ftl.Transform#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see ftl.Transform#getInputs()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Inputs();

	/**
	 * Returns the meta object for the reference list '{@link ftl.Transform#getInstruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instruction</em>'.
	 * @see ftl.Transform#getInstruction()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Instruction();

	/**
	 * Returns the meta object for the reference '{@link ftl.Transform#getOutput <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Output</em>'.
	 * @see ftl.Transform#getOutput()
	 * @see #getTransform()
	 * @generated
	 */
	EReference getTransform_Output();

	/**
	 * Returns the meta object for class '{@link ftl.OutputStream <em>Output Stream</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Stream</em>'.
	 * @see ftl.OutputStream
	 * @generated
	 */
	EClass getOutputStream();

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
	 * Returns the meta object for class '{@link ftl.frames <em>frames</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>frames</em>'.
	 * @see ftl.frames
	 * @generated
	 */
	EClass getframes();

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
		 * The meta object literal for the '<em><b>Streams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STREAMS = eINSTANCE.getProgram_Streams();

		/**
		 * The meta object literal for the '<em><b>Transforms</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__TRANSFORMS = eINSTANCE.getProgram_Transforms();

		/**
		 * The meta object literal for the '{@link ftl.impl.InImpl <em>In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.InImpl
		 * @see ftl.impl.FtlPackageImpl#getIn()
		 * @generated
		 */
		EClass IN = eINSTANCE.getIn();

		/**
		 * The meta object literal for the '{@link ftl.impl.OutImpl <em>Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.OutImpl
		 * @see ftl.impl.FtlPackageImpl#getOut()
		 * @generated
		 */
		EClass OUT = eINSTANCE.getOut();

		/**
		 * The meta object literal for the '{@link ftl.impl.TempImpl <em>Temp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.TempImpl
		 * @see ftl.impl.FtlPackageImpl#getTemp()
		 * @generated
		 */
		EClass TEMP = eINSTANCE.getTemp();

		/**
		 * The meta object literal for the '{@link ftl.impl.StreamImpl <em>Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.StreamImpl
		 * @see ftl.impl.FtlPackageImpl#getStream()
		 * @generated
		 */
		EClass STREAM = eINSTANCE.getStream();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STREAM__PATH = eINSTANCE.getStream_Path();

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
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__INPUTS = eINSTANCE.getTransform_Inputs();

		/**
		 * The meta object literal for the '<em><b>Instruction</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__INSTRUCTION = eINSTANCE.getTransform_Instruction();

		/**
		 * The meta object literal for the '<em><b>Output</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSFORM__OUTPUT = eINSTANCE.getTransform_Output();

		/**
		 * The meta object literal for the '{@link ftl.impl.OutputStreamImpl <em>Output Stream</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.OutputStreamImpl
		 * @see ftl.impl.FtlPackageImpl#getOutputStream()
		 * @generated
		 */
		EClass OUTPUT_STREAM = eINSTANCE.getOutputStream();

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
		 * The meta object literal for the '{@link ftl.impl.framesImpl <em>frames</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ftl.impl.framesImpl
		 * @see ftl.impl.FtlPackageImpl#getframes()
		 * @generated
		 */
		EClass FRAMES = eINSTANCE.getframes();

	}

} //FtlPackage
