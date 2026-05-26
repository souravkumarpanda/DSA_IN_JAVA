package string.introduction;

import java.util.*;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.next();  But it has an issue that not able to print after a space.
//        System.out.println(str);
//        So to solve it, we use
        String str1 = sc.nextLine();
        System.out.println(str1);
    }
}
