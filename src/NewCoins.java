
public class NewCoins {
	  public int minCoins(int[] a)
	  {
	    int n = a.length;
	    int[] din = new int[100001];
	    for (int i = 100000; i >= 1; --i) {
	      for (int j = 0; j < n; ++j) {
	        din[i] += a[j] / i;
	      }
	      for (int t = 2 * i; t <= 100000; t += i) {
	        int cur = din[t];
	        for (int j = 0; j < n; ++j) {
	          cur += (a[j] % t) / i;
	        }
	        din[i] = Math.min(din[i], cur);
	      }
	    }
	    return din[1];
	  }
}
