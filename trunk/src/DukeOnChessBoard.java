// http://www.topcoder.com/stat?c=problem_statement&pm=8268

public class DukeOnChessBoard {
	public String to(int x, int y) {
		return "" + (char) ('a' + x) + (char) ('1' + y);
	}

	public String dukePath(int n, String initPosition) {
		int x = initPosition.charAt(0) - 'a';
		int y = initPosition.charAt(1) - '1';
		String path = "";
		boolean[][] uses = new boolean[n][n];
		uses[x][y] = true;
		while (true) {
			path = path + to(x, y) + "-";
			if (x + 1 < n && !uses[x + 1][y]) {
				uses[x + 1][y] = true;
				x = x + 1;
				continue;
			}
			if (y + 1 < n && !uses[x][y + 1]) {
				uses[x][y + 1] = true;
				y = y + 1;
				continue;
			}
			if (y - 1 >= 0 && !uses[x][y - 1]) {
				uses[x][y - 1] = true;
				y = y - 1;
				continue;
			}
			if (x - 1 >= 0 && !uses[x - 1][y]) {
				uses[x - 1][y] = true;
				x = x - 1;
				continue;
			}
			break;
		}
		path = path.substring(0, path.length() - 1);
		if (path.length() > 40) {
			return path.substring(0, 20) + "..."
					+ path.substring(path.length() - 20, path.length());
		} else {
			return path;
		}
	}
}
