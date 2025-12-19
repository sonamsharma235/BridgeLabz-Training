import java.util.*;
public class FindFactorsUsingWhile{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    int factor=1;
    if(number>0){
      for(int i=number;i>=1;i--){
        factor*=i;
      }
      System.out.println(factor);
    }
 }
}
