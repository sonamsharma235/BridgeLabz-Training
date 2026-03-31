import java.util.*;
public class CalculateTemperature {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        int windSpeed=sc.nextInt();
        calculateWindChill(temp,windSpeed);

    }
    public double calculateWindChill(double temperature, double windSpeed){
        double windChill=35.74+0.6215*temperature+(0.425*temo-35.75)*(Math.pow(windSpeed,0.16));
        System.out.println(windChill);
    }

}