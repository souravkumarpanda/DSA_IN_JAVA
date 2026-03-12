package Excelsheet;

public class ColumnNumberToColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder ans = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            ans.append((char) (((columnNumber) % 26) + 'A'));
            columnNumber = (columnNumber) / 26;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(111));
    }
}
