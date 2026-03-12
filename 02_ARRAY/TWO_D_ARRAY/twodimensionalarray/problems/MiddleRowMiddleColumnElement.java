package TWO_D_ARRAY.twodimensionalarray.problems;

import java.util.Scanner;

public class MiddleRowMiddleColumnElement {
    public static void printMatrix(int[][] matrix){
        for (int[] ele:matrix){
            for (int val:ele){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
    public static void displayMiddleElements(int[][] matrix, int size){
        int mid = size/2;
        System.out.println("Middle row elements: ");
        for (int j=0;j<size;j++){
            System.out.print(matrix[mid][j] + " ");
        }
        System.out.println("\n\nMiddle column elements: ");
        for (int i=0;i<size;i++){
            System.out.print(matrix[i][mid] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the square matrix (must be odd): ");
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Matrix size must be odd!");
            return;
        }
        int[][] matrix = new int[n][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        displayMiddleElements(matrix,n);
    }
}
