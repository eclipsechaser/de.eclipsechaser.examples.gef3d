/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.eclipsechaser.examples.gef3d.model.graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Edge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.eclipsechaser.examples.gef3d.model.graph.Edge#getSource <em>Source</em>}</li>
 *   <li>{@link de.eclipsechaser.examples.gef3d.model.graph.Edge#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getEdge()
 * @model
 * @generated
 */
public interface Edge extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.eclipsechaser.examples.gef3d.model.graph.Node#getOutgoingEdges <em>Outgoing Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Node)
	 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getEdge_Source()
	 * @see de.eclipsechaser.examples.gef3d.model.graph.Node#getOutgoingEdges
	 * @model opposite="outgoingEdges" required="true"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link de.eclipsechaser.examples.gef3d.model.graph.Edge#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link de.eclipsechaser.examples.gef3d.model.graph.Node#getIncomingEdges <em>Incoming Edges</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getEdge_Target()
	 * @see de.eclipsechaser.examples.gef3d.model.graph.Node#getIncomingEdges
	 * @model opposite="incomingEdges"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link de.eclipsechaser.examples.gef3d.model.graph.Edge#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

} // Edge
