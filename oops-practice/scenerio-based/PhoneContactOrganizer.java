import java.util.*;

class InvalidPhoneNumberException extends Exception {
    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
class Contact {
    String name;
    String phoneNumber;

    public Contact(String name, String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches("\\d{10}")) {
            throw new InvalidPhoneNumberException("Invalid phone number: " + phoneNumber);
        }
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}
class ContactOrganizer {
    private List<Contact> contacts = new ArrayList<>();
    public void addContact(String name, String phone) throws InvalidPhoneNumberException {
        for (Contact c : contacts) {
            if (c.phoneNumber.equals(phone)) {
                System.out.println("Duplicate contact not allowed!");
                return;
            }
        }
        contacts.add(new Contact(name, phone));
        System.out.println("Contact added successfully.");
    }
    public void deleteContact(String phone) {
        contacts.removeIf(c -> c.phoneNumber.equals(phone));
        System.out.println("Contact deleted if existed.");
    }
    public void searchContact(String phone) {
        for (Contact c : contacts) {
            if (c.phoneNumber.equals(phone)) {
                System.out.println("Found: " + c.name + " - " + c.phoneNumber);
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}

public class PhoneContactOrganizer {
    public static void main(String[] args) {
        ContactOrganizer organizer = new ContactOrganizer();

        try {
            organizer.addContact("Rahul", "9876543210");
            organizer.addContact("Anita", "9123456789");
            organizer.addContact("Duplicate", "9876543210"); // duplicate

            organizer.searchContact("9123456789");
            organizer.deleteContact("9876543210");
            organizer.searchContact("9876543210");

        } catch (InvalidPhoneNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
