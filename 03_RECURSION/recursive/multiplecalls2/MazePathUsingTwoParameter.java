package recursive.multiplecalls2;

public class MazePathUsingTwoParameter {
    public static int findWays(int row, int col){
        if (row <1 || col < 1) return 0;
        if (row == 1 && col == 1) return 1;
        int rightWays = findWays(row, col-1);
        int downWays = findWays(row-1, col);
        int totalWays = rightWays + downWays;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(findWays(3,3));
    }
}
