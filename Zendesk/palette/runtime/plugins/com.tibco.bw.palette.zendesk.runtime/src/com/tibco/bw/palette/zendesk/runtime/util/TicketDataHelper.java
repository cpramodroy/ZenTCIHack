package com.tibco.bw.palette.zendesk.runtime.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;
import org.zendesk.client.v2.model.Collaborator;
import org.zendesk.client.v2.model.Priority;
import org.zendesk.client.v2.model.Type;

import com.tibco.bw.palette.zendesk.runtime.TicketData;
import com.tibco.bw.runtime.ProcessContext;

/**
 * @author tvuppala,
 *  @author pcheruku
 * 
 */

/**
 * This class is used to extract and store the ticket data parameters for
 * create or update ticket activities.
 *
 */
public class TicketDataHelper {
	public static final String PARAM_REQUESTER = "Requester";
	public static final String PARAM_SUBJECT = "Subject";
	public static final String PARAM_DESCRIPTION = "Description";
	public static final String PARAM_TYPE = "Type";
	public static final String PARAM_PRIORITY = "Priority";
	public static final String PARAM_TAGS = "Tags";
	public static final String PARAM_CUSTOM_FIELDS = "CustomFields";
	public static final String PARAM_TICKET_ID = "TicketId";
	public static final String PARAM_COLLABORATORS = "Collaborators";
	public static final String PARAM_COMMENT = "Comment";

	public static <N> TicketData getTicketInput(N input, ProcessContext<N> processContext) {

		TicketData ticketData = new TicketData();

		String ticketIdString = TicketDataHelper.getTicketId(input, processContext.getXMLProcessingContext());
		if (ticketIdString != null) {
			Long ticketId = Long.parseLong(ticketIdString);
			ticketData.setTicketId(ticketId);
		}

		Map<String, String> requesterDetails = TicketDataHelper.getRequesterDetails(input, processContext.getXMLProcessingContext());

		for (Entry<String, String> entry : requesterDetails.entrySet()) {
			String key = entry.getKey();
			if (key.equalsIgnoreCase("name")) {
				ticketData.setRequesterName(entry.getValue());
			} else {
				ticketData.setRequesterEmail(entry.getValue());
			}
		}

		String subject = TicketDataHelper.getSubject(input, processContext.getXMLProcessingContext());
		if (subject != null)
			ticketData.setSubject(subject);

		String description = TicketDataHelper.getDescription(input, processContext.getXMLProcessingContext());
		if (description != null)
			ticketData.setDescription(description);

		String comment = TicketDataHelper.getComment(input, processContext.getXMLProcessingContext());
		if (comment != null)
			ticketData.setComment(comment);

		List<Collaborator> collaborators = TicketDataHelper.getCollaborators(input, processContext.getXMLProcessingContext());
		ticketData.setCollaborators(collaborators);

		String ticketType = TicketDataHelper.getTicketType(input, processContext.getXMLProcessingContext());
		if (ticketType != null) {
			if (ticketType.equalsIgnoreCase("task")) {
				ticketData.setTicketType(Type.TASK);
			} else if (ticketType.equalsIgnoreCase("problem")) {
				ticketData.setTicketType(Type.PROBLEM);
			} else if (ticketType.equalsIgnoreCase("incident")) {
				ticketData.setTicketType(Type.INCIDENT);
			} else if (ticketType.equalsIgnoreCase("question")) {
				ticketData.setTicketType(Type.QUESTION);
			}
		}

		String ticketPriority = TicketDataHelper.getTicketPriority(input, processContext.getXMLProcessingContext());
		if (ticketPriority != null) {
			if (ticketPriority.equalsIgnoreCase("low")) {
				ticketData.setTicketPriority(Priority.LOW);
			} else if (ticketPriority.equalsIgnoreCase("high")) {
				ticketData.setTicketPriority(Priority.HIGH);
			} else if (ticketPriority.equalsIgnoreCase("normal")) {
				ticketData.setTicketPriority(Priority.NORMAL);
			} else if (ticketPriority.equalsIgnoreCase("urgent")) {
				ticketData.setTicketPriority(Priority.URGENT);
			}
		}

		List<String> ticketTags = TicketDataHelper.getTags(input, processContext.getXMLProcessingContext());
		ticketData.setTicketTags(ticketTags);

		// Custom fields

		Map<String, String> customFieldValues = TicketDataHelper.getTicketCustomFields(input, processContext.getXMLProcessingContext());
		ticketData.setTicketCustomFields(customFieldValues);

		return ticketData;

	}

	public static <N> Map<String, String> getRequesterDetails(final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N requesterElement = model.getFirstChildElementByName(input, null, PARAM_REQUESTER);
		Iterable<N> requesterNodes = null;
		if (requesterElement != null)
			requesterNodes = model.getChildElements(requesterElement);
		Map<String, String> requesterMap = new HashMap<String, String>();
		;
		if (requesterNodes != null) {
			Iterator<N> requesterNodesIterator = requesterNodes.iterator();
			while (requesterNodesIterator.hasNext()) {
				N node = requesterNodesIterator.next();
				if (node != null) {
					String nodeName = model.getLocalName(node);
					String nodeValue = model.getStringValue(node);
					requesterMap.put(nodeName, nodeValue);
				}
			}
		}
		return requesterMap;
	}

	public static <N> String getTicketId(final N input, final ProcessingContext<N> pcx) {

		return getChildElementStringValue(PARAM_TICKET_ID, input, pcx);

	}

	public static <N> String getSubject(final N input, final ProcessingContext<N> pcx) {

		return getChildElementStringValue(PARAM_SUBJECT, input, pcx);

	}

	public static <N> String getTicketType(final N input, final ProcessingContext<N> pcx) {

		return getChildElementStringValue(PARAM_TYPE, input, pcx);

	}

	public static <N> String getTicketPriority(final N input, final ProcessingContext<N> pcx) {

		return getChildElementStringValue(PARAM_PRIORITY, input, pcx);

	}

	public static <N> String getDescription(final N input, final ProcessingContext<N> pcx) {

		return getChildElementStringValue(PARAM_DESCRIPTION, input, pcx);

	}

	public static <N> String getComment(final N input, final ProcessingContext<N> pcx) {

		return getChildElementStringValue(PARAM_COMMENT, input, pcx);

	}

	public static <N> List<String> getTags(final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N requesterElement = model.getFirstChildElementByName(input, null, PARAM_TAGS);
		Iterable<N> requesterNodes = null;
		if (requesterElement != null)
			requesterNodes = model.getChildElements(requesterElement);
		List<String> tagList = new ArrayList<String>();
		if (requesterNodes != null) {
			Iterator<N> requesterNodesIterator = requesterNodes.iterator();
			while (requesterNodesIterator.hasNext()) {
				N node = requesterNodesIterator.next();
				if (node != null) {
					String nodeValue = model.getStringValue(node);
					tagList.add(nodeValue);
				}
			}
		}
		return tagList;
	}

	public static <N> List<Collaborator> getCollaborators(final N input, final ProcessingContext<N> pcx) {

		Model<N> model = pcx.getModel();
		N requesterElement = model.getFirstChildElementByName(input, null, PARAM_COLLABORATORS);
		Iterable<N> requesterNodes = null;
		if (requesterElement != null)
			requesterNodes = model.getChildElements(requesterElement);
		ArrayList<Collaborator> collaborators = new ArrayList<Collaborator>();
		if (requesterNodes != null) {
			Iterator<N> requesterNodesIterator = requesterNodes.iterator();
			while (requesterNodesIterator.hasNext()) {
				N node = requesterNodesIterator.next();
				Iterable<N> ccNodes = null;
				if (node != null) {
					ccNodes = model.getChildElements(node);
					if (ccNodes != null) {
						Iterator<N> ccNodesIterator = ccNodes.iterator();
						String nameValue = null;
						String emailValue = null;
						Collaborator collaborator = new Collaborator();
						while (ccNodesIterator.hasNext()) {
							N ccNode = ccNodesIterator.next();
							if (ccNode != null) {
								String nodeName = model.getLocalName(ccNode);
								if (nodeName.equalsIgnoreCase("name")) {
									nameValue = model.getStringValue(ccNode);
									collaborator.setName(nameValue);
								} else {
									emailValue = model.getStringValue(ccNode);
									collaborator.setEmail(emailValue);
								}
							}
						}
						if (emailValue != null) {
							collaborators.add(collaborator);
						}
					}

				}
			}
		}
		return collaborators;
	}

	public static <N> Map<String, String> getTicketCustomFields(final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N customElement = model.getFirstChildElementByName(input, null, PARAM_CUSTOM_FIELDS);
		Iterable<N> customNodes = null;
		if (customElement != null)
			customNodes = model.getChildElements(customElement);
		Map<String, String> customFieldsMap = new HashMap<String, String>();
		if (customNodes != null) {
			Iterator<N> customNodesIterator = customNodes.iterator();
			while (customNodesIterator.hasNext()) {
				N node = customNodesIterator.next();
				if (node != null) {
					String nodeName = model.getLocalName(node);
					String nodeValue = model.getStringValue(node);
					customFieldsMap.put(nodeName, nodeValue);
				}
			}
		}
		return customFieldsMap;
	}

	public static <N> String getChildElementStringValue(final String elementName, final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N node = model.getFirstChildElementByName(input, null, elementName);

		String value = null;

		if (node != null) {
			value = model.getStringValue(node);
		}

		return value;
	}
}
