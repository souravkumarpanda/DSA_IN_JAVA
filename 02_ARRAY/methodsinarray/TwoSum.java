package methodsinarray;

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int n = nums.length;
        int[] ans = new int[2];
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (nums[i]+nums[j] == target){
                    ans[0] = i; ans[1] = j;
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSum obj = new TwoSum();
        int[] arr = {83,21,38,69,74,12};
        System.out.println(Arrays.toString(obj.twoSum(arr, 81)));
    }
}
