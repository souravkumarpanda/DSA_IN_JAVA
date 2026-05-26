package bubblesort;

class BubbleSort {
    static void bubbleSort(int[] arr) {
//        Worst case
        int n = arr.length;
//        for(int i = 0; i < n - 1; i++) {
//            for(int j = 0; j < n - i - 1; j++) {
//                if(arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//        }
//        Optimized code
        for(int i=0;i<n-1;i++){
            boolean isSorted = true;
            for(int j=0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        bubbleSort(arr);
        for(int ele : arr) {
            System.out.print(ele + " ");
        }
    }
}