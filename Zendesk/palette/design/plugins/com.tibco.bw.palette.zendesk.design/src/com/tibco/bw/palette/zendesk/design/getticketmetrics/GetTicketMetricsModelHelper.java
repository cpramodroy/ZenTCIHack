package com.tibco.bw.palette.zendesk.design.getticketmetrics;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskFactory;
import com.tibco.bw.palette.zendesk.model.zendesk.GetTicketMetrics;

public class GetTicketMetricsModelHelper extends BWAbstractModelHelper 

{

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
        GetTicketMetrics activity = ZendeskFactory.eINSTANCE.createGetTicketMetrics();
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
