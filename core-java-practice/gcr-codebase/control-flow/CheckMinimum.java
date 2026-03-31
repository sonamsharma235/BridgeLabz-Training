import java.util.*;
public class CheckMinimum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        int number3=sc.nextInt();
        boolean b=false;
        if(number1<number2 && number1<number3){
           b=true;
        }
        Systemout.println(" Is the first number the smallest?"+b);
    }
}