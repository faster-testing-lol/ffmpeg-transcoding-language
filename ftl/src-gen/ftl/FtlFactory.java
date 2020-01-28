/**
 */
package ftl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ftl.FtlPackage
 * @generated
 */
public interface FtlFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FtlFactory eINSTANCE = ftl.impl.FtlFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>Transform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform</em>'.
	 * @generated
	 */
	Transform createTransform();

	/**
	 * Returns a new object of class '<em>Sepia</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sepia</em>'.
	 * @generated
	 */
	Sepia createSepia();

	/**
	 * Returns a new object of class '<em>Blur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Blur</em>'.
	 * @generated
	 */
	Blur createBlur();

	/**
	 * Returns a new object of class '<em>Fps</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fps</em>'.
	 * @generated
	 */
	Fps createFps();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns a new object of class '<em>Audio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Audio</em>'.
	 * @generated
	 */
	Audio createAudio();

	/**
	 * Returns a new object of class '<em>Negate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negate</em>'.
	 * @generated
	 */
	Negate createNegate();

	/**
	 * Returns a new object of class '<em>Echo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Echo</em>'.
	 * @generated
	 */
	Echo createEcho();

	/**
	 * Returns a new object of class '<em>Mix</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mix</em>'.
	 * @generated
	 */
	Mix createMix();

	/**
	 * Returns a new object of class '<em>Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start</em>'.
	 * @generated
	 */
	Start createStart();

	/**
	 * Returns a new object of class '<em>End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End</em>'.
	 * @generated
	 */
	End createEnd();

	/**
	 * Returns a new object of class '<em>Concat</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Concat</em>'.
	 * @generated
	 */
	Concat createConcat();

	/**
	 * Returns a new object of class '<em>Grayscale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grayscale</em>'.
	 * @generated
	 */
	Grayscale createGrayscale();

	/**
	 * Returns a new object of class '<em>Reverse</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reverse</em>'.
	 * @generated
	 */
	Reverse createReverse();

	/**
	 * Returns a new object of class '<em>Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale</em>'.
	 * @generated
	 */
	Scale createScale();

	/**
	 * Returns a new object of class '<em>Sharpen</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sharpen</em>'.
	 * @generated
	 */
	Sharpen createSharpen();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FtlPackage getFtlPackage();

} //FtlFactory
