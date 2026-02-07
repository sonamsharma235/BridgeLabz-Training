package FunctionalInterface;

public class Lights implements SmartDeviceControl{
  public void turnOn() {
	  System.out.println("Lights are on");
  }
  
  public void turnOff() {
	  System.out.println("Lights are Off");
  }
}
