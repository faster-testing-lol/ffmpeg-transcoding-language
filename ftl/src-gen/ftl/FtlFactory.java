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
	 * Returns a new object of class '<em>In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In</em>'.
	 * @generated
	 */
	In createIn();

	/**
	 * Returns a new object of class '<em>Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Out</em>'.
	 * @generated
	 */
	Out createOut();

	/**
	 * Returns a new object of class '<em>Temp</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Temp</em>'.
	 * @generated
	 */
	Temp createTemp();

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
	 * Returns a new object of class '<em>frames</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>frames</em>'.
	 * @generated
	 */
	frames createframes();

	/**
	 * Returns a new object of class '<em>Video</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Video</em>'.
	 * @generated
	 */
	Video createVideo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FtlPackage getFtlPackage();

} //FtlFactory
