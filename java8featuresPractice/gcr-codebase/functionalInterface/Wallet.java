package FunctionalInterface;

public class Wallet implements Payment{
  public void pay() {
	  System.out.println("paid via wallet ");
  }
}
