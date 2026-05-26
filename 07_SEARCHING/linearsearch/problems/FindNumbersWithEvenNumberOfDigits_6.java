package linearsearch.problems;

// Leetcode - 1295

public class FindNumbersWithEvenNumberOfDigits_6 {
    static int findNumbers(int[] arr){
        int count = 0;
        for (int ele:arr){
            if (even(ele)){
                count++;
            }
        }
        return count;
    }
//    Function to check whether a number contains an even digit or not
    static boolean even(int num){
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }
//    Count the number of digits in a number
    static int digits(int num){
        if (num<0) {
            num = num * -1;
        }
        if (num == 0) {
            return 1;
        }
//        int count = 0;
//        while (num>0){
//            count++;
//            num = num/10;
//        }
//        return count;
//        instead of doing this, the shortcut and efficient way is
        return (int)(Math.log10(num)) + 1;
    }
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}
