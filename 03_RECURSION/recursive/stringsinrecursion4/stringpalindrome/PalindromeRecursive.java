package recursive.stringsinrecursion4.stringpalindrome;

public class PalindromeRecursive {
    static boolean isPalindrome(String s, int i, int j){
        if (i>j) return true;
        if (s.charAt(i) != s.charAt(j)) return false;
        else return isPalindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        String s = "peep";
        System.out.println(isPalindrome(s,0,s.length()-1));
    }
}
