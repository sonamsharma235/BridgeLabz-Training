package java8Features;

import java.util.*;
public class CustomSorting {
	public static void main(String[]args) {
		List<Product> list = new ArrayList<>();

	    list.add(new Product("Mobile", 15000, 4.5, 10));
	    list.add(new Product("Laptop", 60000, 4.8, 20));
	    list.add(new Product("Headphone", 2000, 4.1, 30));
	    
	    // sorted using price
	    list.sort((a,b)->Double.compare(a.price,b.price));
	    System.out.println("sorted via price");
	    list.forEach(i->System.out.print(i+" "));
	    
	    // sorted using rating
	    list.sort((a,b)->Double.compare(a.rating,b.rating));
	    System.out.println("sorted via rating");
	    list.forEach(i->System.out.print(i+" "));
	    
	    
	    //sorted using discount
	    list.sort((a,b)->Double.compare(a.discount,b.discount));
	    System.out.println("sorted via discount");
	    list.forEach(i->System.out.print(i+" "));
	}
}
