package recursive.leetcode6.countandsay;

public class Leetcode38 {
    public String countAndSay(int n){
        if (n==1) return "1";
        String str = countAndSay(n-1);
        int size = str.length();
        String ztr = "";
        char ch = str.charAt(0);
        int freq = 1;
        for (int i=1;i<size;i++){
            char dh = str.charAt(i);
            if (ch==dh) freq++;
            if (ch!=dh){
                ztr += (Integer.toString(freq) + ch);
                ch = dh;
                freq = 1;
            }
        }
        ztr += (Integer.toString(freq) + ch);
        return ztr;
    }

    public static void main(String[] args) {
        Leetcode38 obj = new Leetcode38();
        System.out.println(obj.countAndSay(5));
    }
}
