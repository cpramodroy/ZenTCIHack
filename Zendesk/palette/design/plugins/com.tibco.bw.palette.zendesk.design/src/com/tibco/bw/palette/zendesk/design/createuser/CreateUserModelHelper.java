package com.tibco.bw.palette.zendesk.design.createuser;

import org.eclipse.emf.ecore.EObject;
import com.tibco.bw.design.api.BWAbstractModelHelper;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskFactory;
import com.tibco.bw.palette.zendesk.model.zendesk.CreateUser;

public class CreateUserModelHelper extends BWAbstractModelHelper 

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
        CreateUser activity = ZendeskFactory.eINSTANCE.createCreateUser();
        // begin-custom-code
        // end-custom-code
        return activity;
    }
}
