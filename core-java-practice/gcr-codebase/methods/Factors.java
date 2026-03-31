import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        findFactors(n);
    }
    public static void findFactors(int n){
       int array[]=new int[n];
       int sum=0;
       int squareSum=0;
       int product=1;
       for(int i=1;i<n;i++){
        if(n%i==0){
            array[i]=i;
            sum+=i;
            squareSum+=(int)(Math.pow(i,2));
            product*=i;
        }
       }
       System.out.println("total"+sum);
       System.out.println("squareSum of Factors"+squareSum);
       System.out.println("product of factors"+product);
    }
    
}