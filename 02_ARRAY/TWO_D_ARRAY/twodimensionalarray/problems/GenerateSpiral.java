package TWO_D_ARRAY.twodimensionalarray.problems;

public class GenerateSpiral {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] generateSpiralMatrix(int n){
        int[][] matrix = new int[n][n];
        int curr = 1, topRow = 0, rightCol = n-1, bottomRow = n-1, leftCol = 0;
        while (curr <= n*n) {
            // topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && curr <= n*n;j++){
                matrix[topRow][j] = curr;
                curr++;
            }
            topRow++;
            // rightCol -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && curr <= n*n;i++){
                matrix[i][rightCol] = curr;
                curr++;
            }
            rightCol--;
            // bottomRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && curr <= n*n;j--){
                matrix[bottomRow][j] = curr;
                curr++;
            }
            bottomRow--;
            // leftCol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && curr <= n*n;i--){
                matrix[i][leftCol] = curr;
                curr++;
            }
            leftCol++;
        }
        return matrix;
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = generateSpiralMatrix(n);
        printMatrix(matrix);
    }
}
