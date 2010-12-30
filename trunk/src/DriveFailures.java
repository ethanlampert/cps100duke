public class DriveFailures {
	public double[] failureChances(double[] failureProb) {
		int n = failureProb.length;
		int N = 1 << n;
		double[] res = new double[n + 1];
		for (int I = 0; I < N; I++) {
			int c = 0;
			double p = 1;
			for (int i = 0; i < n; i++) {
				if ((I & (1 << i)) != 0) {
					c++;
					p *= failureProb[i];
				} else {
					p *= 1 - failureProb[i];
				}
			}
			res[c] += p;
		}
		return res;
	}
}