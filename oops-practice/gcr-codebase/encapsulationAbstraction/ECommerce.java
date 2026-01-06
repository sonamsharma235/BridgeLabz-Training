package EncapsulationAbstraction;
import java.util.*;
public class ECommerce {
	static void printFinalPrice(List<Product> products) {

        for (Product p : products) {

            double tax = p.calculateTax();      // polymorphic call
            double discount = p.calculateDiscount();

            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Product Name : " + p.getName());
            System.out.println("Base Price  : " + p.getPrice());
            System.out.println("Discount    : " + discount);
            System.out.println("Tax         : " + tax);
            System.out.println("Final Price : " + finalPrice);
            System.out.println("--------------------------------");
        }
    }
	public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        printFinalPrice(products);
    }
}
