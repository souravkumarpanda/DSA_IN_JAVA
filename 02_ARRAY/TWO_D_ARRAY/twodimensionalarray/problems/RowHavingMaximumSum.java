package TWO_D_ARRAY.twodimensionalarray.problems;

public class RowHavingMaximumSum {
    public static void printMatrix(int[][] matrix){
        for (int[] ele:matrix){
            for (int val:ele){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
    public static void maxRowSum(int[][] matrix, int r, int c){
        int maxSum = Integer.MIN_VALUE;
        int rowNumber = -1;
        for (int i=0;i<r;i++){
            int sum = 0;
            for (int j=0;j<c;j++){
                sum += matrix[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + " = " + sum);
            if (sum > maxSum){
                maxSum = sum;
                rowNumber = i+1;
            }
        }
        System.out.println("\nRow number having maximum sum is: " + rowNumber);
        System.out.println("Maximum sum = " + maxSum);
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        int r = matrix.length;
        int c = matrix[0].length;
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        maxRowSum(matrix,r,c);
    }
}
