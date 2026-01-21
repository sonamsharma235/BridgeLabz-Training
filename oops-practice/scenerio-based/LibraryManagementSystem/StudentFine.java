class StudentFine implements FineCalculator {
    public double calculateFine(int daysLate) {
        return daysLate * 2;   // ₹2 per day
    }
}
