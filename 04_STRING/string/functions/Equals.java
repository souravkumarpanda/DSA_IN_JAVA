//10
package string.functions;

public class Equals {
    public static void main(String[] args) {
        String str = "Computer Science";
        String gtr = "Computer Science";
        String ctr = new String("Computer Science");
        System.out.println(str == gtr);
        System.out.println(str == ctr);
        System.out.println(str.equals(gtr));
        System.out.println(str.equals(ctr));
    }
}
