import java.util.Scanner;
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
          int[] frequency = new int[256]; 

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            frequency[ch]++;
        }

        char mostFrequent = s.charAt(0);
        int maxCount = frequency[mostFrequent];

        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (frequency[ch] > maxCount) {
                maxCount = frequency[ch];
                mostFrequent = ch;
            }
        }
        return mostFrequent;
    }
    
}