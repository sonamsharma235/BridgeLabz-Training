package addressBook.service;

import addressBook.model.*;
import addressBook.repository.*;

public class AddressBookService {

    private AddressBookRepository repository = new AddressBookRepository();
    // UC-9: Dictionary for City and State
    // ===============================
    private Map<String, List<Contact>> cityMap = new HashMap<>();
    private Map<String, List<Contact>> stateMap = new HashMap<>();

    // useCase 6
    // Create Address Book
    public void createAddressBook(String name) {
        if (repository.exists(name)) {
            System.out.println("Address Book already exists!");
        } else {
            repository.saveAddressBook(new AddressBook(name));
            System.out.println("Address Book created successfully!");
        }
    }

    // Add Contact
   public void addContact(String bookName, Contact contact) {

    // Get AddressBook from Repository
    AddressBook book = repository.findByName(bookName);

    if (book == null) {
        System.out.println("Address Book not found!");
        return;
    }

    // ==========================================
    // UC-7: Duplicate Check using contains()
    // contains() internally calls overridden equals()
    // ==========================================
    if (book.getContacts().contains(contact)) {
        System.out.println("Duplicate Entry! Person already exists.");
        return;
    }

    // ==========================================
    // Validation Section
    // ==========================================
    if (String.valueOf(contact.getZip()).length() != 6) {
        System.out.println("Invalid Zip Code!");
        return;
    }

    if (String.valueOf(contact.getPhoneNo()).length() != 10) {
        System.out.println("Invalid Phone Number!");
        return;
    }

    if (!contact.getEmail().contains("@gmail.com")) {
        System.out.println("Invalid Email!");
        return;
    }

    // ==========================================
    // Add Contact to AddressBook
    // ==========================================
    book.getContacts().add(contact);

    // ==========================================
    // UC-9: Maintain City Dictionary
    // City → List<Contact>
    // ==========================================
    cityMap
        .computeIfAbsent(contact.getCity().toLowerCase(), k -> new ArrayList<>())
        .add(contact);

    // ==========================================
    // UC-9: Maintain State Dictionary
    // State → List<Contact>
    // ==========================================
    stateMap
        .computeIfAbsent(contact.getState().toLowerCase(), k -> new ArrayList<>())
        .add(contact);

    System.out.println("Contact Added Successfully!");
}

    // UC-9: View Persons By City
    // ===============================
    public void viewPersonsByCity(String city) {

       List<Contact> persons = cityMap.get(city.toLowerCase());

       if (persons == null || persons.isEmpty()) {
          System.out.println("No persons found in this city.");
          return;
       }

       for (Contact c : persons) {
          System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());
          System.out.println("City: " + c.getCity());
          System.out.println("--------------------------------");
       }
    }
    // ===============================
    // UC-9: View Persons By State
    // ===============================
    public void viewPersonsByState(String state) {

      List<Contact> persons = stateMap.get(state.toLowerCase());

      if (persons == null || persons.isEmpty()) {
         System.out.println("No persons found in this state.");
         return;
       }

       for (Contact c : persons) {
           System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());
           System.out.println("State: " + c.getState());
           System.out.println("--------------------------------");
        }
    }

    // Delete Contact
    public void deleteContact(String bookName, String firstName) {

        AddressBook book = repository.findByName(bookName);

        if (book == null) {
            System.out.println("Address Book not found!");
            return;
        }

        book.getContacts().removeIf(c -> c.getFirstName().equals(firstName));
        System.out.println("Contact Deleted!");
    }

    // UC-8: Search Person by City Across All Address Books
  
    public void searchByCity(String city) {

      boolean found = false;

      for (String bookName : repository.getAllAddressBookNames()) {

         AddressBook book = repository.findByName(bookName);

          for (Contact c : book.getContacts()) {

            if (c.getCity().equalsIgnoreCase(city)) {

                System.out.println("Address Book: " + bookName);
                System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());
                System.out.println("City: " + c.getCity());
                System.out.println("--------------------------------");

                found = true;
            }
        }
    }

    if (!found) {
        System.out.println("No person found in this city.");
    }
}
    public void searchByState(String state) {

    boolean found = false;

    for (String bookName : repository.getAllAddressBookNames()) {

        AddressBook book = repository.findByName(bookName);

        for (Contact c : book.getContacts()) {

            if (c.getState().equalsIgnoreCase(state)) {

                System.out.println("Address Book: " + bookName);
                System.out.println("Name: " + c.getFirstName() + " " + c.getLastName());
                System.out.println("State: " + c.getState());
                System.out.println("--------------------------------");

                found = true;
            }
        }
    }

    if (!found) {
        System.out.println("No person found in this state.");
    }
}

    // Display Contacts
    public void displayContacts(String bookName) {

        AddressBook book = repository.findByName(bookName);

        if (book == null) {
            System.out.println("Address Book not found!");
            return;
        }

        for (Contact c : book.getContacts()) {
            System.out.println("First Name: " + c.getFirstName());
            System.out.println("Last Name: " + c.getLastName());
            System.out.println("City: " + c.getCity());
            System.out.println("Phone: " + c.getPhoneNo());
            System.out.println("--------------------------------");
        }
    }

    // Display All Address Books
    public void displayAllBooks() {
        repository.getAllAddressBookNames()
                .forEach(System.out::println);
    }
}