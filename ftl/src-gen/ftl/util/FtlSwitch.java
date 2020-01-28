/**
 */
package ftl.util;

import ftl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ftl.FtlPackage
 * @generated
 */
public class FtlSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FtlPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FtlSwitch() {
		if (modelPackage == null) {
			modelPackage = FtlPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case FtlPackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.TRANSFORM: {
			Transform transform = (Transform) theEObject;
			T result = caseTransform(transform);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.INSTRUCTION: {
			Instruction instruction = (Instruction) theEObject;
			T result = caseInstruction(instruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.SEPIA: {
			Sepia sepia = (Sepia) theEObject;
			T result = caseSepia(sepia);
			if (result == null)
				result = caseInstruction(sepia);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.BLUR: {
			Blur blur = (Blur) theEObject;
			T result = caseBlur(blur);
			if (result == null)
				result = caseInstruction(blur);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.FPS: {
			Fps fps = (Fps) theEObject;
			T result = caseFps(fps);
			if (result == null)
				result = caseInstruction(fps);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.GRAYSCALE: {
			Grayscale grayscale = (Grayscale) theEObject;
			T result = caseGrayscale(grayscale);
			if (result == null)
				result = caseInstruction(grayscale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.REVERSE: {
			Reverse reverse = (Reverse) theEObject;
			T result = caseReverse(reverse);
			if (result == null)
				result = caseInstruction(reverse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.SCALE: {
			Scale scale = (Scale) theEObject;
			T result = caseScale(scale);
			if (result == null)
				result = caseInstruction(scale);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.SHARPEN: {
			Sharpen sharpen = (Sharpen) theEObject;
			T result = caseSharpen(sharpen);
			if (result == null)
				result = caseInstruction(sharpen);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.INPUT: {
			Input input = (Input) theEObject;
			T result = caseInput(input);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.VIDEO: {
			Video video = (Video) theEObject;
			T result = caseVideo(video);
			if (result == null)
				result = caseInput(video);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.AUDIO: {
			Audio audio = (Audio) theEObject;
			T result = caseAudio(audio);
			if (result == null)
				result = caseInput(audio);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.NEGATE: {
			Negate negate = (Negate) theEObject;
			T result = caseNegate(negate);
			if (result == null)
				result = caseInstruction(negate);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.ECHO: {
			Echo echo = (Echo) theEObject;
			T result = caseEcho(echo);
			if (result == null)
				result = caseInstruction(echo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.MIX: {
			Mix mix = (Mix) theEObject;
			T result = caseMix(mix);
			if (result == null)
				result = caseInstruction(mix);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.START: {
			Start start = (Start) theEObject;
			T result = caseStart(start);
			if (result == null)
				result = caseInstruction(start);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.END: {
			End end = (End) theEObject;
			T result = caseEnd(end);
			if (result == null)
				result = caseInstruction(end);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FtlPackage.CONCAT: {
			Concat concat = (Concat) theEObject;
			T result = caseConcat(concat);
			if (result == null)
				result = caseInstruction(concat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransform(Transform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sepia</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sepia</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSepia(Sepia object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlur(Blur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fps</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fps</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFps(Fps object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Video</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVideo(Video object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Audio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAudio(Audio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Negate</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNegate(Negate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Echo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Echo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEcho(Echo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMix(Mix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart(Start object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd(End object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Concat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConcat(Concat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grayscale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grayscale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrayscale(Grayscale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reverse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reverse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReverse(Reverse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScale(Scale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sharpen</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sharpen</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSharpen(Sharpen object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInput(Input object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FtlSwitch
