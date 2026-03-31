import java.util.*;
public class ArmstrongNumber{
public static void main(String[]agrs){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int sum=0;
    int numberCopy=number;
    while(number>0){
       sum+=(Math.pow(number%10,3));
       number/=10;
    }
    if(sum==numberCopy){
        System.out.println("is Armstrong");
    }else{
        System.out.println("Not Armstrong");
    }
  }
}