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
		
		// Get list of id(s) and type from activity input and delete corresponding object(s).
		try {
			long[] listOfIds = getListOfIds(input, processContext.getXMLProcessingContext());
			DeleteData deleteData = new DeleteData();
			deleteData.setDeleteType(activityConfig.getDeleteType());
			deleteData.setListOfIds(listOfIds);
			success = deleteZendeskObject(deleteData);
		} catch (Exception e) {
			throw new ActivityFault(activityContext, e);
		}
		
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
		N requesterElement = model.getFirstChildElementByName(input, null, PARAM_IDS);
		Iterable<N> requesterNodes = null;
		if (requesterElement != null)
			requesterNodes = model.getChildElements(requesterElement);
		List<Long> idList = new ArrayList<Long>();
		if (requesterNodes != null) {
			Iterator<N> requesterNodesIterator = requesterNodes.iterator();
			while (requesterNodesIterator.hasNext()) {
				N node = requesterNodesIterator.next();
				if (node != null) {
					long nodeValue = Long.parseLong(model.getStringValue(node));
					idList.add(nodeValue);
				}
			}
		}
		long[] ids = new long[idList.size()];
		for (int i = 0; i < idList.size(); i++)
			ids[i] = idList.get(i);

		return ids;
	}

	private boolean deleteZendeskObject(DeleteData deleteData) throws ActivityFault {
		String companyUrl = activityConfig.getCompanyUrl();
		String userId = activityConfig.getUserId();
		String password = activityConfig.getPassword(); // TODO: Encode password using HTTP connector

		Zendesk zendeskInstance = null;
		try {
			zendeskInstance = new Zendesk.Builder(companyUrl).setUsername(userId).setPassword(password).build();
		} catch (RuntimeException e) {
			LocalizedMessage msg = new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_INVALID_CREDENTIALS,
					new Object[] { activityContext.getActivityName() });
			throw new ActivityFault(activityContext, msg);
		}

		String type = deleteData.getDeleteType();
		long[] idList = deleteData.getListOfIds();
		switch (type) {
			case "ticket":
				zendeskInstance.deleteTickets(idList[0], idList);
				return true;
			case "user":
				for (long id : idList)
					zendeskInstance.deleteUser(id);
				return true;
			case "group":
				for (long id : idList)
					zendeskInstance.deleteGroup(id);
				return true;
			case "organization":
				for (long id : idList)
					zendeskInstance.deleteOrganization(id);
				return true;
		}
		return false;
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
