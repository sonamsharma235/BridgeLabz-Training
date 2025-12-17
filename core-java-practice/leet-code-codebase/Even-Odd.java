import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n % 2 == 0)// check whether number is divisible by 2 or not
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
