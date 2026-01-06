package EncapsulationAbstraction;
import java.util.*;
public class FoodDelieverySystem {
	 public static void main(String[] args) {

	        List<FoodItem> order = new ArrayList<>();

	        order.add(new VegItem("Paneer Pizza", 300, 2));
	        order.add(new NonVegItem("Chicken Burger", 200, 1));

	        for (FoodItem item : order) {

	            item.getItemDetails();
	            double total = item.calculateTotalPrice();

	            if (item instanceof Discountable) {
	                Discountable d = (Discountable) item;
	                total -= d.applyDiscount();
	                System.out.println(d.getDiscountDetails());
	            }

	            System.out.println("Total Price: " + total);
	        }
	    }
}
