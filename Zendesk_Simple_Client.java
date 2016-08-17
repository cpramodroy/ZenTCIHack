import java.util.Iterator;
import java.util.List;

import org.zendesk.client.v2.model.Role;


import org.zendesk.client.v2.Zendesk;
import org.zendesk.client.v2.model.Organization;
import org.zendesk.client.v2.model.SearchResultEntity;
import org.zendesk.client.v2.model.Ticket;
import org.zendesk.client.v2.model.User;


public class Zendesk_Simple_Client {

	public static void main(String[] args) {
	Zendesk zd = new Zendesk.Builder("https://tibcohackathon.zendesk.com")
        .setUsername("patilsayali@hotmail.com")
        .setPassword("passw0rd")
        .build();
	
	//Get Tickets
	
	Iterable<Ticket> tl =zd.getTickets();
	Iterator<Ticket> it = tl.iterator();
    while(it.hasNext()) {
        Ticket cur = it.next();
        //System.out.println(cur.getDescription());
    }
	
	
	//Create User
	try{
		
	
    User u = new User();
    u.setEmail("agent5@yahoo.com");
    u.setName("agent5");
    u.setRole(Role.ADMIN);
    u.setOrganizationId(9706105907L);
  
   	User u1=zd.createUser(u);
   	System.out.println("==============" +u1.getEmail());
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
    // Search type:user
    
	Iterable<SearchResultEntity> sr=zd.getSearchResults("type:user");
    	
	System.out.println(sr);
	Iterator <SearchResultEntity> sit=sr.iterator();
	
    while(sit.hasNext()) {
    	SearchResultEntity se=sit.next();
    	
        System.out.println(((User)se).getEmail());
        
    
    }
    
    //Search type:Organization
   
    Organization o = new Organization();
   
	
 // Search type:organization
    
 	Iterable<SearchResultEntity> org=zd.getSearchResults("type:organization");
     	
 	
 	Iterator <SearchResultEntity> ores=org.iterator();
 	
     while(ores.hasNext()) {
     	SearchResultEntity se=ores.next();
     	
         System.out.println(((Organization)se).getId() + "===" + ((Organization)se).getName());
         
     
     }
		

	}

}
