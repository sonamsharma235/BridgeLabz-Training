import java.util.Scanner;
public class BMICalculator{
    public static String[] calculateBMI(double weightKg, double heightCm) {
        double heightMeter = heightCm / 100;
        double bmi = weightKg / (heightMeter * heightMeter);
        String status;

     if (bmi < 18.5) {
            status = "Underweight";
     }else if (bmi < 25) {
            status = "Normal";
     }else if (bmi < 30) {
            status = "Overweight";
     }else {
            status = "Obese";
     }
        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }
    public static String[][] prepareBMIReport(double[][] data) {
        String[][] report = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiResult = calculateBMI(weight, height);

            report[i][0] = String.valueOf(height);
            report[i][1] = String.valueOf(weight);
            report[i][2] = bmiResult[0];
            report[i][3] = bmiResult[1];
        }

        return report;
    }
    public static void displayReport(String[][] report) {
        for (int i = 0; i < report.length; i++) {
            System.out.println(
                    report[i][0] + "\t\t" +
                    report[i][1] + "\t\t" +
                    report[i][2] + "\t\t" +
                    report[i][3]
            );
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble();
            data[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = prepareBMIReport(data);
        displayReport(bmiReport);
    }
}
