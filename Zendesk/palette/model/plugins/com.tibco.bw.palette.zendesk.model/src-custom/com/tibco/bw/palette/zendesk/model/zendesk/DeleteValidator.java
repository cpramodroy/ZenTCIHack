package com.tibco.bw.palette.zendesk.model.zendesk;

import com.tibco.bw.palette.zendesk.model.zendesk.Delete;
import com.tibco.bw.validation.process.ActivityConfigurationValidator;
import com.tibco.bw.validation.process.ActivityValidationContext;
import com.tibco.bw.palette.zendesk.model.zendesk.ZendeskPackage;
import com.tibco.bw.palette.zendesk.model.utils.Messages;
import com.tibco.bw.palette.zendesk.model.utils.MessageCode;
import org.eclipse.osgi.util.NLS;

public class DeleteValidator implements ActivityConfigurationValidator {	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * Validates Activity model configuration.
	 * @param context
	 *			The activity validation context.Developers can retrieve following informations:
	 *          <li> Activity Configuration Model(EMF model)</li>
 	 *          <li> Name of the EventSource Activity</li>
     *          <li> Value of process property used in Activity Configuration</li>
     *          <li> Name of property configured in the Attribute Binding Field</li>
     *          <li> Name of the process</li><br>
	 */	
	@Override
	public void validateBWActivityConfiguration(ActivityValidationContext context) {
	    Delete model =(Delete) context.getActivityConfigurationModel();    	
		
	    String passwordModul = context.getAttributeBindingPropertyName("password");
		if(passwordModul == null || "".equals(passwordModul)){
		    String password = model.getPassword(); 
		    if(password == null || "".equals(password)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Password"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, ZendeskPackage.Literals.DELETE__PASSWORD);
		    }
		}
	    String deleteTypeModul = context.getAttributeBindingPropertyName("deleteType");
		if(deleteTypeModul == null || "".equals(deleteTypeModul)){
		    String deleteType = model.getDeleteType(); 
		    if(deleteType == null || "".equals(deleteType)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Delete Type"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, ZendeskPackage.Literals.DELETE__DELETE_TYPE);
		    }
		}
	    String companyUrlModul = context.getAttributeBindingPropertyName("companyUrl");
		if(companyUrlModul == null || "".equals(companyUrlModul)){
		    String companyUrl = model.getCompanyUrl(); 
		    if(companyUrl == null || "".equals(companyUrl)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"Company Url"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, ZendeskPackage.Literals.DELETE__COMPANY_URL);
		    }
		}
	    String userIdModul = context.getAttributeBindingPropertyName("userId");
		if(userIdModul == null || "".equals(userIdModul)){
		    String userId = model.getUserId(); 
		    if(userId == null || "".equals(userId)) {
		        String message = ""; //$NON-NLS-1$
		        message = NLS.bind(Messages.PALETTE_PARAMETER_VALUE_INVALID, new String[] {"User Id"});
		        context.createError(message, null, MessageCode.PARAMETER_NOT_SPECIFIED, ZendeskPackage.Literals.DELETE__USER_ID);
		    }
		}	
		// begin-custom-code
	    // end-custom-code
  	}
}