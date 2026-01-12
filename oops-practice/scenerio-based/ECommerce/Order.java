package ECommerce;

public class Order {
   private Product product;
   private Customer customer;
   private String status;
   
   Order(Product product, Customer customer){
	   this.product=product;
	   this.customer=customer;
	   this.status="ccreated";
   }
   
   public void placeOrder(Payment payment) {
	   try {
		   payment.pay(product.getPrice());
		   status="confirmed";
		   System.out.println("order placed for"+ product.getName());
	   }catch(PaymentFailedException e) {
		   status="payment failed";
		   System.out.println("order failed "+ e.getMessage());
	   }
   }
   
   public void cancelOrder() {
	   if(status.equals("confirmed")) {
		   status="cancelled";
		   System.out.println("order cancel");
	   }else {
		   System.out.println("can not cancel");
	   }
   }
   public void trackOrder() {
	   System.out.println("order status "+status);
   }
   
}
