package com.tibco.bw.palette.zendesk.runtime.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Attachment;
import org.zendesk.client.v2.model.Collaborator;
import org.zendesk.client.v2.model.Comment;
import org.zendesk.client.v2.model.CustomFieldValue;
import org.zendesk.client.v2.model.Field;
import org.zendesk.client.v2.model.Field.Option;
import org.zendesk.client.v2.model.Priority;
import org.zendesk.client.v2.model.Status;
import org.zendesk.client.v2.model.Ticket;
import org.zendesk.client.v2.model.Type;
import org.zendesk.client.v2.model.User;


public class ZendeskContext {
	
	static Zendesk zendesk = new Zendesk.Builder("https://tibcohackathon.zendesk.com")
	        .setUsername("t.vuppalapati@gmail.com")
	        .setPassword("raj123")
	        .build();
	static ConcurrentHashMap<String, Long> customFieldCache = new ConcurrentHashMap<String, Long>();
	static HashMap<String, HashMap<String, String>> optionsMap = new HashMap<String, HashMap<String, String>>();
	
	public static void main(String[] args) throws Exception {
		if(zendesk != null){
			User user = zendesk.getCurrentUser();
			System.out.println(user.getName());
			System.out.println(user.getRole());
			System.out.println("Ticket Fields "+zendesk.getTicketFields());
			//Ticket ticket = zendesk.getTicket(10);
			//uploadFileToZendesk();
//			Attachment attach = new Attachment();
//			attach.setId(200L);
//			attach.setFileName("testAttach");
//			attach.setContentType("Image/png");
//			attach.setContentUrl("/Users/tvuppala/Desktop/Screenshot");
//			ClassLoader classloader = Thread.currentThread().getContextClassLoader();
//			InputStream is = classloader.getResourceAsStream("screenshot.png");
			//searchZendesk();
			//createZendeskUser();
			//updateZendeskTicket(ticket);
			createZendeskTicket();
			zendesk.close();
		}
	}

	private static void getAllTicketFields() {
		List<Field> fields = zendesk.getTicketFields();
		for(Field field: fields){
			Long fieldID = field.getId();
			System.out.println(fieldID);
			String fieldType = field.getType();
			HashMap<String, String> optionValues = new HashMap<String, String>();
			if(fieldType.equals("tagger")){
				
					for(Option option: field.getCustomFieldOptions()){
						optionValues.put(option.getName().toLowerCase(), option.getValue().toLowerCase());
					}
				
			}
			String fieldTitle = field.getTitle().replaceAll("\\s+", "");
			optionsMap.put(fieldTitle.toLowerCase(), optionValues);

			customFieldCache.put(fieldTitle.toLowerCase(), fieldID);
		}
		
	}
	/*private static void getAllTicketFieldValues() {
		List<Field> fields = zendesk.getTicketFields();
		for(Field field: fields){
			Long fieldID = field.getId();
			System.out.println(fieldID);
			String fieldType = field.getType();
			FieldInfo fieldInfo = new FieldInfo();
			fieldInfo.setType(fieldType);
			fieldInfo.setTitle(field.getTitle().replaceAll("//s+", ""));
			if(fieldType.equals("tagger")){
					for(Option option: field.getCustomFieldOptions()){
						fieldInfo.dropDownValues.add(option.getName());
					}
				
			}				
			customFieldCache.put(fieldID, fieldInfo);
		}
		
	}*/

	private static void uploadFileToZendesk() throws IOException {
		File file = new File(Thread.currentThread().getContextClassLoader().getResource("Screenshot.png").getFile());
		byte[] contents = new byte[(int) file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(contents);
		fis.close();

		Attachment.Upload upload = zendesk.createUpload(file.getName(), "application/binary", contents);
		String uploadToken = upload.getToken();
		System.out.println("uploadToken : "+uploadToken);
		Ticket tic = zendesk.getTicket(10);
		tic.setComment(new Comment("This is first upload", uploadToken));
        zendesk.updateTicket(tic);

	}

	private static void searchZendesk() {
		Iterable<Ticket> results = zendesk.getTicketsFromSearch("know");
		for(Ticket tic: results){
			System.out.println("Found search string in Ticket id: "+tic.getId());
		}
		results = zendesk.getTicketsByStatus(Status.OPEN);
		System.out.println("Tickets in open status ");
		for(Ticket tic: results){
			System.out.println("Ticket id: "+tic.getId());
		}
		
		Iterable<User> results1 = zendesk.getSearchResults(User.class,"abc");
		System.out.println("Search by user name ");
		for(User u: results1){
			System.out.println("user email: "+u.getEmail());
		}
	}

	private static void createZendeskUser() {
		User user = new User();
		user.setId((long) 2143107035);
		user.setName("abc");
		user.setEmail("abc@gmail.com");
		user.setVerified(true);
		zendesk.createUser(user);
	}

	private static void updateZendeskTicket(Ticket ticket) {
        ticket.setPriority(Priority.NORMAL);
        ticket.setType(Type.TASK);
        ticket.setTags(Arrays.asList("testTag", "tagRaj"));
        zendesk.updateTicket(ticket);
        
	}

	private static void createZendeskTicket() throws IOException {
		Ticket t = new Ticket( new Ticket.Requester("Raj", "t.vuppalapati@gmail.com"), "Ticket with custom fields lowercase", new Comment("This is description"));
		t.setSubject("Create a new ticket with some custom fields");
		t.setCollaborators(Arrays.asList(new Collaborator("raj", "cpramodroy@gmail.com")));
        t.setType(Type.PROBLEM);
		t.setPriority(Priority.LOW);
        t.setTags(Arrays.asList("testTag", "tagRaj", "tagPramod"));
		getAllTicketFields();
		HashMap<String, String> customValues = new HashMap<String, String>();
		customValues.put("CUSTOMTEXT1", "text123");
		customValues.put("CustomField1", "Drop down 2");
		Long custom_id = null;
		String custom_value = null;
        List<CustomFieldValue> customFields = new ArrayList<CustomFieldValue>();

		for(Entry<String, String> custom: customValues.entrySet()){
			String customKey = custom.getKey().toLowerCase();
			String customValue = custom.getValue().toLowerCase();
			if(optionsMap.containsKey(customKey)){
				if(optionsMap.get(customKey).size() > 0){					
					if(optionsMap.get(customKey).containsKey(customValue)){
						if(customFieldCache.containsKey(customKey)){
							custom_id = customFieldCache.get(customKey);
							custom_value = optionsMap.get(customKey).get(customValue);
							System.out.println("custom_value: "+custom_value);
							
						}
					}
				}
				else{
					custom_id = customFieldCache.get(customKey);
					custom_value = customValue;
				}
		        CustomFieldValue customField = new CustomFieldValue(custom_id, custom_value);
		        customFields.add(customField);
			}
		}
		
		//        customField.setId(100L);
//        customField.setValue("FirstCustomFiled");
        t.setCustomFields(customFields);
/*        File file = new File(Thread.currentThread().getContextClassLoader().getResource("asg-caching-core.log").getFile());
		byte[] contents = new byte[(int) file.length()];
		FileInputStream fis = new FileInputStream(file);
		fis.read(contents);
		fis.close();

		Attachment.Upload upload = zendesk.createUpload(file.getName(), "application/binary", contents);
		String uploadToken = upload.getToken();
		System.out.println("uploadToken : "+uploadToken);
		
		File file1 = new File(Thread.currentThread().getContextClassLoader().getResource("zendesk-java-client-master.zip").getFile());
		byte[] contents1 = new byte[(int) file.length()];
		FileInputStream fis1 = new FileInputStream(file1);
		fis1.read(contents1);
		fis1.close();

		Attachment.Upload upload1 = zendesk.createUpload(file1.getName(), "application/binary", contents1);
		String uploadToken1 = upload1.getToken();
		System.out.println("uploadToken : "+uploadToken1);
		
		String[] tokens = new String[2];
		tokens[0]= uploadToken;
		tokens[1]= uploadToken1;
		
		t.setComment(new Comment("uploading file while creating ticket ", tokens));*/
		Ticket ticket = zendesk.createTicket(t);
       // System.out.println(ticket.getId() + " -> " + ticket.getUrl());
	}
	
	static public class FieldInfo {
		String type;
		String title;
		List<String> dropDownValues = new ArrayList<String>();
		
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		
		
	}

}
