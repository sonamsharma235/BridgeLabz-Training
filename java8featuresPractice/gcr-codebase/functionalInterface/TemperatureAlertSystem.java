package FunctionalInterface;

import java.util.function.Predicate;
public class TemperatureAlertSystem {
   public static void main(String[]args) {
	   double threshold=37;
	   
	   Predicate<Double> isHighTemp= temp->temp>threshold;
	   
	   double currTemp=38.3;
	   
	   if(isHighTemp.test(currTemp)) {
		   System.out.print("Alert!, Temperature is too high:");
	   }else {
		   System.out.print(" Temperature is normal:");
	   }
   }
}
