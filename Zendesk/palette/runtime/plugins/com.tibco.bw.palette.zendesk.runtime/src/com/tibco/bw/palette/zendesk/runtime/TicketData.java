package com.tibco.bw.palette.zendesk.runtime;

import java.util.List;
import java.util.Map;

import org.zendesk.client.v2.model.Collaborator;
import org.zendesk.client.v2.model.Priority;
import org.zendesk.client.v2.model.Type;

/**
 * @author tvuppala, pramod
 *
 */
/*
 * This class is used to store the ticket data parameters specified in the
 * create ticket activity
 */
public class TicketData {
	Long ticketId;
	String companyURL;
	String username ;
	String password ;
	Map<String, String> requesterDetails;
	String requesterName;
	String requesterEmail;
	String subject;
	String Description;
	String comment;
	List<Collaborator> collaborators;
	Type ticketType;
	Priority ticketPriority;
	List<String> ticketTags;
	Map<String, String> ticketCustomFields;
	
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Long getTicketId() {
		return ticketId;
	}
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}
	public String getRequesterName() {
		return requesterName;
	}
	public void setRequesterName(String requesterName) {
		this.requesterName = requesterName;
	}
	public String getRequesterEmail() {
		return requesterEmail;
	}
	public void setRequesterEmail(String requesterEmail) {
		this.requesterEmail = requesterEmail;
	}
	public String getCompanyURL() {
		return companyURL;
	}
	public void setCompanyURL(String companyURL) {
		this.companyURL = companyURL;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map<String, String> getRequesterDetails() {
		return requesterDetails;
	}
	public void setRequesterDetails(Map<String, String> requesterDetails) {
		this.requesterDetails = requesterDetails;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public List<Collaborator> getCollaborators() {
		return collaborators;
	}
	public void setCollaborators(List<Collaborator> collaborators) {
		this.collaborators = collaborators;
	}
	public Type getTicketType() {
		return ticketType;
	}
	public void setTicketType(Type ticketType) {
		this.ticketType = ticketType;
	}
	public Priority getTicketPriority() {
		return ticketPriority;
	}
	public void setTicketPriority(Priority low) {
		this.ticketPriority = low;
	}
	public List<String> getTicketTags() {
		return ticketTags;
	}
	public void setTicketTags(List<String> ticketTags) {
		this.ticketTags = ticketTags;
	}
	public Map<String, String> getTicketCustomFields() {
		return ticketCustomFields;
	}
	public void setTicketCustomFields(Map<String, String> customFieldValues) {
		this.ticketCustomFields = customFieldValues;
	}
	
}
