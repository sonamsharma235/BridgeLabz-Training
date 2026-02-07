package FunctionalInterface;

public interface Conversions {
    static void KmToMiles(double n) {
    	double nn=n*0.621371;
    	System.out.println(n+" km to "+nn+" miles");
    }
    
    static void KgToLbs(double n) {
    	double nn=n*2.20462;
    	System.out.println(n+" kg to "+nn+" lbs");
    }
}
