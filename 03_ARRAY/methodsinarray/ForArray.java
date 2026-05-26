package methodsinarray;

public class ForArray {
    public static void change(int[] arr){
        arr[0] = 54;
    }
    public static void main(String[] args) {
        int[] arr = {12,23,34,45};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }
}
