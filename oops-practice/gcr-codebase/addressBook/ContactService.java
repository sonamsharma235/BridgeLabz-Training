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
    
	// UseCase-3: edit contact
	//Edit contacts
    public void editContacts(String name) {
    	boolean flag=true;
    	for(ContactModel c:dao.addressBook) {
    		if(c.getFirstName().equals(name)) {
    				System.out.println("1: edit first name");
    				System.out.println("2: edit Last name");
    				System.out.println("3: edit Address");
    				System.out.println("4: edit City");
    				System.out.println("5: edit ZIP");
    				System.out.println("6: edit Phone number");
    				System.out.println("7: edit email");
    				System.out.println("choose what to edit ");
    				int choose =sc.nextInt();
    				flag=false;
    				
    				switch(choose) {
    				   case 1:System.out.println("enter first Name");
    				          String first=sc.next();
    					      c.setFirstName(first);
    					      break;
    					      
    				   case 2:System.out.println("enter last Name");
					          c.setLastName(sc.next());
					          break;
					          
    				   case 3:System.out.println("enter new Address");
					          c.setAddress(sc.next());
					          break;
					          
    				   case 4:System.out.println("enter new city");
					          c.setCity(sc.nextLine());
					          break;
					          
    				   case 5:System.out.println("enter new zip");
					          c.setZip(sc.nextInt());
					          break;
					         
    				   case 6:System.out.println("enter new phone number");
					          c.setPhoneNo(sc.nextLong());
					          break;
					          
    				   case 7:System.out.println("enter new Email");
					          c.setEmail(sc.nextLine());
					          break;        
    				} 
    				
    			}
    			
    		}
    	if(flag==true) {
    		System.out.println("enter valid name");
    	}
    }

	// UseCase-4: delete contact
    //delete contact
    public void deleteContacts(String name) {
    	for(ContactModel c:dao.addressBook) {
    		if(c.getFirstName().equals(name)) {
    			dao.addressBook.remove(c);
    			System.out.println("contact deleted");
    		}
    	}	
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
