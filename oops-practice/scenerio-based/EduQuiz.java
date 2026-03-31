import java.util.*;
public class EduQuiz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String correctAns[]=new String[10];
        for(int i=0;i<correctAns.length;i++){
            correctAns[i]=sc.next();
        }
        String studentAns[]=new String[10];
        for(int i=0;i<correctAns.length;i++){
            studentAns[i]=sc.next();
        }
        int score=calculateScore(correctAns,studentAns);
        double percentage=(score/10)*100;
        System.out.println("percentage : "+percentage +" %");
        if(score>4){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
    }
    public static int calculateScore(String []correctAns,String []studentAns){
        int score=0;
        for(int i=0;i<correctAns.length;i++){
            if(correctAns[i].equalsIgnoreCase(studentAns[i])){
                System.out.println("Question "+(i+1)+" is Correct");
                score++;
            }else{
                 System.out.println("Question "+(i+1)+" is Incorrect");
            }
        }
        return score;
    } 
}