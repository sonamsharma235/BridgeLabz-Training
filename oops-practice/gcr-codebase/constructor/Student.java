class Student {

    public String rollNumber;
    protected String name;
    private double CGPA;

    Student(String roll, String name, double cgpa) {
        this.rollNumber = roll;
        this.name = name;
        this.CGPA = cgpa;
    }

    // Public methods for private CGPA
    public void setCGPA(double cgpa) {
        CGPA = cgpa;
    }

    public double getCGPA() {
        return CGPA;
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent(String roll, String name, double cgpa) {
        super(roll, name, cgpa);
    }

    void displayDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent("CS101", "Amit", 8.5);
        pg.displayDetails();
    }
}
