package TWO_D_ARRAY.jaggedarray.problems;
import java.util.*;
public class PascalsTriangle {
    public static void printMatrix(int[][] matrix){
        for (int[] row:matrix){
            for (int val:row){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[][] pascal(int n){
        int[][] ans = new int[n][];
        for (int i=0;i<n;i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for (int j=1;j<i;j++){
                ans[i][j] = ans[i-1][j] + ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[][] result = pascal(n);
        printMatrix(result);
    }
}
