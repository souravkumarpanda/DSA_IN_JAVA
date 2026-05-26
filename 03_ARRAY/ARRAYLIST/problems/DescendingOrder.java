package problems;

import java.util.ArrayList;
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("Welcome"); str.add("To"); str.add("Physics"); str.add("Wallah");
//        Ascending Order
        Collections.sort(str);
        System.out.println(str);
//        Descending Order
        Collections.sort(str, Collections.reverseOrder());
        System.out.println(str);
    }
}
