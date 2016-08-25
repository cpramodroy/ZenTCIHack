package com.tibco.bw.palette.zendesk.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.CustomFieldValue;
import org.zendesk.client.v2.model.Field;
import org.zendesk.client.v2.model.Ticket;
import org.zendesk.client.v2.model.User;

import com.tibco.bw.palette.zendesk.model.zendesk.GetTickets;
import com.tibco.bw.palette.zendesk.runtime.pojo.gettickets.ActivityOutputType;
import com.tibco.bw.palette.zendesk.runtime.pojo.gettickets.CCType;
import com.tibco.bw.palette.zendesk.runtime.pojo.gettickets.CollaboratorsType;
import com.tibco.bw.palette.zendesk.runtime.pojo.gettickets.CustomFieldType;
import com.tibco.bw.palette.zendesk.runtime.pojo.gettickets.FieldType;
import com.tibco.bw.palette.zendesk.runtime.pojo.gettickets.RequesterType;
import com.tibco.bw.palette.zendesk.runtime.pojo.gettickets.TagsType;
import com.tibco.bw.palette.zendesk.runtime.pojo.gettickets.TicketType;
import com.tibco.bw.palette.zendesk.runtime.util.PaletteUtil;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.bw.runtime.util.XMLUtils;
import com.tibco.neo.localized.LocalizedMessage;


public class GetTicketsSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants {
	@Property
	public GetTickets activityConfig;
	private Zendesk zendeskInstance;
	private ConcurrentHashMap<Long, String> customFieldsTitleMap = new ConcurrentHashMap<Long, String>();
	
	private static final String PARAM_TICKET_IDS = "TicketIds";
	
	/**
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
		zendeskInstance = new Zendesk.Builder(activityConfig.getCompanyUrl())
											 .setUsername(activityConfig.getUserId())
											 .setPassword(activityConfig.getPassword())
											 .build();
		User _user = zendeskInstance.getAuthenticatedUser();
		if (_user == null) {
			LocalizedMessage msg = new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_INVALID_CREDENTIALS,
					new Object[] { activityContext.getActivityName() });
			throw new ActivityLifecycleFault(msg);
		}
		super.init();
	}
	
	/**
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
		customFieldsTitleMap.clear();
		zendeskInstance.close();
		super.destroy();
	}
	
    /**
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
        List<Ticket> listTickets = null;
        // Get list of TicketId(s) from activity input and return corresponding Ticket(s).
        listTickets = getZendeskTickets(getListofIds(input, processContext.getXMLProcessingContext()));
        try {
	        // create output data according the output structure
            result = evalOutput(input, processContext.getXMLProcessingContext(), listTickets);
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

	private long[] getListofIds(N input, ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N ticketIdsElement = model.getFirstChildElementByName(input, null, PARAM_TICKET_IDS);
		Iterable<N> ticketsIdNodes = null;
		if (ticketIdsElement != null)
			ticketsIdNodes = model.getChildElements(ticketIdsElement);
		List<Long> ticketIdList = new ArrayList<Long>();
		if (ticketsIdNodes != null) {
			Iterator<N> ticketsIdNodesNodesIterator = ticketsIdNodes.iterator();
			while (ticketsIdNodesNodesIterator.hasNext()) {
				N ticketId = ticketsIdNodesNodesIterator.next();
				if (ticketId != null) {
					long ticketIdValue = Long.parseLong(model.getStringValue(ticketId));
					ticketIdList.add(ticketIdValue);
				}
			}
		}
		long[] ticketIds = new long[ticketIdList.size()];
		for (int i = 0; i < ticketIdList.size(); i++)
			ticketIds[i] = ticketIdList.get(i);

		return ticketIds;
	}
	
	private List<Ticket> getZendeskTickets(long[] listTicketIds) throws ActivityFault {
		List<Ticket> listTickets = new ArrayList<Ticket>();
		try {
			// get ticket values from zendesk
			listTickets = zendeskInstance.getTickets(listTicketIds[0], listTicketIds);
		} catch (Exception e) {
			throw new ActivityFault(activityContext, new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_TICKET_ID_NOT_AVAILABLE, new Object[] {
					activityContext.getActivityName(), listTicketIds }));
		}

		return listTickets;
	}
	
	/**
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
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, List<Ticket> listTickets) throws Exception {
		ActivityOutputType activityOutput = new ActivityOutputType();
		for (Ticket zticket : listTickets) {
			TicketType ticket = new TicketType();
			
			// set Requester
			RequesterType requester = new RequesterType();
			if (zticket.getRequesterId() != null) {
				User _requester = zendeskInstance.getUser(zticket.getRequesterId());
				requester.setName(_requester.getName());
				requester.setEmail(_requester.getEmail());
			}
			ticket.setRequester(requester);
			// end Requester
			
			ticket.setSubject(zticket.getSubject());
			ticket.setDescription(zticket.getDescription());

			// set collaborators
			CollaboratorsType collaborators = new CollaboratorsType();
			CCType cc = new CCType();
			List<Long> ccIds = zticket.getCollaboratorIds();
			if (!ccIds.isEmpty()) {
				for (long id : ccIds) {
					User user = zendeskInstance.getUser(id);
					cc.setName(user.getName());
					cc.setEmail(user.getEmail());
					collaborators.getCC().add(cc);
				}
			}
			ticket.setCollaborators(collaborators);
			// end collaborators
			
			if(zticket.getType() != null)
				ticket.setType(zticket.getType().toString());
			
			if(zticket.getPriority() != null)
				ticket.setPriority(zticket.getPriority().toString());
			
			// set tags
			List<String> listTags = zticket.getTags();
			TagsType tags = new TagsType();
			if(!listTags.isEmpty())
				tags.getTagName().addAll(listTags);
			ticket.setTags(tags);
			// end tags
			
			// set custom fields
			CustomFieldType outputCustomFields = new CustomFieldType();
			List<Field> ticketFields = zendeskInstance.getTicketFields();
			
			createCustomFieldsTitleMap(ticketFields);
			
			List<CustomFieldValue> listCustomFields = zticket.getCustomFields();
			for (CustomFieldValue customField : listCustomFields) {
				long id = customField.getId();
				String customFieldTitle = customFieldsTitleMap.get(id);
				String customFieldValue = customField.getValue();

				FieldType field = new FieldType();
				field.setTitle(customFieldTitle);
				if (customFieldValue != null)
					field.setValue(customFieldValue);
				outputCustomFields.getField().add(field);
			}
			ticket.setCustomFields(outputCustomFields);
			// end custom fields

			activityOutput.getTicket().add(ticket);
		}
		N output = PaletteUtil.parseObjtoN(ActivityOutputType.class, activityOutput, processingContext, activityContext.getActivityOutputType().getTargetNamespace(), "ActivityOutput");
	    return output;
	}
	
	/**
	 * Creates a map containing custom field id's and it's title
	 * @param ticketFields
	 */
	private void createCustomFieldsTitleMap(List<Field> ticketFields) {
		for (Field field : ticketFields) {
			Long fieldID = field.getId();
			String fieldTitle = field.getTitle().replaceAll("\\s+", "");
			customFieldsTitleMap .put(fieldID, fieldTitle);
		}
	}
}
