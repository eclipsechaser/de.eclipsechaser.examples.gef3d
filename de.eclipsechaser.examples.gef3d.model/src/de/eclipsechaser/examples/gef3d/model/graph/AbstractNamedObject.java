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
 * A representation of the model object '<em><b>Abstract Named Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.eclipsechaser.examples.gef3d.model.graph.AbstractNamedObject#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getAbstractNamedObject()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNamedObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Some Name"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.eclipsechaser.examples.gef3d.model.graph.GraphPackage#getAbstractNamedObject_Name()
	 * @model default="Some Name"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.eclipsechaser.examples.gef3d.model.graph.AbstractNamedObject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractNamedObject
