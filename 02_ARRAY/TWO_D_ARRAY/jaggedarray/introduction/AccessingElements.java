package TWO_D_ARRAY.jaggedarray.introduction;

public class AccessingElements {
    public static void main(String[] args) {
//        Declaration and allocation of the main array
        int[][] jArr = new int[3][];
//        Allocation of the inner arrays with different lengths
        jArr[0] = new int[5]; // Row 0 has 5 columns
        jArr[1] = new int[2]; // Row 0 has 2 columns
        jArr[2] = new int[4]; // Row 0 has 4 columns
//        Initializing the array
        int val = 1;
        for (int i=0;i< jArr.length;i++){
            for (int j=0;j<jArr[i].length;j++){
                jArr[i][j] = val++;
            }
        }
//        Displaying the jagged array
        for (int i=0;i<jArr.length;i++){
            for (int j=0;j<jArr[i].length;j++){
                System.out.print(jArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
