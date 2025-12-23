import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int students=sc.nextInt();
        int marks[][]=new int[students][3];
        for(int i=0;i<students;i++){
            marks[i][0]=sc.nextInt();
            marks[i][1]=sc.nextInt();
            marks[i][2]=sc.nextInt(); 
        }
        int percentage[][]=new int[students][3];
        for(int i=0;i<percentage.length;i++){
            percentage[i][0]=marks[i][0]+marks[i][1]+marks[i][2];
            percentage[i][0]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
            percentage[i][0]=((marks[i][0]+marks[i][1]+marks[i][2])/300)*100;
        }
        grades(students,percentage);
    }
    public static void grades(int students,int percentage[][]){
        String gradesArray[][]=new String[students][2];
        for(int i=0;i<students;i++){
            if(percentage[i][2]>=80){
                gradesArray[1][0]+=(i+1);
                gradesArray[i][1]="Level 4";
            }else if(percentage[i][2]>=70&& percentage[i][2]<=79){
                gradesArray[1][0]+=(i+1);
                gradesArray[i][1]="Level 3";
            }else if(percentage[i][2]>=60&& percentage[i][2]<=69){
                gradesArray[1][0]+=(i+1);
                gradesArray[i][1]="Level 2";
            }else if(percentage[i][2]>=50&& percentage[i][2]<=59){
                gradesArray[1][0]+=(i+1);
                gradesArray[i][1]="Level 1";
            }
        }
    }
   
}