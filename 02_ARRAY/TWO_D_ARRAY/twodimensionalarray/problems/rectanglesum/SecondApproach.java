package TWO_D_ARRAY.twodimensionalarray.problems.rectanglesum;

public class SecondApproach {
    public static void printMatrix(int[][] matrix){
        for(int[] ele:matrix){
            for (int val:ele){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
    public static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
    }
    public static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        findPrefixSumMatrix(matrix);
        for (int i=l1;i<=l2;i++){
            if (r1 > 0) sum += matrix[i][r2] - matrix[i][r1-1];
            else sum += matrix[i][r2];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int l1 = 1;
        int r1 = 1;
        int l2 = 2;
        int r2 = 2;
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        System.out.print("Sum of range of the matrix from " + "("+l1+","+r1+")"+" to "+"("+l2+","+r2+")"+" is: ");
        System.out.print(findSum(matrix,l1,r1,l2,r2));
    }
}
