public class EqualCompare {
     public static void main(String[]args) {
         Compare s=new Compare("sonam"); 
         Compare s1=new Compare("sonam");
         Compare s2=s1;
         System.out.println(s==s1);
         System.out.println(s1==s2); 
         System.out.println(s1.equals(s2)); 
         System.out.println(s.equals(s1)); 
        } 
    }