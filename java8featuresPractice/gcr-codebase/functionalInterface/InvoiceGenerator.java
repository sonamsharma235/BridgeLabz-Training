package FunctionalInterface;

import java.time.LocalDate;

public class InvoiceGenerator {
    public static void main(String[]args) {
    	LocalDate today=LocalDate.now();
    	
    	String format1 = DateFormatUtility.formatDate(today, "dd-MM-yyyy");
        String format2 = DateFormatUtility.formatDate(today, "yyyy/MM/dd");
        String format3 = DateFormatUtility.formatDate(today, "dd MMM yyyy");

        System.out.println("Format 1: " + format1);
        System.out.println("Format 2: " + format2);
        System.out.println("Format 3: " + format3);
    }
}
