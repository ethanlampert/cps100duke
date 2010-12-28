
public class HandsShaking {
	public long countPerfect(int n) { 
	    long[] f = new long[n+1];
	    f[0] = 1;
	    for (int i = 2; i <= n; i+=2)
	      for (int j = 0; j <= i-2; j+=2)
	        f[i] += f[j] * f[i-j-2];
	    
	    return f[n];
	}
}
