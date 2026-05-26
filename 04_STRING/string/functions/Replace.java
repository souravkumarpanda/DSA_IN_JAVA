package string.functions;

public class Replace {
    public static void main(String[] args) {
        String str = "banana";
        String result = str.replace('a','o');
        System.out.println(result);
        String gtr = "I love Java";
        String results = gtr.replace("Java", "DSA");
        System.out.println(results);
        String ctr = "abc123xyz";
        String ans = ctr.replace("123","");
        System.out.println(ans);
    }
}
