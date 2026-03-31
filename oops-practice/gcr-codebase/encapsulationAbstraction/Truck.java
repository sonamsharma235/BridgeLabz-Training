package EncapsulationAbstraction;

class Truck extends Vehicle implements Insurable{
	private String insurancePolicyNumber;
	
	Truck(int vehicleNumber,String type,double rentalRate,String policyNo){
		super(vehicleNumber,type,rentalRate);
		 this.insurancePolicyNumber = policyNo;
	}
	public double calculateRentalCost(int days) {
		return days*getRentalRate();
	}
	public double calculateInsurance() {
		return getRentalRate() * 0.25;
	}
	@Override
	public String getInsuranceDetails() {
		return "Insurance of Truck";
	}

}
