package FunctionalInterface;

public class Bikes {
   
   boolean rent=true;
	
   public void rent() {
	  if(rent==true) {
         rent=false;
         System.out.println("yes bike booked!");
	  }else {
		  System.out.println("already booked");
	  }
   }

   public void returnVehicle() {
	  if(rent==false) {
	    rent=true;
	    System.out.println("yes bike returned!");
	  }
	  else {
		System.out.println("already booked");
	  }
   }
}
