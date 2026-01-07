package StoryScenerio;

public class Ride {
	private User user;
    private Driver driver;
    private double distance;
    private double fare;

    public Ride(User user, Driver driver, double distance, double fare) {
        this.user = user;
        this.driver = driver;
        this.distance = distance;
        this.fare = fare;
    }

    public void displayRide() {
        System.out.println(
            "User: " + user.getName() +
            ", Driver: " + driver.getName() +
            ", Distance: " + distance +
            " km, Fare: ₹" + fare
        );
    }
}
