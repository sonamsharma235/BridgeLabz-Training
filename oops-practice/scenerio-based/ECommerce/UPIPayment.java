package ECommerce;

public class UPIPayment implements Payment{
	public void pay(double amount) throws PaymentFailedException{
		 if(amount>100000) {
			 throw new PaymentFailedException("UPI limit exceed");
		 }
		 System.out.println("paid "+amount+" using UPI");
	}
}
