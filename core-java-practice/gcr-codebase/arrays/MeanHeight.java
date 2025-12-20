import java.util.*;
public class MeanHeight{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int array[]=new int[11];
        int sum=0;

        for(int i=10;i<10;i++){
           array[i]=sc.nextInt();
           sum+=array[i];
        }
       int meanHeight=sum/11;
       System.out.println(meanHeight);
    }
}