class BankAccount {

    int balance = 10000;

    public void withdraw(String name, int amount) {

        System.out.println("[" + name + "] Attempting to withdraw " + amount);

        if (balance >= amount) {

            try {
                Thread.sleep(200);   // to show race condition
            } catch (Exception e) {}

            balance -= amount;

            System.out.println(
                "Transaction successful: " + name +
                ", Amount: " + amount +
                ", Balance: " + balance
            );
        } 
        else {
            System.out.println("Transaction FAILED for " + name);
        }
    }
}

class Transaction implements Runnable {

    BankAccount account;
    String name;
    int amount;

    public Transaction(BankAccount acc, String name, int amount) {
        this.account = acc;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        System.out.println(
            Thread.currentThread().getName() + " state: RUNNABLE"
        );

        account.withdraw(name, amount);
    }
}

public class BankingDemo {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        Thread t1 = new Thread(new Transaction(acc,"Customer-1",3000));
        Thread t2 = new Thread(new Transaction(acc,"Customer-2",4000));
        Thread t3 = new Thread(new Transaction(acc,"Customer-3",2000));
        Thread t4 = new Thread(new Transaction(acc,"Customer-4",5000));
        Thread t5 = new Thread(new Transaction(acc,"Customer-5",1500));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
