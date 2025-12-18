import java.util.*;
public class CalculatePrice{
    public static void main(String[]args){
   Scanner sc=new Scanner(System.in);
   int unitPrice=sc.nextInt();
   int quantity=sc.nextInt();
   int totalPrice=unitPrice*quantity;
   System.out.println(totalPrice);
    }
}