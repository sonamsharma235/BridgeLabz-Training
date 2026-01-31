import java.util.Scanner;
import java.util.LinkedHashSet;

public class LexicalTwist {
    static boolean isValidWord(String s) {
        return !s.contains(" ");
    }

    // Check reversed version 
    static boolean isReversed(String first, String second) {
        String rev = new StringBuilder(first).reverse().toString();
        return rev.equalsIgnoreCase(second);
    }

    // Replace vowels with @
    static String replaceVowels(String s) {
        return s.replaceAll("[aeiou]", "@");
    }

    // Count vowels
    static int countVowels(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if ("AEIOU".indexOf(c) != -1)
                count++;
        }
        return count;
    }

    // Get first two unique vowels
    static String firstTwoVowels(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            if ("AEIOU".indexOf(c) != -1)
                set.add(c);
        }

        String res = "";
        for (char c : set) {
            res += c;
            if (res.length() == 2)
                break;
        }
        return res;
    }

    // Get first two unique consonants
    static String firstTwoConsonants(String s) {
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char c : s.toCharArray()) {
            if ("AEIOU".indexOf(c) == -1 && Character.isLetter(c))
                set.add(c);
        }

        String res = "";
        for (char c : set) {
            res += c;
            if (res.length() == 2)
                break;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first word");
        String first = sc.nextLine();

        if (!isValidWord(first)) {
            System.out.println(first + " is an invalid word");
            return;
        }

        System.out.println("Enter the second word");
        String second = sc.nextLine();

        if (!isValidWord(second)) {
            System.out.println(second + " is an invalid word");
            return;
        }

        // CASE 1 → second is reversed version
        if (isReversed(first, second)) {

            String rev = new StringBuilder(first).reverse().toString();
            rev = rev.toLowerCase();
            rev = replaceVowels(rev);

            System.out.println(rev);
        }

        // CASE 2 → not reversed
        else {

            String combined = (first + second).toUpperCase();

            int vowels = countVowels(combined);
            int consonants = combined.length() - vowels;

            if (vowels > consonants) {
                System.out.println(firstTwoVowels(combined));
            }
            else if (consonants > vowels) {
                System.out.println(firstTwoConsonants(combined));
            }
            else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}
