package EncapsulationAbstraction;

 class FullTimeEmployee extends Employee implements Department{
	private double baseSalary;
	FullTimeEmployee(int id, String name, double baseSalary){
		super(id, name, baseSalary);
	}
    double calculateSalary() {
    	return baseSalary;
    }
   public void assignDepartment(String dept) {
	   setDepartment(dept);
   }
   public String getDepartmentDetails() {
       return getDepartment();
   }
    
}
