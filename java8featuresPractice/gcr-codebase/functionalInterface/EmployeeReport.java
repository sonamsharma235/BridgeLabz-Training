package FunctionalInterface;

public class EmployeeReport implements ReportExporter {

    public void exportToCSV() {
        System.out.println("Employee Report CSV");
    }

    public void exportToPDF() {
        System.out.println("Employee Report PDF");
    }

    // Custom JSON implementation
    @Override
    public void exportToJSON() {
        System.out.println("Employee Report JSON");
    }
}
