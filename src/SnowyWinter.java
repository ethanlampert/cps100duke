public class SnowyWinter {
	public int snowyHighwayLength(int[] startPoints, int[] endPoints) {
		int[] a = new int[10001];
		int r = 0;
		int n = startPoints.length;
		for (int i = 0; i < n; i++) {
			for (int k = startPoints[i]; k < endPoints[i]; k++)
				a[k] = 1;
		}
		for (int z : a)
			r += z;
		return r;
	}
}
