import java.util.*;
public class LeapYear{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year>=1582){
            if((year%4 ==0 &&(year%100!=0))||year%400==0){
                System.out.println("it is a leap year");
            }else{
            System.out.println("it is a not a leap year");
        }
        }else{
            System.out.println("it is a not a leap year");
        }
    }
}