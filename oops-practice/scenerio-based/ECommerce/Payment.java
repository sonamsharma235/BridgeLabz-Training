package ECommerce;

public interface Payment {
   public void  pay(double amount) throws PaymentFailedException;
}
