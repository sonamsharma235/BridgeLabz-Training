import java.util.*;
public class UnitConvertor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double km=sc.nextDouble();
        double miles=sc.nextDouble();
        double feet=sc.nextDouble();
        double meter=sc.nextDouble();
        System.out.println(convertKmToMiles(km));
        System.out.println(convertMilesToKm(miles));
        System.out.println(convertMeterToFeet(feet));
        System.out.println(convertFeetToMeter(meter));
    }
    public static double convertKmToMiles(double km){
       double miles=km*0.621371;
       System.out.println(miles);
    }
    public static double convertMilesToKm(double miles){
       double km=miles*1.60934;
       System.out.println(km);
    }
    public static double convertMeterToFeet(double km){
       double feet=meter*3.28084;
       System.out.println(feet);
    }
    public static double convertFeetToMeter(double miles){
       double meter=feet*0.3048;
       System.out.println(meter);
    }
}