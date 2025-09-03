package recursive.stringsinrecursion4;
import java.util.*;

public class StoreArraySubsets {
    static void storeSubset(int[] arr,int n,int index,List<Integer> current,List<List<Integer>> allSubsets){
        if (index == n){
            allSubsets.add(new ArrayList<>(current));
            return;
        }
        storeSubset(arr, n, index+1, current, allSubsets);
        current.add(arr[index]);
        storeSubset(arr, n, index+1, current, allSubsets);
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int n = arr.length;
        List<List<Integer>> allSubsets = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        storeSubset(arr,n,0,current,allSubsets);
        for (List<Integer> subset:allSubsets){
            System.out.println(subset);
        }
    }
}
