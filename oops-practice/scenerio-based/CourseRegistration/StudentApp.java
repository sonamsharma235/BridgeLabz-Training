package CourseRegistration;

public class StudentApp {
	public static void main(String[] args) {

        Student s1 = new Student(101, "Sonam", 20);
        RegistrationService service = new CourseRegistrations();

        try {
            service.enroll(s1, "Java");
            service.enroll(s1, "Python");
            service.enroll(s1, "DBMS");
            service.enroll(s1, "AI");   // Will throw exception
        }
        catch (CourseLimitexceededException e) {
            System.out.println(e.getMessage());
        }

        s1.addGrade("Java", 85);
        s1.addGrade("Python", 90);

        System.out.println("Grades:");
        s1.showGrades();
    }
}
