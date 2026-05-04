package bubblesort;

public class MoveAllZeroesToEnd_1 {
    static void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,-2,3,0,4,8,0,10,12};
        pushZerosToEnd(arr);
        for(int ele:arr){
            System.out.print(ele + " ");
        }
    }
}

// This is not a good method to solve this problem. Instead of
// Bubble sort use Two-pointer approach for better TC.