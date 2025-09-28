package arrayreference;

public class Main {
    public static void changeArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        changeArray(arr);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
