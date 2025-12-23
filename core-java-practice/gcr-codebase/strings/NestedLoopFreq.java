import java.util.Scanner;
public class NestedLoopFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int []fre=new int[26];
        for(int i=0;i<s.length();i++){
          for(int j=i;j<s.elngth();j++){
            if(s.charAt(i)==s.charAt(j)){
                fre[s.charAt(i)-'0']++;
            }
          }
        }
        System.out.println(Arrays.toString(fre));
    }
}