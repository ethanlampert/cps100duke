
public class NewHouse {
	public int count(int[] x, int[] y) {
		int r = 0;
		for (int m=-100; m <= 100; m++) {
			for (int n=-100; n<=100; n++) {
				int cur = 0;
				for (int i = 0; i <x.length; i++) {
					int x1 = x[i];
					int y1 = y[i];
					
					cur = cur|((x1>m && y1 == n)?1:0);
					cur = cur|((x1==m && y1 < n)?2:0);
					cur = cur|((x1<m && y1 == n)?4:0);
					cur = cur|((x1 == m && y1> n)?8:0);
					
					if (cur == 15) {
						r++;
						break;
					}
				}
			}
		}
		return r;
	}
}
