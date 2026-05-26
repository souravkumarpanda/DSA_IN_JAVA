package string.introduction;

public class Immutability {
    public static void main(String[] args) {
        String s = "Hello";
//        s.charAt(0) = 'D';
        String S = "Dello";
        S = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(S);
    }
}
