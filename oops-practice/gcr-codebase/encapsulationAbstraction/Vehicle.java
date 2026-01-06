package EncapsulationAbstraction;

abstract class Vehicle {
   private int vehicleNumber;
   private String type;
   private double rentalRate;
   
   Vehicle(int vehicleNumber,String type,double rentalRate){
	   this.rentalRate=rentalRate;
	   this.type=type;
	   this.vehicleNumber=vehicleNumber;
   }
   
   int getVehicleNumber() {
	   return vehicleNumber;
   }
   String getType() {
	   return type;
   }
   double getRentalRate() {
	   return rentalRate;
   }
   public void setRentalRate(double rentalRate) {
       if (rentalRate > 0) {
           this.rentalRate = rentalRate;
       }
   }
   abstract double calculateRentalCost(int days);
}
