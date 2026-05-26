package cyclicsort;

public class SetMisMatch_5 {
    public static int[] findErrorNumber(int[] arr){
        int i = 0;
        while(i < arr.length){
            int idx = arr[i]-1;
            if(arr[i]!=arr[idx]){
                swap(arr,i,idx);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j] != j+1){
                return new int[] {arr[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        int[] result = findErrorNumber(arr);
        System.out.println("Duplicate: "+ result[0]);
        System.out.println("Missing: "+ result[1]);
    }
}
