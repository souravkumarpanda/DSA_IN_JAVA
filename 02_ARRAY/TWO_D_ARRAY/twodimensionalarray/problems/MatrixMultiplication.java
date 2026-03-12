package TWO_D_ARRAY.twodimensionalarray.problems;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void printMatrix(int[][] matrix){
        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void multiplication(int[][] a, int r1, int c1, int[][] b, int r2, int c2){
        if (c1 != r2){
            System.out.println("Wrong Input.");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<c1;k++){
                    mul[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multiplication of two matrix is: ");
        printMatrix(mul);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows & columns of matrix1: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        System.out.println("Enter value of matrix1: ");
        int[][] a = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows & columns of matrix2: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("Enter value of matrix2: ");
        int[][] b = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix1: ");
        printMatrix(a);
        System.out.println("Matrix2: ");
        printMatrix(b);

        multiplication(a, r1, c1, b, r2, c2);
    }
}