import java.util.*;
public class FizzBuzz{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        String array[]=new String[number];

        for(int i=0;i<number;i++){
            if(i%3==0 && i%5==0){
                array[i]="FizzBuzz";
            }else if(i%3==0){
                array[i]="Fizz";
            }else{
                array[i]="Buzz";
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
