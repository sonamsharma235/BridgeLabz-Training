class Book {

    String title;
    String author;
    double price;
    boolean available;

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
        available = true;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed successfully.");
        } else {
            System.out.println(title + " is currently not available.");
        }
    }

    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        Book book1 = new Book("Wings Of Fire", "A.P.J Abdul Kalam", 500);

        book1.displayBook();
        book1.borrowBook();
        book1.displayBook();
        book1.borrowBook();
    }
}
