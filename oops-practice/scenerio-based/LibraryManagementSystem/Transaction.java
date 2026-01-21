class Transaction {
    Book book;
    Member member;

    Transaction(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    void issueBook() throws BookNotAvailableException {
        if (!book.available)
            throw new BookNotAvailableException("Book not available!");

        book.available = false;
        System.out.println("Book issued: " + book.title);
    }

    void returnBook(FineCalculator fc, int daysLate) {
        book.available = true;
        double fine = fc.calculateFine(daysLate);
        System.out.println("Book returned");
        System.out.println("Fine: ₹" + fine);
    }
}
