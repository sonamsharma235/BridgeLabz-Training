import java.util.*;
class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String message) {
        super(message);
    }
}
class QuizProcessor {
    static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length) {
            throw new InvalidQuizSubmissionException("Answer length mismatch!");
        }
        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i])) {
                score++;
            }
        }
        return score;
    }
    static char getGrade(int score, int total) {
        double percentage = (double) score / total * 100;

        if (percentage >= 90) return 'A';
        else if (percentage >= 75) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 40) return 'D';
        else return 'F';
    }
}

// Main class
public class OnlineQuizPlatform {
    public static void main(String[] args) {

        String[] correctAnswers = {"A", "B", "C", "D", "A"};
        List<Integer> scores = new ArrayList<>();

        try {
            String[] user1 = {"A", "B", "C", "D", "A"};
            String[] user2 = {"A", "C", "C", "D", "B"};

            int score1 = QuizProcessor.calculateScore(correctAnswers, user1);
            int score2 = QuizProcessor.calculateScore(correctAnswers, user2);

            scores.add(score1);
            scores.add(score2);

            System.out.println("User1 Score: " + score1 +
                    " Grade: " + QuizProcessor.getGrade(score1, correctAnswers.length));

            System.out.println("User2 Score: " + score2 +
                    " Grade: " + QuizProcessor.getGrade(score2, correctAnswers.length));

        } catch (InvalidQuizSubmissionException e) {
            System.out.println(e.getMessage());
        }
    }
}
