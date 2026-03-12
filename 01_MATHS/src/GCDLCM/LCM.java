package GCDLCM;

public class LCM {
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
    public static int LCMNUMBER(int a, int b){
        return a*b/Optimize(a,b);
    }

    public static void main(String[] args) {
        System.out.println(LCMNUMBER(15,20));
    }
}
