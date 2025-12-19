import java.util.*;
public class DayOfWeek {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int number=sc.nextInt();
     for(int i=1;i<=number;i++){
        if(i%2==0){
            System.out.prinltn("number"+i+"is even");
        }else{
            System.out.prinltn("number"+i+"is odd");
        }
     }
    }
}
