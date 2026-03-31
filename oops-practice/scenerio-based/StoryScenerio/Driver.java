package StoryScenerio;

public class Driver {
	  private String name;
	  private int driverId;
	  boolean available=true;
	  
	  Driver(int userId,String name){
		  this.name=name;
		  this.driverId=userId;
	  }
	  public String getName() {
		  return name;
	  }
	  public int  getUserId() {
		  return driverId;
	  }
	  public boolean isAvailable() {
	        return available;
	    }
	  public void assignDriver() {
	        available = false;
	    }
}
