import java.util.*;
public class FindFactors{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int number=sc.nextInt();
  int factor=1;
  if(number>0){
    while(number!=0){
      factor*=number;
      number--;
    }
    System.out.println(factor);
  }
 }
}
