import java.util.*;
public class SumOfNumbers
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in);
	    double total=sc.nextDouble();
	    double num=sc.nextDouble();
	    while(num!=0.0){
	        total+=num;
	        double x=sc.nextDouble();
	        num=x;
	    }
	    System.out.println(total);
	}
} 