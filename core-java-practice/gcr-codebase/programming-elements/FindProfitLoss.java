public class FindProfitLoss{
    public static void main(String[]agrs){
       int cost=129;
       int sell=191;
       int profit=sell-cost;
       int profitPercent=profit/(cost*100);
       System.out.println("The cost price is INR "+cost+" Selling price is INR "+sell);
       System.out.println("The Profit is INR "+profit+" the profit percent is "+profitPercent);
    }
}