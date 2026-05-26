// 18.
package stringbuilder.functions;

public class IsEmpty {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb.isEmpty());
        StringBuilder gb = new StringBuilder("");
        System.out.println(gb.isEmpty());
    }
}
