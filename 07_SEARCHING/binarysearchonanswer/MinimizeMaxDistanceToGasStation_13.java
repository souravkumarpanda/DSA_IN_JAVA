package binarysearchonanswer;

// Leetcode- 774 and GFG Practice

public class MinimizeMaxDistanceToGasStation_13 {
    static double minMaxDist(int[] stations, int k) {
        int n = stations.length;
        double low = 0;
        double high = 0;
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, stations[i + 1] - stations[i]);
        }
        while (high - low > 1e-6) {
            double mid = low + (high - low) / 2.0;
            if (canPlace(stations, k, mid)) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return high;
    }

    static boolean canPlace(int[] stations, int k, double dist) {
        int neededStations = 0;
        for (int i = 0; i < stations.length - 1; i++) {
            double gap = stations[i + 1] - stations[i];
            neededStations += (int)Math.ceil(gap / dist) - 1;
            if (neededStations > k) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] stations = {1,2,3,4,5,6,7,8,9};
        int k = 9;
        System.out.println(minMaxDist(stations,k));
    }
}
