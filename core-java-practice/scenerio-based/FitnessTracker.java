import java.util.Scanner;
public class FitnessTracker{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[7];
        int total=0;
        for(int i=0;i<7;i++){
            arr[i]=sc.nextInt();
        }
        for(int n:arr){
            if(n==0)continue;
              total+=n;
        }
        System.out.println("total "+total);
        System.out.println("avg "+total/7);

    }
}