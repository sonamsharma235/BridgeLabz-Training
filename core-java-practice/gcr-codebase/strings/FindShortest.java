import java.util.Scanner;
public class FindShortest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        String[] words=splitWords(s);
        String [][] wordLength=createWord(words);

        int []ans=findShortest(wordLength);
        System.out.println(wordLength[ans[0]][0]);
        System.out.println(wordLength[ans[1]][0]);
    }
    public static int findLength(String s){
        int count=0;
        try{
            while(true){
                s.charAt(count);
                count++;
            }
        }catch(StringIndexOutOfBoundsException e){

        }
        return count;
    }

    public static String[] splitWords(String s){
        int length=findLength(s);
        int wordcount=0;

        for(int i=0;i<length;i++){
            if(s.charAt(i)==' '){
                wordcount++;
            }
        }
        String words[]=new String[wordcount];
        int idx=0;
        String word="";
        for(int i=0;i<length;i++){
            if(s.charAt(i)==' '){
                words[idx++]=word;
                word="";
            }else{
                word+=s.charAt(i);
            }
        }
        words[idx]=word;
        return words;
    }
    public static [][] createWord(String[]words){
        String [][]wordLength=new String[words.length][2];

        for(int i=0;i<words.length;i++){
            int l=findLength(words[i]);
            wordLength[i][0]=words[i];
            wordLength[i][1]=String.valueOf(l);
        }
        return wordLength;
    }
    public static int[] findShortest(String[][]data){
        int min=0;
        int max=0;

        int minLen=Integer.parseInt(data[0][1]);
        int maxLen=Integer.parseInt(data[0][1]);
        for(int i=1;i<data.length;i++){
            int curr=Integer.parseInt(data[i][1]);
           if (curr < minLen) {
                minLen = curr;
                min = i;
            }

            if (curr > maxLen) {
                maxLen = curr;
                max = i;
            }
        }

        return new int[]{min, max};
        }  
    }