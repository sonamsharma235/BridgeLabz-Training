import java.util.*;

public class CalculateBMI{
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     double weight = sc.nextDouble();
     double height = sc.nextDouble();

     // Calculate BMI
     double bmi = weight / (height * height);
     System.out.println("Your BMI is: " + bmi);
     if (bmi < 18.5) {
        System.out.println("Category: Underweight");
     } else if (bmi >= 18.5 && bmi < 25) {
        System.out.println("Category: Normal");
     } else {
        System.out.println("Category: Overweight");
        }
    }
}
