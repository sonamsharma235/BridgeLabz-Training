import java.util.*;

public class EventWelcome {
    public static void main(String[] args) {

        List<String> attendees = Arrays.asList(
            "Sonam", "Amit", "Rahul", "Neha"
        );

        attendees.forEach(name ->
            System.out.println("Welcome to Event, " + name)
        );
    }
}
