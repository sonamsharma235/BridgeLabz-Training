package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Student {
    int id;
    String name;
    int age;
    int marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id +
                           ", Name: " + name +
                           ", Age: " + age +
                           ", Marks: " + marks);
    }
}

public class ReadCSV {

    public static void main(String[] args) {

        String filePath = "src/CSV/demo.csv";

        System.out.println("---- Student Details ----");

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            // 👉 Skip header line
            br.readLine();

            while ((line = br.readLine()) != null) {

                // Skip empty lines
                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                // Validate column count
                if (data.length != 4) {
                    System.out.println("Invalid record: " + line);
                    continue;
                }

                try {
                    int id = Integer.parseInt(data[0].trim());
                    String name = data[1].trim();
                    int age = Integer.parseInt(data[2].trim());
                    int marks = Integer.parseInt(data[3].trim());

                    Student s = new Student(id, name, age, marks);
                    s.display();

                } catch (NumberFormatException e) {
                    System.out.println("Skipping invalid number record: " + line);
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
