package recursive.multiplecalls2;

public class MazePath {
    public static int countWays(int sr, int sc , int er , int ec){
        if (sr > er || sc > ec) return 0;
        if (sr==er && sc==ec) return 1;
        int rightSide = countWays(sr+1, sc, er, ec);
        int downSide = countWays(sr, sc+1, er, ec);
        int totalWays = rightSide + downSide;
        return totalWays;
    }

    public static void main(String[] args) {
        System.out.println(countWays(0,0,2,2));
    }
}
