package EncapsulationAbstraction;

import java.util.*;
public class VehicleRentalSystem {
   public static void main(String[]args) {
	   List<Vehicle>vehicles=new ArrayList<>();
	   
	   vehicles.add(new Car(101,"Car", 2000, "CARINS123456"));
	   vehicles.add(new Bike(202,"Bike", 500));
       vehicles.add(new Truck(303,"Truck", 4000, "TRKINS987654"));
       
       int rentalDays=3;
       for(Vehicle v:vehicles) {
    	   System.out.println("Vehicle Type   : " + v.getType());
           System.out.println("Vehicle Number : " + v.getVehicleNumber());
           
           double rentalCost = v.calculateRentalCost(rentalDays);
           System.out.println("Rental Cost (" + rentalDays + " days): " + rentalCost);
           
           if (v instanceof Insurable) {
               Insurable i = (Insurable) v;
               System.out.println(i.getInsuranceDetails());
               System.out.println("Insurance Cost: " + i.calculateInsurance());
           }
       }
	   
   }
}
