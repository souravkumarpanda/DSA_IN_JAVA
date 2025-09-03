package recursive.stringsinrecursion4;
import java.util.*;

public class ArraySubsets {
    static void printSubset(int[] arr,int n,int index, List<Integer> ans){
        if(index == n){
            for (int i=0;i<ans.size();i++){
                System.out.print(ans.get(i) + "");
            }
            System.out.println();
            return;
        }
        printSubset(arr, n, index+1, ans);
        ans.add(arr[index]);
        printSubset(arr, n, index+1, ans);
        ans.remove(ans.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        List<Integer> v = new ArrayList<>();
        printSubset(arr,n,0,v);
    }
}
