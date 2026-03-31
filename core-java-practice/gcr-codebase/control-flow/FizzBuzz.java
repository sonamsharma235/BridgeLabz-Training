import java.util.*;
public class FizzBuzz{
public static void main(String[]agrs){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number>0){
        for(int i=1;i<=number;i++){
            if(i%3==0&& i%5==0){
                System.out.println("FizzBuzz");
            }else if(i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println("Buzz");
            }
        }
    }
  }
}