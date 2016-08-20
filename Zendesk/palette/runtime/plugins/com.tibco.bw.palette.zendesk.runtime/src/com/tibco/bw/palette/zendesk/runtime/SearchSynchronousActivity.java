package com.tibco.bw.palette.zendesk.runtime;

/**
 * @author tvuppala
 * @author pcheruku
 *
 */

import java.util.ArrayList;
import java.util.List;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Group;
import org.zendesk.client.v2.model.Organization;
import org.zendesk.client.v2.model.Ticket;
import org.zendesk.client.v2.model.User;

import com.tibco.bw.palette.zendesk.model.zendesk.Search;
import com.tibco.bw.palette.zendesk.runtime.pojo.search.ActivityOutputType;
import com.tibco.bw.palette.zendesk.runtime.pojo.search.IdsType;
import com.tibco.bw.palette.zendesk.runtime.util.PaletteUtil;
import com.tibco.bw.runtime.ActivityFault;
import com.tibco.bw.runtime.ActivityLifecycleFault;
import com.tibco.bw.runtime.ProcessContext;
import com.tibco.bw.runtime.SyncActivity;
import com.tibco.bw.runtime.annotation.Property;
import com.tibco.bw.runtime.util.XMLUtils;
import com.tibco.neo.localized.LocalizedMessage;

/**
 * @author tvuppala, pramod
 *
 * @param <N>
 */
public class SearchSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants

{

	@Property
	public Search activityConfig;

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
		SearchData searchData = null;
		List<Long> searchResult = null;
		try {
			// Reading search parameters from input activity
			searchData = getSearchInput(input, processContext);
			searchResult = executeSearch(searchData);
		} catch (Exception exp) {
			throw new ActivityFault(activityContext, exp);
		}
		try {
			// create output data according to the output structure
			result = evalOutput(input, processContext.getXMLProcessingContext(), searchResult);
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
	 * This method is used to get search results based on input activity from
	 * zendesk
	 * 
	 * @param searchData
	 * @return
	 * @throws ActivityFault
	 */
	private List<Long> executeSearch(SearchData searchData) throws ActivityFault {
		ArrayList<Long> result = null;
		Zendesk zendeskInstance = null;
		String companyURL = activityConfig.getCompanyUrl();
		String username = activityConfig.getUserId();
		String password = activityConfig.getPassword(); // TODO: Encode password
														// using HTTP connector

		// Create zendesk instance to communicate with zendesk portal
		try {
			zendeskInstance = new Zendesk.Builder(companyURL).setUsername(username).setPassword(password).build();
		} catch (RuntimeException e) {
			LocalizedMessage msg = new LocalizedMessage(RuntimeMessageBundle.ERROR_OCCURED_INVALID_CREDENTIALS,
					new Object[] { activityContext.getActivityName() });
			throw new ActivityFault(activityContext, msg);
		}
		int maxRows = searchData.getMaxRows();
		// If input of maxRows is empty then limiting the results to default
		// value i.e., 10
		if (maxRows == 0) {
			maxRows = 10;
		}
		String query = searchData.getSearchQuery();
		String searchType = searchData.getSearchType();
		searchType = searchType.toLowerCase();
		switch (searchType) {
			case "ticket":
				result = getSearchResultsByTicket(query, maxRows, zendeskInstance);
				break;
			case "user":
				result = getSearchResultsByUser(query, maxRows, zendeskInstance);
				break;
			case "group":
				result = getSearchResultsByGroup(query, maxRows, zendeskInstance);
				break;
			case "organization":
				result = getSearchResultsByOrganization(query, maxRows, zendeskInstance);
				break;

		}
		zendeskInstance.close();
		return result;
	}

	/**
	 * Used to get the search results by organization
	 * 
	 * @param query
	 * @param maxRows
	 * @param zendeskInstance
	 * @return list of organization ids for the given query
	 */
	private ArrayList<Long> getSearchResultsByOrganization(String query, int maxRows, Zendesk zendeskInstance) {
		ArrayList<Long> result = new ArrayList<Long>();
		Iterable<Organization> orgs = zendeskInstance.getSearchResults(Organization.class, query);
		for (Organization org : orgs) {
			result.add(org.getId());
			if (result.size() == maxRows)
				break;
		}
		return result;
	}

	/**
	 * Used to get the search results by group
	 * 
	 * @param query
	 * @param maxRows
	 * @param zendeskInstance
	 * @return list of group ids for the given query
	 */
	private ArrayList<Long> getSearchResultsByGroup(String query, int maxRows, Zendesk zendeskInstance) {
		ArrayList<Long> result = new ArrayList<Long>();
		Iterable<Group> groups = zendeskInstance.getSearchResults(Group.class, query);
		for (Group group : groups) {
			result.add(group.getId());
			if (result.size() == maxRows)
				break;
		}
		return result;
	}

	/**
	 * Used to get the search results by user
	 * 
	 * @param query
	 * @param maxRows
	 * @param zendeskInstance
	 * @return list of user ids for the given query
	 */
	private ArrayList<Long> getSearchResultsByUser(String query, int maxRows, Zendesk zendeskInstance) {
		ArrayList<Long> result = new ArrayList<Long>();
		Iterable<User> users = zendeskInstance.getSearchResults(User.class, query);
		for (User user : users) {
			result.add(user.getId());
			if (result.size() == maxRows)
				break;
		}
		return result;
	}

	/**
	 * Used to get the search results by ticket
	 * 
	 * @param query
	 * @param maxRows
	 * @param zendeskInstance
	 * @return list of ticket ids for the given query
	 */
	private ArrayList<Long> getSearchResultsByTicket(String query, int maxRows, Zendesk zendeskInstance) {
		ArrayList<Long> result = new ArrayList<Long>();
		Iterable<Ticket> tickets = zendeskInstance.getSearchResults(Ticket.class, query);
		for (Ticket ticket : tickets) {
			result.add(ticket.getId());
			if (result.size() == maxRows)
				break;
		}
		return result;
	}

	/**
	 * Used to extract information from search activity
	 * 
	 * @param input
	 * @param processContext
	 * @return
	 */
	private SearchData getSearchInput(N input, ProcessContext<N> processContext) {
		SearchData searchData = new SearchData();
		// Search type
		String searchType = activityConfig.getSearchType();
		searchData.setSearchType(searchType);
		// Max rows
		int maxRows = activityConfig.getMaxRows();
		searchData.setMaxRows(maxRows);
		// Query String
		String searchQuery = getChildElementStringValue("Query", input, processContext.getXMLProcessingContext());
		if (searchQuery != null) {
			searchData.setSearchQuery(searchQuery);
		}
		return searchData;
	}

	private static <N> String getChildElementStringValue(final String elementName, final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N node = model.getFirstChildElementByName(input, null, elementName);

		String value = null;

		if (node != null) {
			value = model.getStringValue(node);
		}

		return value;
	}

	/**
	 * @generated
	 * 
	 *            This method to build the output after finishing the business.
	 * @param inputData
	 *            This is the activity input data.
	 * @param processingContext
	 *            XML processing context.
	 * @param data
	 *            List of ids based on search type.
	 * @return An XML Element which adheres to the output schema of the activity
	 *         or may return <code>null</code> if the activity does not require
	 *         an output.
	 */
	protected <A> N evalOutput(N inputData, ProcessingContext<N> processingContext, List<Long> data) throws Exception {

		ActivityOutputType activityOutput = new ActivityOutputType();
		IdsType idsType = new IdsType();
		idsType.getId().addAll(data);
		activityOutput.setId(idsType);
		N output = PaletteUtil.parseObjtoN(ActivityOutputType.class, activityOutput, processingContext, activityContext.getActivityOutputType()
				.getTargetNamespace(), "ActivityOutput");
		return output;
	}
}
