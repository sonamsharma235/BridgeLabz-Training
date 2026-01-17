package addressBook;

import java.util.*;
public class ContactService {
	ContactRepository dao=new ContactRepository();
	Scanner sc=new Scanner(System.in);

	// UseCase-2: add Contacts
    public void addContact(String firstName, String lastName,String address,String city,int zip,long phoneNo,String email) {
    	
    	// zip validation
    	String strzip=zip+"";
    	if(strzip.length()!=6) {
    		System.out.println("please enter valid zip");
    		return;
    	}
    	
    	// phone  number validation
    	String phonestr=phoneNo+"";
    	if(phonestr.length()!=10) {
    		System.out.println("please enter valid phone number");
    		return;
    	}
    	
    	//email validation
    	if(!email.contains("@gmail.com")) {
    		System.out.println("please enter valid Email");
    		return;
    	}
    	
    	ContactModel contact=new ContactModel(firstName,lastName,address,city,zip,phoneNo,email);
    	dao.saveContact(contact);
    	
    }
    
    //display contacts 
    public void displayContacts() {
    	for(ContactModel c:dao.addressBook) {
    		System.out.println("first Name: "+c.getFirstName());
    		System.out.println("Last Name: "+c.getLastName());
    		System.out.println("Address: "+c.getAddress());
    		System.out.println("ZIP: "+c.getZip());
    		System.out.println("City Name: "+c.getCity());
    		System.out.println("Phone number: "+c.getPhoneNo());
    		System.out.println("Email: "+c.getEmail());
    		System.out.println("-----------------------------------------------");
    	}
	}
    
    
}
