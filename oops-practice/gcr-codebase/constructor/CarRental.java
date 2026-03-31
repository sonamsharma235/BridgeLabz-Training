class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay = 1500;

    // Default constructor
    CarRental() {
        customerName = "Customer";
        carModel = "Basic Model";
        rentalDays = 1;
    }

    // Parameterized constructor
    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    double calculateCost() {
        return rentalDays * costPerDay;
    }

    void showRentalDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: ₹" + calculateCost());
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {

        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Amit", "Hyundai Creta", 5);

        r1.showRentalDetails();
        r2.showRentalDetails();
    }
}
