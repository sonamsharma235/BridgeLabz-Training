import java.util.*;
import java.util.stream.*;

public class Program {

    // 1. Register Creator
    public void registerCreator(CreatorStats record) {
        CreatorStats.engagementBoard.add(record);
    }

    // 2. Get Top Post Counts
    public Map<String, Integer> getTopPostCounts(
            List<CreatorStats> records,
            double likeThreshold) {

        Map<String, Integer> result = new LinkedHashMap<>();

        for (CreatorStats c : records) {

            int count = 0;

            for (double likes : c.getWeeklyLikes()) {
                if (likes >= likeThreshold) {
                    count++;
                }
            }

            if (count > 0) {
                result.put(c.getCreatorName(), count);
            }
        }

        return result;
    }

    // 3. Calculate Average Likes
    public double calculateAverageLikes() {

        List<Double> allLikes = new ArrayList<>();

        for (CreatorStats c : CreatorStats.engagementBoard) {
            for (double d : c.getWeeklyLikes()) {
                allLikes.add(d);
            }
        }

        if (allLikes.isEmpty())
            return 0;

        double sum = 0;
        for (double d : allLikes) {
            sum += d;
        }

        return sum / allLikes.size();
    }
