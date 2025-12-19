import java.util.*;
public class TotalSum
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in);
	   int number=sc.nextInt();
	   int sum=0;
	   int i=1;
	   if(number>0){
	   int formula= number*(number+1)/2;
	   while(i<=number){
	       sum+=i;
	       i++;
	   }
	   if(formula==sum){
	       System.out.println(sum);
	   }
	}
}
} // code 12