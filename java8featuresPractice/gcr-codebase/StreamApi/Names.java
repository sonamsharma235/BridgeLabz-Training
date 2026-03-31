import java.util.*;
import java.util.stream.*;

public class Names {
    public static void main(String[] args) {

        List<String> customers =
            Arrays.asList("sonam", "amit", "rahul");

        List<String> result = customers.stream()

            .map(n -> n.toUpperCase())

            .sorted((a, b) -> a.compareTo(b))

            .collect(Collectors.toList());

        result.forEach(n -> System.out.println(n));
    }
}
