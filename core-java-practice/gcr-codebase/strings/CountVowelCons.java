import java.util.Scanner;
public class CountVowelCons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String upperCase=s.toUpperCase();
        int length=s.length();
        int arr[][]=new int[length/2][2];
        int a=0;
        int b=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='O'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='U'){
                arr[a][0]=s.charAt(i);
                a++;
            }else if(s.charAt(i)>=65 && s.charAt(i)<=90){
                arr[b][1]=s.charAt(i);
                b++;
            }else{
                System.out.println("not valid letter");
            }
        }
    }
    
}