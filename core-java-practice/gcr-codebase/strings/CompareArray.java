import java.util.Scanner;
public class CompareArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);\
        String s=sc.next();

        char []manual=character(s);
        char []built=s.toCharArray();
        System.out.println(compare(manual,built));
    }
    public static char[] character(String s){
        char []array=new char[s.length()];
        for(int i=0;i<s.length();i++){
            array[i]=s.charAt(i);

        }
        return array;
    }
    public static boolena compare(char []a,char []b){
        if(a.length!=b.length)return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i])return false;
        }
        return true;
    }
}