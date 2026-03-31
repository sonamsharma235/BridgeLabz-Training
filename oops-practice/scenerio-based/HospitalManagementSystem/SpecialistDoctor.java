class SpecialistDoctor extends Doctor {

    SpecialistDoctor(String name) {
        super(name);
    }

    @Override
    double consultationFee() {
        return 1000;  // higher fee
    }
}
