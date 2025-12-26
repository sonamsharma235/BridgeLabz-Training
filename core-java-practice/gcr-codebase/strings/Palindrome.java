import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean flag=true;
        for(int i=0;i<=s.length()/2;i++){
          if(s.charAt(i)!=s.charAt(s.length()-1-i)){
            flag =false;
            break;
          }
        }
        if(flag){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    
}