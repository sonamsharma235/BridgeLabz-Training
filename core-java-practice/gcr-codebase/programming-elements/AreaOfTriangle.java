import java.util.*;
public class AreaOfTriangle{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int base=sc.nextInt();
        int height=sc.nextInt();
        int area=(1/2)*base*height;
        int areaInches=(1/2)*(base*0.394*0.394*height);
        int areaFeet=(1/2)*(0.032*0.032*base*height);
        System.out.println("area in cm "+area +" area in inchees "+areaInches+"area in feet "+areaFeet);
    }
}