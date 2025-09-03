package recursive.stringsinrecursion4;
import java.util.*;

public class SubsetTwo {
    public static void storeSubset(String ans,String org,ArrayList<String> v,boolean flag){
//        Sort the string
        if (flag && ans.isEmpty()){
            char[] arr = org.toCharArray();
            for (int i=0;i< arr.length-1;i++){
                for (int j=0;j<arr.length-1-i;j++){
                    if (arr[j] > arr[j+1]){
                        char temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            org = "";
            for (int i=0;i< arr.length;i++){
                org += arr[i];
            }
        }
//        Base case
        if (org.isEmpty()){
            v.add(ans);
            return;
        }
//        Logic
        char ch = org.charAt(0);
        if (org.length()==1){
            if (flag){
                storeSubset(ans+ch,org.substring(1),v,true);
            }
            storeSubset(ans,org.substring(1),v,true);
            return;
        }
        char dh = org.charAt(1);
        if (ch==dh){
            if (flag){
                storeSubset(ans+ch,org.substring(1),v,true);
            }
            storeSubset(ans,org.substring(1),v,false);
        }else {
            if (flag){
                storeSubset(ans+ch,org.substring(1),v,true);
            }
            storeSubset(ans,org.substring(1),v,true);
        }
    }

    public static void main(String[] args) {
        String org = "aba";
        ArrayList<String> v = new ArrayList<>();
        storeSubset("",org,v,true);
        for (String s : v) {
            System.out.println(s);
        }
    }
}
