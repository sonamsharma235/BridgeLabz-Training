package EncapsulationAbstraction;

class CurrentAccount extends BankAccount {
	private static final double MIN_BALANCE = 5000;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= MIN_BALANCE) {
            super.withdraw(amount);
        } else {
            System.out.println("Minimum balance rule violated");
        }
    }
}
