class Ride {
    User user;
    Driver driver;
    double fare;

    Ride(User user, Driver driver, FareCalculator fc, double distance) {
        this.user = user;
        this.driver = driver;
        this.fare = fc.calculateFare(distance);
        driver.available = false;
    }
}
