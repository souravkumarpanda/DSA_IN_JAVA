//6
package string.functions;

public class StartsWithEndsWith {
    public static void main(String[] args) {
        String str = "Computer Science";
        System.out.println(str.startsWith("Computer"));
        System.out.println(str.startsWith("science"));
        System.out.println(str.startsWith("Science",6));
        System.out.println(str.endsWith("nce"));
        System.out.println(str.endsWith("Com"));
    }
}
