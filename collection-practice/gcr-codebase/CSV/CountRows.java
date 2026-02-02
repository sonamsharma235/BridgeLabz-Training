package CSV;

import java.io.BufferedReader;
import java.io.FileReader;

public class CountRows {
    public static void main(String[] args) {

        String file = "src/CSV/students.csv";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            br.readLine();          // skip header

            while (br.readLine() != null) {
                count++;
            }

            System.out.println("Total Records: " + count);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
