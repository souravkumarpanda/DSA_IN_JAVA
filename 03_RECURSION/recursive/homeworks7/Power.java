package recursive.homeworks7;

public class Power {
    //        using for loop
    public static int power(int a, int b){
        int p = 1;
        if(a==0 && b==0){
            System.out.println("0 raised to the power 0 is not define.");
            return -100;
        }
        if (a==0) return 0;
        for (int i=1;i<=b;i++){
            p *= a;
        }
        return p;
    }
//   using recursion
    public static int PowerRec(int a,int b){
        if(b==0) return 1;
        return a*PowerRec(a,b-1);
    }

    public static void main(String[] args) {
        System.out.println(PowerRec(2,10));
    }
}
