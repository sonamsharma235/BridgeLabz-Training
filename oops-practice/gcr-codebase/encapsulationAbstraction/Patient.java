package EncapsulationAbstraction;

import java.util.*;
abstract class Patient {
	private int patientId;
    private String name;
    private int age;

    // Sensitive data
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
    }

    protected void addMedicalHistory(String record) {
        medicalHistory.add(record);
    }
    protected void showMedicalHistory() {
        for (String r : medicalHistory) {
            System.out.println("- " + r);
        }
    }

    public abstract double calculateBill();
}
