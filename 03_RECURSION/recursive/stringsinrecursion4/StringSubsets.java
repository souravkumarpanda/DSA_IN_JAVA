package recursive.stringsinrecursion4;

public class StringSubsets {
    public static void printSubset(String ans, String original){
        if (original.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(0);
        printSubset(ans+ch,original.substring(1));
        printSubset(ans,original.substring(1));
    }

    public static void main(String[] args) {
        String original = "abc";
        printSubset("",original);
    }
}
