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

import com.tibco.bw.palette.zendesk.model.zendesk.CreateTicket;
import com.tibco.bw.palette.zendesk.runtime.pojo.createticket.ActivityOutput;
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
 * @author tvuppala,pramod
 *
 * @param <N>
 */
public class CreateTicketSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants {

	@Property
	public CreateTicket activityConfig;

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
		Long ticketId;
		try {
			//Reading ticket data from input activity and creating a zendesk
			// ticket

			ticketData = TicketDataHelper.getTicketInput(input, processContext);
			ticketId = createZendeskTicket(ticketData);
		} catch (Exception exp) {
			throw new ActivityFault(activityContext, exp);
		}
		try {
			// create output data according to the output structure
			result = evalOutput(input, processContext.getXMLProcessingContext(), ticketId);
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
	 * This method is to create the zendesk ticket.
	 * 
	 * @param ticketData
	 *            Data from activity input to create ticket
	 * @return created ticket id
	 * @throws ActivityFault
	 */
	private Long createZendeskTicket(TicketData ticketData) throws ActivityFault {
		String companyURL = activityConfig.getCompanyUrl();
		String username = activityConfig.getUserId();
		String password = activityConfig.getPassword();
		Zendesk zendeskInstance = null;

		// Create zendesk instance to communicate with zendesk portal
		try {
			zendeskInstance = new Zendesk.Builder(companyURL).setUsername(username).setPassword(password).build();
		} catch (RuntimeException e) {
			LocalizedMessage msg = new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_INVALID_CREDENTIALS,
					new Object[] { activityContext.getActivityName() });
			throw new ActivityFault(activityContext, msg);
		}
		String requesterName = ticketData.getRequesterName();
		String requesterEmail = ticketData.getRequesterEmail();
		String description = ticketData.getDescription();

		Ticket.Requester requester = new Ticket.Requester(requesterName, requesterEmail);
		Ticket ticket = new Ticket(requester, null, new Comment(description));
		ticket.setSubject(ticketData.getSubject());
		// Collaborators
		if (ticketData.getCollaborators().size() > 0) {
			ticket.setCollaborators(ticketData.getCollaborators());
		}
		if (ticketData.getTicketType() != null) {
			ticket.setType(ticketData.getTicketType());
		}
		if (ticketData.getTicketPriority() != null) {
			ticket.setPriority(ticketData.getTicketPriority());
		}

		if (ticketData.getTicketTags().size() > 0) {
			ticket.setTags(ticketData.getTicketTags());
		}

		/*
		 * Custom fields Get all the custom fields from zendesk Validate the
		 * input custom field against zendesk custom fields Use the valid custom
		 * fields in current ticket
		 */
		if (activityConfig.isHasCustomFields() && ticketData.getTicketCustomFields().size() > 0) {
			List<CustomFieldValue> customFields = CustomFieldsUtil.verifyAndGetCustomFields(ticketData.getTicketCustomFields(), zendeskInstance,
					"ticket");
			if (customFields.size() > 0) {
				ticket.setCustomFields(customFields);
			}
		}

		// Attachments
		if (activityConfig.isHasAttachments()) {
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
			Upload upload = zendeskInstance.createUpload(file.getName(), contents);
			String[] uploadTokens = new String[1];
			uploadTokens[0] = upload.getToken();
			ticket.setComment(new Comment("Attachment uploaded.", uploadTokens));
		}

		Ticket createdTicket = zendeskInstance.createTicket(ticket);
		// closing zendesk connection
		zendeskInstance.close();
		return createdTicket.getId();
	}

	/**
	 * @generated
	 * 
	 *            This method to build the output after finishing the business.
	 * @param inputData
	 *            This is the activity input data.
	 * @param processingContext
	 *            XML processing context.
	 * @param ticketId
	 *            Business object.
	 * @return An XML Element which adheres to the output schema of the activity
	 *         or may return <code>null</code> if the activity does not require
	 *         an output.
	 */
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, Long ticketId) throws Exception {

		ActivityOutput activityOutput = new ActivityOutput();
		activityOutput.setTicketId(ticketId);
		N output = PaletteUtil.parseObjtoN(ActivityOutput.class, activityOutput, processingContext, activityContext.getActivityOutputType()
				.getTargetNamespace(), "ActivityOutput");
		return output;
	}
}
