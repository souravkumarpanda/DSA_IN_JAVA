package recursive.recursionproblems5;

public class IterativeSubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int k=i;k<n;k++){
                for(int j=i;j<=k;j++){
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
        }
    }
}
