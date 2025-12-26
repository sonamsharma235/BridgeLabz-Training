import java.util.Scanner;
public  class TraingularPark {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int total =a+b+c;
        int cover=5000;
        int rounds=cover/total;
        System.out.println(rounds);
    }
}