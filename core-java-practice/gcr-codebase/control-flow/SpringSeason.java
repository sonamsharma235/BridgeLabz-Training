import java.util.*;
public class SpringSeason
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner (System.in);
	    String month=sc.next();
	    int day= sc.nextInt();
	    boolean isSpring=false;
	    if(month.equals("March") && day >= 20 && day <= 31){
	       isSpring=true;
	    }
	    if(month.equals("April") && day>=1 && day<=30){
	        isSpring=true;
	    }
	    if(month.equals("May")&& day >= 1 && day <= 31){
	        isSpring =true;
	    }
	    if(month.equals("June")&& day >= 1 && day <= 20){
	        isSpring=true;
	    }
	    if(isSpring){
	        System.out.println("Yes it is a Spring season");
	    }
	    else{
	         System.out.println("Not it is not a Spring season");
	    }
	}
} 