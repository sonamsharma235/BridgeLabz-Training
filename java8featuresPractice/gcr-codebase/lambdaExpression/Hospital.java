package java8Features;

import java.util.*;

class Patient {
    int id;

    Patient(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void printId(int id) {
        System.out.println("Patient ID: " + id);
    }
}

public class Hospital {
    public static void main(String[] args) {

        List<Patient> list = Arrays.asList(
            new Patient(101),
            new Patient(102),
            new Patient(103)
        );

        // Method Reference used instead of lambda
        list.stream()
            .map(Patient::getId)      
            .forEach(Patient::printId); 
    }
}

