package linearsearch.problems;

public class SearchInString_1 {
    static boolean search(String str, char target){
        if (str.isEmpty()){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "Mango";
        char tar = 'n';
        System.out.println(search(str,tar));
    }
}
