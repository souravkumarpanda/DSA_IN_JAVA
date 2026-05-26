package TWO_D_ARRAY.twodimensionalarray.problems;

import java.util.Scanner;

public class DiagonalElements {
    public static void printMatrix(int[][] matrix){
        for (int[] ele:matrix){
            for (int val:ele){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        System.out.println("\nMain diagonal elements: ");
        for (int i=0;i<n;i++){
            System.out.print(matrix[i][i] + " ");
        }
        System.out.println("\n\nSecondary diagonal elements: ");
        for (int i=0;i<n;i++){
            System.out.print(matrix[i][n-1-i] + " ");
        }
        System.out.println();
    }
}
