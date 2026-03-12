// 17.
package stringbuilder.functions;

public class SetLength {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        System.out.println("Before: "+sb);
        sb.setLength(2);
        System.out.println("After: "+sb);
    }
}
