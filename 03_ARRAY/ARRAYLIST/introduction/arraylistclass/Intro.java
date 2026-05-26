package ARRAYLIST.introduction.arraylistclass;

import java.util.ArrayList;

public class Intro {
    public static void main(String[] args) {
//        Create an array list
        ArrayList<Integer> l1 = new ArrayList<>();
//        Add new elements
        l1.add(1);l1.add(2);l1.add(3);l1.add(4);
//        Get an element at index i or access elements
        System.out.println(l1.get(1));
//        Print with for loop
        for (int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
//        Printing the array list directly without for
        System.out.println(l1);
//        Adding element at some index i
        l1.add(1,100);
        System.out.println(l1);
//        Change element at index i
        l1.set(1,10);
        System.out.println(l1);
//        Removing element at index i
        l1.remove(1);
        System.out.println(l1);
//        Removing an element e
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);
//        Checking if an element exists
        boolean ans = l1.contains(Integer.valueOf(3));
        System.out.println(ans);
//        If you don't specify a class, you can put anything inside a list
        ArrayList l = new ArrayList();
        l.add("pres");
        l.add(1);
        l.add(true);
        System.out.println(l);
    }
}
