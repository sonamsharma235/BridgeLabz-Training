import java.util.*;
public class EmployeeWageComputation{

    //UC 7
    // Class Variables (Static Variables)
    static final int IS_PART_TIME = 1;
    static final int IS_FULL_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    // Class Method (Static Method)
    public static int computeEmployeeWage() {

        int totalEmpHours = 0;
        int totalWorkingDays = 0;
        Random random = new Random();

        while (totalEmpHours < MAX_WORKING_HOURS &&
               totalWorkingDays < MAX_WORKING_DAYS) {

            totalWorkingDays++;

            int empType = random.nextInt(3); // 0,1,2
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

            totalEmpHours += empHours;
        }

        return totalEmpHours * WAGE_PER_HOUR;
    }
    public static void main(String []args){
        //UC 1  
        System.out.println("Welcom To Employee Wage Computation");

        //UC 2
        int is_present=1;
        Random random =new Random();
        int attendence=random.nextInt(2);
        if(attendence==is_present){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }

        //UC 3
        // int wage_per_hour=20;
        int full_day_hour=8;
        if(attendence==is_present){
            int daily_wage=wage_per_hour*full_day_hour;
            System.out.println("daily wage "+daily_wage);
        }else{
            System.out.println("employee is absent");
            System.out.println("wage is =0");
        }

        //UC 4

        // int is_part_time=1;
        // int is_full_time=2;
        int empHours=0;

        int empType=random.nextInt();

        switch(empType){
            case is_part_time:
                empHours=4;
                System.out.println("part time employee");
                break;
            case is_full_time:
                empHours=8;
                System.out.println("full time employee");
                break;    
            default:
                empHours=0;
                System.out.println("employee absent");    
        }

        int dailyWage=empHours*wage_per_hour;
        System.out.println("daily wage is "+ dailyWage);

        //UC 5
        int monthlyWage=0;
        int working_Days=sc.nextInt();

        for(int day=1;day<=working_Days;day++){
          empType=random.nextInt();
          switch(empType){
            case is_part_time:
                empHours=4;
                System.out.println("part time employee");
                break;
            case is_full_time:
                empHours=8;
                System.out.println("full time employee");
                break;    
            default:
                empHours=0;
                System.out.println("employee absent");    
         }
            daily_wage=empHours*wage_per_hour;
            monthlyWage+=daily_wage;
        }
        System.out.println("monthly wage ="+monthlyWage);

        int totalWage=computeEmployeeWage();

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalEmpHours);
        System.out.println("Total Monthly Wage: " + totalWage)
    }
}