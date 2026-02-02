package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchEmployee {
    public static void main(String[] args) {

        String file = "src/CSV/employees.csv";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            br.readLine();   // skip header

            boolean found = false;

            while ((line = br.readLine()) != null) {

                String[] d = line.split(",");

                if (d[1].equalsIgnoreCase(name)) {

                    System.out.println("Department: " + d[2]);
                    System.out.println("Salary: " + d[3]);

                    found = true;
                    break;
                }
            }

            if (!found)
                System.out.println("Employee not found!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

