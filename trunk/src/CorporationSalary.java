// http://www.topcoder.com/stat?c=problem_statement&pm=9824
public class CorporationSalary {
	private int N;
	private long[] sals;
	private String[] rel;

	public long totalSalary(String[] rel) {
		this.rel = rel;
		N = rel.length;
		sals = new long[N];
		for (int i = 0; i < N; i++)
			sals[i] = -1;
		long r = 0;
		for (int i = 0; i < N; i++) {
			r += f(i);
		}
		return r;
	}

	private long f(int n) {
		if (sals[n] != -1)
			return sals[n];
		long r = 0;

		int subsCnt = 0;
		for (int i = 0; i < N; i++) {
			if (rel[n].charAt(i) == 'Y') {
				subsCnt++;
				r += f(i);
			}
		}
		if (subsCnt == 0)
			r = 1;
		sals[n] = r;
		return r;
	}
}
