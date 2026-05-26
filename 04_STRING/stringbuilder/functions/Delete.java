//5
package stringbuilder.functions;

public class Delete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Computer Science");
        sb.delete(2,8);
        System.out.println(sb);
    }
}
