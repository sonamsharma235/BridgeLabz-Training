import java.util.Scanner;

public class LargestOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b)// check condition
            System.out.println(a + " is larger");
        else
            System.out.println(b + " is larger");
    }
}
