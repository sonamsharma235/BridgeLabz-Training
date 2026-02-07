import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean weekend;

    Doctor(String n, String s, boolean w) {
        name = n; specialty = s; weekend = w;
    }

    public boolean isAvailableWeekend() {
        return weekend;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String toString() {
        return name + " - " + specialty;
    }
}

public class Hospital {
    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
            new Doctor("Amit", "Cardio", true),
            new Doctor("Rahul", "Neuro", false),
            new Doctor("Sneha", "Ortho", true)
        );

        List<Doctor> result = doctors.stream()

            .filter(d -> d.isAvailableWeekend())

            .sorted((d1, d2) ->
                d1.getSpecialty().compareTo(d2.getSpecialty()))

            .collect(Collectors.toList());

        result.forEach(d -> System.out.println(d));
    }
}
