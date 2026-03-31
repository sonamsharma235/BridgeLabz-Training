import java.util.*;

public class KeyGenerator {

    static String generateKey(String s) {
        StringBuilder filtered = new StringBuilder();

        for (char c : s.toCharArray()) {
            if ((int)c % 2 != 0) {
                filtered.append(c);
            }
        }

        filtered.reverse();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < filtered.length(); i++) {
            char c = filtered.charAt(i);
            if (i % 2 == 0)
                result.append(Character.toUpperCase(c));
            else
                result.append(Character.toLowerCase(c));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String s = sc.nextLine();

            if (s.isEmpty()) {
                System.out.println("Invalid Input (empty string)");
            } else if (s.length() < 6) {
                System.out.println("Invalid Input (length < 6)");
            } else if (s.contains(" ")) {
                System.out.println("Invalid Input (contains space)");
            } else if (s.matches(".*\\d.*")) {
                System.out.println("Invalid Input (contains digits)");
            } else if (!s.matches("[a-zA-Z]+")) {
                System.out.println("Invalid Input (contains special character)");
            } else {
                System.out.println("The generated key is - " + generateKey(s.toLowerCase()));
            }
        }
    }
}
