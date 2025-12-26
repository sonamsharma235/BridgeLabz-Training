import java.util.Scanner;
public class QuotientReminderOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int divisor=sc.nextInt();
        findRemainderAndQuotient(number,divisor);
    }
    public static void findRemainderAndQuotient(int number, int divisor){
        System.out.println(number/divisor);
        System.out.println(number%divisor);
    }
}