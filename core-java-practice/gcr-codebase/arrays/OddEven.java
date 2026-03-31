import java.util.*;
public class OddEven{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int odd[]=new int[(number/2)+1];
        int o=0;
        int e=0;
        int even[]=new int[(number/2)+1];

        for(int i=0;i<number;i++){
           int n=sc.nextInt();
           if(n%2==0){
             even[e]=n;
             e++;
           }else{
             odd[o]=n;
             o++;
           }

        }
       System.out.println(Arrays.toString(even));
       System.out.println(Arrays.toString(odd));
    }
}