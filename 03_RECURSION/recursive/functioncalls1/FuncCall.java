package recursive.functioncalls1;

public class FuncCall {
    public static int product(int a,int b){
        return a*b;
    }
    public static void greet(){
        System.out.println("Good Morning!");
        System.out.println("How are You?");
    }

    public static void main(String[] args) {
        greet();
        System.out.println(product(2,4));
        greet();
    }
}
