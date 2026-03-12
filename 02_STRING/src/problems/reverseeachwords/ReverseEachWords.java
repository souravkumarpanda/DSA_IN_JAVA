// 4. Java program to reverse each word in a string.
package problems.reverseeachwords;
import java.util.*;
public class ReverseEachWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = "";
        StringBuilder sb = new StringBuilder("");
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
            }else{
                sb.reverse();
                ans += sb;
                ans += " ";
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
