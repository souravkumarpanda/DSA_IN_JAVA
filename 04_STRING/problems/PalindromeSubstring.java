// 3. Given a string s, return the number of palindromic substring in it.
package problems;
import java.util.*;
public class PalindromeSubstring {
    public static boolean isPalindrome(String s){
        int i = 0, j = s.length()-1;
        while (i<j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if (isPalindrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j) + " ");
                    count++;
                }
            }
        }
        System.out.println("\n"+count);
    }
}
