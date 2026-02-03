import java.util.*;

public class CreatorStats {

    private String creatorName;
    private double[] weeklyLikes;

    // Static list (same as EngagementBoard)
    public static List<CreatorStats> engagementBoard = new ArrayList<>();

    // Getters & Setters
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public double[] getWeeklyLikes() {
        return weeklyLikes;
    }

    public void setWeeklyLikes(double[] weeklyLikes) {
        this.weeklyLikes = weeklyLikes;
    }
}
