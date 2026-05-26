package TWO_D_ARRAY.twodimensionalarray.problems.rectanglesum;

public class ThirdApproach {
    public static void printMatrix(int[][] matrix){
        for(int[] ele:matrix){
            for (int val:ele){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
//    Calculate both sums over rows and columns
    public static void findPrefixSumMatrix(int[][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
//        Calculate row-wise prefix sum
        for (int i=0;i<r;i++){
            for (int j=1;j<c;j++){
                matrix[i][j] += matrix[i][j-1];
            }
        }
//        Calculate column-wise sum
        for (int j=0;j<c;j++){
            for (int i=1;i<r;i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
    }
    public static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
        findPrefixSumMatrix(matrix);
        sum = matrix[l2][r2];
        if (r1 >= 1) left = matrix[l2][r1-1];
        if (l1 >= 1) up = matrix[l1-1][r2];
        if (l1 >= 1 && r1 >= 1) leftUp = matrix[l1-1][r1-1];
        ans = sum - up - left + leftUp;
        return ans;
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
