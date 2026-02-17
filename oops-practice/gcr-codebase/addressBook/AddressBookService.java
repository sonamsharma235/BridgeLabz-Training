package addressBook.service;

import addressBook.model.*;
import addressBook.repository.*;

public class AddressBookService {

    private AddressBookRepository repository = new AddressBookRepository();
    
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

        AddressBook book = repository.findByName(bookName);

        if (book == null) {
            System.out.println("Address Book not found!");
            return;
        }

        // Validation
        if (String.valueOf(contact.getZip()).length() != 6) {
            System.out.println("Invalid Zip!");
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

        book.getContacts().add(contact);
        System.out.println("Contact Added Successfully!");
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