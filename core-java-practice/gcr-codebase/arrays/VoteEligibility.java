import java.util.*;
public class VoteEligibility{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int array[]=new int[10];

        for(int i=0;i<array.length;i++){
            if(array[i]<0){
                System.out.println("Invalid Age");
            }else if(array[i]>=18){
                Syste.out.println("student with the age"+ array[i]+"can vote");
            }else{
                System.out.println(Syste.out.println("student with the age"+ array[i]+"can not vote");)
            }
        }
    }
}