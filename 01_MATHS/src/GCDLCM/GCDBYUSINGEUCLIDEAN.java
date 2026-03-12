package GCDLCM;

public class GCDBYUSINGEUCLIDEAN {
    public static int Optimize(int a, int b){
        if(a==0){
            return b;
        }
        if(b==0){
            return a;
        }
        if(a==b){
            return a;
        }
        if(a>b){
            return Optimize(a-b, b);
        }else {
            return Optimize(b-a, a);
        }
    }

    public static void main(String[] args) {
        System.out.println(Optimize(36,60));
    }
}
