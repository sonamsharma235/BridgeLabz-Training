package CSV;

import java.io.*;

public class UpdateSalary {
    public static void main(String[] args) {

        String input = "src/CSV/employees.csv";
        String output = "src/CSV/updated_employees.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(input));
             FileWriter fw = new FileWriter(output)) {

            String line;

            // write header
            fw.write(br.readLine() + "\n");

            while ((line = br.readLine()) != null) {

                String[] d = line.split(",");

                String dept = d[2];
                double salary = Double.parseDouble(d[3]);

                if (dept.equalsIgnoreCase("IT")) {
                    salary = salary + salary * 0.10;   // +10%
                }

                fw.write(d[0] + "," + d[1] + "," + d[2] + "," + salary + "\n");
            }

            System.out.println("Updated file created!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

