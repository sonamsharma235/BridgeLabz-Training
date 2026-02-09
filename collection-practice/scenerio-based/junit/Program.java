public class Program {

    private double Balance;

    public Program(double initialBalance) {
        this.Balance = initialBalance;
    }

    public double getBalance() {
        return Balance;
    }

    public void Deposit(double amount) throws Exception {
        if (amount < 0) {
            throw new Exception("Deposit amount cannot be negative");
        }
        Balance += amount;
    }

    public void Withdraw(double amount) throws Exception {
        if (amount > Balance) {
            throw new Exception("Insufficient funds.");
        }
        Balance -= amount;
    }
}
