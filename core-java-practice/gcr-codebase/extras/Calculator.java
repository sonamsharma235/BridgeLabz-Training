import java.util.*;

public class Calculator {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      float a=sc.nextFloat();
      float b=sc.nextFloat();
      add(a,b);
      sub(a,b);
      multiply(a,b);
      divide(a,b);
    }

    public static void add(int a ,int b){
        System.out.println(a+b);
    }
    public static void sub(int a ,int b){
        System.out.println(a-b);
    }
    public static void multiply(int a ,int b){
        System.out.println(a*b);
    }
    public static void divide(int a ,int b){
        System.out.println(a/b);
    }
}
