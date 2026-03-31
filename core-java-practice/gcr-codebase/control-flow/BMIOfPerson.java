import java.util.*;
public class BMIOfPerson{
public static void main(String[]agrs){
    Scanner sc=new Scanner(System.in);
    double weight=sc.nextDouble();
    double height=sc.nextDouble();
    double heightCm=height/100;
    double BMI=weight/(heightCm*heightCm);

    if(BMI>=40){
        System.out.println("obese");
    }else if(BMI>25 && BMI<39.9){
        System.out.println("overweight");
    }else if(BMI>18.5 && BMI<24.9){
        System.out.println("normal");
    }else{
        System.out.println("underweight");
    }
  }
}