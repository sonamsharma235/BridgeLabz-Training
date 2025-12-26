import java.util.Scanner;
public class ChocolateDivide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int chocolates=sc.nextInt();
        int students=sc.nextInt();
        findRemainderAndQuotient(chocolates,students);
    }
    public static void findRemainderAndQuotient(int number, int divisor){
      int remaining=number%divisor;
      int eachStudents=number/divisor;
      System.out.println(remaining);
      System.out.println(eachStudents);
    }
}