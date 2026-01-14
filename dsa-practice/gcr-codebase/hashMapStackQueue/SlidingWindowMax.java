import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMax {

    static void maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offer(i);
            if (i >= k - 1) {
                System.out.print(nums[dq.peek()] + " ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        maxSlidingWindow(arr, k);
    }
}
