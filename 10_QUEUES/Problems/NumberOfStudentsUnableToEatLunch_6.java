package Problems;

// Leetcode - 1700
import java.util.*;

public class NumberOfStudentsUnableToEatLunch_6 {
    static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q = new LinkedList<>();
        int n = students.length;
        for (int student : students) {
            q.add(student);
        }
        int i = 0;
        int count = 0;
        while (!q.isEmpty() && count!=q.size()) {
            if (q.peek()==sandwiches[i]) {
                count = 0;
                q.remove();
                i++;
            }else {
                q.add(q.peek());
                q.remove();
                count++;
            }
        }
        return q.size();
    }

    public static void main(String[] args) {
        int[] students = {1,1,1,0,0,1};
        int[] sandwiches = {1,0,0,0,1,1};
        System.out.println(countStudents(students,sandwiches));
    }
}
