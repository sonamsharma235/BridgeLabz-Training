import java.util.Scanner;

public class BMICalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        double[][] personData = new double[count][3];
        String[] weightStatus = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.println("\nRecording data for Person #" + (i + 1));
            double w;
            do {
                System.out.print("Enter weight in kg: ");
                w = input.nextDouble();
                if (w <= 0) System.out.println("Please enter a positive value.");
            } while (w <= 0);
            personData[i][0] = w;
            double h;
            do {
                h = input.nextDouble();
                if (h <= 0) System.out.println("Please enter a positive value.");
            } while (h <= 0);
            personData[i][1] = h;
            double bmi = personData[i][0] / (personData[i][1] * personData[i][1]);
            personData[i][2] = bmi;
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.printf("Person %-3d %-10.2f %-10.2f %-10.2f %-15s\n", 
                (i + 1), 
                personData[i][0], 
                personData[i][1], 
                personData[i][2], 
                weightStatus[i]);
        }
    }
}