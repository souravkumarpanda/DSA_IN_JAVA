package HashSet.Problems;

// Leetcode - 2442
import java.util.HashSet;

public class CountNumberOfDistinctIntegersAfterReverseOperations_5 {
    static int rev(int n) {
        int r = 0;
        while(n>0) {
            r *= 10;
            r += (n%10);
            n /= 10;
        }
        return r;
    }
    static int countDistinctIntegers(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<n;i++) {
            int rev = rev(arr[i]);
            set.add(arr[i]);
            set.add(rev);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {1,13,10,12,31};
        System.out.println(countDistinctIntegers(arr));
    }
}
