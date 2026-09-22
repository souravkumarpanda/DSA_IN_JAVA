package HashSet.Problems;

// Leetcode - 2744
import java.util.HashSet;

public class FindMaximumNumberOfStringPairs_6 {
    static int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        HashSet<String> set = new HashSet<>();
        int count = 0;
        for (int i=0;i<n;i++) {
            set.add(words[i]);
        }
        for (int i=0;i<n;i++) {
            String rev = new StringBuilder(words[i]).reverse().toString();
            if (words[i].equals(rev)) continue;
            if (set.contains(rev)) {
                count++;
                set.remove(words[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] words = {"cd","ac","dc","ca","zz"};
        System.out.println(maximumNumberOfStringPairs(words));
    }
}
