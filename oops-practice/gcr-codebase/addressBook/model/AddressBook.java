package addressBook.model;

import java.util.*;

public class AddressBook {

    private String name;
    private List<Contact> contacts = new ArrayList<>();

    public AddressBook(String name) {
        this.name = name;
    }

    public String getName() { return name; }

    public List<Contact> getContacts() { return contacts; }
}