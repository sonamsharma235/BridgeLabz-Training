class BankAccount {

    public String accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(String accNo, String holder, double bal) {
        accountNumber = accNo;
        accountHolder = holder;
        balance = bal;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String accNo, String holder, double bal) {
        super(accNo, holder, bal);
    }

    void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + getBalance());
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SB101", "Neha", 10000);
        sa.deposit(2000);
        sa.displayAccountDetails();
    }
}
