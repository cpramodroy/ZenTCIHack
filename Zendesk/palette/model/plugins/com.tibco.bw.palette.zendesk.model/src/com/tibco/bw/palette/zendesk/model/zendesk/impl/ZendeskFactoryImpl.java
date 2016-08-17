/**
 */
package com.tibco.bw.palette.zendesk.model.zendesk.impl;

import com.tibco.bw.palette.zendesk.model.zendesk.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZendeskFactoryImpl extends EFactoryImpl implements ZendeskFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ZendeskFactory init() {
		try {
			ZendeskFactory theZendeskFactory = (ZendeskFactory)EPackage.Registry.INSTANCE.getEFactory(ZendeskPackage.eNS_URI);
			if (theZendeskFactory != null) {
				return theZendeskFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ZendeskFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZendeskFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ZendeskPackage.CREATE_TICKET: return createCreateTicket();
			case ZendeskPackage.CREATE_USER: return createCreateUser();
			case ZendeskPackage.UPDATE_TICKET: return createUpdateTicket();
			case ZendeskPackage.DELETE: return createDelete();
			case ZendeskPackage.GET_TICKET_METRICS: return createGetTicketMetrics();
			case ZendeskPackage.SEARCH: return createSearch();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateTicket createCreateTicket() {
		CreateTicketImpl createTicket = new CreateTicketImpl();
		return createTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateUser createCreateUser() {
		CreateUserImpl createUser = new CreateUserImpl();
		return createUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateTicket createUpdateTicket() {
		UpdateTicketImpl updateTicket = new UpdateTicketImpl();
		return updateTicket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Delete createDelete() {
		DeleteImpl delete = new DeleteImpl();
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTicketMetrics createGetTicketMetrics() {
		GetTicketMetricsImpl getTicketMetrics = new GetTicketMetricsImpl();
		return getTicketMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Search createSearch() {
		SearchImpl search = new SearchImpl();
		return search;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZendeskPackage getZendeskPackage() {
		return (ZendeskPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ZendeskPackage getPackage() {
		return ZendeskPackage.eINSTANCE;
	}

} //ZendeskFactoryImpl
