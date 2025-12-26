import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        checkNumber(n);
    }
    public static void checkNumber(int n){
        if(n>0){
            System.out.println("positive");
        }else if(n<0){
            System.out.println("negative");
        }else{
            System.out.println("zero");
        }
    }
    
}