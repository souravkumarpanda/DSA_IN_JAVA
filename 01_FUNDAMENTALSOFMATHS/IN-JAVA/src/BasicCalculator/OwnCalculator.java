package BasicCalculator;

public class OwnCalculator {
    public static double[] myCalculator(double[][] Arr) {
        double a1 = Arr[0][0], b1 = Arr[0][1], c1 = Arr[0][2], d1 = Arr[0][3];
        double a2 = Arr[1][0], b2 = Arr[1][1], c2 = Arr[1][2], d2 = Arr[1][3];
        double a3 = Arr[2][0], b3 = Arr[2][1], c3 = Arr[2][2], d3 = Arr[2][3];

        double delta = a1 * (b2 * c3 - b3 * c2) - b1 * (a2 * c3 - a3 * c2) + c1 * (a2 * b3 - a3 * b2);

        if (Math.abs(delta) < 1e-9) {
            double deltaD1 = d1 * (b2 * c3 - b3 * c2) - b1 * (d2 * c3 - d3 * c2) + c1 * (d2 * b3 - d3 * b2);
            if (Math.abs(deltaD1) < 1e-9) {
                return new double[]{1};  // Infinitely many solutions
            } else {
                return new double[]{0};  // No solution
            }
        }

        // Calculate determinants for X, Y, and Z
        double deltaX = d1 * (b2 * c3 - b3 * c2) - b1 * (d2 * c3 - d3 * c2) + c1 * (d2 * b3 - d3 * b2);
        double deltaY = a1 * (d2 * c3 - d3 * c2) - d1 * (a2 * c3 - a3 * c2) + c1 * (a2 * d3 - a3 * d2);
        double deltaZ = a1 * (b2 * d3 - b3 * d2) - b1 * (a2 * d3 - a3 * d2) + d1 * (a2 * b3 - a3 * b2);

        // Compute X, Y, Z
        double x = Math.floor(deltaX / delta);
        double y = Math.floor(deltaY / delta);
        double z = Math.floor(deltaZ / delta);

        return new double[]{x, y, z};
    }

    public static void main(String[] args) {
        double[][] arr = {
                {5, 4, 2, 0},
                {1, 4, 2, 0},
                {4, 2, 9, 0}
        };

        double[] result = myCalculator(arr);
        for (double val : result) {
            System.out.print((int) val + " ");
        }
    }
}