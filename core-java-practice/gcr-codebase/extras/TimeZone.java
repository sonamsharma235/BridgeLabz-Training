import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class TimeZone{
    public static void main(String []agrs){
        DateTimeFormatter formater=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

        //GMT TIME
        ZonedDateTime gmt=ZonedDateTime.now(ZoneId.of("GMT"));
        System.out.println("gmt current time"+ gmt.format(formater));
        //ist
        ZonedDateTime ist=ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("gmt current time"+ ist.format(formater));
        //pst
        ZonedDateTime pst=ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("gmt current time"+ pst.format(formater));
        
    }
}