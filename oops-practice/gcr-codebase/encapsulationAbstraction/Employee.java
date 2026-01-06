package EncapsulationAbstraction;

abstract class Employee {
	private int employeeId;
	private String name;
	private double baseSalary;
	private String department;
	
	Employee(int employeeId,String name,double baseSalary){
		this.baseSalary=baseSalary;
		this.employeeId=employeeId;
		this.name=name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public String getName() {
		return name;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setDepartment(String department) {
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}
	
	abstract double calculateSalary();
	void displayDetails() {
		System.out.println("ID: "+employeeId);
		System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Final Salary: " + calculateSalary());
	}

}
