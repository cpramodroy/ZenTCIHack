package com.tibco.bw.palette.zendesk.design.search;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskFactory;
import com.tibco.bw.palette.zendesk.model.zendesk.Search;

public class SearchModelHelper extends BWAbstractModelHelper 

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
        Search activity = ZendeskFactory.eINSTANCE.createSearch();
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
