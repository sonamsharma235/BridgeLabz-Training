package LinearBinarySearch;

public class ConcateString {
    public static void main(String[]args) {
    	String str[]= {"hello","sonam","how","are","you"};
    	StringBuffer sb=new StringBuffer();
    	for(String s:str) {
    		sb.append(s);
    	}
    	String ans=sb.toString();
    	System.out.print(ans);
    }
}
