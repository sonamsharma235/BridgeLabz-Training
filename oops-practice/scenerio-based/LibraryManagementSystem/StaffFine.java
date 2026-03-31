class StaffFine implements FineCalculator {
    public double calculateFine(int daysLate) {
        return daysLate * 1;   // ₹1 per day
    }
}
