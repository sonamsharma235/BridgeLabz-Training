import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String sub=sc.next();
        
        int count = 0;
        int index = 0;

        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index = index + sub.length();
        }
       System.out.println(count);
    }
    
}