package java8Features;

public class SmartHomeLighting {
  public static void main(String[]args) {
	   LightBehaviour motion=()->System.out.println("Light on via motion");
	   
	   LightBehaviour time=()->System.out.println("Light on via time of day");
	   
	   LightBehaviour voice=()->System.out.println("Light on via voice");
	   
	   activateLight(motion);
	   activateLight(time);
	   activateLight(voice);
	   
  }
  static void activateLight(LightBehaviour behaviour) {
	  behaviour.activate();
  }
}
