import java.util.*;
public class SnakeLadder {
    public static void main(String[] args) {

        //UC 1
        int posOfplayer1=0;
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
        
        //UC 6
        System.out.println(CountOfDie);
         
        //UC 7
        int ladder=1;
        int snake=2;
        int posOfPlayer2=0;
        int posOfPlayer3=0;
        boolean flag=true;
        while(posOfPlayer2!=100 && posOfPlayer3!=100){
              die=random.nextInt(6)+1; 
              switch(CheckOption){
                 case 1:
                      if(flag==true){
                       posOfPlayer2+=die;
                       if(posOfPlayer2>100){
                        posOfPlayer2-=die;
                       }
                    }else{
                        posOfPlayer3+=die;
                        if(posOfPlayer3>100){
                        posOfPlayer3-=die;
                       }
                    }
                    break;
                 case 2:
                       if(flag==true){
                       posOfPlayer2-=die;
                       }else{
                        posOfPlayer3-=die;
                       } 
                      break; 
              }
              flag=!flag;
              if(posOfPlayer2<0){
                 posOfPlayer2=0;
              }else if(posOfPlayer3<0)posOfPlayer3=0;

             System.out.println(posOfPlayer2+" "+posOfPlayer3);
      } 
      if(posOfPlayer2==100){
        System.out.println("Player 2 is the Winner");
      }else{
        System.out.println("Player 3 is the winner");
      }
        
    }
    
}