package recursive.multiplecalls2;

public class PowerFunction {
    public static int pow(int x, int n){
        if(n==1) return  x;
        int ans = pow(x,n/2);
        if (n%2 == 0) return ans*ans;
        else return ans*ans*x;
    }

    public static void main(String[] args) {
        System.out.println(pow(3,3));
    }
}
