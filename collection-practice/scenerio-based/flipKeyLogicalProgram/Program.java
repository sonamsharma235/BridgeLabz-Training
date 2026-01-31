import java.util.Scanner;

public class Program {

    public static String CleanseAndInvert(String input) {

        // 1) Null check and length < 6
        if (input == null || input.length() < 6) {
            return "";
        }

        // 2) Must contain only alphabets (no space, digit, special char)
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                return "";
            }
        }
        input = input.toLowerCase();

        // 3) Remove characters with EVEN ASCII values
        String temp = "";
        for (char c : input.toCharArray()) {
            if ((int) c % 2 != 0) {      
                temp += c;
            }
        }

        // 4) Reverse the remaining string
        String reversed = new StringBuilder(temp).reverse().toString();

        // 5) Convert even index characters to uppercase
        char[] arr = reversed.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {           
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the word");
        String input = sc.nextLine();

        String result = CleanseAndInvert(input);

        if (result.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + result);
        }

        sc.close();
    }
}
