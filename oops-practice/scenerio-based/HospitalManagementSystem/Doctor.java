class Doctor extends Person {
    boolean available = true;

    Doctor(String name) {
        super(name);
    }

    double consultationFee() {
        return 500;   // normal fee
    }
}
