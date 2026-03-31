import java.util.*;
public class LibraryReminderApp{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=5;i++){
           System.out.println("book "+i);
           int deuDate=sc.nextInt();
           int returnDate=sc.nextInt();
           
           if(returnDate>deuDate){
            int lateDays=returnDate-deuDate;
            int fine=lateDays*5;
            System.out.println("late by "+ lateDays+"days, so fine "+fine);
           }else{
            System.out.println("returned on time no fine");
           }
        }
    }
}