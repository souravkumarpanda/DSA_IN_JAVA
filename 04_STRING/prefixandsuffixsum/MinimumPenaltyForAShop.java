package prefixandsuffixsum;

public class MinimumPenaltyForAShop{
    public static int bestClosingTime(String customers){
        int n = customers.length();
        int[] pre = new int[n+1];
        int[] suf = new int[n+1];
        pre[0] = 0;
        for (int i=0;i<n;i++){
            pre[i+1] = pre[i] + ((customers.charAt(i)=='N') ? 1: 0);
        }
        suf[n] = 0;
        for (int i=n-1;i>=0;i--){
            suf[i] = suf[i+1] + ((customers.charAt(i)=='Y') ? 1 : 0);
        }
        int minPen = n+5;
        for (int i=0;i<=n;i++){
            pre[i] += suf[i];
            int pen = pre[i];
            minPen = Math.min(minPen,pen);
        }
        for (int i=0;i<=n;i++){
            int pen = pre[i];
            if(pen==minPen) return i;
        }
        return n;
    }

    public static void main(String[] args) {
        String customers = "YYNY";
        System.out.println(bestClosingTime(customers));
    }
}
