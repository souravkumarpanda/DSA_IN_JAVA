package TWO_D_ARRAY.twodimensionalarray.problems;
import java.util.*;
public class ReverseEachRow {
    public static void printMatrix(int[][] matrix){
        for (int[] row:matrix){
            for (int val:row){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void reverse(int[][] matrix){
        for (int[] row:matrix){
            int left = 0;
            int right = row.length-1;
            while (left < right){
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                left++;
                right--;
            }
        }
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

        reverse(matrix);

        System.out.println("\nMatrix after reversing each row: ");
        printMatrix(matrix);
    }
}
