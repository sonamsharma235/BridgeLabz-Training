import java.util.*;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int GCD = 1;
        
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                GCD = i;
                break;
            }
        }
        System.out.println("Greatest factor: " + GCD);
        
    }
}
