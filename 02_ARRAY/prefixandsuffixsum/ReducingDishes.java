package prefixandsuffixsum;
import java.util.*;
public class ReducingDishes {
    public static int maxSatisfaction(int[] satisfaction) {
        int n = satisfaction.length;
        // Sort the array
        Arrays.sort(satisfaction);
        // Suffix sum array
        int[] suf = new int[n];
        suf[n - 1] = satisfaction[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] + satisfaction[i];
        }
        // Find pivot index
        int idx = -1;
        for (int i = 0; i < n; i++) {
            if (suf[i] >= 0) {
                idx = i;
                break;
            }
        }
        if (idx == -1) return 0;
        // Max sum of like-time coefficient
        int x = 1;
        int maxSum = 0;
        for (int i = idx; i < n; i++) {
            maxSum += satisfaction[i] * x;
            x++;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-8,0,5,-9};
        System.out.println(maxSatisfaction(arr));
    }
}
