import java.util.*;
public class CompareString{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    String s2=sc.next();
    
    boolean b=true;
   for(int i=0;i<s1.length();i++){
    if(s1.charAt(i)!=s2.charAt(i)){
        b=false;
        break;
    }
   }
   System.out.println(b);
 }
}