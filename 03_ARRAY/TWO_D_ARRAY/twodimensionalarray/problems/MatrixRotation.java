package TWO_D_ARRAY.twodimensionalarray.problems;
import java.util.*;

public class MatrixRotation {
    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix){
            for (int val : row){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    public static void transposeInPlace(int[][] matrix, int n){
        for (int i=0; i<n; i++){
            for (int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void reverse(int[][] matrix){
        for (int[] row : matrix){
            int left = 0, right = row.length-1;
            while (left < right){
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }
    }

    public static void rotateMatrix(int[][] matrix, int n){
        transposeInPlace(matrix, n);
        reverse(matrix);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of square matrix (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        System.out.println("Enter elements of matrix: ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nOriginal Matrix: ");
        printMatrix(matrix);

        rotateMatrix(matrix, n);

        System.out.println("\nMatrix after 90° rotation: ");
        printMatrix(matrix);
    }
}
