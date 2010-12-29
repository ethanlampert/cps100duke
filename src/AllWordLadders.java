import java.util.LinkedList;
import java.util.Queue;

public class AllWordLadders {
	StringWrap[] strList;
	boolean first;
	Queue<StringWrap> queue = new LinkedList<StringWrap>();
	private class StringWrap {
		String str;
		boolean used;
		int dist;
		public LinkedList<StringWrap> prev;
		public StringWrap(String str) {
			this.str = str;
			this.used = false;
			prev = new LinkedList<StringWrap>();
		}

		public boolean similar(StringWrap temp) {
			String t = temp.str;
			int cnt = 0;
			for (int i = 0; i < t.length(); i++) {
				if (t.charAt(i) != str.charAt(i))
					cnt++;
			}
			return cnt == 1;
		}
	}

	public boolean solve_it(StringWrap from, StringWrap to) {
		if (from.similar(to) && first)
			return true;
		first = true;
		for (StringWrap cur : strList) {
			if (from.similar(cur) && !cur.used) {
				cur.used = true;
				if (solve_it(cur, to))
					return true;
				else
					cur.used = false;
			}
		}
		return false;
	}

	public int[] solve(String[] words,  String from, String to) {
		strList = new StringWrap[words.length];
		first = false;
		for (int i = 0; i < strList.length; i++) {
			strList[i] = new StringWrap(words[i]);
		}
		int[] res = new int[2];
		res[0] = 0;
		res[1] = 1;
		return res;
	}
}
