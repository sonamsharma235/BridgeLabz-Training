
import java.util.*;
public class HarshadNumber{
public static void main(String[]agrs){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int numberCopy=number;
    int sum=0;
    while(number>0){
        sum+=(number%10);
        number/=10;
    }
    if(numberCopy%sum==0){
        System.out.println("HAarshadNumber");
    }else{
        System.out.println("Not Harshad");
    }
  }
}