// 7.  Input a string of size n and Update all the even positions in the string
// to character 'a’ Consider 0-based indexing
package problems;
import java.util.*;
public class UpdateEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 'a';
            }
        }
        String updatedString = new String(arr);
        System.out.println("Updated string: " + updatedString);
    }
}
