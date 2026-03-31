package CourseRegistration;

interface RegistrationService {
    void enroll(Student s, String course) throws CourseLimitexceededException;
    void drop(Student s,String course);
}
