package problems;
// 10. Given String/integer print the next immediate greater data;
//        input : 123
//        output: 132

//        input: 2341
//        output: 2413

import java.util.Scanner;
import java.util.Arrays;

public class NextImmediate{
    public static void nextGreaterNumber(String number){
        char[] numArray = number.toCharArray();
        int i= numArray.length-2;
        while(i >= 0 && numArray[i] >= numArray[i + 1]){
            i--;
        }
        if(i == -1){
            System.out.println("No");
            return;
        }
        int j = numArray.length-1;
        while(numArray[j] <= numArray[i]){
            j--;
        }
        char temp = numArray[i];
        numArray[i] = numArray[j];
        numArray[j] = temp;
        Arrays.sort(numArray, i + 1, numArray.length);
        System.out.println(new String(numArray));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNext()){
            String num1 = sc.next();
            nextGreaterNumber(num1);
        }
        if(sc.hasNext()){
            String num2 = sc.next();
            nextGreaterNumber(num2);
        }
    }
}
