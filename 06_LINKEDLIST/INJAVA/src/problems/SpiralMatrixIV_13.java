package problems;

import java.util.*;

public class SpiralMatrixIV_13 {
    public static int[][] spiralMatrix(int m, int n, ListNode head){
        int[][] matrix = new int[m][n];
//        Initial matrix with -1
        for (int i=0;i<m;i++){
            Arrays.fill(matrix[i], -1);
        }
        int top = 0, bottom = m-1;
        int left = 0, right = n-1;
        while(head!=null && top <= bottom && left <= right){
//            Left to Right
            for(int col=left;col<=right && head!=null;col++){
                matrix[top][col] = head.val;
                head = head.next;
            }
            top++;
//            Top to Bottom
            for(int row=top;row<=bottom&&head!=null;row++){
                matrix[row][right] = head.val;
                head = head.next;
            }
            right--;
//            Right to Left
            for(int col=right;col>=left&&head!=null;col--){
                matrix[bottom][col] = head.val;
                head = head.next;
            }
            bottom--;
//            Bottom to Top
            for(int row=bottom;row>=top&&head!=null;row--){
                matrix[row][left] = head.val;
                head = head.next;
            }
            left++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        int m = 3, n= 5;
        int[] values = {3,0,2,6,8,1,7,9,4,2,5,5,0};
        ListNode head = new ListNode(values[0]);
        ListNode temp = head;
        for (int i=1;i< values.length;i++){
            temp.next = new ListNode(values[i]);
            temp = temp.next;
        }
        int[][] result = spiralMatrix(m,n,head);
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
