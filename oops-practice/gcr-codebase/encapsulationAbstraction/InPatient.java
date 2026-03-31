package EncapsulationAbstraction;

public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;

    public InPatient(int id, String name, int age, int days) {
        super(id, name, age);
        this.daysAdmitted = days;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * 3000; // room charges
    }

    @Override
    public void addRecord(String record) {
        addMedicalHistory(record);
    }

    @Override
    public void viewRecords() {
        showMedicalHistory();
    }
}
