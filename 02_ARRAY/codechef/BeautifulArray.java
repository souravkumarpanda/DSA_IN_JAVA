package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;
public class BeautifulArray {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // Read the number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // Read the size of the array
            int[] a = new int[4]; // Array to store counts of numbers modulo 4

            for (int i = 1; i <= n; ++i) {
                int x = sc.nextInt();
                a[x % 4] += 1;
            }

            // Check divisibility condition
            if ((a[1] + 2 * a[2] + 3 * a[3]) % 4 == 0) {
                int ans = Math.min(a[3], a[1]);
                a[3] -= ans;
                a[1] -= ans;

                ans += a[2] / 2;
                a[2] %= 2;

                if (a[2] > 0) {
                    ans += 2;
                    a[2] = 0;

                    if (a[3] > 0) {
                        a[3] -= 2;
                    }
                    if (a[1] > 0) {
                        a[1] -= 2;
                    }
                }

                if (a[1] > 0) {
                    ans += (a[1] / 4) * 3;
                }
                if (a[3] > 0) {
                    ans += (a[3] / 4) * 3;
                }

                System.out.println(ans);
            } else {
                System.out.println("-1");
            }
        }

        sc.close();
    }
}
