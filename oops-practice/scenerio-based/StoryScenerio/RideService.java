package StoryScenerio;
import java.util.*;
public class RideService {
	 private List<Driver> drivers = new ArrayList<>();
	 private List<Ride> rideHistory = new ArrayList<>();
	 
	 public RideService(List<Driver> drivers) {
	        this.drivers = drivers;
	    }
	 
	 public Ride bookRide(User user, double distance, FareCalculator calculator)
	            throws NoDriverAvailableException {

	        for (Driver driver : drivers) {
	            if (driver.isAvailable()) {
	                driver.assignDriver();
	                double fare = calculator.fareCalculate(distance);
	                Ride ride = new Ride(user, driver, distance, fare);
	                rideHistory.add(ride);
	                return ride;
	            }
	        }
	        throw new NoDriverAvailableException("No drivers available at the moment");
	    }
	 public void showRideHistory() {
	        for (Ride ride : rideHistory) {
	            ride.displayRide();
	        }
	    }
}
