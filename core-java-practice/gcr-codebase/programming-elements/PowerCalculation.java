import java.util.*;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();

        double result = Math.pow(base, exp);
        System.out.println("Result: " + result);
    }
}
