import java.util.*;
public class SumOfArray{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double array[]=new double[10];
        double sum=0;
        double num=sc.nextDouble();
        int i=0;
        while(!(num==0 || num<0)){
              array[i]=nuum;
              i++;
              sum+=num;
              num=sc.nextDouble();
        }
        System.out.println(sum);
    }
}
