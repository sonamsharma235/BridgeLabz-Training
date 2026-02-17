package addressBook.repository;

import java.util.*;
import addressBook.model.AddressBook;

public class AddressBookRepository {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    public void saveAddressBook(AddressBook book) {
        addressBookMap.put(book.getName(), book);
    }

    public AddressBook findByName(String name) {
        return addressBookMap.get(name);
    }

    public boolean exists(String name) {
        return addressBookMap.containsKey(name);
    }

    public Set<String> getAllAddressBookNames() {
        return addressBookMap.keySet();
    }
}