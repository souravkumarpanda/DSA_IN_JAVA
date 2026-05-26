// product of an array.
package basicproblemsbynottakinguserinput;

public class Problem4 {
    public static void main(String[] args) {
        int product = 1;
        int[] arr = {3,7,3,8};
        for (int i=0;i< arr.length;i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
