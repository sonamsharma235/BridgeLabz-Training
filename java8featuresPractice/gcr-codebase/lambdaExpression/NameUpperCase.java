package java8Features;

import java.util.*;
import java.util.stream.*;

public class NameUpperCase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList(
            "sonam", "rahul", "pooja", "amit"
        );

        // Using String::toUpperCase method reference
        List<String> upperNames =
            names.stream()
                 .map(String::toUpperCase)
                 .collect(Collectors.toList());

        System.out.println(upperNames);
    }
}

