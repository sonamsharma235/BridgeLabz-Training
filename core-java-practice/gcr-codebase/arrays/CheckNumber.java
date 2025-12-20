import java.util.*;
public class CheckNumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int array[]=new int[1];

        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                System.out.println("Zero");
            }else if(array[i]<0){
                System.out.println("Negative");
            }else if(array[i]>0){
                if(array[i]%2==0){
                   System.out.println("even");
                }else{
                    System.out.println("odd");
                }
        }
    }
}