package ECommerce;

public class CardPayment implements Payment{
	public void pay(double amount) throws PaymentFailedException{
		 if(amount>100000) {
			 throw new PaymentFailedException("card limit exceed");
		 }
		 System.out.println("paid "+amount+" using card");
	}
}
