import java.util.*;

class Transaction {
    String type;
    int amount;
    int remainingLimit;

    Transaction(String type, int amount, int remainingLimit) {
        this.type = type;
        this.amount = amount;
        this.remainingLimit = remainingLimit;
    }
}

class CreditCard {
    String cardNumber;
    String holder;
    int creditLimit;
    int availableLimit;
    List<Transaction> transactions = new ArrayList<>();

    CreditCard(String cardNumber, String holder, int creditLimit) {
        this.cardNumber = cardNumber;
        this.holder = holder;
        this.creditLimit = creditLimit;
        this.availableLimit = creditLimit;
    }
}

public class CreditSystem {

    static Map<String, CreditCard> map = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        while (n-- > 0) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String cmd = parts[0];

            if (cmd.equals("ISSUE")) {
                String card = parts[1];
                String holder = parts[2];
                int limit = Integer.parseInt(parts[3]);

                map.putIfAbsent(card, new CreditCard(card, holder, limit));

            } else if (cmd.equals("SPEND")) {
                String card = parts[1];
                int amount = Integer.parseInt(parts[2]);

                if (!map.containsKey(card) ||
                    map.get(card).availableLimit < amount) {

                    System.out.println("Transaction declined");
                } else {
                    CreditCard c = map.get(card);
                    c.availableLimit -= amount;

                    c.transactions.add(
                        new Transaction("SPEND", amount, c.availableLimit)
                    );

                    System.out.println("SPENT " + card + " " + c.availableLimit);
                }

            } else if (cmd.equals("PAYMENT")) {
                String card = parts[1];
                int amount = Integer.parseInt(parts[2]);

                if (!map.containsKey(card)) {
                    System.out.println("Card not found");
                } else {
                    CreditCard c = map.get(card);

                    c.availableLimit += amount;
                    if (c.availableLimit > c.creditLimit)
                        c.availableLimit = c.creditLimit;

                    c.transactions.add(
                        new Transaction("PAYMENT", amount, c.availableLimit)
                    );

                    System.out.println("PAYMENT DONE " + card + " " + c.availableLimit);
                }

            } else if (cmd.equals("HOLDER")) {
                String holder = parts[1];

                List<CreditCard> list = new ArrayList<>();

                for (CreditCard c : map.values()) {
                    if (c.holder.equals(holder)) {
                        list.add(c);
                    }
                }

                if (list.isEmpty()) {
                    System.out.println("No cards found");
                } else {
                    list.sort((a, b) -> a.cardNumber.compareTo(b.cardNumber));

                    for (CreditCard c : list) {
                        System.out.println(c.cardNumber + " " + c.availableLimit);
                    }
                }
            }
        }
    }
}