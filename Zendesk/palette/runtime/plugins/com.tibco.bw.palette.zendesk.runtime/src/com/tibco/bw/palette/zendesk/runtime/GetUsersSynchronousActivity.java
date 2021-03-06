package com.tibco.bw.palette.zendesk.runtime;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.User;

import com.tibco.bw.palette.zendesk.model.zendesk.GetUsers;
import com.tibco.bw.palette.zendesk.runtime.pojo.getusers.ActivityOutputType;
import com.tibco.bw.palette.zendesk.runtime.pojo.getusers.UsersType;
import com.tibco.bw.palette.zendesk.runtime.util.PaletteUtil;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.bw.runtime.util.XMLUtils;
import com.tibco.neo.localized.LocalizedMessage;


public class GetUsersSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants {
	@Property
	public GetUsers activityConfig;
	private Zendesk zendeskInstance;
	public static final String PARAM_USER_IDS = "UserIds";
	
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
        ArrayList<User> listUsers = null;
        // Get list of UserId(s) from activity input and return corresponding User(s).
        listUsers = getZendeskUsers(getListofIds(input, processContext.getXMLProcessingContext()));
        try {
            result = evalOutput(input, processContext.getXMLProcessingContext(), listUsers);
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

	private List<Long> getListofIds(N input, ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N userIdsElement = model.getFirstChildElementByName(input, null, PARAM_USER_IDS);
		Iterable<N> usersIdNodes = null;
		if (userIdsElement != null)
			usersIdNodes = model.getChildElements(userIdsElement);
		List<Long> userIdList = new ArrayList<Long>();
		if (usersIdNodes != null) {
			Iterator<N> usersIdNodesIterator = usersIdNodes.iterator();
			while (usersIdNodesIterator.hasNext()) {
				N userId = usersIdNodesIterator.next();
				if (userId != null) {
					long userIdValue = Long.parseLong(model.getStringValue(userId));
					userIdList.add(userIdValue);
				}
			}
		}
		return userIdList;
	}
	
	private ArrayList<User> getZendeskUsers(List<Long> listUserIds) throws ActivityFault {
		ArrayList<User> listUsers = new ArrayList<User>();

		// validate input userIds and add users to list
		for (long id : listUserIds) {
			User user = zendeskInstance.getUser(id);
			if (user != null)
				listUsers.add(user);
			else {
				throw new ActivityFault(activityContext, new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_USER_ID_NOT_AVAILABLE, new Object[] {
						activityContext.getActivityName(), listUserIds }));
			}
		}
		return listUsers;
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
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, ArrayList<User> listUsers) throws Exception {
		ActivityOutputType activityOutput = new ActivityOutputType();
		// iterate over each zendesk user and add to output
		for (User zUser : listUsers) { 
			UsersType user = new UsersType();
			user.setName(zUser.getName());
			user.setEmail(zUser.getEmail());
			user.setRole(zUser.getRole().toString());
			if(zUser.getPhone() != null)
				user.setPhoneNumber(zUser.getPhone());
			if(zUser.getAlias() != null)
				user.setAlias(zUser.getAlias());
			if(zUser.getExternalId() != null)
				user.setExternalId(zUser.getExternalId());
			activityOutput.getUser().add(user);
		}
		N output = PaletteUtil.parseObjtoN(ActivityOutputType.class, activityOutput, processingContext, activityContext.getActivityOutputType().getTargetNamespace(), "ActivityOutput");
	    return output;
	}
}
