import java.util.Random;

public class EmpWageBuilder {
     
    //useCase 9
    // Instance Variables (NOT static)
    private String company;
    private int wagePerHour;
    private int maxWorkingDays;
    private int maxWorkingHours;
    private int totalWage;

    public EmpWageBuilder(String company,
                          int wagePerHour,
                          int maxWorkingDays,
                          int maxWorkingHours) {

        this.company = company;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
    }

    // Method to compute wage
    public void computeEmployeeWage() {

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
                    empHours = 4;
                    break;
                case 2:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            totalEmpHours += empHours;
        }

        totalWage = totalEmpHours * wagePerHour;
    }

    // Getter method
    public int getTotalWage() {
        return totalWage;
    }

    public String getCompany() {
        return company;
    }

    public static void main(String[] args) {

        EmpWageBuilder tcs =
            new EmpWageBuilder("TCS", 20, 20, 100);

        EmpWageBuilder infosys =
            new EmpWageBuilder("Infosys", 25, 22, 120);

        tcs.computeEmployeeWage();
        infosys.computeEmployeeWage();

        System.out.println("Company: " + tcs.getCompany()
                + " Total Wage: " + tcs.getTotalWage());

        System.out.println("Company: " + infosys.getCompany()
                + " Total Wage: " + infosys.getTotalWage());
    }
}