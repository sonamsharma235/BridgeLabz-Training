import java.util.*;
public class YardConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double yard=sc.nextDouble();
        double feet=sc.nextDouble();
        double inches=sc.nextDouble();
        double meter=sc.nextDouble();
        System.out.println(convertYardToFeet(yard));
        System.out.println(convertMilesToKm(feet));
        System.out.println(convertMeterToFeet(meter));
        System.out.println(convertFeetToMeter(inches));
    }
    public static double convertYardToFeet(double yard){
      double feet=yard*3;
      System.out.println(feet);
    }
    public static double convertFeetToYard(double feet){
      double yard=feet*0.33333;
      System.out.println(yard);
    }
    public static double convertMeterToInches(double meter){
      double inches=meter*0.0254;
      System.out.println(inches);
    }
    public static double convertInchesToMeter(double inches){
       double meter=feet*0.3048;
       System.out.println(meter);
    }
}