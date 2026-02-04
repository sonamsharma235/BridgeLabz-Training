package java8Features;

public class Product {
  String name;	
  double price;
  double rating;
  double discount;
  
  Product(String name,double price, double rating, double discouunt){
	  this.name=name;
	  this.discount=discount;
	  this.price=price;
	  this.rating=rating;
  }
  
  public String toString() {
      return name + " Price:" + price +
             " Rating:" + rating +
             " Discount:" + discount;
  }
  
}
