package com.tibco.bw.palette.zendesk.design.gettickets;

import java.util.List;

import org.eclipse.xsd.XSDElementDeclaration;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.XSDTypeDefinition;

import com.tibco.bw.design.api.BWActivitySignature;
import com.tibco.bw.design.util.ModelHelper;
import com.tibco.bw.model.activityconfig.Configuration;
import com.tibco.bw.palette.zendesk.design.ZendeskExceptionsSchema;
import com.tibco.bw.palette.zendesk.model.zendesk.GetTickets;
/**
 * <!-- begin-custom-doc -->
 * 
 * <!-- end-custom-doc -->
 * @generated
 * 
 */
public class GetTicketsSignature extends BWActivitySignature {
	
	
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
        inputType =  GetTicketsSchema.getInputType(); 
        // begin-custom-code
        // end-custom-code
        return inputType;
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
        XSDElementDeclaration outputType = null;
        outputType =  GetTicketsSchema.getOutputType();
		
        // begin-custom-code
		GetTickets getTickets = (GetTickets) getDefaultEMFConfigObject(config);
		
		// get dynamic schema
		XSDTypeDefinition outputCustomFieldType = ModelHelper.INSTANCE.getXSDTypeByQName(getTickets, getTickets.getOutputHeadersQName());

		// create namespace and use it to update new output schema's namespace.
		String namespace = createNamespace(new Object[] { outputType.getSchema(), config, "output" }); //$NON-NLS-1$
		updateNamespace(outputType, namespace);

		if (outputType != null && outputCustomFieldType != null) {
			isOutputHeaderContentChanged(config, outputType, outputCustomFieldType);
			combineSimpleTypes(outputType, outputCustomFieldType, "CustomFields");
		}
        // end-custom-code
        return outputType;
    }
    
	private void isOutputHeaderContentChanged(Configuration config, XSDElementDeclaration newOutputTypeElement, XSDTypeDefinition outputCustomFieldType) {
		XSDSchema outputCustomFieldSchema = newOutputTypeElement.getSchema();
		XSDSchema customFieldSchema = outputCustomFieldType.getSchema();

		if (outputCustomFieldSchema != null && customFieldSchema != null) {
			if (isContentChanged(outputCustomFieldSchema.resolveElementDeclaration("CustomFields"), customFieldSchema.resolveElementDeclaration("CustomFields"))) {
				createImport(config, outputCustomFieldSchema, customFieldSchema);
			}
		}
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
