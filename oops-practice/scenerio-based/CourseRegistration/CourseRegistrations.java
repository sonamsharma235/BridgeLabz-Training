package CourseRegistration;

public class CourseRegistrations implements RegistrationService {
    private static final int MAX_COURSES = 3;

    public void enroll(Student s, String course) throws CourseLimitexceededException {
        if (s.getCourses().size() >= MAX_COURSES) {
            throw new CourseLimitexceededException("Maximum course limit reached!");
        }
        s.getCourses().add(course);
        System.out.println(course + " enrolled");
    }

    public void drop(Student s, String course) {
        s.getCourses().remove(course);
        System.out.println(course + " dropped");
    }

}
