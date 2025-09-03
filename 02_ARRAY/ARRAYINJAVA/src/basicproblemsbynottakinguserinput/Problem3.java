package basicproblemsbynottakinguserinput;

public class Problem3 {
    public static void search(){
        int[] arr = {1,5,3};
        int x = 5;
        int ans = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                ans = i;
                break;
            }
        }
        if (ans==-1) System.out.println("Not found.");
        else System.out.println(ans);
    }

    public static void main(String[] args) {
        search();
    }
}
