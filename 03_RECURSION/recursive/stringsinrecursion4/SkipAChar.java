package recursive.stringsinrecursion4;

public class SkipAChar {
//    public static void removeChar(String str, String s){
//        Brute Force Approach
//        if (str.isEmpty()){
//            System.out.println(s);
//            return;
//        }
//        char ch = str.charAt(0);
//        if (ch=='a') removeChar(str.substring(1),s);
//        else removeChar(str.substring(1),s+ch);
//    }
public static void removeChar(String str, String s, int idx){
//    Better Approach
    if (idx == str.length()){
        System.out.println(s);
        return;
    }
    char ch = str.charAt(idx);
    if (ch=='a') removeChar(str,s,idx+1);
    else removeChar(str,s+ch,idx+1);
}
    public static void main(String[] args) {
        String str = "sourav kumar panda";
//        removeChar(str,"");
        removeChar(str,"",0);





        //        Using for loop
//        String str = "Sourav Kumar Panada";
//        String s = str.replace('a',' ');
//        String s = "";
//        for (int i=0;i<str.length();i++){
//            if (str.charAt(i) != 'a') s += str.charAt(i);
//        }
//        System.out.println(s);
    }
}
