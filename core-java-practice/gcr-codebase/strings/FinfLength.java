import java.util.Scanner;
public class FindLength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(findlength(s));
        System.out.println(s.length());
    }
    public static int findlength(String s){
        int count=0;

        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){}

        return count;

    }
    
}