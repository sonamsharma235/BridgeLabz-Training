package ECommerce;

class PaymentFailedException extends Exception{
	public PaymentFailedException(String msg){
		super(msg);
	}
}
