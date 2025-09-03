package recursive.multiplecalls2.preinpost;

public class PreInPostExample {
    public static void solution(int n){
        if (n==0) return;
        System.out.println("Pre" + n);
        solution(n-1);
        System.out.println("In" + n);
        solution(n-1);
        System.out.println("Post" + n);
    }

    public static void main(String[] args) {
        solution(3);
    }
}
