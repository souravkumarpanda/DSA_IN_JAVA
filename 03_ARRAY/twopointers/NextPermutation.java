package twopointers;

import java.util.Arrays;

public class NextPermutation {
    // helper: swap two elements
    public static void swap(int[] num, int i, int j){
        int temp = num[i];
        num[i] = num[j];
        num[j] = temp;
    }
    // helper: reverse a portion of array
    public static void reverse(int[] num, int i, int j){
        while (i < j) {
            swap(num, i, j);
            i++;
            j--;
        }
    }
    public static void permutation(int[] num){
        int n = num.length;
        // 1) find pivot
        int idx = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (num[i] < num[i + 1]) {
                idx = i;
                break;
            }
        }
        // 2) if no pivot, this is the largest permutation -> reverse whole array
        if (idx == -1) {
            reverse(num, 0, n - 1);
            return;
        }
        // 3) find rightmost element greater than num[idx]
        int j = n - 1;
        while (j > idx && num[j] <= num[idx]) {
            j--;
        }
        // 4) swap pivot with that element
        swap(num, idx, j);
        // 5) reverse suffix to get the smallest suffix ordering
        reverse(num, idx + 1, n - 1);
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3};
        System.out.println("Original: " + Arrays.toString(num));
        permutation(num);
        System.out.println("Next Permutation: " + Arrays.toString(num));
    }
}
