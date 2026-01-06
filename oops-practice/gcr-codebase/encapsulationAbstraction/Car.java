package EncapsulationAbstraction;

class Car extends Vehicle implements Insurable{
	private String insurancePolicyNumber;
	
	Car(int vehicleNumber,String type,double rentalRate,String policyNo){
		super(vehicleNumber,type,rentalRate);
		this.insurancePolicyNumber = policyNo;
	}
    
	public double calculateRentalCost(int days) {
		return days*getRentalRate();
	}
	@Override
	public double calculateInsurance() {
		return getRentalRate()*0.15;
	}
	@Override
	public String getInsuranceDetails() {
		return "Insurance of car";
	}
}
