import java.util.ArrayList;
import java.util.Random;

// useCase 13
class CompanyEmpWage {

    public String companyName;
    public int wagePerHour;
    public int maxWorkingDays;
    public int maxWorkingHours;
    public int totalWage;

    public ArrayList<Integer> dailyWages;

    public CompanyEmpWage(String companyName,
                          int wagePerHour,
                          int maxWorkingDays,
                          int maxWorkingHours) {

        this.companyName = companyName;
        this.wagePerHour = wagePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalWage = 0;
        this.dailyWages = new ArrayList<>();
    }

    public void addDailyWage(int dailyWage) {
        dailyWages.add(dailyWage);
    }

    public void setTotalWage(int totalWage) {
        this.totalWage = totalWage;
    }

    @Override
    public String toString() {
        return "Company: " + companyName +
               "\nDaily Wages: " + dailyWages +
               "\nTotal Wage: " + totalWage +
               "\n---------------------------";
    }
}

public class EmpWageBuilder implements IEmpWageBuilder {

    private static final int IS_PART_TIME = 1;
    private static final int IS_FULL_TIME = 2;

    private ArrayList<CompanyEmpWage> companyList;

    public EmpWageBuilder() {
        companyList = new ArrayList<>();
    }

    @Override
    public void addCompany(String name,
                           int wagePerHour,
                           int maxWorkingDays,
                           int maxWorkingHours) {

        companyList.add(new CompanyEmpWage(name,
                                           wagePerHour,
                                           maxWorkingDays,
                                           maxWorkingHours));
    }

    private void computeWage(CompanyEmpWage company) {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        Random random = new Random();

        while (totalEmpHours < company.maxWorkingHours &&
               totalWorkingDays < company.maxWorkingDays) {

            totalWorkingDays++;

            int empType = random.nextInt(3);
            int empHours = 0;

            switch (empType) {
                case IS_PART_TIME:
                    empHours = 4;
                    break;
                case IS_FULL_TIME:
                    empHours = 8;
                    break;
                default:
                    empHours = 0;
            }

            int dailyWage = empHours * company.wagePerHour;

            company.addDailyWage(dailyWage);  // 🔥 store daily wage

            totalEmpHours += empHours;
        }

        company.setTotalWage(totalEmpHours * company.wagePerHour);
    }
    // useCase 14
    public int getTotalWage(String companyName) {

    for (CompanyEmpWage company : companyList) {

        if (company.companyName.equals(companyName)) {
            return company.totalWage;
        }
    }

    System.out.println("Company not found!");
    return -1;
}

    @Override
    public void computeWageForAll() {

        for (CompanyEmpWage company : companyList) {
            computeWage(company);
            System.out.println(company);
        }
    }

    public static void main(String[] args) {

        public static void main(String[] args) {

    EmpWageBuilder builder = new EmpWageBuilder();

    builder.addCompany("TCS", 20, 20, 100);
    builder.addCompany("Infosys", 25, 22, 120);

    builder.computeWageForAll();

    System.out.println("TCS Total Wage: "
            + builder.getTotalWage("TCS"));

    System.out.println("Infosys Total Wage: "
            + builder.getTotalWage("Infosys"));
};
    }
}