import java.util.*;
public class DiscountFee{
    public static void main(String[]agrs){
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discountPercent=sc.nextInt();
        double discount=fee*0.1;
        double actualFee=fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+ actualFee);
    }
}