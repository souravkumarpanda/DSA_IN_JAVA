package methodsinarray;

public class ReverseArrayWithExtraArray {
    public static void main(String[] args) {
        int[] org = {10,20,30,40};
        int n = org.length;
        int[] reversed = new int[n];
        for (int i=0;i<n;i++){
            reversed[i] = org[n-1-i];
        }
        System.out.println("Reversed Array: ");
        for (int num:reversed){
            System.out.print(num+" ");
        }
    }
}
