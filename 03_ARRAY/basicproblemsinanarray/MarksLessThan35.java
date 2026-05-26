// 6. Given an array of marks of students, if the mark of any student is less than 35 print
// its roll number. [roll number here refers to the index of the array].
package basicproblemsinanarray;

import java.util.Scanner;

public class MarksLessThan35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of student: ");
        int n = sc.nextInt();
        int[]  marks = new int[n];
        System.out.println("Enter marks of the student: ");
        for (int i=0;i<n;i++){
            marks[i] = sc.nextInt();
        }
        for (int i=0;i< marks.length;i++){
            if (marks[i] < 35){
                System.out.println(i);
            }
        }
    }
}
