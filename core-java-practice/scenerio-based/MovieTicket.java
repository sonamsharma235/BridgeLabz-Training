import java.util.Scanner;
public class MovieTicket{
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        String type=sc.next();
        int ticketPrice=0;
        String next=sc.next();
      while(next.equalsIgnoreCase("yes")){
        switch(type){
          case "horror":
            ticketPrice=200;
            System.out.println("movie done");
            break;
          case "comedy":
            ticketPrice=150;
             System.out.println("movie done");
            break;
          case "drama":
            ticketPrice=180;
             System.out.println("movie done");
            break; 
          default:
            System.out.println("invalid"); 
            continue;    
        }
        String seatType=sc.next();
        if(seatType.equalsIgnoreCase("gold")){
            ticketPrice+=100;
             System.out.println("seat done");
        }else{
            ticketPrice+=50;
             System.out.println("seat done");
        }

        System.out.println("asking about snacks");
        String snacks=sc.next();
        if(snacks.equalsIgnoreCase("yes")){
            ticketPrice+=200;
        }
        System.out.println("total ticket price "+ticketPrice);
        System.out.println("next Customer");
         next=sc.next();
    }


    }
}