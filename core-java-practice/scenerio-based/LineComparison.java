import java.util.*;
public class LineComparison {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //UC 1
        System.out.println("Welcom To Line Comparison Computation Program");

        //UC 2
        System.out.println("enter coordinates");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int x2=sc.nextInt();
        int y2=sc.nextInt();

        double lengthOfLine= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length of Line is "+lengthOfLine);

        //UC 3
        System.out.println("enter coordinates for 2nd line");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        int x4=sc.nextInt();
        int y4=sc.nextInt();

        double lengthOfLine2= Math.sqrt(Math.pow((x4-x3),2)+Math.pow((y4-y3),2));
        System.out.println("Length of Line is "+lengthOfLine2);

        if(lengthOfLine==lengthOfLine2){
            System.out.println("Length of both line is equal");
        }else{
            System.out.println("not equal");
        }

        //UC 4
        if(lengthOfLine==lengthOfLine2){
            System.out.println("Length of both line is equal");
        }else if(lengthOfLine>lengthOfLine2){
            System.out.println("first line is greater than second line");
        }else{
            System.out.println("second line is greater than first line");
        }

    }
}