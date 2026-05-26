package TWO_D_ARRAY.twodimensionalarray.introduction;
import java.util.*;
public class TakingInputPrintingOutput {
    public static void printArray(int[][] arr){
        for (int[] ele : arr) {
            for (int num : ele) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row and column size: ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Enter value of the matrix: ");
        int[][] arr = new int[r][c];
        for (int i=0;i<r;i++) {
            for (int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr);
    }
}
