package ECommerce;

public class WalletPayment implements Payment{
	private double balance = 3000;
	
	public void pay(double amount) throws PaymentFailedException{
		 if(amount>100000) {
			 throw new PaymentFailedException("Wallet limit exceed");
		 }
		 balance-=amount;
		 System.out.println("paid "+amount+" using Wallet");
	}

}
