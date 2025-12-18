public class FeeDiscount{
    public static void main(String[]agrs){
        int fee=125000;
        int discountPercent=10;
        double discount=fee*0.1;
        double actualFee=fee-discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+ actualFee);
    }
}