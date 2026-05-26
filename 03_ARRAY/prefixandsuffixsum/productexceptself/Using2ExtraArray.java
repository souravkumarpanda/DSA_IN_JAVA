package prefixandsuffixsum.productexceptself;
import java.util.*;
public class Using2ExtraArray {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] pre = new int[n];
        int[] suf = new int[n];
        int p = nums[0];
        pre[0] = 1;
        for(int i=1;i<n;i++){
            pre[i] = p;
            p *= nums[i];
        }
        p = nums[n-1];
        suf[n-1] = 1;
        for(int i=n-2;i>=0;i--){
            suf[i] = p;
            p *= nums[i];
        }
        for(int i=0;i<n;i++){
            pre[i] = pre[i] * suf[i];
        }
        return pre;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
