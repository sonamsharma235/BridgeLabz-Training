import java.util.Scanner;

public class Euclidean {
    static double findDistance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;

        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }
    static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];

        double m = (y2 - y1) / (x2 - x1);   
        double b = y1 - (m * x1);           

     result[0] = m;
     result[1] = b;

     return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("\nEuclidean Distance = " + distance);

        // Line equation calculation
        if (x1 == x2) {
            System.out.println("Equation of line: Vertical line (slope undefined)");
        } else {
            double[] line = findLineEquation(x1, y1, x2, y2);
            System.out.println("Slope (m) = " + line[0]);
            System.out.println("Y-intercept (b) = " + line[1]);
            System.out.println("Equation of line: y = " + line[0] + "x + " + line[1]);
        }

        sc.close();
    }
}
