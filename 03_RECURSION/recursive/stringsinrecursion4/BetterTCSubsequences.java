package recursive.stringsinrecursion4;

import java.util.*;

public class BetterTCSubsequences {
    static void printSubsequences(int[] arr, int n, int index, List<Integer> ans, int k){
        if(index == n){
            if (ans.size()==k){
                for (int i=0;i<ans.size();i++){
                    System.out.print(ans.get(i) + "");
                }
                System.out.println();
            }
            return;
        }
        if (ans.size() + (n-index) < k) return;
        printSubsequences(arr, n, index+1, ans, k);
        ans.add(arr[index]);
        printSubsequences(arr, n, index+1, ans, k);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        List<Integer> v = new ArrayList<>();
        int k = 3;
        printSubsequences(arr,n,0,v,k);
    }
}
