package twopointers;

import java.util.Arrays;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int n = height.length;
        int ans = 0;
        int l = 0, r = n-1;
        int lmax = 0, rmax = 0;
        while(l<r){
            lmax = Math.max(lmax,height[l]);
            rmax = Math.max(rmax,height[r]);
            if(lmax<rmax){
                ans += lmax - height[l];
                l++;
            }else{
                ans += rmax - height[r];
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] height1 = {0,1,0,2,1,0,1,3,2,1,2,1};
        int[] height2 = {4,2,0,3,2,5};

        System.out.println("Input: " + Arrays.toString(height1));
        System.out.println("Trapped Water = " + trap(height1));

        System.out.println("Input: " + Arrays.toString(height2));
        System.out.println("Trapped Water = " + trap(height2));
    }
}
