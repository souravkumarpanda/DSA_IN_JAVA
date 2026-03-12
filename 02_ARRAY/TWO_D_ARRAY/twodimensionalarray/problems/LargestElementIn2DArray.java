package TWO_D_ARRAY.twodimensionalarray.problems;
import java.util.*;
public class LargestElementIn2DArray {
    public static void printMatrix(int[][] matrix){
        for (int[] row:matrix){
            for (int val:row){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void largest(int[][] matrix, int r, int c){
        int max = matrix[0][0];
        for (int i=1;i<r;i++){
            for (int j=0;j<c;j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("The largest number is: " + max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column size: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        System.out.println("Enter elements of matrix: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nOriginal Matrix: ");
        printMatrix(matrix);

        largest(matrix,r,c);
    }
}
