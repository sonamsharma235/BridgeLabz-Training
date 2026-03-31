package FunctionalInterface;

public class Cars {
	boolean rent=true;
	
	public void rent() {
    	if(rent==true) {
	       rent=false;
	       System.out.println("yes car booked!");
    	}else {
    		System.out.println("already booked");
    	}
    }
    
    public void returnVehicle() {
    	if(rent==false) {
    	  rent=true;
    	  System.out.println("yes car returned!");
    	}
    	else {
    		System.out.println("already booked");
    	}
    }
}
