package java8Features;

import java.util.*;
import java.util.function.Predicate;

public class HospitalAlert {
    public static void main(String[] args) {

        List<Alert> alerts = Arrays.asList(
            new Alert("CRITICAL", "Heart rate high"),
            new Alert("NORMAL", "Medicine time"),
            new Alert("CRITICAL", "BP low"),
            new Alert("INFO", "Doctor visit")
        );

        // User wants only CRITICAL alerts
        Predicate<Alert> criticalOnly =
            a -> a.type.equals("CRITICAL");

        showAlerts(alerts, criticalOnly);
    }

    static void showAlerts(List<Alert> list,
                           Predicate<Alert> rule) {

        for(Alert a : list) {
            if(rule.test(a)) {
                System.out.println(a);
            }
        }
    }
}
