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
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.eclipsechaser.examples.gef3d.model.graph.Graph#getNodes <em>Nodes</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends AbstractNamedObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link de.eclipsechaser.examples.gef3d.model.graph.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getGraph_Nodes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Node> getNodes();

} // Graph
