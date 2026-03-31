class MovieTicket {
    String movieName;
    String seatNumber;
    double price;
    boolean booked = false;
    void bookTicket(String movie, String seat, double cost) {
        if (!booked) {
            movieName = movie;
            seatNumber = seat;
            price = cost;
            booked = true;
            System.out.println("Ticket booked for movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
        } 
    }

    void displayTicket() {
        if (!booked) {
            System.out.println("Ticket have not booked yet....");
        } else {
            System.out.println("Price: $" + price);
        }
    }

    public static void main(String[] args) {
        // 1st object
        MovieTicket t = new MovieTicket();
        t.displayTicket();
        t.bookTicket("Dragon", "A10", 120.0);
        t.bookTicket("Dragon", "A10", 120.0);
        t.displayTicket();
    }
}
