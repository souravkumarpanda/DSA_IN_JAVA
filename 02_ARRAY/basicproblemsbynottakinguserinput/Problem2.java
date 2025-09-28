package basicproblemsbynottakinguserinput;

public class Problem2 {
    public static void maximum(){
        int[] arr = {1,5,3};
        int max = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        maximum();
    }
}
