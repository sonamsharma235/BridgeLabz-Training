import java.util.*;
public class AbundantNumber{
public static void main(String[]agrs){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int sum=0;
    int numberCopy=number;
   for(int i=1;i<number;i++){
      if(number%i==0){
        sum+=i;
      }
   }
   if(sum>number){
    System.out.println("Is Abundant Number");
   }else{
    System.out.println("Not Abundant")
   }
  }
}