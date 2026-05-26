package TWO_D_ARRAY.twodimensionalarray.problems;
import java.util.*;
public class TransposeMatrix {
//    It is for any size of the array
    public static int[][] transpose(int[][] matrix, int r, int c){
        int[][] ans = new int[c][r];
        for (int i=0;i<c;i++){
            for (int j=0;j<r;j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
//    Not using an extra array (Only possible for square matrices)
    public static void transposeInPlace(int[][] matrix, int r, int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column size: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        int totalElements = r*c;
        System.out.println("Enter " + totalElements+ " values: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nOriginal Matrix: ");
        printMatrix(matrix);
        System.out.println("Transpose of matrix: ");
        int[][] result = transpose(matrix,r,c);
        printMatrix(result);
        transposeInPlace(matrix,r,c);
        printMatrix(matrix);
    }
}
