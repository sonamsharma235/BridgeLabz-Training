import java.util.Random;

public class EmployeeWageComputation {
     
    // useCase 8
    // Class Method with Parameters
    public static void computeEmployeeWage(String company,
                                           int wagePerHour,
                                           int maxWorkingDays,
                                           int maxWorkingHours) {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        Random random = new Random();

        while (totalEmpHours < maxWorkingHours &&
               totalWorkingDays < maxWorkingDays) {

            totalWorkingDays++;

            int empType = random.nextInt(3); // 0,1,2
            int empHours = 0;

            switch (empType) {
                case 1:
                    empHours = 4;  // Part Time
                    break;

                case 2:
                    empHours = 8;  // Full Time
                    break;

                default:
                    empHours = 0;  // Absent
            }

            totalEmpHours += empHours;
        }

        int totalWage = totalEmpHours * wagePerHour;

        System.out.println("Company: " + company);
        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHours);
        System.out.println("Total Wage: " + totalWage);
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {

        System.out.println("Welcome To Employee Wage Computation");

        // Multiple Companies
        computeEmployeeWage("TCS", 20, 20, 100);
        computeEmployeeWage("Infosys", 25, 22, 120);
        computeEmployeeWage("Wipro", 18, 25, 110);
    }
}