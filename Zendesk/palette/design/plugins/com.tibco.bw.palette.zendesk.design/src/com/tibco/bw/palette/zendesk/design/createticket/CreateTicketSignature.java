package com.tibco.bw.palette.zendesk.design.createticket;

import java.util.List;

import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;

import com.tibco.bw.design.api.BWActivitySignature;
import com.tibco.bw.design.util.ModelHelper;
import com.tibco.bw.palette.zendesk.design.ZendeskExceptionsSchema;
import com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket;
import com.tibco.bw.model.activityconfig.Configuration;
/**
 * <!-- begin-custom-doc -->
 * 
 * <!-- end-custom-doc -->
 * @generated
 * 
 */
public class CreateTicketSignature extends BWActivitySignature 
{
	
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * By default all activities have input.
	 * 
	 * Return false if activity doesn't want a InputTab.
	 *
	 * @return
	 */
    @Override
    public boolean hasInput() {
    	// begin-custom-code
        // end-custom-code
        return true;
    }
   	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * By default all activities have output.
	 * 
	 * Return false if activity doesn't want a OutputTab.
	 * 
	 * @return
	 */
    @Override
    public boolean hasOutput() {
    	// begin-custom-code
        // end-custom-code
        return true;
    }
     
   /**
	* <!-- begin-custom-doc -->
	*
	* <!-- end-custom-doc -->
	* @generated
	*
	* Method to return the input element declaration of this activity.
	* @param config
	*			activity configuration
	* @return the input element declaration
	*/
	@Override
	public XSDElementDeclaration getInputType(final Configuration config) {
        XSDElementDeclaration inputType = null;
        inputType =  CreateTicketSchema.getInputType();
		
        // begin-custom-code
		CreateTicket createTicket = (CreateTicket) getDefaultEMFConfigObject(config);
		
		// get dynamic schema
		XSDTypeDefinition inputCustomFieldType = ModelHelper.INSTANCE.getXSDTypeByQName(createTicket, createTicket.getInputHeadersQName());

		// create namespace and use it to update new input schema's namespace.
		String namespace = createNamespace(new Object[] { inputType.getSchema(), config, "input" }); //$NON-NLS-1$
		updateNamespace(inputType, namespace);

		if (inputType != null && inputCustomFieldType != null) {
			isInputHeaderContentChanged(config, inputType, inputCustomFieldType);
			combineSimpleTypes(inputType, inputCustomFieldType, "CustomFields");
		}
        // end-custom-code
        return inputType;
    }

	private void isInputHeaderContentChanged(Configuration config, XSDElementDeclaration newInputTypeElement, XSDTypeDefinition inputCustomFieldType) {
		XSDSchema inputCustomFieldSchema = newInputTypeElement.getSchema();
		XSDSchema customFieldSchema = inputCustomFieldType.getSchema();

		if (inputCustomFieldSchema != null && customFieldSchema != null) {
			if (isContentChanged(inputCustomFieldSchema.resolveElementDeclaration("CustomFields"), customFieldSchema.resolveElementDeclaration("CustomFields"))) {
				createImport(config, inputCustomFieldSchema, customFieldSchema);
			}
		}
	}

   /**
	* <!-- begin-custom-doc -->
	* 
	* <!-- end-custom-doc -->
	* @generated
	*
	* Method to return the output element declaration of this activity.
	* @param config
	*			activity configuration
	* @return the output element declaration
	*/
    @Override
    public XSDElementDeclaration getOutputType(final Configuration config) {
        XSDElementDeclaration outPutType = null;
        outPutType =  CreateTicketSchema.getOutputType();
        // begin-custom-code
        // end-custom-code
        return outPutType;
    }

    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * Method to return the list of fault element declarations that this activity may throw.
	 * @param config
	 *            current configuration of the activity, in case the faults depend on how the activity is current configured
	 * @return list of elements or an empty list if none
	 */
    @Override
    public List<XSDElementDeclaration> getFaultTypes(final Configuration config) {
    	List<XSDElementDeclaration> faultType = null;
        faultType =  ZendeskExceptionsSchema.getZendeskPluginFaultTypes();
        // begin-custom-code
        // end-custom-code
		return faultType;
    }
}
