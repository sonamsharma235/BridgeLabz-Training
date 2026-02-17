package addressBook.controller;

import java.util.*;
import addressBook.model.Contact;
import addressBook.service.AddressBookService;

public class AddressBookController {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AddressBookService service = new AddressBookService();

        while (true) {

            System.out.println("\n1. Create Address Book");
            System.out.println("2. Add Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display Contacts");
            System.out.println("5. Display All Address Books");
            System.out.println("6. Exit");
			System.out.println("7. Search by City");
            System.out.println("8. Search by State");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter Address Book Name:");
                    service.createAddressBook(sc.next());
                    break;

                case 2:
                    System.out.println("Enter Address Book Name:");
                    String bookName = sc.next();

                    System.out.println("Enter First Name:");
                    String first = sc.next();

                    System.out.println("Enter Last Name:");
                    String last = sc.next();

                    System.out.println("Enter Address:");
                    String address = sc.next();

                    System.out.println("Enter City:");
                    String city = sc.next();

                    System.out.println("Enter Zip:");
                    int zip = sc.nextInt();

                    System.out.println("Enter Phone:");
                    long phone = sc.nextLong();

                    System.out.println("Enter Email:");
                    String email = sc.next();

                    Contact contact = new Contact(first, last, address, city, zip, phone, email);
                    service.addContact(bookName, contact);
                    break;

                case 3:
                    System.out.println("Enter Address Book Name:");
                    String bName = sc.next();
                    System.out.println("Enter First Name to delete:");
                    String name = sc.next();
                    service.deleteContact(bName, name);
                    break;

                case 4:
                    System.out.println("Enter Address Book Name:");
                    service.displayContacts(sc.next());
                    break;

                case 5:
                    service.displayAllBooks();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

				case 7:
                    System.out.println("Enter City:");
                    service.searchByCity(sc.next());
                    break;

                case 8:
                    System.out.println("Enter State:");
                    service.searchByState(sc.next());
                    break;	
            }
        }
    }
}