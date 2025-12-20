import java.util.*;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String coffeeType = sc.nextLine();
            if (coffeeType.equalsIgnoreCase("exit")) {
                System.out.println("Thank you! Cafe closed.");
                break;
            }
          
            int quantity = sc.nextInt();
            sc.nextLine(); 

            double price = 0;
            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 100;
                    break;
                case "latte":
                    price = 120;
                    break;
                case "cappuccino":
                    price = 150;
                    break;
                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }
            double totalAmount = price * quantity;
            double gst = totalAmount * 0.05; 
            double finalBill = totalAmount + gst;

            System.out.println("Total Amount: " + totalAmount);
            System.out.println("GST (5%): " + gst);
            System.out.println("Final Bill: " + finalBill);
        }
    }
}
