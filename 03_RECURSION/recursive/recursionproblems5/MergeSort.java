package recursive.recursionproblems5;
import java.util.Scanner;

public class MergeSort {
    public static void merge(int[] list, int lb, int mid, int ub) {
        int n1 = mid - lb + 1;
        int n2 = ub - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        System.arraycopy(list, lb, left, 0, n1);
        System.arraycopy(list, mid + 1, right, 0, n2);
        int i = 0, j = 0, k = lb;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                list[k] = left[i];
                i++;
            } else {
                list[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            list[k] = left[i];
            i++;
            k++;
        }
        while (j < n2) {
            list[k] = right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] list, int lb, int ub) {
        if (lb < ub) {
            int mid = lb + (ub - lb) / 2;
            mergeSort(list, lb, mid);
            mergeSort(list, mid + 1, ub);
            merge(list, lb, mid, ub);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid array size. Exiting program.");
            sc.close();
            return;
        }
        int[] list = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            list[i] = sc.nextInt();
        }
        mergeSort(list, 0, n - 1);
        System.out.println("Sorted array:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
