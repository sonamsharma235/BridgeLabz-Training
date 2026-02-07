package FunctionalInterface;

import java.util.function.*;
public class StringLengthChecker {
   public static void main(String[]args) {
	   
	   String s="hello how are you what are you doing";
	   
	   Function<String,Integer>isExceed=str->str.length();
	   
	   if(isExceed.apply(s)>15) {
		   System.out.println("character limit eceed");
	   }else {
		   System.out.println("characters are okay");
	   }
   }
}
