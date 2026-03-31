package LinearBinarySearch;

import java.util.*;
public class ReverseString {
    public static void main(String[]args) {
    	String str="hello";
    	StringBuilder s=new StringBuilder();
    	
    	s.append(str);
    	s.reverse();
    	String reversed=s.toString();
    	System.out.println(reversed);
    	
    }
}
