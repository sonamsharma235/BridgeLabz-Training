import java.util.*;
public class MultiplicationTable{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int array[]=new int[10];

        for(int i=1;i<=10;i++){
           array[i]=i*number;
        }
        for(int i=0;i<array.length;i++){
            System.out.println(number+" * "+(i+1)+" = "array[i]);
        }
    }
}