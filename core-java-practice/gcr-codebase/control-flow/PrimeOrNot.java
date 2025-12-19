import java.util.*;
public class PrimeOrNot{
    Public static void main(String []args){
      Scanner sc=new Scanner(System.in);
      int number=sc.nextInt();
      boolean b=true;
      for(int i=2;i<number;i++){
        if(number%i==0){
            b=false;
            break;
        }
      }
      if(b){
        System.out.println("prime");
      }else{
        System.out.println("not prime");
      }
    }
}