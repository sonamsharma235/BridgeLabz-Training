import java.util.*;
public class NaturalSum
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in);
	    double total=sc.nextDouble();
	    double num=sc.nextDouble();
	    while(num !=0.0 && num>0.0){
	        total+=num;
	        double x=sc.nextDouble();
	        num=x;
	        if(num<=0) break;
	    }
	    System.out.println(total);
	}
}
 // code 11