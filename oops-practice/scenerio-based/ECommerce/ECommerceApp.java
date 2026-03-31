package ECommerce;

public class ECommerceApp {
  public static void main(String []args) {
	  Product p1=new Product(1, "Laptop", 6000);
	  Customer c1 = new Customer(101, "Sonam");
	  
	  Order order = new Order(p1, c1);

      Payment payment = new UPIPayment();  
      order.placeOrder(payment);

      order.trackOrder();
      order.cancelOrder();
      order.trackOrder();
  }
}
