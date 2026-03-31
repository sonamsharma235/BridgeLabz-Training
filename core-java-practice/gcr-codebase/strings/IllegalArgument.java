import java.util.Scanner;
public class IllegalArgument {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.next();
    }
    public static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }
    public static void generate(String s){
        System.out.println(s.substring(5,2));
    }  
}