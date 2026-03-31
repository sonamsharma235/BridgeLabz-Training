import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
         String result = "";

    for (int i = 0; i < s.length(); i++) {
        char currentChar = s.charAt(i);

        if (result.indexOf(currentChar) == -1) {
            result += currentChar;
        }
    }
    System.out.println(result);
    }
    
}