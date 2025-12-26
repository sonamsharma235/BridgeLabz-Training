import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        int day=sc.nextInt();
        checkSeason(month,day);
    }
    public static void checkSeason(int month,int day){
        if(month>=3 && month<=6){
            if(day>=20 && day<=30){
                System.out.println("it is spring season");
            }else{
                System.out.println("not spring");
            }
        }else{
            System.out.println("not spring");
        }
    }
}