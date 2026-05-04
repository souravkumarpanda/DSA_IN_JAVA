package mergesort;

public class Merging {
    static void merge(int[] A, int[] B, int[] C, int m, int n) {
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (A[i] < B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        while (i < m) {
            C[k++] = A[i++];
        }
        while (j < n) {
            C[k++] = B[j++];
        }
    }

    public static void main(String[] args) {
        int[] A = {2,5,8,12};
        int[] B = {4,6,7,15,18};
        int[] C = new int[A.length + B.length];
        merge(A,B,C,A.length,B.length);
        for(int ele:C){
            System.out.print(ele + " ");
        }
    }
}
