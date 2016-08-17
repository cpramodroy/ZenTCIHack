/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage
 * @generated
 */
public interface ZendeskFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ZendeskFactory eINSTANCE = com.tibco.bw.palette.zendesk.model.zendesk.impl.ZendeskFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Create Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create Ticket</em>'.
	 * @generated
	 */
	CreateTicket createCreateTicket();

	/**
	 * Returns a new object of class '<em>Create User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Create User</em>'.
	 * @generated
	 */
	CreateUser createCreateUser();

	/**
	 * Returns a new object of class '<em>Update Ticket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Update Ticket</em>'.
	 * @generated
	 */
	UpdateTicket createUpdateTicket();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ZendeskPackage getZendeskPackage();

} //ZendeskFactory
