// 1. Given a string, the task is to toggle all the characters
// of the string, i.e., to convert Upper case to Lower case and vice versa.
package problems.toggle;
import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        System.out.println("Original string: " + sb);
        for (int i=0;i<sb.length();i++){
            boolean flag = true;
            char ch = sb.charAt(i);
            if (ch==' ') continue;
            int ascii = (int)ch;
            if (ascii >= 97) flag=false;
            if (flag==true){
                ascii += 32;
                char dh = (char)ascii;
                sb.setCharAt(i,dh);
            }else {
                ascii -= 32;
                char dh = (char)ascii;
                sb.setCharAt(i,dh);
            }
        }
        System.out.println("Toggles string: " + sb);
    }
}
