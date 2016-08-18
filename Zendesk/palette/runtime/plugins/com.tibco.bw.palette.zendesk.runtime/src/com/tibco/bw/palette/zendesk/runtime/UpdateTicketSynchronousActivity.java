package com.tibco.bw.palette.zendesk.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.genxdm.io.FragmentBuilder;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Attachment;
import org.zendesk.client.v2.model.Comment;
import org.zendesk.client.v2.model.CustomFieldValue;
import org.zendesk.client.v2.model.Ticket;

import com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket;
import com.tibco.bw.palette.zendesk.runtime.pojo.updateticket.ActivityOutput;
import com.tibco.bw.palette.zendesk.runtime.util.CustomFieldsUtil;
import com.tibco.bw.palette.zendesk.runtime.util.PaletteUtil;
import com.tibco.bw.palette.zendesk.runtime.util.TicketDataHelper;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.bw.runtime.util.XMLUtils;
import com.tibco.neo.localized.LocalizedMessage;


public class UpdateTicketSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants 


{

	@Property
	public UpdateTicket activityConfig;
	
	
	
	
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * This method is called to initialize the activity. It is called by the 
	 * BusinessWorks Engine once for a particular activity lifetime.
	 * 
	 * @throws ActivityLifecycleFault
	 *             Thrown if the activity initialization is unsuccessful or encounters an error.
	 */
	@Override
	public void init() throws ActivityLifecycleFault {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "init()", activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		super.init();
	}
	
	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 * 
	 * This method is called when an activity is destroyed. It is called by the BusinessWorks Engine and 
	 * the method must be implemented to release or cleanup any resources held by this activity.
	 */
    @Override
	public void destroy() {
		if(this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "destroy()", activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
		}
		// begin-custom-code
        // add your own business code here
        // end-custom-code
		super.destroy();
	}
	
    /**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
     * The implementation of this method defines the execution behavior of the synchronous activity.  
     * This method is called by the BusinessWorks Engine on a engine thread to perform 
     * the activity essential functions.
     * 
     * @param input 
     *           This is the activity input data. It is an XML Element which adheres to the input schema of the activity or <code>null</code> if the activity does not require an input. The 
     *           activity input data should be processed using the XML processing context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
     * @param processContext
	 *           Context that is associated with a BusinessWorks Process instance. This context is unique per BusinessWorks Process instance and it 
	 *           is not visible to other BusinessWorks Process instances.  Also this context is valid only within the BusinessWorks Engine thread on 
	 *           which this method is invoked. Therefore this context must not be saved or used by a different thread that is created or managed by the activity
	 *           implementation. 
     * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output. 
     *         This is the activity output data and it should be created using the XML processing context obtained from the method {@link ProcessContext#getXMLProcessingContext()}.
     * @throws ActivityFault
     *           Thrown if the activity execution is unsuccessful or encounters an error.
	 */
	@Override
	public N execute(N input, ProcessContext<N> processContext) throws ActivityFault {
        if(getActivityLogger().isDebugEnabled()){
        	activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED
								,new Object[] { "execute()"
								,activityContext.getActivityName()
								,activityContext.getProcessName()
								,activityContext.getDeploymentUnitName()
								,activityContext.getDeploymentUnitVersion() });
	        String serializedInputNode = XMLUtils.serializeNode(input, processContext.getXMLProcessingContext());
		    activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_INPUT, new Object[] {activityContext.getActivityName(), serializedInputNode});
		}
        N result = null;
        try {
        // begin-custom-code
    		String namespace = activityContext.getActivityInputType().getTargetNamespace();
        TicketData ticketData = TicketDataHelper.getTicketInput(input,processContext,namespace);
        boolean success = updateZendeskTicket(ticketData);
        Long ticketId = ticketData.getTicketId();
		// add your own business code here
		// end-custom-code
	        // create output data according the output structure
            result = evalOutput(input, processContext.getXMLProcessingContext(), ticketId, success);
        } catch (Exception e) {
            throw new ActivityFault(activityContext, new LocalizedMessage(
						RuntimeMessageBundle.ERROR_OCCURED_RETRIEVE_RESULT, new Object[] {activityContext.getActivityName()}));
        }

        if(getActivityLogger().isDebugEnabled()){
	        String serializedOutputNode = XMLUtils.serializeNode(result, processContext.getXMLProcessingContext());
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_OUTPUT, new Object[] {activityContext.getActivityName(), serializedOutputNode, activityContext.getActivityName()});
		}
        return result;
	}

	/**
	 * <!-- begin-custom-doc -->
	 *
	 *
	 * <!-- end-custom-doc -->
	 * @generated
	 *  
	 * This method to build the output after finishing the business.
	 * @param inputData
	 *			This is the activity input data. 
	 * @param processingContext
	 *			XML processing context.
	 * @param data
	 *			Business object.
	 * @return An XML Element which adheres to the output schema of the activity or may return <code>null</code> if the activity does not require an output.
	 */
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, Long ticketId, boolean success) throws Exception {
		
		ActivityOutput activityOutput = new ActivityOutput();
		activityOutput.setTicketId(ticketId+"");
		activityOutput.setSuccess(new Boolean(success));
		N output = PaletteUtil.parseObjtoN(ActivityOutput.class, activityOutput, processingContext, activityContext.getActivityOutputType().getTargetNamespace(), "ActivityOutput");
		// begin-custom-code
        // add your own business code here
        // end-custom-code
	    return output;
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
	 *
	 * This method to get the root element of output.
	 * @param processingContext
	 *				XML processing context.
	 * @return An XML Element.
	 */		
	 protected N getOutputRootElement(ProcessingContext<N> processingContext) {
        final FragmentBuilder<N> builder = processingContext.newFragmentBuilder();

        Model<N> model = processingContext.getModel();
        builder.startDocument(null, "xml");
        try {
			builder.startElement(activityContext.getActivityOutputType().getTargetNamespace(), "ActivityOutput", "ns0");
        try {
			} finally {
				builder.endElement();
			}
		} finally {
			builder.endDocument();
		}
        N output = builder.getNode();
        N resultList = model.getFirstChild(output);
        // begin-custom-code
        // add your own business code here
        // end-custom-code
        return resultList;
    }

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the String type parameter from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param parameterName
     *			The parameter name which you want to get the value.
     * @return parameter value.	
     */
 	public String getInputParameterStringValueByName(final N inputData, final ProcessingContext<N> processingContext, final String parameterName) {
         Model<N> model = processingContext.getMutableContext().getModel();
         N parameter = model.getFirstChildElementByName(inputData, null, parameterName);
         if (parameter == null) {
             return "";
         }
         return model.getStringValue(parameter);
     }

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the String type attribute from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param attributeName
     *			The attribute name which you want to get the value.
     * @return attribute value.	
     */
 	public String getInputAttributeStringValueByName(final N inputData, final ProcessingContext<N> processingContext, final String attributeName) {
         Model<N> model = processingContext.getMutableContext().getModel();
         N attribute = model.getAttribute(inputData, "", attributeName);
         if (attribute == null) {
             return "";
         }
         return model.getStringValue(attribute);
     }

	/**
 	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * @generated
     * Gets the Boolean type parameter from the input by name.
     * @param inputData
     *			This is the activity input data.
     * @param processingContext
     *			XML processing context.
     * @param parameterName
     *			The parameter name which you want to get the value.
     * @return parameter value.	
     */
 	public boolean getInputParameterBooleanValueByName(final N inputData, final ProcessingContext<N> processingContext, final String parameterName) {
 		Model<N> model = processingContext.getMutableContext().getModel();
 		N parameter = model.getFirstChildElementByName(inputData, null, parameterName);
 		if (parameter == null) {
 			return false;
 		}
 		String valueStr = model.getStringValue(parameter);
 		return Boolean.parseBoolean(valueStr);
 	}
 	
	private boolean updateZendeskTicket(TicketData ticketData) throws Exception {
		String companyURL = activityConfig.getCompanyUrl();
		String username = activityConfig.getUserId();
		String password = activityConfig.getPassword();
		
		Zendesk zendeskInstance = new Zendesk.Builder(companyURL)
			.setUsername(username)
	        .setPassword(password)
	        .build();		
		
		Long ticketId = ticketData.getTicketId();
		
		Ticket ticket = zendeskInstance.getTicket(ticketId);
		
		String requesterName = ticketData.getRequesterName();
		String requesterEmail = ticketData.getRequesterEmail();
		// Update requester
		Ticket.Requester requester = new Ticket.Requester(requesterName, requesterEmail);
		ticket.setRequester(requester);
		//update description i.e., comment in zendesk 
		String description = ticketData.getDescription();
		ticket.setComment(new Comment(description));
		//update subject
		ticket.setSubject(ticketData.getSubject());
		
		if(ticketData.getCollaborators().size() > 0){
			ticket.setCollaborators(ticketData.getCollaborators());
		}
		if(ticketData.getTicketType() != null){
			ticket.setType(ticketData.getTicketType());
		}
		if(ticketData.getTicketPriority() != null){
			ticket.setPriority(ticketData.getTicketPriority());
		}
		
		if(ticketData.getTicketTags().size() > 0){
			ticket.setTags(ticketData.getTicketTags());
		}
		
		// Custom fields		
		if(ticketData.getTicketCustomFields().size() > 0){
			List<CustomFieldValue> customFields = CustomFieldsUtil.verifyAndGetCustomFields(ticketData.getTicketCustomFields(), zendeskInstance, "ticket");
			if(customFields.size() > 0){
				ticket.setCustomFields(customFields);
			}
		}

		// Attachments
		if(activityConfig.isAdditionalAttachment()){
			File file = new File(activityConfig.getAttachmentName());
			byte[] contents = new byte[(int) file.length()];
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
				fis.read(contents);
			} catch (Exception e1) {
					throw new Exception(e1);
			} 	
			try {
					fis.close();
			} catch (IOException e) {
					e.printStackTrace();
			}
			Attachment.Upload upload = zendeskInstance.createUpload(file.getName(), "application/binary", contents);
			String[] uploadTokens = new String[1];
			uploadTokens[0] = upload.getToken();
			ticket.setComment(new Comment("Attachment uploaded.", uploadTokens));
		}
		try{
			zendeskInstance.updateTicket(ticket);
		}
		catch(Exception e){
			throw new RuntimeException("Failed to update ticket "+e);
		}		
		zendeskInstance.close();
		return true;
	}
}
