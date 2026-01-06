package EncapsulationAbstraction;
import java.util.*;
public class BankingSystem {
	 public static void main(String[] args) {

	        List<BankAccount> accounts = new ArrayList<>();

	        accounts.add(new SavingsAccount("SAV101", "Amit", 50000));
	        accounts.add(new CurrentAccount("CUR202", "Neha", 80000));

	        for (BankAccount acc : accounts) {

	            System.out.println("Account Holder : " + acc.getHolderName());
	            System.out.println("Account Number : " + acc.getAccountno());
	            System.out.println("Balance        : " + acc.getBalance());

	            double interest = acc.calculateInterest();
	            System.out.println("Interest       : " + interest);

	            // Loan feature using instanceof
	            if (acc instanceof Loanable) {
	                Loanable loanAcc = (Loanable) acc;
	                loanAcc.applyForLoan();
	                System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
	            }
	        }
	        
	 }
}

