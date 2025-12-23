import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 200; 
        while (balance > 0) {
            System.out.println("\nCurrent Balance: ₹" + balance);
            System.out.print("Enter distance in km (0 to exit): ");
            int distance = sc.nextInt();

            if (distance == 0) {
                break;
            }

            double fare = (distance <= 5) ? 20 :
                          (distance <= 10) ? 30 :
                          (distance <= 20) ? 40 : 50;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare deducted: ₹" + fare);
            } else {
                System.out.println("Insufficient balance");
                break;
            }
        }
        System.out.println("Remaining Balance: ₹" + balance);
    }
}
