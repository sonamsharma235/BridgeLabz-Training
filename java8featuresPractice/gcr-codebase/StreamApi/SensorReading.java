import java.util.*;

public class SensorReadings {

    public static void main(String[] args) {

        int THRESHOLD = 50;

        List<Integer> readings = Arrays.asList(
            45, 60, 30, 75, 55, 40
        );

        readings.stream()

            .filter(r -> r > THRESHOLD)

            .forEach(r ->
                System.out.println("ALERT! High Reading: " + r)
            );
    }
}
