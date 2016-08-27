package com.tibco.bw.palette.zendesk.runtime;

/**
 * @author tvuppala
 * @author pcheruku
 *
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Group;
import org.zendesk.client.v2.model.Organization;
import org.zendesk.client.v2.model.Ticket;
import org.zendesk.client.v2.model.User;

import com.tibco.bw.palette.zendesk.model.zendesk.Delete;
import com.tibco.bw.palette.zendesk.runtime.pojo.delete.ActivityOutputType;
import com.tibco.bw.palette.zendesk.runtime.util.PaletteUtil;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.bw.runtime.util.XMLUtils;
import com.tibco.neo.localized.LocalizedMessage;


public class DeleteSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants 
{
	@Property
	public Delete activityConfig;
	private Zendesk zendeskInstance;
	
	public static final String PARAM_IDS = "Ids";
	
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
		boolean success;
		DeleteData deleteData = new DeleteData();
		
		// Get list of id(s) and type from activity input 
		try {
			long[] listOfIds = getListOfIds(input, processContext.getXMLProcessingContext());
			deleteData.setDeleteType(activityConfig.getDeleteType());
			deleteData.setListOfIds(listOfIds);
		} catch (Exception e) {
			throw new ActivityFault(activityContext, e);
		}
		
		// delete corresponding object(s)
		success = deleteZendeskObject(deleteData);
		
		try {
			// create output data according the output structure
			result = evalOutput(input, processContext.getXMLProcessingContext(), success);
		} catch (Exception e) {
			throw new ActivityFault(activityContext, new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_RETRIEVE_RESULT,
					new Object[] { activityContext.getActivityName() }));
		}

        if(getActivityLogger().isDebugEnabled()){
	        String serializedOutputNode = XMLUtils.serializeNode(result, processContext.getXMLProcessingContext());
			activityLogger.debug(RuntimeMessageBundle.DEBUG_PLUGIN_ACTIVITY_OUTPUT, new Object[] {activityContext.getActivityName(), serializedOutputNode, activityContext.getActivityName()});
		}
        return result;
	}
	
	private static <N> long[] getListOfIds(final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N IdsElement = model.getFirstChildElementByName(input, null, PARAM_IDS);
		Iterable<N> IdsNodes = null;
		if (IdsElement != null)
			IdsNodes = model.getChildElements(IdsElement);
		List<Long> idList = new ArrayList<Long>();
		if (IdsNodes != null) {
			Iterator<N> IdsNodesIterator = IdsNodes.iterator();
			while (IdsNodesIterator.hasNext()) {
				N id = IdsNodesIterator.next();
				if (id != null) {
					long idValue = Long.parseLong(model.getStringValue(id));
					idList.add(idValue);
				}
			}
		}
		long[] ids = new long[idList.size()];
		for (int i = 0; i < idList.size(); i++)
			ids[i] = idList.get(i);

		return ids;
	}

	private boolean deleteZendeskObject(DeleteData deleteData) throws ActivityFault {
		String type = deleteData.getDeleteType();
		long[] idList = deleteData.getListOfIds();
		boolean validate = validateIds(type, idList, true);
		if(!validate) {
			throw new ActivityFault(activityContext, new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_DELETE_IDS_DO_NOT_EXIST, new Object[] {activityContext.getActivityName(), idList }));
		}
		switch (type) {
			case "ticket":
				zendeskInstance.deleteTickets(idList[0], idList);
				break;
			case "user":
				for (long id : idList)
					zendeskInstance.deleteUser(id);
				break;
			case "group":
				for (long id : idList)
					zendeskInstance.deleteGroup(id);
				break;
			case "organization":
				for (long id : idList)
					zendeskInstance.deleteOrganization(id);
				break;
		}
		validate = validateIds(type, idList, false);
		if(!validate) {
			throw new ActivityFault(activityContext, new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_DELETE_IDS_UNSUCCESSFUL, new Object[] { activityContext.getActivityName(), idList }));
		}
		return validate;
	}

	private boolean validateIds(String type, long[] idList, boolean exists) {
		boolean validate = false;
		for(long id : idList) {
			switch(type) {
			case "ticket" :
				Ticket ticket = zendeskInstance.getTicket(id);
				if(ticket != null && exists)  // id exists before delete, so return true
					validate = true;
				else if(ticket != null && !exists) // id exists after delete, implies delete failed
					validate = false;
				else if(ticket == null && exists) // id does not exist before delete, implies invalid input
					validate = false;
				else if(ticket == null && !exists) // id does not exist after delete, implies delete succeeded
					validate = true;
				break;

			case "user" :
				User user = zendeskInstance.getUser(id);
				if(user.getEmail() != null && exists)  // id exists before delete, so return true
					validate = true;
				else if(user.getEmail() != null && !exists) // id exists after delete, implies delete failed
					validate = false;
				else if(user.getEmail() == null && exists) // id does not exist before delete, implies invalid input
					validate = false;
				else if(user.getEmail() == null && !exists) // id does not exist after delete, implies delete succeeded
					validate = true;
				break;

			case "group" :
				Group group = zendeskInstance.getGroup(id);
				if(group != null && exists)  // id exists before delete, so return true
					validate = true;
				else if(group != null && !exists) // id exists after delete, implies delete failed
					validate = false;
				else if(group == null && exists) // id does not exist before delete, implies invalid input
					validate = false;
				else if(group == null && !exists) // id does not exist after delete, implies delete succeeded
					validate = true;
				break;

			case "organization" :
				Organization org = zendeskInstance.getOrganization(id);
				if(org != null && exists)  // id exists before delete, so return true
					validate = true;
				else if(org != null && !exists) // id exists after delete, implies delete failed
					validate = false;
				else if(org == null && exists) // id does not exist before delete, implies invalid input
					validate = false;
				else if(org == null && !exists) // id does not exist after delete, implies delete succeeded
					validate = true;
				break;
			} // close switch
		} // close forEach
		return validate;
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
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, boolean success) throws Exception {
		ActivityOutputType activityOutput = new ActivityOutputType();
		activityOutput.setSuccess(success);
		N output = PaletteUtil.parseObjtoN(ActivityOutputType.class, activityOutput, processingContext, activityContext.getActivityOutputType().getTargetNamespace(), "ActivityOutput");
	    return output;
	}
}
