package StoryScenerio;
import java.util.*;
public class RideManagementSystem {
  public static void main(String[]args) {
	  User user=new User(1,"sonam");
	  
	  List<Driver> drivers = new ArrayList<>();
      drivers.add(new Driver(101, "Ravi"));
      drivers.add(new Driver(102, "Amit"));
      
      RideService service = new RideService(drivers);
      
      try {
          FareCalculator pricing = new PeakPricing(); // Polymorphism
          Ride ride = service.bookRide(user, 12, pricing);
          ride.displayRide();
      } catch (NoDriverAvailableException e) {
          System.out.println(e.getMessage());
      }

      System.out.println("\nRide History:");
      service.showRideHistory();
  }
}
