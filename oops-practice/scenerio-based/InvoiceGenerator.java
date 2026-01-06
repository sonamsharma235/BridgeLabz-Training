public class InvoiceGenerator {
    static String[] parseInvoice(String input) {
        return input.split(",");
    }
    static int getTotalAmount(String[] tasks) {
        int total = 0;

        for (String task : tasks) {
            String[] parts = task.split("-");
            String amountPart = parts[1].trim(); // "3000 INR"
            int amount = Integer.parseInt(amountPart.split(" ")[0]);
            total += amount;
        }
        return total;
    }

    public static void main(String[] args) {
        String invoice ="Logo Design - 3000 INR, Web Page - 4500 INR, SEO Work - 2000 INR";

        String[] tasks = parseInvoice(invoice);
        for (String task : tasks) {
            System.out.println(task.trim());
        }
        int totalAmount = getTotalAmount(tasks);
        System.out.println("Total Invoice Amount: " + totalAmount + " INR");
    }
}
