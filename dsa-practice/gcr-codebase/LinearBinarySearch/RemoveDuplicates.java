package LinearBinarySearch;

import java.util.*;
public class RemoveDuplicates {
    public static void main(String[]args) {
    	String s="hhellooo";
    	StringBuilder sb=new StringBuilder();
    	HashSet<Character>set=new HashSet();
    	for(Character c:s.toCharArray()) {
    		if(!set.contains(c)) {
    			sb.append(c);
    			set.add(c);
    		}
    	}
    	String ans=sb.toString();
    	System.out.println(ans);
    }
}
