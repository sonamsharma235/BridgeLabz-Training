import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<=s.length()/2;i++){
           System.out.println(s.charAt(s.length()-1-i));
        }
    }
    
}