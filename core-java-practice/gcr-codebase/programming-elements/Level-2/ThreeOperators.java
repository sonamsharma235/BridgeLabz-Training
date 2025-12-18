import java.util.*;
public class ThreeOperator{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int a1=a+b*c;
        int a2=a*b+c;
        int a3=c+a/b;
        int a4=a%b+c;
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}