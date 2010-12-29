// http://www.topcoder.com/tc?module=Static&d1=match_editorials&d2=srm398
public class CountPaths {
	public int[] difPaths(int r, int c, int[] fieldrow, int[] fieldcol) {
		int[] dx = new int[] { 1, 0 };
		int[] dy = new int[] { 0, 1 };
		int mod = 1000007;
		int n = fieldrow.length;
		int[][] num = new int[r][c];
		for (int i = 0; i < n; i++) {
			int x = fieldrow[i] - 1;
			int y = fieldcol[i] - 1;
			num[x][y] = i + 1;
		}
		int[][][][] res = new int[r][c][n + 1][n + 1]; // [\u1089][\u1082][\u1086][\u1083][\u1100][\u1082][\u1086]
		if (num[0][0] == 0)
			res[0][0][0][0] = 1;
		else
			res[0][0][1][num[0][0]] = 1;
		for (int x = 0; x < r; x++)
			for (int y = 0; y < c; y++)
				for (int k = 0; k <= n; k++)
					for (int last = 0; last <= n; last++) {
						if (res[x][y][k][last] == 0)
							continue;
						for (int d = 0; d < 2; d++) {
							int x1 = x + dx[d], y1 = y + dy[d];
							if (x1 < r && y1 < c) {
								if (num[x1][y1] == 0) {
									res[x1][y1][k][last] = (res[x1][y1][k][last] + res[x][y][k][last])
											% mod;
								} else if (num[x1][y1] > last) {
									res[x1][y1][k + 1][num[x1][y1]] = (res[x1][y1][k + 1][num[x1][y1]] + res[x][y][k][last])
											% mod;
								}
							}
						}
					}
		int[] ans = new int[n + 1];
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++)
				ans[i] = (ans[i] + res[r - 1][c - 1][i][j]) % mod;
		}
		return ans;
	}

}