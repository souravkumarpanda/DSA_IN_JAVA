package cyclicsort;

public class FindDuplicateNumber_3 {
    static int findDuplicate(int[] arr){
        int i = 0;
        while(i < arr.length) {
            if(arr[i]!=i+1){
                int idx = arr[i]-1;
                if (arr[i] != arr[idx]) {
                    swap(arr, i, idx);
                }else{
                    return arr[i];
                }
            }
             else {
                i++;
            }
        }
        return -1;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
