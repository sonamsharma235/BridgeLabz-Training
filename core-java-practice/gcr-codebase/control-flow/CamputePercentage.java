import java.util.*;
public class CamputePercentage{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int physics=sc.nextInt();
        int chemistry=sc.nextInt();
        int maths=sc.nextInt();
        int percentage=((physics+chemistry+maths)/300)*100;
        if(percentage>=80){
          System.out.println("level 4");
        }else if(percentage>=70 && percentage<=79){
            System.out.println("level 3");
        }else if(percentage>=60 && percentage<=69){
            System.out.println("level 2");
        }else if(percentage>=50 && percentage<=59){
            System.out.println("level 1");
        }else{
            System.out.println("Remedial standards");
        }
        
    }
}