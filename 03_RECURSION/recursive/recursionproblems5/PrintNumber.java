package recursive.recursionproblems5;
public class PrintNumber {
    public void print(int[] arr, int si) {
        if(si >= arr.length) {
            return ;
        }
        System.out.print(arr[si] + " ");
        print(arr, si+1);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int si = 0;
        PrintNumber pn = new PrintNumber();
        pn.print(arr, si);
    }
}

//Reverse of this input i.e. 3 2 1
//public class recursive.recursionproblems.PrintNumber {
//    public void print(int[] arr, int si) {
//        if(si >= arr.length) {
//            return ;
//        }
//        print(arr, si+1);
//        System.out.print(arr[si] + " ");
//    }
//    public static void main(String[] args){
//        int[] arr = {1,2,3};
//        int si = 0;
//        recursive.recursionproblems.PrintNumber pn = new recursive.recursionproblems.PrintNumber();
//        pn.print(arr, si);
//    }
//}