class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    // Default constructor
    HotelBooking() {
        guestName = "Guest";
        roomType = "Standard";
        nights = 1;
    }

    // Parameterized constructor
    HotelBooking(String name, String room, int days) {
        guestName = name;
        roomType = room;
        nights = days;
    }

    // Copy constructor
    HotelBooking(HotelBooking booking) {
        guestName = booking.guestName;
        roomType = booking.roomType;
        nights = booking.nights;
    }

    void showBooking() {
        System.out.println("Guest Name: " + guestName);
        System.out.println("Room Type: " + roomType);
        System.out.println("Nights: " + nights);
    }

    public static void main(String[] args) {

        HotelBooking b1 = new HotelBooking();
        HotelBooking b2 = new HotelBooking("Rohan", "Deluxe", 3);
        HotelBooking b3 = new HotelBooking(b2);

        b1.showBooking();
        b2.showBooking();
        b3.showBooking();
    }
}
