
import java.util.*;
public class LongestConsequetiveSequence {
    public static int longestConsecutive(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;

        for (int num : nums) {

            if (map.containsKey(num))
                continue;

            int left = map.getOrDefault(num - 1, 0);
            int right = map.getOrDefault(num + 1, 0);

            int currLen = left + 1 + right;
            map.put(num, currLen);

            map.put(num - left, currLen);
            map.put(num + right, currLen);

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr)); 
    }
}
