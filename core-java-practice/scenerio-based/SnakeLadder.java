import java.util.*;
public class SnakeLadder {
    public static void main(String[] args) {

        //UC 1
        int posOfplayer1=0;
         //UC 2
        Random random=new Random();
        int die=random.nextInt(6)+1;
        
         //UC 2
        Random random=new Random();
        int die=random.nextInt(6)+1;
        
        //UC 3
        int CheckOption=random.nextInt(2)+1;
        int ladder=1;
        int snake=2;
        int CountOfDie=1;

        //UC 4 & UC 5
        while(posOfplayer1!=100){
           die=random.nextInt(6)+1; 
           switch(CheckOption){
            case 1:
                posOfplayer1+=die;
                if(posOfplayer1>100) 
                    posOfplayer1-=die;
                break;
            case 2:
                posOfplayer1-=die;
                break;   
          }
          if(posOfplayer1<0){
            posOfplayer1=0;
          }
          System.out.println(player1);
          CountOfDie++;
        }
        
       
    }
    
}