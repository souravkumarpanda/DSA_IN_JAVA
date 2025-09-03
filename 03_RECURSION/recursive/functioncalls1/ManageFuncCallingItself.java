package recursive.functioncalls1;

public class ManageFuncCallingItself {
    public static void fun(int n){
        if (n==0) return;
        System.out.println("Hello PW!");
        fun(n-1);
    }

    public static void main(String[] args) {
        fun(4);
    }
}
