import java.util.*;
public class TemperatureConvertor{
    public static void main(String []agrs){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        fahrenheitToCelsius(number);
    }  
    public static void fahrenheitToCelsius(int fahrenheit){
         double celsius = (fahrenheit -32)*(5/9);
        System.out.println("Temperature in Fahrenheit: " + celsius);
    }
    public static void CelsiusTofahrenheit(int celsius){
         double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }
}