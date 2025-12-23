import java.util.Scanner;
public class SplitString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int length=findLength(s);
        splitWords(length,s);
    }
    public static int findLength(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){}

        return count;
    }
    public static void splitWords(int length,String s){
        int words=1;
        for(int i=0;i<length;i++){
            if(s.charAt(i)==' '){
                words++;
            }
        }

        int []spaces=new int[words-1];
        int index=0;
        for(int i=0;i<length;i++){
            if(s.charAt(i)==' '){
                spaces[index++]=i;
            }
        }
        String []wordArray=new String[words]
            int start=0;
        for(int i=0;i<words-1;i++){
            String word="";
            for(int j=start;j<spaces[i];j++){
                word=word+s.charAt(j);
            }
            wordArray[i]=word;
            start=spaces[i]+1;
        }
        String lastWord="";
        for(int i=start;i<length;i++){
            lastWord+=s.charAt(i);
        }
         wordArray[words - 1] = lastWord;
        return words;
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
    
}