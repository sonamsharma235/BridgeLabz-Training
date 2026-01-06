import java.util.*;
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}
class Student {
    private String name;
    private String[] subjects;
    private int[] marks;

    public Student(String name, String[] subjects, int[] marks) throws InvalidMarkException {
        this.name = name;
        this.subjects = subjects;
        this.marks = marks;
        validateMarks();
    }
    private void validateMarks() throws InvalidMarkException {
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Invalid mark found: " + mark);
            }
        }
    }
    public double calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }
    public char assignGrade() {
        double avg = calculateAverage();

        if (avg >= 90) return 'A';
        else if (avg >= 75) return 'B';
        else if (avg >= 60) return 'C';
        else if (avg >= 40) return 'D';
        else return 'F';
    }
    public void displayReport() {
        System.out.println("=================================");
        System.out.println("Student Name : " + name);

        for (int i = 0; i < subjects.length; i++) {
            System.out.printf("report", subjects[i], marks[i]);
        }
        System.out.printf("Average Marks : %.2f%n", calculateAverage());
        System.out.println("Grade         : " + assignGrade());
        System.out.println("=================================\n");
    }
}

// Main class
public class StudentReportGenerator {
    public static void main(String[] args) {

        String[] subjects = {"Math", "Science", "English"};

        List<Student> students = new ArrayList<>();

        try {
            students.add(new Student("Rahul", subjects, new int[]{85, 90, 88}));
            students.add(new Student("Anita", subjects, new int[]{72, 68, 75}));
            students.add(new Student("Vikram", subjects, new int[]{95, 92, 93}));

            for (Student student : students) {
                student.displayReport();
            }

        } catch (InvalidMarkException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
