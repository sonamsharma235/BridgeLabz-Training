public class LibraryApp {
    public static void main(String[] args) {

        Book b1 = new Book("Java Basics");
        Member m1 = new Member("Sonam");

        Transaction t1 = new Transaction(b1, m1);

        try {
            t1.issueBook();
            FineCalculator fine = new StudentFine(); // polymorphism
            t1.returnBook(fine, 3);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
