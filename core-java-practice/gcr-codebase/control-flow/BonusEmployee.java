import java.util.*;
public class BonusEmployee{
public static void main(String[]agrs){
    Scanner sc=new Scanner(System.in);
    int salary=sc.nextInt();
    int year=sc.nextInt();
    double  bonus=0;
    if(year>5){
        bonus=salary*0.05;
    }
    System.out.println(bonus);
  }
}