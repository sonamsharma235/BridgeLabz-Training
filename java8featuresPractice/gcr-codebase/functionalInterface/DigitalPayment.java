package FunctionalInterface;

public class DigitalPayment {
   public static void main(String[]args) {
	   UPI a=new UPI();
	   a.pay();
	   
	   CreditCard b=new CreditCard();
	   b.pay();
	   
	   Wallet c=new Wallet();
	   c.pay();
   }
}
