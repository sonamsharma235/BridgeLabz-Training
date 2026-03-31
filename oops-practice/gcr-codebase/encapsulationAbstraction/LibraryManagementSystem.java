package EncapsulationAbstraction;
import java.util.*;
public class LibraryManagementSystem {
   public static void main(String[]args) {
	   List<LibraryItem>items=new ArrayList<>();
	   
	   items.add(new Book(101, "Java Basics", "James Gosling",21));
       items.add(new Magazine(102, "Tech Monthly", "Editorial Team",10));
       items.add(new Dvd(103, "Inception", "Christopher Nolan",15));
       
       for(LibraryItem item:items) {
    	   item.getItemDetails();
    	   System.out.println("Loan Duration");
    	   System.out.println(item.getLoanDuration());
    	   
    	   if(item instanceof Reservable) {
    		   Reservable r=(Reservable)item;
    		   System.out.println(r.checkAvailability());
    		   r.reserveItem();
    	   }
    	   
       }
   }
}
