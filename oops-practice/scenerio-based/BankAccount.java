class BankAccount {
    int accountNumber;
    double balance;
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal denied.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        }
    }
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
public class BankApp {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, 5000);

        acc.deposit(2000);
        acc.withdraw(3000);
        acc.withdraw(6000); 
        acc.checkBalance();
    }
}
