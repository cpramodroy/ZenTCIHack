package com.tibco.bw.palette.zendesk.runtime;

import java.util.List;
import java.util.Map;

public class TicketData {
	String companyURL;
	String username ;
	String password ;
	Map<String, String> requesterDetails;
	String subject;
	String Description;
	Map<String, String> collaborators;
	String ticketType;
	String ticketPriority;
	List<String> ticketTags;
	
	
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
	public Map<String, String> getCollaborators() {
		return collaborators;
	}
	public void setCollaborators(Map<String, String> collaborators) {
		this.collaborators = collaborators;
	}
	public String getTicketType() {
		return ticketType;
	}
	public void setTicketType(String ticketType) {
		this.ticketType = ticketType;
	}
	public String getTicketPriority() {
		return ticketPriority;
	}
	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}
	public List<String> getTicketTags() {
		return ticketTags;
	}
	public void setTicketTags(List<String> ticketTags) {
		this.ticketTags = ticketTags;
	}
	
}
