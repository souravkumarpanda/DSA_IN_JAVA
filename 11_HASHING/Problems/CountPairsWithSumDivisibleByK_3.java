package Problems;

// GFG
import java.util.HashMap;

public class CountPairsWithSumDivisibleByK_3 {
    static long countKDivPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int ele:arr) {
            int x = ele%k;
            map.put(x,map.getOrDefault(x,0)+1);
        }
        long pairs = 0;
        long zeroCount = map.getOrDefault(0,0);
        pairs += zeroCount*(zeroCount-1)/2;
        map.remove(0);
        if (k%2==0 && map.containsKey(k/2)) {
            long halfCount = map.get(k/2);
            pairs += halfCount*(halfCount-1)/2;
            map.remove(k/2);
        }
        pairs *= 2;
        for (int key: map.keySet()) {
            int rem = k-key;
            if (map.containsKey(rem)) {
                pairs += (map.get(key))*(map.get(rem));
            }
        }
        pairs /= 2;
        return pairs;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,7,5,3};
        int k = 4;
        System.out.println(countKDivPairs(arr,k));
    }
}
