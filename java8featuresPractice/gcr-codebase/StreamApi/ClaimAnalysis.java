import java.util.*;
import java.util.stream.*;

class Claim {
    String type;
    double amount;

    Claim(String t, double a) {
        type = t; amount = a;
    }

    public String getType() { return type; }
    public double getAmount() { return amount; }
}

public class ClaimAnalysis {
    public static void main(String[] args) {

        List<Claim> claims = Arrays.asList(
            new Claim("Health", 20000),
            new Claim("Health", 30000),
            new Claim("Vehicle", 15000),
            new Claim("Vehicle", 25000)
        );

        Map<String, Double> avg = claims.stream()

            .collect(Collectors.groupingBy(
                c -> c.getType(),
                Collectors.averagingDouble(c -> c.getAmount())
            ));

        System.out.println(avg);
    }
}
