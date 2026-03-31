package FunctionalInterface;

public class MultiVehicleRentalSystem {
   public static void main(String[]args) {
	   Cars c=new Cars();
	   c.rent();
	   c.returnVehicle();
	   
	   Bikes b=new Bikes();
	   b.rent();
	   b.returnVehicle();
	   
	   Buses bb=new Buses();
	   bb.rent();
//	   bb.returnVehicle();
	   
	   
   }
}
