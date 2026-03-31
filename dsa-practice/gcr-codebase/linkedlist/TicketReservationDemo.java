class TicketNode {
    int ticketId;
    String customerName, movieName, seatNo, bookingTime;
    TicketNode next;

    TicketNode(int id, String cust, String movie, String seat, String time) {
        ticketId = id;
        customerName = cust;
        movieName = movie;
        seatNo = seat;
        bookingTime = time;
        next = this;
    }
}

class TicketReservation {
    private TicketNode head = null;

    // Add ticket at end
    void addTicket(int id, String cust, String movie, String seat, String time) {
        TicketNode newNode = new TicketNode(id, cust, movie, seat, time);

        if (head == null) {
            head = newNode;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = newNode;
        newNode.next = head;
    }

    // Remove ticket by ID
    void removeTicket(int id) {
        if (head == null) return;

        TicketNode curr = head, prev = null;

        do {
            if (curr.ticketId == id) {
                if (curr == head) {
                    TicketNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                System.out.println("Ticket removed: " + id);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Ticket not found!");
    }

    // Display all tickets
    void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("\nBooked Tickets:");
        do {
            display(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search ticket
    void search(String key) {
        if (head == null) return;

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(key) ||
                temp.movieName.equalsIgnoreCase(key)) {
                display(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No matching ticket found.");
    }

    // Count tickets
    void countTickets() {
        if (head == null) {
            System.out.println("Total tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total tickets: " + count);
    }

    void display(TicketNode t) {
        System.out.println(t.ticketId + " | " + t.customerName +
                " | " + t.movieName + " | Seat " + t.seatNo +
                " | " + t.bookingTime);
    }
}

public class TicketReservationDemo {
    public static void main(String[] args) {

        TicketReservation tr = new TicketReservation();

        tr.addTicket(1, "Amit", "Inception", "A1", "10:00 AM");
        tr.addTicket(2, "Neha", "Avatar", "B5", "10:05 AM");
        tr.addTicket(3, "Rahul", "Inception", "C3", "10:10 AM");

        tr.displayTickets();

        tr.search("Inception");
        tr.removeTicket(2);

        tr.countTickets();
        tr.displayTickets();
    }
}
