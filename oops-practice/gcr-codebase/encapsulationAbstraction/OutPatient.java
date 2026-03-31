package EncapsulationAbstraction;

public class OutPatient extends Patient {

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public double calculateBill() {
        return 500; // consultation fee
    }
}
