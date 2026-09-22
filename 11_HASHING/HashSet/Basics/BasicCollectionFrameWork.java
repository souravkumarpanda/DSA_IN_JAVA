package HashSet.Basics;

import java.util.HashSet;
import java.util.TreeSet;

public class BasicCollectionFrameWork {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10); set.add(20); set.add(30);
        set.add(40); set.add(50); set.add(60);
        System.out.println(set);
        System.out.println(set.size());
        set.remove(50);
        System.out.println(set.contains(50));
// In HashSet all these operation happens in O(1) TC.
        TreeSet<Integer> t = new TreeSet<>(); // This is also called Ordered set
//        In TreeSet all these operation happens in O(log n) TC.
        t.add(10); t.add(20); t.add(30);
        t.add(40); t.add(50); t.add(60);
        System.out.println(t);
        System.out.println(t.size());
        t.remove(50);
        System.out.println(t.contains(50));

//        Both of the sets only contain unique numbers, no duplicate allowed.
        set.add(40);
        System.out.println(set+" "+set.size());

//        Traversing
        for (int ele:set) {
            System.out.print(ele+" ");
        }
    }
}
