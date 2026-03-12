package prefixandsuffixsum.productexceptself;
import java.util.*;
public class UsingDivision {
    public static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int product = 1, p2 = 1, noz = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) noz++;
            product *= nums[i];
            if(nums[i] != 0) p2 *= nums[i];
        }
        if(noz > 1) p2 = 0;
        for(int i=0;i<n;i++){
            if(nums[i]==0) nums[i]=p2;
            else nums[i] = product/nums[i];
        }
        return nums;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

}
