package Problems;

// Leetcode - 3

import java.util.HashMap;
//import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacter_1 {
    static int lengthOfLongestSubstring(String s) {
//        HashMap Solution TC=O(n)
        HashMap<Character,Integer> map = new HashMap<>();
        int i=0, j=0, maxLen=0;
        while (j<s.length()) {
            char ch = s.charAt(j);
            if (map.containsKey(ch)) {
                i = Math.max(i,map.get(ch)+1);
            }
            map.put(ch,j);
            int len = j-i+1;
            maxLen= Math.max(maxLen,len);
            j++;
        }
        return maxLen;

//        HashSet Solution TC=O(n)
//        HashSet<Character> set = new HashSet<>();
//        int i=0, j=0, maxLen=1;
//        while (j<s.length()) {
//            char ch = s.charAt(j);
//            if (!set.contains(ch)) {
//                set.add(ch);
//                j++;
//            }else {
//                int len = j-i;
//                maxLen = Math.max(len,maxLen);
//                while (s.charAt(i)!=s.charAt(j)) {
//                    set.remove(s.charAt(i));
//                    i++;
//                }
//                i++;
//                j++;
//            }
//        }
//        int len = j-i;
//        maxLen = Math.max(len,maxLen);
//        return maxLen;
    }

    public static void main(String[] args) {
        String s = "ulangwar";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
