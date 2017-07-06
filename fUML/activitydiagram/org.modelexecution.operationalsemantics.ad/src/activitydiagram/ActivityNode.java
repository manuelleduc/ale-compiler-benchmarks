/**
 */
package activitydiagram;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link activitydiagram.ActivityNode#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link activitydiagram.ActivityNode#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link activitydiagram.ActivityNode#getActivity <em>Activity</em>}</li>
 *   <li>{@link activitydiagram.ActivityNode#isRunning <em>Running</em>}</li>
 *   <li>{@link activitydiagram.ActivityNode#getHeldTokens <em>Held Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see activitydiagram.ActivitydiagramPackage#getActivityNode()
 * @model abstract="true"
 * @generated
 */
public interface ActivityNode extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.ActivityEdge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityNode_Outgoing()
	 * @see activitydiagram.ActivityEdge#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<ActivityEdge> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link activitydiagram.ActivityEdge}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.ActivityEdge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityNode_Incoming()
	 * @see activitydiagram.ActivityEdge#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<ActivityEdge> getIncoming();

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link activitydiagram.Activity#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' container reference.
	 * @see #setActivity(Activity)
	 * @see activitydiagram.ActivitydiagramPackage#getActivityNode_Activity()
	 * @see activitydiagram.Activity#getNodes
	 * @model opposite="nodes" required="true" transient="false"
	 * @generated
	 */
	Activity getActivity();

	/**
	 * Sets the value of the '{@link activitydiagram.ActivityNode#getActivity <em>Activity</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' container reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Activity value);

	/**
	 * @generated NOT
	 */
	public void run();
	
	/**
	 * @generated NOT
	 */
	public boolean isReady();
	/**
	 * @generated NOT
	 */
	public void sendOffers(List<Token> tokens);
	/**
	 * @generated NOT
	 */
	public List<Token> takeOfferdTokens();
	/**
	 * @generated NOT
	 */
	public void addTokens(List<Token> tokens);
	/**
	 * @generated NOT
	 */
	public void removeToken(Token token);
	/**
	 * @generated NOT
	 */
	public boolean hasOffers();
	/**
	 * @generated NOT
	 */
	public boolean isRunning();
	/**
	 * Sets the value of the '{@link activitydiagram.ActivityNode#isRunning <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Running</em>' attribute.
	 * @see #isRunning()
	 * @generated
	 */
	void setRunning(boolean value);

	/**
	 * Returns the value of the '<em><b>Held Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link activitydiagram.Token}.
	 * It is bidirectional and its opposite is '{@link activitydiagram.Token#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Held Tokens</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Held Tokens</em>' containment reference list.
	 * @see activitydiagram.ActivitydiagramPackage#getActivityNode_HeldTokens()
	 * @see activitydiagram.Token#getHolder
	 * @model opposite="holder" containment="true"
	 * @generated
	 */
	EList<Token> getHeldTokens();

	/**
	 * @generated NOT
	 */
	public void terminate();

	void fire(List<Token> tokens);
	
} // ActivityNode
