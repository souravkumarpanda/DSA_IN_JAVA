package recursive.multiplecalls2;

public class StairPath {
    public static int countways(int n){
        if(n==3) return 3;
        if(n==2) return 2;
        if (n==1) return 1;
        return countways(n-1) + countways(n-2) + countways(n-3);
    }

    public static void main(String[] args) {
        System.out.println(countways(5));
    }
}
