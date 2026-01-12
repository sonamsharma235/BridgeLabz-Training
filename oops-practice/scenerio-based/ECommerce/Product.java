package ECommerce;

public class Product {
   private String productName;
   private int productId;
   private int remaining;
   private double price;
   
   Product(int id,String name,double price){
	   this.price=price;
	   this.productId=id;
	   this.productName=name;
   }
   
   public double getPrice() {
	   return price;
   }
   public String getName() {
	   return productName;
   }
    
   
}
