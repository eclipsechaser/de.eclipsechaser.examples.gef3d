/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.eclipsechaser.examples.gef3d.model.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.eclipsechaser.examples.gef3d.model.graph.Node#getIncomingEdges <em>Incoming Edges</em>}</li>
 *   <li>{@link de.eclipsechaser.examples.gef3d.model.graph.Node#getOutgoingEdges <em>Outgoing Edges</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends AbstractNamedObject {
	/**
	 * Returns the value of the '<em><b>Incoming Edges</b></em>' reference list.
	 * The list contents are of type {@link de.eclipsechaser.examples.gef3d.model.graph.Edge}.
	 * It is bidirectional and its opposite is '{@link de.eclipsechaser.examples.gef3d.model.graph.Edge#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Edges</em>' reference list.
	 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getNode_IncomingEdges()
	 * @see de.eclipsechaser.examples.gef3d.model.graph.Edge#getTarget
	 * @model opposite="target" changeable="false"
	 * @generated
	 */
	EList<Edge> getIncomingEdges();

	/**
	 * Returns the value of the '<em><b>Outgoing Edges</b></em>' reference list.
	 * The list contents are of type {@link de.eclipsechaser.examples.gef3d.model.graph.Edge}.
	 * It is bidirectional and its opposite is '{@link de.eclipsechaser.examples.gef3d.model.graph.Edge#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Edges</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Edges</em>' reference list.
	 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getNode_OutgoingEdges()
	 * @see de.eclipsechaser.examples.gef3d.model.graph.Edge#getSource
	 * @model opposite="source" changeable="false"
	 * @generated
	 */
	EList<Edge> getOutgoingEdges();

} // Node
