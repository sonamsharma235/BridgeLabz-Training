import java.util.*;
public class TotalSumWhile
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in);
	   int number=sc.nextInt();
	   int sum=0;
	  
	   if(number>0){
	   int formula= number*(number+1)/2;
	  for(int i=1;i<=number;i++){
	      sum+=i;
	  }
	   if(formula==sum){
	       System.out.println(sum);
	   }
	}
}
} // code 13