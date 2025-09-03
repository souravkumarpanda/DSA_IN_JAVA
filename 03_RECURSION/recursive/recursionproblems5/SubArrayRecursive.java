package recursive.recursionproblems5;
import java.util.*;

public class SubArrayRecursive {
    static void printSubArray(List<Integer> v, int[] arr,int n, int idx){
        if (idx == n){
            for (int i=0;i<v.size();i++){
                System.out.print(v.get(i) + " ");
            }
            System.out.println();
            return;
        }
        printSubArray(v,arr,n,idx+1);
        if (v.isEmpty() || arr[idx-1]== v.get(v.size() - 1)){
            v.add(arr[idx]);
            printSubArray(v,arr,n,idx+1);
            v.remove(v.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int n = arr.length;
        List<Integer> v = new ArrayList<>();
        printSubArray(v,arr,n,0);
    }
}
