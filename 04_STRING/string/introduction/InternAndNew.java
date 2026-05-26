package string.introduction;

public class InternAndNew {
    public static void main(String[] args) {
        String gtr = "CSE";
//        new keyword
        String str = new String("CSE");
        System.out.println(str);
        System.out.println(gtr == str);
//        but using intern()
        String ctr = gtr.intern();
        System.out.println(gtr == ctr);
    }
}
