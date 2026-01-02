import java.util.*;
class StudentScoreAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] scores = new int[n];

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ": ");
            int score = sc.nextInt();
            if (score < 0) {
                System.out.println("Invalid score");
                i--;
                continue;
            }
            scores[i] = score;
            sum += score;
            max = Math.max(max, score);
            min = Math.min(min, score);
        }
        double avg = (double) sum / n;
        System.out.println("Avg Score: " + avg);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);
        for (int s : scores) {
            if (s > avg) {
                System.out.println(s);
            }
        }
    }
}
