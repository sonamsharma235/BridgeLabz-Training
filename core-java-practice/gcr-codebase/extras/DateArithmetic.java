import java.util.Scanner;
import java.time.LocalDate;

public class DateArithmetic{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        LocalDate date=LocalDate.parse(sc.next());

        //add
        LocalDate updated=date.plusDays(7).plusMonths(1).plusYears(2);

        //subtract;
        updated=updated.minusWeeks(3);

        System.out.println("final date "+updated);
    }
}