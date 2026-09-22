package Problems;

// Leetcode - 560
import java.util.HashMap;

public class SubarraySumEqualsK_6 {
    static int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = arr.length;
        if (n==0) return 0;
        if (n==1) {
            if (arr[0]==k) return 1;
            else return 0;
        }
//        prefix sum
        for (int i=1;i<n;i++) {
            arr[i] += arr[i-1];
        }
        int count = 0;
        for (int i=0;i<n;i++) {
            if (arr[i]==k) count++;
            int rem = arr[i]-k;
            if (map.containsKey(rem)) count+= map.get(rem);
            if (map.containsKey(arr[i])) {
                int idx = map.get(arr[i]);
                idx++;
                map.put(arr[i],idx);
            }else {
                map.put(arr[i],1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int k = 3;
        System.out.println(subarraySum(arr,k));
    }
}
