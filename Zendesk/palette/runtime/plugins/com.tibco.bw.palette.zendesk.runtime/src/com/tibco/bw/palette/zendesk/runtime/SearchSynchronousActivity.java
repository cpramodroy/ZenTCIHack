package com.tibco.bw.palette.zendesk.runtime;

import java.util.ArrayList;
import java.util.List;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.genxdm.io.FragmentBuilder;
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

public class SearchSynchronousActivity<N> extends SyncActivity<N> implements ZendeskContants

{

	@Property
	public Search	activityConfig;

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
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
		// begin-custom-code
		// add your own business code here
		// end-custom-code
		super.init();
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
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
		// begin-custom-code
		// add your own business code here
		// end-custom-code
		super.destroy();
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
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
		try {
			// begin-custom-code
			// add your own business code here
			SearchData searchData = getSearchInput(input, processContext);
			List<Long> searchResult = executeSearch(searchData);
			// end-custom-code
			// create output data according the output structure
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
	
	private List<Long> executeSearch(SearchData searchData) {
		ArrayList<Long> result = null;
		String companyUrl = activityConfig.getCompanyUrl();
		String userId = activityConfig.getUserId();
		String password = activityConfig.getPassword(); // TODO: Encode password
														// using HTTP connector
		// Create zendesk instance to communicate
		Zendesk zendeskInstance = new Zendesk.Builder(companyUrl).setUsername(userId).setPassword(password).build();

		int maxRows = searchData.getMaxRows();
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
	 * <!-- begin-custom-doc -->
	 *
	 *
	 * <!-- end-custom-doc -->
	 * 
	 * @generated
	 * 
	 *            This method to build the output after finishing the business.
	 * @param inputData
	 *            This is the activity input data.
	 * @param processingContext
	 *            XML processing context.
	 * @param data
	 *            Business object.
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
		// begin-custom-code
		// add your own business code here
		// end-custom-code
		return output;
	}

	/**
	 * <!-- begin-custom-doc -->
	 * 
	 * <!-- end-custom-doc -->
	 * 
	 * @generated
	 *
	 *            This method to get the root element of output.
	 * @param processingContext
	 *            XML processing context.
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
	 * 
	 * @generated Gets the String type parameter from the input by name.
	 * @param inputData
	 *            This is the activity input data.
	 * @param processingContext
	 *            XML processing context.
	 * @param parameterName
	 *            The parameter name which you want to get the value.
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
	 * 
	 * @generated Gets the String type attribute from the input by name.
	 * @param inputData
	 *            This is the activity input data.
	 * @param processingContext
	 *            XML processing context.
	 * @param attributeName
	 *            The attribute name which you want to get the value.
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
	 * 
	 * @generated Gets the Boolean type parameter from the input by name.
	 * @param inputData
	 *            This is the activity input data.
	 * @param processingContext
	 *            XML processing context.
	 * @param parameterName
	 *            The parameter name which you want to get the value.
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
}
