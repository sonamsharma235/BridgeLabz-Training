import java.util.*;

class RestaurantReservationSystem {
    Map<Integer, Table> tables = new HashMap<>();
    List<Reservation> reservations = new ArrayList<>();

    // Add table
    void addTable(Table table) {
        tables.put(table.tableNumber, table);
    }

    // Reserve table
    void reserveTable(int tableNumber, String timeSlot, String customer)
            throws TableAlreadyReservedException {

        for (Reservation r : reservations) {
            if (r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot)) {
                throw new TableAlreadyReservedException(
                        "Table " + tableNumber + " already reserved at " + timeSlot);
            }
        }
        reservations.add(new Reservation(tableNumber, timeSlot, customer));
        System.out.println("Reservation successful for " + customer);
    }

    // Cancel reservation
    void cancelReservation(int tableNumber, String timeSlot) {
        reservations.removeIf(r ->
                r.tableNumber == tableNumber && r.timeSlot.equals(timeSlot));
        System.out.println("Reservation cancelled.");
    }

    // Show available tables
    void showAvailableTables(String timeSlot) {
        System.out.println("Available tables at " + timeSlot + ":");
        for (Integer tableNo : tables.keySet()) {
            boolean booked = false;
            for (Reservation r : reservations) {
                if (r.tableNumber == tableNo && r.timeSlot.equals(timeSlot)) {
                    booked = true;
                    break;
                }
            }
            if (!booked) {
                System.out.println("Table " + tableNo);
            }
        }
    }
}
