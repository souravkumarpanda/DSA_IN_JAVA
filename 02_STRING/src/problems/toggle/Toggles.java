//1. Given a string, the task is to toggle all the characters
// of the string, i.e., to convert Upper case to Lower case and vice versa.
package problems.toggle;
import java.util.*;
public class Toggles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
//        StringBuilder sb = new StringBuilder(str);
        System.out.println("Original string: " + str);
        for (int i=0;i<str.length();i++){
            boolean flag = true;
            char ch = str.charAt(i);
            if (ch==' ') continue;
            int ascii = (int)ch;
            if (ascii >= 97) flag=false;
            if (flag==true){
                ascii += 32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }else {
                ascii -= 32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println("Toggles string: " + str);
    }
}
