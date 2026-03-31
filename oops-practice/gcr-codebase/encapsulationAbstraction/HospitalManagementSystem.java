package EncapsulationAbstraction;
import java.util.*;
public class HospitalManagementSystem {
	public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        InPatient p1 = new InPatient(1, "Rahul", 40, 5);
        p1.addRecord("Diabetes");
        p1.addRecord("Blood Test");

        patients.add(p1);
        patients.add(new OutPatient(2, "Anita", 28));

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                System.out.println("Medical Records:");
                m.viewRecords();
            }

            System.out.println("---------------------------");
        }
    }
}
