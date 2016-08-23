package com.tibco.bw.palette.zendesk.design.gettickets;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskFactory;
import com.tibco.bw.palette.zendesk.model.zendesk.GetTickets;

public class GetTicketsModelHelper extends BWAbstractModelHelper {

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Create an instance of the activity configuration model and provide "good" default values.
	 *
	 * @return new instance
	 */
    @Override
    public EObject createInstance() {
        GetTickets activity = ZendeskFactory.eINSTANCE.createGetTickets();
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
