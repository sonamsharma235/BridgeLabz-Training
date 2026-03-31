import java.util.*;

class ReverseNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int temp = number, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];
        int[] reverse = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
    }
}
