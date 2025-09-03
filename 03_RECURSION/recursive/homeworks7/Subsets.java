package recursive.homeworks7;

public class Subsets {
    public static void subsetUsingIndex(String ans, String original, int idx){
        if (idx == original.length()){
            System.out.println(ans);
            return;
        }
        char ch = original.charAt(idx);
        subsetUsingIndex(ans+ch,original,idx+1);
        subsetUsingIndex(ans,original,idx+1);
    }

    public static void main(String[] args) {
        String original = "abc";
        subsetUsingIndex("",original,0);
    }
}
