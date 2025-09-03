package recursive.arraysinrecursion3;

// Find maximum value of an Array

public class maxValueInArray {
    public static void printMax(int[] arr,int n,int idx, int max){
        if (idx == n){
            System.out.println(max);
            return;
        }
        if (max<arr[idx]) max=arr[idx];
        printMax(arr, n, idx+1, max);
    }

    public static void main(String[] args) {
        int[] arr = {1,100,2,200,3,300,1000};
        int n = arr.length;
        printMax(arr,n,0,Integer.MIN_VALUE);
    }
}
