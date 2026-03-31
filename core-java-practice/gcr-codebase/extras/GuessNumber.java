import java.util.*;
public class GuessNumber{
    public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        boolean b=true;
        while(b){
            int guess=sc.nextInt();
            if(guess>number){
                System.out.println("high");
            }else if(number>guess){
                System.out.println("low");
            }else{
                 b=false;
                System.out.println("correct");
            }
        }
    }
}