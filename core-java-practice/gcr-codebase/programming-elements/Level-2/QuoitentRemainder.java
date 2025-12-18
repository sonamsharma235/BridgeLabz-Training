import java.util.*;
public class QuoitentRemainder{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int r=a%b;
        int q=a/b;
        System.out.println("remainder"+r+"quoitent"+q);
    }
}