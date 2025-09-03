package recursive.arraysinrecursion3;

// Store maximum value of an Array

import static java.lang.Math.max;

public class StoreMaxValInArray {
    public static int display(int[] arr,int n,int idx){
        if (idx == n) return Integer.MIN_VALUE;
        return max(arr[idx],display(arr,n,idx+1));
    }

    public static void main(String[] args) {
        int[] arr = {1,100,2,200,3,300,1000};
        int n = arr.length;
        System.out.println(display(arr,n,0));
    }
}
