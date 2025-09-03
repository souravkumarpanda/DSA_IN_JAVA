package recursive.stringsinrecursion4;
import java.util.*;

public class StoreStringSubsets {
//    This code is written using substring ,but it is slower as compare to indexing.
//    static void storeSubset(String ans,String org,List<String> v){
//        if (org.isEmpty()){
//            v.add(ans);
//            return;
//        }
//        char ch = org.charAt(0);
//        storeSubset(ans,org.substring(1),v);
//        storeSubset(ans+ch,org.substring(1),v);
//    }
//
//    public static void main(String[] args) {
//        String str = "abc";
//        List<String> v = new ArrayList<>();
//        storeSubset("",str,v);
//        for (String ele:v) {
//            System.out.println(ele);
//        }
//    }

//    Let's do for using index
    static void storeSubset(String ans,String org,int idx,List<String> v){
        if (idx == org.length()){
            v.add(ans);
            return;
        }
        storeSubset(ans, org, idx+1, v);
        storeSubset(ans+org.charAt(idx), org, idx+1, v);
    }

    public static void main(String[] args) {
        String str = "abc";
        List<String> v = new ArrayList<>();
        storeSubset("",str,0,v);
        for (String ele:v){
            System.out.println(ele);
        }
    }
}
