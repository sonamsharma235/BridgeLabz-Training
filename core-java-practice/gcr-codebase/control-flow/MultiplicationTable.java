import java.util.*;
public class MultiplicationTable{
public static void main(String[]agrs){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number>=6 && number<=9){
      for(int i=1;i<=10;i++){
        System.out.println(number+"*"+i+"="+number*i);
      }
    }
  }
}