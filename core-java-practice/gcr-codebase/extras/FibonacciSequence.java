import java.util.*;
public class FibonacciSequence{
    public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        fibonacciGenerator(number);
    }
    public static void fibonacciGenerator(int number){
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(b);
        while(number-->0){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c);
        }
    }
}