import java.util.Scanner;
public class FindVowelConsonent {
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(findVowelConsonent(s));
    }
    public static void findVowelConsonent(String s){
        int []count=new int[2];
        String ans=s.toUpperCase();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='O'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='U'){
                count[0]=count[0]++;
            }else{
                count[1]=count[1]++;
            }
        }
    }
}