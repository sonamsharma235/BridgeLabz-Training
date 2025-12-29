import java.util.*;
public class PrimeChecker{
    public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        prime(number);
    }
    public static void prime(int n){
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