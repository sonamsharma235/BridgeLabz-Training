import java.util.*;
public class main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int pi=3.14;
        int r=sc.nextInt();
        r=Math.pow(r,2);
        int area=pi*r;// formula of area;
        System.out.println(area);
    }
}