import java.util.Scanner;
public class FindRoots {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        findoots(a,b,c);
    }
    public static void FindRoots(int a,int b,int c){
        int delta=(int)(Math.pow(b,2))+4*a*c;
        int root1=0;
        int root2=0;
        if(delta>0){
           root1=(-b+(int)Math.sqrt(delta))/(2*a);
           root2=(-b-(int)Math.sqrt(delta))/(2*a);
        }else if(delta==0){
            root1=-b/(2*a);
        }
        System.out.println("x"+root1+"y"+root2);
    }
}