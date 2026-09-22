package Problems;

// Leetcode - 1814
import java.util.HashMap;

public class CountNIcePairsInAnArray_5 {
    static int rev(int n) {
        int r = 0;
        while (n>0) {
            r *= 10;
            r += (n%10);
            n /= 10;
        }
        return r;
    }
    static int countNicePairs(int[] arr) {
        int n = arr.length;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<n;i++) {
            arr[i] -= rev(arr[i]);
        }
        for (int i=0;i<n;i++) {
            if (map.containsKey(arr[i])) {
                count = count%1000000007;
                count += map.getOrDefault(arr[i],0);
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            } else map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        return count%1000000007;
    }

    public static void main(String[] args) {
        int[] arr = {13,10,35,24,76};
        System.out.println(countNicePairs(arr));
    }
}
