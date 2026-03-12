package TWO_D_ARRAY.twodimensionalarray.problems.waveform;

public class WavePrint1 {
    public static void printMatrix(int[][] matrix){
        for (int[] ele:matrix){
            for (int val:ele){
                System.out.print(val+"\t");
            }
            System.out.println();
        }
    }
    public static void firstMethod(int[][] matrix,int r,int c){
        for (int i=0;i<r;i++){
            if (i%2==0){
                for (int j=0;j<c;j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }else {
                for (int j=c-1;j>=0;j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int r = matrix.length;
        int c = matrix[0].length;
        System.out.println("Original Matrix: ");
        printMatrix(matrix);
        System.out.println("Wave form: ");
        firstMethod(matrix,r,c);
    }
}
