package addressBook;

import java.util.*;
public class ContactRepository {
    ArrayList<ContactModel>addressBook=new ArrayList<>();
    
    // save contact in AddressBook
    public void saveContact(ContactModel contact) {
    	addressBook.add(contact);
    }
    
}
