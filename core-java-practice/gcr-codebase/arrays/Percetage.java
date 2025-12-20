import java.util.*;
public class Percentage{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int marks[][]=new int[students][3];

        for(int i=0;i<students;i++){
           for(int j=0;j<3;j++){
            marks[i][j]=sc.nextInt();
           }
        }
       for(int i=0;i<students;i++){
         int sum=0;
           for(int j=0;j<3;j++){
             sum+=marks[i][j];
              System.out.print(marks[i][j]+" ");
           }
           int percentage=(sum/300)*100;
           if(percentage>=80){
            System.out.print("Level 4");
           }else if(percentage>70 && percentage<=79){
            System.out.print("Level 3");
           }else if(percentage>60 && percentage<=69){
           System.out.println("Level 2");
           }else if(percentage>50 && percentage<=59){
           System.out.println("Level 1");
           }else if(percentage>40 && percentage<=49){
           System.out.println("Level 1");
           }else{
           System.out.println("Remedial student");
           }
          System.out.println(percentage);
        }
    }
}
