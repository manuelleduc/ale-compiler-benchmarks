/**
 */
package guarded;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see guarded.GuardedPackage
 * @generated
 */
public interface GuardedFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuardedFactory eINSTANCE = guarded.impl.GuardedFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Guarded</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Guarded</em>'.
	 * @generated
	 */
	Guarded createGuarded();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GuardedPackage getGuardedPackage();

} //GuardedFactory
