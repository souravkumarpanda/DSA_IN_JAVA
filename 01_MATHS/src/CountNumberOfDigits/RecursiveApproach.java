package CountNumberOfDigits;
public class RecursiveApproach {
    public static int countR(int number) {
        if (number / 10 == 0) {
            return 1;
        }
        return 1 + countR(number / 10);
    }

    public static void main(String[] args) {
        System.out.println(countR(13311331));
    }
}
