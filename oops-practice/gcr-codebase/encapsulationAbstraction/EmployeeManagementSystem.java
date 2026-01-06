package EncapsulationAbstraction;
import java.util.*;
public class EmployeeManagementSystem {
	public static void main(String[] args) {

		Employee emp1 = new FullTimeEmployee(101, "Anita", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Rohit", 80, 500);

        // Assign departments (interface reference)
        Department d1 = (Department) emp1;
        Department d2 = (Department) emp2;

        d1.assignDepartment("IT");
        d2.assignDepartment("HR");

        // Display employee details
        emp1.displayDetails();
        emp2.displayDetails();
    }
}
