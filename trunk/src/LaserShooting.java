
public class LaserShooting {
    public double numberOfHits(int[] x, int[] y1, int[] y2) {
        double res = 0;
        for (int i = 0; i < x.length; i++) {
            double a1 = Math.atan2(y1[i], x[i]);
            double a2 = Math.atan2(y2[i], x[i]);
            res += Math.abs(a2 - a1) / Math.PI;
        }
        return res;
    }
}
