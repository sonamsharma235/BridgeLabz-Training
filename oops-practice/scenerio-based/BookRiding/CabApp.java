public class CabApp {
    public static void main(String[] args) {

        User u1 = new User("Sonam");
        Driver d1 = new Driver("Rahul");

        try {
            if (!d1.available)
                throw new NoDriverAvailableException("No driver available!");

            FareCalculator fare;
            fare = new PeakFare();   // polymorphism

            Ride r1 = new Ride(u1, d1, fare, 5);

            System.out.println("Ride booked for " + u1.name);
            System.out.println("Driver: " + d1.name);
            System.out.println("Fare: ₹" + r1.fare);

        } catch (NoDriverAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
