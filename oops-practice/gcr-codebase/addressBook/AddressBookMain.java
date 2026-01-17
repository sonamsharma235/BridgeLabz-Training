package addressBook;

import java.util.*;
public class AddressBookMain {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        
    	System.out.println("Welcome to Address Book Program");
    	
    	ContactService cs=new ContactService();
    	
    	cs.addContact("sonam","sharma","up","agra",283121,1234567890,"sonam@gmail.com");
    	cs.addContact("bhumi","sharma","up","agra",283121,1234567890,"sharma@gmail.com");
    	cs.displayContacts();
//    	cs.editContacts("sonam");
//    	cs.displayContacts();
    	System.out.println("enter name to delete");
    	cs.deleteContacts(sc.next());
    	cs.displayContacts();
    }
}
