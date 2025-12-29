import java.util.*;
public class DigitalWatch{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int hour=0;hour<24;hour++){
            for(int min=0;min<60;min++){
              if(hour==13 && min==0){
                System.out.println("Power cut at 13:00");
                break;
              }
              System.out.printf("%02d:%02d\n", hour, min);
            }
        }
    }
}