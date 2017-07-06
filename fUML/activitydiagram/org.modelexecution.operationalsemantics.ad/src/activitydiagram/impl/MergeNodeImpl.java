/**
 */
package activitydiagram.impl;

import org.eclipse.emf.ecore.EClass;

import activitydiagram.ActivityEdge;
import activitydiagram.ActivitydiagramPackage;
import activitydiagram.MergeNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MergeNodeImpl extends ControlNodeImpl implements MergeNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ActivitydiagramPackage.Literals.MERGE_NODE;
	}
	
	@Override
	public boolean hasOffers() {
		for(ActivityEdge edge : getIncoming()) {
			if(edge.hasOffer()) {
				return true;
			}
		}
		return false;
	}

} //MergeNodeImpl
