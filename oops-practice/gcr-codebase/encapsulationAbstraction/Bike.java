package EncapsulationAbstraction;

class Bike extends Vehicle implements Insurable{
	Bike(int vehicleNumber,String type,double rentalRate){
		super(vehicleNumber,type,rentalRate);
	}
	public double calculateRentalCost(int days) {
		return days*getRentalRate();
	}
	public double calculateInsurance() {
		return 
	}
	@Override
	public String getInsuranceDetails() {
		return "Insurance of Bike";
	}

}
