public class RestaurantApp {
    public static void main(String[] args) {
        RestaurantReservationSystem system = new RestaurantReservationSystem();

        system.addTable(new Table(1, 4));
        system.addTable(new Table(2, 2));

        try {
            system.reserveTable(1, "7PM-8PM", "Amit");
            system.reserveTable(1, "7PM-8PM", "Rahul"); // exception
        } catch (TableAlreadyReservedException e) {
            System.out.println(e.getMessage());
        }

        system.showAvailableTables("7PM-8PM");
    }
}
