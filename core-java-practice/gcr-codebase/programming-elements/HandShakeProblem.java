import java.util.*;
public class HandShakeProblem{
    public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();
     int combination=(number*(number-1))/2;
     System.out.println(combination);
    }
}