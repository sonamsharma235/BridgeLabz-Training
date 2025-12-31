class Circle {

    double radius;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.printf("Area of circle:", area);
    }

    void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference of circle:", circumference);
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 2.5;

        c.calculateArea();
        c.calculateCircumference();
    }
}
