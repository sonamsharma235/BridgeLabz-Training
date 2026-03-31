package EncapsulationAbstraction;

abstract class BankAccount {
	private String accountNumber;
	private String holderName;
	private double balance;
	
	 public BankAccount(String accountNumber, String holderName, double balance) {
	        this.accountNumber = accountNumber;
	        this.holderName = holderName;
	        this.balance = balance;
	    }
	
	public String getAccountno() {
		return accountNumber; 
	}
	public String getHolderName() {
		return holderName;
	}
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
		    System.out.println("Deposited: " + amount);
		}
	}
	public void withdraw(double amount) {
		if(amount>0 && amount<balance) {
			balance-=amount;
			System.out.println("Withdrawn: " + amount);
		}else {
            System.out.println("Insufficient balance");
        }
	}
	abstract double calculateInterest();
	
}
