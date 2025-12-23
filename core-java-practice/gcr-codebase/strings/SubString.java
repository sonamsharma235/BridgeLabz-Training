import java.util.Scanner;
public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();

        int start=sc.nextInt();
        int end=sc.nextInt();
        String manual=substringChartAt(text,start,end);
        Sring builtIn=text.substring(start,end);

        System.out.println(manual);
        System.out.println(builtIn);
        System.out.println(compare(manual,builtIn));

    }
    public static String substringChartAt(String text,int start,int end){
        String ans="";
        for(int i=start;i<end;i++){
            ans=ans+text.charAt(i);
        }
        return ans;
    }
    public static compare(String a,String b){
        if(a.length()!=b.length())return false;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)!=b.charAt(i))return false;
        }
        return true;
    }
    
}