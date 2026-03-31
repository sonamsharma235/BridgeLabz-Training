package FunctionalInterface;

public class CSVJson {
	public static void main(String[] args) {

        ReportExporter s = new SalesReport();
        s.exportToCSV();
        s.exportToJSON();   // uses default

        ReportExporter e = new EmployeeReport();
        e.exportToJSON();   // overridden
    }
}
