package Factorial;

public class TrailingZeroesInFact {
    public static int Count(int num){
        if (num<0){
            return -1;
        }
        int count = 0;
        for (int i=5;(num/i)>=1;i*=5){
            count += num/i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(Count(25));
    }
}
