package CSV;

import java.io.FileWriter;
import java.io.IOException;

public class WriteCSV {

    public static void main(String[] args) {

        String filePath = "src/CSV/employees.csv";

        try (FileWriter fw = new FileWriter(filePath)) {

            // Write Header
            fw.write("ID,Name,Department,Salary\n");

            // Write Records
            fw.write("1,Sonam,IT,50000\n");
            fw.write("2,Rahul,HR,45000\n");
            fw.write("3,Priya,Finance,60000\n");
            fw.write("4,Amit,Marketing,48000\n");
            fw.write("5,Neha,IT,52000\n");

            System.out.println("CSV file created successfully!");

        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}

