package EncapsulationAbstraction;

 class PartTimeEmployee extends Employee implements Department{
	private int hoursWorked;
    private double hourlyRate;

    PartTimeEmployee(int id, String name, int hoursWorked, double hourlyRate) {
        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void assignDepartment(String dept) {
        setDepartment(dept);
    }

    @Override
    public String getDepartmentDetails() {
        return getDepartment();
    }
}

