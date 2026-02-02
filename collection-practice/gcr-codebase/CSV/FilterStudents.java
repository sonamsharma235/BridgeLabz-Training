package CSV;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterStudents {
    public static void main(String[] args) {

        String file = "src/CSV/students.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            br.readLine();   // skip header

            System.out.println("Students with marks > 80");

            while ((line = br.readLine()) != null) {

                String[] d = line.split(",");

                int marks = Integer.parseInt(d[3].trim());

                if (marks > 80) {
                    System.out.println(d[1] + " - " + marks);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
