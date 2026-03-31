class Student {
    String name;
    String rollNumber;
    double mark1, mark2, mark3;
    char calculateGrade() {
        double avg = (mark1 + mark2 + mark3) / 3;
        if (avg >= 75) return 'A';
        else if (avg >= 60) return 'B';
        else return 'C';
    }

  void displayStudent() {
        System.out.println(name);
        System.out.println(rollNumber);
        System.out.println(mark1);
        System.out.println( mark2);
        System.out.println( mark3);
        System.out.println(calculateGrade());
    }
    public static void main(String[] args) {
        // 1st object
       Student s1 = new Student();
        s1.name = "Thamarai";
        s1.rollNumber = "ECE001";
        s1.mark1 = 80;
        s1.mark2 = 70;
        s1.mark3 = 75;
        // 2nd object
        Student s2 = new Student();
        s2.name = "Kannan";
        s2.rollNumber = "CSC002";
        s2.mark1 = 60;
        s2.mark2 = 65;
        s2.mark3 = 50;

        s1.displayStudent();
        s2.displayStudent();
    }
}
