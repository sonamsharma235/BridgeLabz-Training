package FunctionalInterface;

public class Salesreport implements ReportExporter {

    public void exportToCSV() {
        System.out.println("Sales Report exported to CSV");
    }

    public void exportToPDF() {
        System.out.println("Sales Report exported to PDF");
    }

    // No need to implement JSON – inherited automatically
}

