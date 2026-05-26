package TWO_D_ARRAY.twodimensionalarray.problems;

public class SpiralMatrix {
    public static void printMatrix(int[][] matrix){
        for(int[] ele:matrix){
            for(int val:ele){
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }
    public static void spiralForm(int[][] matrix, int r, int c){
        int totalElements = 0, topRow = 0, rightCol = c-1, bottomRow = r-1, leftCol = 0;
        while (totalElements < r*c) {
            // topRow -> leftCol to rightCol
            for(int j=leftCol;j<=rightCol && totalElements < r*c;j++){
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;
            // rightCol -> topRow to bottomRow
            for(int i=topRow;i<=bottomRow && totalElements < r*c;i++){
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;
            // bottomRow -> rightCol to leftCol
            for(int j=rightCol;j>=leftCol && totalElements < r*c;j--){
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            // leftCol -> bottomRow to topRow
            for(int i=bottomRow;i>=topRow && totalElements < r*c;i--){
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        int r = matrix.length;
        int c = matrix[0].length;
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        spiralForm(matrix, r, c);
    }
}
