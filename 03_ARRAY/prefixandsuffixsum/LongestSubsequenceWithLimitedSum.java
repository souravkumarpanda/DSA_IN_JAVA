package prefixandsuffixsum;
import java.util.*;
public class LongestSubsequenceWithLimitedSum {
    public static int[] answerQueries(int[] nums, int[] queries){
        int n = nums.length;
        int m = queries.length;
        int[] ans = new int[m];
        Arrays.sort(nums);
        for (int i=1;i<n;i++){
            nums[i] += nums[i-1];
        }
        for (int i=0;i<m;i++){
            int maxLen = 0;
            int low = 0;
            int high = n-1;
            while(low <= high){
                int mid = low + (high-low)/2;
                if(nums[mid]>queries[i]) high=mid-1;
                else {
                    maxLen = mid+1;
                    low = mid+1;
                }
            }
            ans[i] = maxLen;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,2,1};
        int[] queries = {3,10,21};
        int[] result = answerQueries(arr,queries);
        System.out.println(Arrays.toString(result));
    }
}
