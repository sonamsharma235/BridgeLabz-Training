import java.util.Scanner;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int number = sc.nextInt();

            if (number == 0) {
                break;
            }

            if (number < 0) {
                continue;
            }

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("Congratulations! You won a gift!");
            } else {
                System.out.println("Better luck next time!");
            }
        }

        sc.close();
    }
}
