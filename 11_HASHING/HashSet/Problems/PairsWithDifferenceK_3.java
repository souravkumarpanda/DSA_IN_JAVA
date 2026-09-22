package HashSet.Problems;

// GFG
import java.util.*;

public class PairsWithDifferenceK_3 {
    static int countPairs(int[] arr, int k) {
        int maxVal = 100001;
        int[] freq =new int[maxVal+1];
        for (int ele:arr) {
            freq[ele]++;
        }
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int ele:arr) {
            if (set.contains(ele)) continue;
            set.add(ele);
            if (k==0) {
                int f = freq[ele];
                count += (f*(f-1))/2;
            } else {
                int target = ele+k;
                if (target<=maxVal && freq[target]>0) {
                    count += freq[ele]*freq[target];
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,1,4,5}; int k = 3;
        System.out.println(countPairs(arr,k));
    }
}
