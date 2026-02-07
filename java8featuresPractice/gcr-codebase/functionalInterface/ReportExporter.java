package FunctionalInterface;

public interface ReportExporter {

    void exportToCSV();
    void exportToPDF();

    // NEW FEATURE ADDED LATER
    default void exportToJSON() {
        System.out.println("Default JSON Export Not Implemented");
    }
}

