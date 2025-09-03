package recursive.multiplecalls2;

public class TowerOfHanoi {
    public static void toh(int n, char a, char b, char c){
        if(n==0) return;
        toh(n-1,a,c,b);
        System.out.println(a + " -> " + c);
        toh(n-1,b,a,c);
    }

    public static void main(String[] args) {
        int n = 3;
        toh(n,'A','B','C');
    }
}
