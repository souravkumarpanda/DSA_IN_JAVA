// 10.
package string.functions;

import java.util.Arrays;

public class Split {
    public static void main(String[] args) {
//        Splitting by space
        String sentence = "Java is powerful";
        String[] words = sentence.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
//        Splitting by comma
        String data = "apple,banana,cherry";
        String[] fruits = data.split(",");
        System.out.println(Arrays.toString(fruits));
//        Splitting by multiple delimiters (Regex)
        String messy = "one-two/three.four";
        String[] tokens = messy.split("[-/\\.]");
        System.out.println(Arrays.toString(tokens));

    }
}
