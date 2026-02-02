package CSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
class Student {

    private int id;
    private String name;
    private int age;
    private int marks;

    public Student(int id, String name, int age, int marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student [ID=" + id +
               ", Name=" + name +
               ", Age=" + age +
               ", Marks=" + marks + "]";
    }
}


public class ConvertCSVToObject {

    public static void main(String[] args) {

        String filePath = "src/CSV/students.csv";

        List<Student> studentList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;

            br.readLine();   // 👉 skip header

            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                String[] data = line.split(",");

                int id = Integer.parseInt(data[0].trim());
                String name = data[1].trim();
                int age = Integer.parseInt(data[2].trim());
                int marks = Integer.parseInt(data[3].trim());

                Student s = new Student(id, name, age, marks);

                studentList.add(s);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // 👉 Print All Objects
        System.out.println("---- Student Objects ----");

