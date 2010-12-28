// http://www.topcoder.com/wiki/display/tc/SRM+439
public class PalindromeFactory {
	int n;
	public int getEditDistance(String initial){ 
        char[] s = initial.toCharArray();
        n = s.length;
        int ans = solve(s);
        for (int i=0; i<s.length; i++) {
            for (int j=i+1; j<s.length; j++) {
                char c = s[i]; s[i] = s[j]; s[j] = c;
                int k = solve(s);
                if (k<ans)
                    ans = k+1;
                s[j] = s[i]; s[i] = c;
            }
        }
        return ans; 
	}

	private int solve(char[] s) {
		// TODO Auto-generated method stub
        int[][] f = new int[n][n];
        for (int i=0; i<n-1; i++)
            f[i][1] = s[i]==s[i+1] ? 0 : 1;
        for (int k=2; k<n; k++) {
            for (int i=0; i<n-k; i++) {
                int jj = s[i]==s[i+k] ? f[i+1][k-2] : 100;
                jj = Math.min(f[i+1][k-2]+1, jj);
                int j = Math.min(f[i+1][k-1], f[i][k-1])+1;
                f[i][k] = Math.min(j, jj);
            }
        }
        return f[0][n-1]; 
	}
}
