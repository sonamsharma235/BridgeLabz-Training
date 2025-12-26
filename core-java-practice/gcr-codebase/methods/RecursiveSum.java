import java.util.Scanner;
public class RecursiveSum {
    static int sum=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int total=sumNumber(n);
        int formula=(n*(n+1))/2;
        System.out.println(formula);
        System.out.println(total);

    }
    public static int sumNumber(int n){
        if(n==0)return n;
        sum+=n;
        sumNumber(n-1);
        return sum;
    }
}