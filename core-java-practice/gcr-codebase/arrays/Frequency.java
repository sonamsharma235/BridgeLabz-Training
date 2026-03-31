import java.util.Scanner;

class Frequency {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp = temp / 10;
        }
        int[] digits = new int[digitCount];
        temp = number;
        int index = 0;
        while (temp != 0) {
            digits[index] = temp % 10;
            index++;
            temp = temp / 10;
        }
        int[] frequency = new int[10];

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " time(s)");
            }
        }

    }
}
