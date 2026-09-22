package Problems;

// Leetcode - 1657
import java.util.HashMap;

public class DetermineIfTwoStringsAreClose_7 {
    static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word1.length(); i++) {
            map1.put(word1.charAt(i),
                    map1.getOrDefault(word1.charAt(i), 0) + 1);
            map2.put(word2.charAt(i),
                    map2.getOrDefault(word2.charAt(i), 0) + 1);
        }
        for (char ch : map1.keySet()) {
            if (!map2.containsKey(ch)) return false;
        }
        HashMap<Integer, Integer> help1 = new HashMap<>();
        HashMap<Integer, Integer> help2 = new HashMap<>();
        for (int freq : map1.values()) {
            help1.put(freq, help1.getOrDefault(freq, 0) + 1);
        }
        for (int freq : map2.values()) {
            help2.put(freq, help2.getOrDefault(freq, 0) + 1);
        }
        for (int key : help1.keySet()) {
            if (!help2.containsKey(key)) return false;
            if (!help2.get(key).equals(help1.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "bca";
        System.out.println(closeStrings(word1,word2));
    }
}
