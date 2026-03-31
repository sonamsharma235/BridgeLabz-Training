import java.util.Scanner;
public class StringOutOfBound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        exception(s);
    }
    public static void exception(String s){
        try{
            System.out.println(s.charAt(s.length()));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }
    public static void generate(String s){
        System.out.println(s.charAt(s.length()));
    }
    
}