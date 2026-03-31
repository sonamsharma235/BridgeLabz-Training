import java.util.Scanner;
public class AnagramString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        STring s1=sc.netLine();
        int []fre=new int[26];
        for(int i=0;i<s.length();i++){
          for(int j=i;j<s.elngth();j++){
            if(s.charAt(i)==s.charAt(j)){
                fre[s.charAt(i)-'0']++;
            }
          }
        }
        int fre2[]=new int[26];
        for(int i=0;i<s.length();i++){
          for(int j=i;j<s.elngth();j++){
            if(s.charAt(i)==s.charAt(j)){
                fre2[s.charAt(i)-'0']++;
            }
          }
        }
        System.out.println();
    }
}