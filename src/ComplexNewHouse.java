import java.util.Arrays;

// http://www.topcoder.com/stat?c=problem_statement&pm=10512
public class ComplexNewHouse {
	public double distance(int[] x, int[] y, int k){ 
	    Double ans = Double.POSITIVE_INFINITY;
	    double[] dist = new double[x.length];
	    for (int x0 = -50; x0 <= 50; x0 += 0.5) {
	      for (int y0 = -50; y0 <= 50; y0 += 0.5) {
	        for (int i = 0; i < x.length; ++i) {
	          dist[i] = Math.abs(x0 - x[i]) + Math.abs(y0  - y[i]);
	        }
	        Arrays.sort(dist);
	        ans = Math.min(ans, dist[k - 1]);
	      }
	    }
	    return ans;
	}
}
