package recursive.multiplecalls2;

public class PrintTheMazePath {
//    using Four parameters
    public static void printPath(int sr, int sc, int er, int ec, String s){
        if (sr > er || sc > ec) return;
        if (sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        printPath(sr, sc+1, er, ec, s+"R");
        printPath(sr+1, sc, er, ec, s+"D");
    }
//    using two parameters
public static void printPath2(int row, int col, String str){
    if (row <1 || col < 1) return;
    if (row == 1 && col == 1){
        System.out.println(str);
        return;
    }
    printPath2(row, col-1, str+"R");
    printPath2(row-1, col, str+"D");
}

    public static void main(String[] args) {
        printPath(1,1,3,3,"");
        printPath2(3,3, "");
    }
}
