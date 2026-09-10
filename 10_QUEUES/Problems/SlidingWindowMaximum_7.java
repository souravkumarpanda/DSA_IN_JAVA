package Problems;

// Leetcode - 239
import java.util.*;

public class SlidingWindowMaximum_7 {
    static int[] maxSlidingWindow(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int  n = arr.length;
        int[] ans = new int[n-k+1];
        for (int i=0;i<n;i++) {
            while (!dq.isEmpty() && arr[i]>arr[dq.peekLast()]) dq.removeLast();
            dq.addLast(i);
            int j = i-k+1;
            while (!dq.isEmpty() && dq.peekFirst()<j) dq.removeFirst();
            if (i>=k-1) ans[i-k+1] = arr[dq.peekFirst()];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        System.out.println(Arrays.toString(maxSlidingWindow(arr,k)));
    }
}
