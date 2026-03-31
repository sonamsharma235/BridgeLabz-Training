import java.util.Scanner;
public class VoteEligibility {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);\
        int number=sc.nextInt();
        int []arr=new int[number];
        for(int i=0;i<number;i++){
            arr[i]=sc.nextInt();
        }
        String result[][]=new String[number][number];
        for(int i=0;i<nmber;i++){
            if(arr[i]>=18){
                result[i][0]+=arr[i];
                result[i][1]="yes";
            }else if(arr[i]<18){
                result[i][0]+=arr[i];
                result[i][1]="No";
            }else{
                result[i][0]+=arr[i];
                result[i][1]="Not valid Age";
            }
        }
    }
}