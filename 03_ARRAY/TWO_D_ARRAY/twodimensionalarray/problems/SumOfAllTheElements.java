package TWO_D_ARRAY.twodimensionalarray.problems;

import java.util.*;

public class SumOfAllTheElements {
    public static void printMatrix(int[][] matrix){
        for (int[] row:matrix){
            for (int val:row){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void sumOf(int[][] matrix, int r, int c){
        int sum = 0;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++) {
                    sum += matrix[i][j];
            }
        }
        System.out.println("The sum of all elements is: " + sum);
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

        sumOf(matrix,r,c);
    }
}
