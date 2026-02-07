package FunctionalInterface;

public class Buses {
boolean rent=true;
	
    public void rent() {
    	if(rent==true) {
	       rent=false;
	       System.out.println("yes buses booked!");
    	}else {
    		System.out.println("already booked");
    	}
    }
    
    public void returnVehicle() {
    	if(rent==false) {
    	  rent=true;
    	  System.out.println("yes buses returned!");
    	}
    	else {
    		System.out.println("already booked");
    	}
    }
}
