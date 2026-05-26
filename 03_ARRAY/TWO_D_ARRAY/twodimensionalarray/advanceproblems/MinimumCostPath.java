package TWO_D_ARRAY.twodimensionalarray.advanceproblems;//  Given a 2d matrix cost[][], the task is to calculate the minimum cost path to reach (m, n) from (0, 0). Each cell of the matrix represents a cost to traverse through that cell. The total cost of a path to reach (m, n) is the sum of all the costs on that path (including both source and destination).
//We can only traverse down, right and diagonally lower cells from a given cell, i.e., from a given cell (i, j), cells (i+1, j), (i, j+1), and (i+1, j+1) can be traversed.
// see 2D-1 and 2D-2 diagram
import java.util.Scanner;
public class MinimumCostPath{
    public int solution(int[][] ar,int r,int c){
        if(r==0 && c==0) return ar[0][0];
        if(r<0 || c<0) return Integer.MAX_VALUE;
        return ar[r][c]+Math.min(solution(ar,r,c-1),Math.min(solution(ar,r-1,c),solution(ar,r-1,c-1)));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MinimumCostPath ob = new MinimumCostPath();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int ar[][] = new int[r][c];
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
                ar[i][j] = sc.nextInt();
        System.out.print(ob.solution(ar,r-1,c-1));
    }
}