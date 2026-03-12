package GridUniquePath;

public class RecursiveApproach {
    public static int uniquePath(int m, int n){
        return countPath(0,0,m,n);
    }
    private static int countPath(int i, int j, int m, int n){
        if (i==m-1 || i==n-1){
            return 1;
        }
        if (i>=m || j>=n){
            return 0;
        }
        return countPath(i+1,j,m,n) + countPath(i,j+1,m,n);
    }

    public static void main(String[] args) {
        System.out.println(uniquePath(2,3));
    }
}
