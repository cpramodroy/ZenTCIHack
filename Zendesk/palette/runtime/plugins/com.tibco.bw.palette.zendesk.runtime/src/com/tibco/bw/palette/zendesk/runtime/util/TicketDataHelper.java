package com.tibco.bw.palette.zendesk.runtime.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.genxdm.Model;
import org.genxdm.ProcessingContext;

public class TicketDataHelper {
	public static final String PARAM_REQUESTER = "Requester";
	public static final String PARAM_SUBJECT = "Subject";
	public static final String PARAM_DESCRIPTION = "Description";
	public static final String PARAM_TYPE = "Type";
	public static final String PARAM_PRIORITY = "Priority";
	public static final String PARAM_TAGS = "Tags";


	public static <N> Map<String, String> getRequesterDetails(final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N requesterElement = model.getFirstChildElementByName(input, null, PARAM_REQUESTER);
		Iterable<N> requesterNodes = null; 	
		if(requesterElement != null)
			requesterNodes = model.getChildElements(requesterElement);
		Map<String,String> requesterMap = null;
		if(requesterNodes != null){
			Iterator<N> requesterNodesIterator = requesterNodes.iterator();
			requesterMap = new HashMap<String, String>();
			while(requesterNodesIterator.hasNext()){
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
	
	public static <N> String getSubject(final N input, final ProcessingContext<N> pcx){
		
		return getChildElementStringValue(PARAM_SUBJECT, input, pcx);
		
	}
	
	public static <N> String getTicketType(final N input, final ProcessingContext<N> pcx){
		
		return getChildElementStringValue(PARAM_TYPE, input, pcx);
		
	}
	
public static <N> String getTicketPriority(final N input, final ProcessingContext<N> pcx){
		
		return getChildElementStringValue(PARAM_PRIORITY, input, pcx);
		
	}
	
	public static <N> String getDescription(final N input, final ProcessingContext<N> pcx){
		
		return getChildElementStringValue(PARAM_DESCRIPTION, input, pcx);
		
	}
	
	
	public static <N> List<String> getTags(final N input, final ProcessingContext<N> pcx) {
		Model<N> model = pcx.getModel();
		N requesterElement = model.getFirstChildElementByName(input, null, PARAM_TAGS);
		Iterable<N> requesterNodes = null; 	
		if(requesterElement != null)
			requesterNodes = model.getChildElements(requesterElement);
		List<String> tagList = new ArrayList<String>();
		if(requesterNodes != null){
			Iterator<N> requesterNodesIterator = requesterNodes.iterator();
			
			while(requesterNodesIterator.hasNext()){
				N node = requesterNodesIterator.next();
				if (node != null) {
					String nodeValue = model.getStringValue(node);
					tagList.add(nodeValue);
				}
			}
		}
		return tagList;
	}
	
public static <N> Map<String, String> getCollaborators(final N input, final ProcessingContext<N> pcx){
		
	
	Model<N> model = pcx.getModel();
	N requesterElement = model.getFirstChildElementByName(input, null, "Collaborators");
	Iterable<N> requesterNodes = null; 	
	if(requesterElement != null)
		requesterNodes = model.getChildElements(requesterElement);
	Map<String,String> ccMap = new HashMap<String, String>();
	if(requesterNodes != null){
		Iterator<N> requesterNodesIterator = requesterNodes.iterator();
		while(requesterNodesIterator.hasNext()){
			N node = requesterNodesIterator.next();
			Iterable<N> ccNodes = null;
			if (node != null) {
				ccNodes = model.getChildElements(node);
				if(ccNodes != null){
					Iterator<N> ccNodesIterator = ccNodes.iterator();
					String nameValue = null;
					String emailValue = null;
					while(ccNodesIterator.hasNext()){
						N ccNode = ccNodesIterator.next();
						if (ccNode != null) {
							String nodeName = model.getLocalName(ccNode);
							if(nodeName.equalsIgnoreCase("name")){
								nameValue = model.getStringValue(ccNode);
							}
							else if(nodeName.equalsIgnoreCase("email")){
								emailValue = model.getStringValue(ccNode);
							}
						}
					}
					ccMap.put(emailValue, nameValue);
				}	
				
			}
		}
	}
	return ccMap;
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
