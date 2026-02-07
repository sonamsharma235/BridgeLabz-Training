import java.time.*;
import java.util.*;
import java.util.stream.*;

class Member {
    String name;
    LocalDate expiry;

    Member(String n, LocalDate e) {
        name = n; expiry = e;
    }

    public LocalDate getExpiryDate() {
        return expiry;
    }

    public String toString() {
        return name + " - " + expiry;
    }
}

public class Gym {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        List<Member> members = Arrays.asList(
            new Member("A", today.plusDays(10)),
            new Member("B", today.plusDays(40)),
            new Member("C", today.plusDays(20))
        );

        List<Member> expiring = members.stream()

            .filter(m ->
                !m.getExpiryDate().isBefore(today) &&
                !m.getExpiryDate().isAfter(today.plusDays(30))
            )

            .collect(Collectors.toList());

        expiring.forEach(m -> System.out.println(m));
    }
}
