import java.util.*;
public class GcdAndLcm{
    public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        int number1=sc.nextInt();
        int number2=sc.nextInt();
        gcd(number1,number2);
        lcm(number1,number2);
    }
    public static void gcd(int number1,int number2){
        if(number1>number2){
            for(int i=number1;i>=1;i--){
            if(number1%i==0 && number2%i==0){
                System.out.println("GCD is"+i);
                break;
            }
           }
        }else{
        for(int i=number1;i>=1;i--){
            if(number1%i==0 && number2%i==0){
                System.out.println("GCD is"+i);
                break;
            }
        }
       } 
    }
    public static void lcm(int number1,int number2){
            for(int i=2;i<=number1;i++){
             if(number1%i==0 && number2%i==0){
                System.out.println("LCM is"+i);
                break;
            }
           }
    }
}