package java8Features;

import java.util.*;
import java.util.stream.*;
class Invoice {
    int id;

    Invoice(int id) {
        this.id = id;
    }

    public String toString() {
        return "Invoice ID: " + id;
    }
}

public class InvoiceDemo {
    public static void main(String[] args) {

        List<Integer> txIds =
            Arrays.asList(1001, 1002, 1003);

        // Constructor reference Invoice::new
        List<Invoice> invoices =
            txIds.stream()
                 .map(Invoice::new)
                 .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

