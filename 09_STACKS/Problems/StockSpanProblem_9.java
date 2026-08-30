package Problems;

// GFG

import java.util.*;

public class StockSpanProblem_9 {
    static ArrayList<Integer> calculateSpan(int[] arr) {
      int n = arr.length;
      int[] span = new int[n];
      span[0] = 1;
      Stack<Integer> st = new Stack<>();
      st.push(0);
      for (int i=1;i<n;i++) {
          while (!st.isEmpty() && arr[st.peek()]<=arr[i]) st.pop();
          if (st.isEmpty()) span[i] = i-(-1);
          else span[i] = i-st.peek();
          st.push(i);
      }
      ArrayList<Integer> ans = new ArrayList<>();
      for (int i=1;i<n;i++) {
          ans.add(span[i]);
      }
      return ans;
    }

    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        System.out.println(calculateSpan(arr));
    }
}
