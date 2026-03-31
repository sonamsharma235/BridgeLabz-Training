import java.util.Scanner;
public class NumberFormatxception {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        handle(s);
    }
    public static void handle(String s) {
        try{
            int n=Integer.parseInt();
            System.out.println(n);;
        }catch(NumberFormatxception e){
             System.out.println("NumberFormatxception handle");
        }catch(RuntimeException e){
             System.out.println("RuntimeException handle");
        }
    }
    public static void generateException(String text) {
        int num = Integer.parseInt(text);
        System.out.println(num);
    }

    
}