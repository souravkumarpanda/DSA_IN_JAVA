package Problems;

// GFG

import java.util.Stack;

public class TheCelebrityProblem_10 {
    static int celebrity(int[][] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i=0;i<n;i++) {
            st.push(i);
        }
        while (st.size()>1) {
            int a = st.pop();
            int b = st.pop();
            boolean aFlag = true, bFlag = true;
            if (arr[a][b] == 1) aFlag = false;
            else bFlag = false;
            if (arr[b][a] == 1) bFlag = false;
            else aFlag = false;
            if (aFlag) st.push(a);
            if (bFlag) st.push(b);
        }
        if (st.isEmpty()) return  -1;
        int celeb = st.pop();
        for (int j=0;j<n;j++) {
            if (j == celeb) continue;
            if (arr[celeb][j] == 1) return -1;
        }
        for (int i = 0; i <n; i++) {
            if (i == celeb) continue;
            if (arr[i][celeb] == 0) return -1;
        }
        return celeb;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,1,0}, {0,1,0}, {0,1,1}};
        System.out.println(celebrity(arr));
    }
}
