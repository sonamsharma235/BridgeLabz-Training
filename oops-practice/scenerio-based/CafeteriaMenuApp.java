import java.util.Scanner;
public class CafeteriaMenuApp {
    static void displayMenu(String[] items) {
        System.out.println("Cafeteria Menu:");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " - " + items[i]);
        }
    }
    static String getItemByIndex(String[] items, int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        } else {
            return "Invalid selection";
        }
    }
    public static void main(String[] args) {
        String[] menuItems = {
            "Idli", "Dosa", "Vada", "Pasta", "Burger",
            "Sandwich", "Pizza", "Noodles", "Coffee", "Tea"
        };
        Scanner sc = new Scanner(System.in);

        displayMenu(menuItems);
        int choice = sc.nextInt();

        String selectedItem = getItemByIndex(menuItems, choice);
        System.out.println("You selected: " + selectedItem);
    }
}
