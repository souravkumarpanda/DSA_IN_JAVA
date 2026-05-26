package binarysearchonanswer;

// Leetcode - 4

public class MedianOfTwoSortedArrays_12 {
    static double findMedianSortedArrays(int[] arr1, int[] arr2) {
        if (arr1.length > arr2.length) {
            return findMedianSortedArrays(arr2, arr1);
        }
        int m = arr1.length;
        int n = arr2.length;
        int low = 0;
        int high = m;
        int leftSize = (m + n + 1) / 2;
        while (low <= high) {
            int cut1 = low + (high - low) / 2;
            int cut2 = leftSize - cut1;
            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int r1 = (cut1 == m) ? Integer.MAX_VALUE : arr1[cut1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];
            if (l1 <= r2 && l2 <= r1) {
                if ((m + n) % 2 == 1) {
                    return Math.max(l1, l2);
                }
                return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
            }
            else if (l1 > r2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }
        return 0.0;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
}
