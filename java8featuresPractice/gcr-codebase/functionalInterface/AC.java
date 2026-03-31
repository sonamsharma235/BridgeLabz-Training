package FunctionalInterface;

public class AC implements SmartDeviceControl{
  
	public void turnOn() {
		  System.out.println("AC are on");
	  }
	  
	  public void turnOff() {
		  System.out.println("AC are Off");
	  }
}
