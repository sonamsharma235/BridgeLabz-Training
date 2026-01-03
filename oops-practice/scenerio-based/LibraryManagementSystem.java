public class LibraryManagementSystem {
    static void displayBooks(String[] titles, String[] authors, boolean[] isAvailable) {
        for (int i = 0; i < titles.length; i++) {
            System.out.println(
                (i + 1) + ". " + titles[i] +
                " | Author: " + authors[i] +
                " | Status: " + (isAvailable[i] ? "Available" : "Checked Out")
            );
        }
    }
    static void searchBook(String[] titles, String[] authors, boolean[] isAvailable, String keyword) {
        boolean found = false;

        for (int i = 0; i < titles.length; i++) {
            if (titles[i].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(
                    (i + 1) + ". " + titles[i] +
                    " | Author: " + authors[i] +
                    " | Status: " + (isAvailable[i] ? "Available" : "Checked Out")
                );
                found = true;
            }
        }
        if (!found) {
            System.out.println("No book found with given title.");
        }
    }
    static void checkoutBook(boolean[] isAvailable, int index) {
        if (isAvailable[index]) {
            isAvailable[index] = false;
            System.out.println("Book checked out successfully.");
        } else {
            System.out.println("Book is already checked out.");
        }
    }

    public static void main(String[] args) {
        String[] titles = {"Java Programming", "Data Structures","Operating Systems""Database Management"};

        String[] authors = {"James Gosling","Mark Allen","Abraham Silberschatz","Raghu Ramakrishnan"};
        boolean[] isAvailable = { true, true, false, true };
        displayBooks(titles, authors, isAvailable);
        searchBook(titles, authors, isAvailable, "data");
        checkoutBook(isAvailable, 1);
        displayBooks(titles, authors, isAvailable);
    }
}
