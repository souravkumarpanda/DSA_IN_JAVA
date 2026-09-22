package HashSet.Problems;

// GFG
import java.util.*;

public class FindDistinctElement_1 {
    static int distinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele:arr) set.add(ele);
        return set.size();
    }

    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        System.out.println(distinct(arr));
    }
}
