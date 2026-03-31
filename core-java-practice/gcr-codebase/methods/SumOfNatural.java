import java.util.Scanner;
public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sumNumber(n);
    }
    public static ovid sumNumber(int n){
        int sum=0;
        for(int i=1;i<n;i++){
           sum+=i;
        }
        System.out.println(sum);
    }
    
}