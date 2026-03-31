import java.util.Scanner;
public class TrimString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] indexes = findTrimIndexes(text);
        String manualTrim = substringUsingCharAt(text, indexes[0], indexes[1]);

        String builtInTrim = text.trim();
        System.out.println( manualTrim);
        System.out.println(builtInTrim);

        System.out.println(compareStrings(manualTrim, builtInTrim));
    }
    public static int[] findTrimIndexes(String text) {
        int start = 0;
        int end = 0;
        for (int i = 0; ; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }
        for (int i = text.length() - 1; ; i--) {
            if (text.charAt(i) != ' ') {
                end = i;
                break;
            }
        }
         return new int[]{start, end};
    }
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
  public static boolean compareStrings(String a, String b) {

        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }

        return true;
    }
}