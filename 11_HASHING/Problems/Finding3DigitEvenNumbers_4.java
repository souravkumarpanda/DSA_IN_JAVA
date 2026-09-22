package Problems;

// Leetcode - 2094
import java.util.*;

public class Finding3DigitEvenNumbers_4 {
    static int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = digits.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int ele:digits) map.put(ele,map.getOrDefault(ele,0)+1);
        for (int i=100;i<=999;i+=2) {
            int x = i;
            int a = x%10;
            x /= 10;
            int b = x%10;
            x /= 10;
            int c = x;
            if (map.containsKey(a)) {
                map.put(a, map.get(a)-1);
                if (map.get(a)==0) map.remove(a);
                if (map.containsKey(b)) {
                    map.put(b, map.get(b)-1);
                    if (map.get(b)==0) map.remove(b);
                    if (map.containsKey(c)) ans.add(i);
                    map.put(b,map.getOrDefault(b,0)+1);
                }
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        int[] result = new int[ans.size()];
        for (int i=0;i<ans.size();i++) result[i] = ans.get(i);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,3,0};
        System.out.println(Arrays.toString(findEvenNumbers(arr)));
    }
}
