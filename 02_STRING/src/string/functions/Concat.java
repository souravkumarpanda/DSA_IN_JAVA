//8
package string.functions;

public class Concat {
    public static void main(String[] args) {
        String str = "Computer ";
        String gtr = "Science";
        System.out.println(str.concat(gtr));
//        OR
        String ctr = "abc";
        ctr += "xyz";
        System.out.println(ctr);
        ctr += 'r';
        System.out.println(ctr);
        ctr += 10;
        System.out.println(ctr);
    }
}
