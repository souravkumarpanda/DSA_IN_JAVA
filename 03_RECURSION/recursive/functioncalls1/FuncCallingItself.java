package recursive.functioncalls1;

public class FuncCallingItself {
    public static void fun(){
        System.out.println("Hello PW!");
        fun();  // StackOverFlow because it goes to infinite call now using recursion we can manage it
    }

    public static void main(String[] args) {
        fun();
    }
}
