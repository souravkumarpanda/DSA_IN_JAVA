package Excelsheet;

public class ColumnTitleToColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int sum = 0;
        for(int i=0;i<columnTitle.length();i++){
            sum *= 26;
            sum += columnTitle.charAt(i)-'A'+1;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("AAA"));
    }
}
