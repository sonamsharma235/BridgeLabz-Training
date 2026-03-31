package FunctionalInterface;

public interface PaymentProcessor {
   default void refund() {
	   System.out.println("refund completed!");
   }
}
