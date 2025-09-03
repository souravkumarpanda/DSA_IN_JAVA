package recursive.functioncalls1;

public class ExperimentOnFuncCall {
    public static void gun(){
//        return;
        System.out.println("Hello PW!");
    }
    public static void fun(){
        System.out.println("Hello CW!");
        gun();
    }

    public static void main(String[] args) {
        fun();
    }
}
