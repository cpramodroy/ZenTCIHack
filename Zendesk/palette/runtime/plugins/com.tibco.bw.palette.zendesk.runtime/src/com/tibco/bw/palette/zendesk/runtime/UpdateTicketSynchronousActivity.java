package com.tibco.bw.palette.zendesk.runtime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.genxdm.ProcessingContext;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Attachment.Upload;
import org.zendesk.client.v2.model.Comment;
import org.zendesk.client.v2.model.CustomFieldValue;
import org.zendesk.client.v2.model.Ticket;
import org.zendesk.client.v2.model.User;

import com.tibco.bw.palette.zendesk.model.zendesk.UpdateTicket;
import com.tibco.bw.palette.zendesk.runtime.pojo.updateticket.ActivityOutputType;
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

/**
 * @author tvuppala,
 * @author pcheruku
 *
 */
public class UpdateTicketSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants

{

	@Property
	public UpdateTicket activityConfig;

	/**
	 * @generated
	 * 
	 *            This method is called to initialize the activity. It is called
	 *            by the BusinessWorks Engine once for a particular activity
	 *            lifetime.
	 * 
	 * @throws ActivityLifecycleFault
	 *             Thrown if the activity initialization is unsuccessful or
	 *             encounters an error.
	 */
	@Override
	public void init() throws ActivityLifecycleFault {
		if (this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(
					RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED,
					new Object[] { "init()", activityContext.getActivityName(), activityContext.getProcessName(),
							activityContext.getDeploymentUnitName(), activityContext.getDeploymentUnitVersion() });
		}
		super.init();
	}

	/**
	 * @generated
	 * 
	 *            This method is called when an activity is destroyed. It is
	 *            called by the BusinessWorks Engine and the method must be
	 *            implemented to release or cleanup any resources held by this
	 *            activity.
	 */
	@Override
	public void destroy() {
		if (this.getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(
					RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED,
					new Object[] { "destroy()", activityContext.getActivityName(), activityContext.getProcessName(),
							activityContext.getDeploymentUnitName(), activityContext.getDeploymentUnitVersion() });
		}
		super.destroy();
	}

	/**
	 * @generated
	 *
	 *            The implementation of this method defines the execution
	 *            behavior of the synchronous activity. This method is called by
	 *            the BusinessWorks Engine on a engine thread to perform the
	 *            activity essential functions.
	 * 
	 * @param input
	 *            This is the activity input data. It is an XML Element which
	 *            adheres to the input schema of the activity or
	 *            <code>null</code> if the activity does not require an input.
	 *            The activity input data should be processed using the XML
	 *            processing context obtained from the method
	 *            {@link ProcessContext#getXMLProcessingContext()}.
	 * @param processContext
	 *            Context that is associated with a BusinessWorks Process
	 *            instance. This context is unique per BusinessWorks Process
	 *            instance and it is not visible to other BusinessWorks Process
	 *            instances. Also this context is valid only within the
	 *            BusinessWorks Engine thread on which this method is invoked.
	 *            Therefore this context must not be saved or used by a
	 *            different thread that is created or managed by the activity
	 *            implementation.
	 * @return An XML Element which adheres to the output schema of the activity
	 *         or may return <code>null</code> if the activity does not require
	 *         an output. This is the activity output data and it should be
	 *         created using the XML processing context obtained from the method
	 *         {@link ProcessContext#getXMLProcessingContext()}.
	 * @throws ActivityFault
	 *             Thrown if the activity execution is unsuccessful or
	 *             encounters an error.
	 */
	@Override
	public N execute(N input, ProcessContext<N> processContext) throws ActivityFault {
		if (getActivityLogger().isDebugEnabled()) {
			activityLogger.debug(
					RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_METHOD_CALLED,
					new Object[] { "execute()", activityContext.getActivityName(), activityContext.getProcessName(),
							activityContext.getDeploymentUnitName(), activityContext.getDeploymentUnitVersion() });
			String serializedInputNode = XMLUtils.serializeNode(input, processContext.getXMLProcessingContext());
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_INPUT, new Object[] { activityContext.getActivityName(),
					serializedInputNode });
		}
		N result = null;
		TicketData ticketData = null;
		boolean success = false;
		long ticketId = 0;
		try {
			// Reading ticket data from input activity
			ticketData = TicketDataHelper.getTicketInput(input, processContext);
			ticketId = ticketData.getTicketId();
		} catch (Exception exp) {
			throw new ActivityFault(activityContext, exp);
		}
		
		// updating zendesk ticket
		success = updateZendeskTicket(ticketData);

		try {
			// create output data according to the output structure
			result = evalOutput(input, processContext.getXMLProcessingContext(), ticketId, success);
		} catch (Exception e) {
			throw new ActivityFault(activityContext, new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_RETRIEVE_RESULT,
					new Object[] { activityContext.getActivityName() }));
		}

		if (getActivityLogger().isDebugEnabled()) {
			String serializedOutputNode = XMLUtils.serializeNode(result, processContext.getXMLProcessingContext());
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_OUTPUT, new Object[] { activityContext.getActivityName(),
					serializedOutputNode, activityContext.getActivityName() });
		}
		return result;
	}

	/**
	 * 
	 * @generated
	 * 
	 *            This method to build the output after finishing the business.
	 * @param inputData
	 *            This is the activity input data.
	 * @param processingContext
	 *            XML processing context.
	 * @param ticketId
	 *            updated ticket id.
	 * @param success
	 *            true or false based on update ticket.
	 * @return An XML Element which adheres to the output schema of the activity
	 *         or may return <code>null</code> if the activity does not require
	 *         an output.
	 */
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, long ticketId, boolean success) throws Exception {

		ActivityOutputType activityOutputType = new ActivityOutputType();
		activityOutputType.setTicketId(ticketId);
		activityOutputType.setSuccess(new Boolean(success));
		N output = PaletteUtil.parseObjtoN(ActivityOutputType.class, activityOutputType, processingContext, activityContext.getActivityOutputType()
				.getTargetNamespace(), "ActivityOutput");
		return output;
	}

	/**
	 * This method is to update the existing ticket based on activity input.
	 * 
	 * @param ticketData
	 * @return
	 * @throws ActivityFault
	 */
	private boolean updateZendeskTicket(TicketData ticketData) throws ActivityFault {
		String companyURL = activityConfig.getCompanyUrl();
		String username = activityConfig.getUserId();
		String password = activityConfig.getPassword();
		// Create zendesk instance to communicate with zendesk portal
		Zendesk zendeskInstance = new Zendesk.Builder(companyURL).setUsername(username).setPassword(password).build();
		User user = zendeskInstance.getAuthenticatedUser();
		if (user == null) {
			LocalizedMessage msg = new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_INVALID_CREDENTIALS,
					new Object[] { activityContext.getActivityName() });
			throw new ActivityFault(activityContext, msg);
		}
		Long ticketId = ticketData.getTicketId();

		Ticket ticket = zendeskInstance.getTicket(ticketId);
		if (ticket == null) {
			LocalizedMessage msg = new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_TICKET_ID_NOT_AVAILABLE,
					new Object[] { activityContext.getActivityName() });
			throw new ActivityFault(activityContext, msg);
		}
		String requesterName = ticketData.getRequesterName();
		String requesterEmail = ticketData.getRequesterEmail();
		// Update requester
		Ticket.Requester requester = new Ticket.Requester(requesterName, requesterEmail);
		ticket.setRequester(requester);
		// update description i.e., comment in zendesk
		String description = ticketData.getDescription();
		ticket.setComment(new Comment(description));
		// update subject
		ticket.setSubject(ticketData.getSubject());
		// update collaborators
		if (ticketData.getCollaborators().size() > 0) {
			ticket.setCollaborators(ticketData.getCollaborators());
		}
		if (ticketData.getTicketType() != null) {
			ticket.setType(ticketData.getTicketType());
		}
		if (ticketData.getTicketPriority() != null) {
			ticket.setPriority(ticketData.getTicketPriority());
		}
		// update tags
		if (ticketData.getTicketTags().size() > 0) {
			ticket.setTags(ticketData.getTicketTags());
		}
		/*
		 * Custom fields Get all the custom fields from zendesk Validate the
		 * input custom field against zendesk custom fields Use the valid custom
		 * fields in current ticket
		 */
		if (ticketData.getTicketCustomFields().size() > 0) {
			List<CustomFieldValue> customFields = CustomFieldsUtil.verifyAndGetCustomFields(ticketData.getTicketCustomFields(), zendeskInstance,
					"ticket");
			if (customFields.size() > 0) {
				ticket.setCustomFields(customFields);
			}
		}

		// Attachments
		if (activityConfig.isAdditionalAttachment()) {
			File file = new File(activityConfig.getAttachmentName());
			byte[] contents = new byte[(int) file.length()];
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);
				fis.read(contents);
			} catch (FileNotFoundException e) {
				throw new ActivityFault(activityContext, e);
			} catch (IOException e) {
				throw new ActivityFault(activityContext, e);
			}
			try {
				fis.close();
			} catch (IOException e) {
				throw new ActivityFault(activityContext, e);
			}
			/*
			 * First we need to upload the content and use that token as a
			 * ticket comment to upload attachment.
			 */
			Upload upload = null;
			try {
				upload = zendeskInstance.createUpload(file.getName(), contents);
			} catch (Exception e) {
				throw new ActivityFault(activityContext, e);
			}
			String[] uploadTokens = new String[1];
			uploadTokens[0] = upload.getToken();
			ticket.setComment(new Comment("Attachment uploaded.", uploadTokens));
		}
		try {
			zendeskInstance.updateTicket(ticket);
		} catch (Exception e) {
			throw new ActivityFault(activityContext, e);
		}
		zendeskInstance.close();
		return true;
	}
}
