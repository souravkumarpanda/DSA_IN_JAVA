package TWO_D_ARRAY.twodimensionalarray.problems;
import java.util.*;
public class StudentMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] studentData = new int[2][4];
        System.out.println("Enter roll numbers of 4 student: ");
        for (int i=0;i<4;i++){
            studentData[0][i] = sc.nextInt();
        }
        System.out.println("Enter marks of 4 student: ");
        for (int i=0;i<4;i++){
            studentData[1][i] = sc.nextInt();
        }
        System.out.println("\nRoll No and Marks side by side: ");
        System.out.println("RollNo\tMarks");
        for (int i=0;i<4;i++){
            System.out.println(studentData[0][i] + "\t" + studentData[1][i]);
        }
    }
}
