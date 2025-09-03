package Palindrome;

import java.util.ArrayList;

public class ClosestPalindrome {
    public static long findNearestPalindrome(long firstHalf, boolean isOdd){
        long res = firstHalf;
        if (isOdd){
            firstHalf /= 10;
        }
        while (firstHalf>0){
            res = res*10+(firstHalf%10);
            firstHalf /= 10;
        }
        return res;
    }
    public static String nearestPalindrome(String n) {
        ArrayList<Long> list = new ArrayList<Long>();
        int len = n.length();
        boolean isOdd = (len%2!=0);
//        copy first half
        int mid = (len%2==0) ? (len/2) : (len/2+1);
        long firstHalf = Long.parseLong(n.substring(0,mid));
        list.add(findNearestPalindrome(firstHalf,isOdd));
        list.add(findNearestPalindrome(firstHalf+1,isOdd));
        list.add(findNearestPalindrome(firstHalf-1,isOdd));
        list.add((long)Math.pow(10,len)+1); // all 9's case
        list.add((long)Math.pow(10,len-1)-1); // all 101,1001,10001 ... case
        long num = Long.parseLong(n);
        long minDiff = Long.MAX_VALUE;
        long res = Long.MAX_VALUE;
        for (long element : list){
            if (element == num) continue;
            long curDiff = Math.abs(element - num);
            if (curDiff < minDiff){
                res = element;
                minDiff = curDiff;
            } else if (curDiff == minDiff) {
                res = Math.min(res,element);
            }
        }
        return String.valueOf(res);
    }

    public static void main(String[] args) {
        System.out.println(nearestPalindrome("129"));
    }
}
