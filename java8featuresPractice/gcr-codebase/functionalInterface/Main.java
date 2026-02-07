package FunctionalInterface;

public class Main {
  public static void main(String[]args) {
	  Lights l=new Lights();
	  l.turnOn();
	  l.turnOff();
	  
	  Tv t=new Tv();
	  t.turnOn();
	  t.turnOff();
	  
	  AC a=new AC();
	  a.turnOn();
	  a.turnOff();
  }
}
