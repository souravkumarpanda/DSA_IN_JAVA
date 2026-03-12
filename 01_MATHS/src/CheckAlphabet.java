import java.util.Scanner;
public class CheckAlphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char ch = scanner.next().charAt(0);
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("The alphabet '" + ch + "' is a vowel.");
            } else {
                System.out.println("The alphabet '" + ch + "' is a consonant.");
            }
        } else {
            System.out.println("'" + ch + "' is not a valid alphabet.");
        }
        scanner.close();
    }
}
