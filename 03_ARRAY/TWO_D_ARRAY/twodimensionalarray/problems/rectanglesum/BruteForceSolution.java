package TWO_D_ARRAY.twodimensionalarray.problems.rectanglesum;

public class BruteForceSolution {
    public static void printMatrix(int[][] matrix){
        for(int[] ele:matrix){
            for (int val:ele){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
    public static int findSum(int[][] matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i=l1;i<=l2;i++){
            for (int j=r1;j<=r2;j++){
                sum += matrix[i][j];
            }
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
        System.out.println(findSum(matrix,l1,r1,l2,r2));
    }
}
