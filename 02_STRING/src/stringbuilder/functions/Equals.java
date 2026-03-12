// 11.
package stringbuilder.functions;

public class Equals {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        StringBuilder gb = new StringBuilder("Java");
        System.out.println(sb.equals(gb));
        System.out.println(sb.toString().equals(gb.toString()));
    }
}
