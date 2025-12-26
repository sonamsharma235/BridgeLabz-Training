import java.util.Scanner;

public class BusRouteTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDistance = 0;
        while (true) {
            int distance = sc.nextInt();

            if (distance <= 0) {
                System.out.println("Invalid distance. Try again.");
                continue;
            }

            totalDistance += distance;
            System.out.println("Total distance covered: " + totalDistance + " km");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("Final distance travelled: " + totalDistance + " km");
        sc.close();
    }
}
