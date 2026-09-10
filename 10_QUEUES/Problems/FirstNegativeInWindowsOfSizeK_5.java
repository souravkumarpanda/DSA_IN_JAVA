package Problems;

// GFG
import java.util.*;

public class FirstNegativeInWindowsOfSizeK_5 {
    static List<Integer> firstNegInt(int[] arr, int k) {
        List<Integer> ans = new ArrayList<>();
        int n = arr.length;
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) q.add(i);
        }
        for (int i=0;i<n-k+1;i++) {
            while (!q.isEmpty() && q.peek()<i) q.remove();
            if (!q.isEmpty() && q.peek()<=i+k-1) ans.add(arr[q.peek()]);
            else ans.add(0);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println(firstNegInt(arr,k));
    }
}
