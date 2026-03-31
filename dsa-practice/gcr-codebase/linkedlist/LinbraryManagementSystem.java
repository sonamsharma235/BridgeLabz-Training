class BookNode {
    int bookId;
    String title, author, genre;
    boolean available;
    BookNode prev, next;

    BookNode(int bookId, String title, String author, String genre, boolean available) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
    }
}
class LibraryDLL {
    BookNode head, tail;

    // Add at beginning
    void addAtBeginning(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    // Add at end
    void addAtEnd(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Remove by Book ID
    void removeBook(int id) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Book removed: " + id);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found!");
    }

    // Search by title or author
    void search(String key) {
        BookNode temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(key) ||
                temp.author.equalsIgnoreCase(key)) {
                displayBook(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found)
            System.out.println("No matching book found.");
    }

    // Update availability
    void updateAvailability(int id, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookId == id) {
                temp.available = status;
                System.out.println("Availability updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found!");
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        System.out.println("\nBooks (Forward):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        BookNode temp = tail;
        System.out.println("\nBooks (Reverse):");
        while (temp != null) {
            displayBook(temp);
            temp = temp.prev;
        }
    }

    // Count books
    void countBooks() {
        int count = 0;
        BookNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total books: " + count);
    }

    void displayBook(BookNode b) {
        System.out.println(b.bookId + " | " + b.title + " | " +
                b.author + " | " + b.genre + " | " +
                (b.available ? "Available" : "Issued"));
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {

        LibraryDLL library = new LibraryDLL();

        library.addAtBeginning(101, "Clean Code", "Robert Martin", "Programming", true);
        library.addAtEnd(102, "Java Complete Ref", "Herbert Schildt", "Programming", true);
        library.addAtEnd(103, "Atomic Habits", "James Clear", "Self-Help", false);

        library.displayForward();
        library.displayReverse();

        library.search("Robert Martin");
        library.updateAvailability(103, true);

        library.removeBook(102);
        library.countBooks();

        library.displayForward();
    }
}
