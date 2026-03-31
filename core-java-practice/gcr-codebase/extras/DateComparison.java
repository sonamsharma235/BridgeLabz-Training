import java.util.Scanner;
import java.time.LocalDate;
public class DateComparison{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LocalDate date1=LocalDate.parse(scnext());

        LocalDate date2=LocalDate.parse(scnext());

        if(date1.isBefore(date2)){
            System.out.println("first date is before second");
        }else if(date1.isAfter(date2)){
            System.out.println("first date is after second");
        }else if(date1.isEqual(date2)){
            System.out.println("first date is equal second");
        }
    }
}