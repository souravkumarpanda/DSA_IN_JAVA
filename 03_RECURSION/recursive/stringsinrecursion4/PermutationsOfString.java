package recursive.stringsinrecursion4;

public class PermutationsOfString {
    public static void permutations(String ans, String org){
        if (org.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i=0;i<org.length();i++){
            char ch = org.charAt(i);
            String left = org.substring(0,i);
            String right = org.substring(i+1);
            permutations(ans+ch,left+right);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutations("",str);
    }
}
