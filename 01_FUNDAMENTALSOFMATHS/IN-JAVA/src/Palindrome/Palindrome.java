package Palindrome;

public class Palindrome {
    public static boolean PalindromeNumber(int num){
        int temp = num;
        int reverse = 0;
        while(temp!=0){
             int n = temp%10;
             temp = temp/10;
             reverse = reverse*10+n;
        }
        return num==reverse;
    }

    public static void main(String[] args) {
        System.out.println("Is 131 a Palindrome.Palindrome number? " +PalindromeNumber(131));
    }
}
