import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting{
    public static void main(String[]args){
        LocalDate today=LocalDate.now();

        DateTimeFormatter f1=DateTimeFormatter.ofPattern("dd/mm/yyyy");
         DateTimeFormatter f2=DateTimeFormatter.ofPattern("yyyy-mm-dd");
          DateTimeFormatter f3=DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println(today.format(f1)); 
        System.out.println(today.format(f2)); 
        System.out.println(today.format(f3));  
    }
}