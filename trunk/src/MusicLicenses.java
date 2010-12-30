import java.util.Arrays;

// http://www.topcoder.com/stat?c=problem_statement&pm=3467
public class MusicLicenses {
	public boolean correct(String s) {
		boolean[] free = new boolean[s.length()];
		for (int i = 0; i < s.length(); i++) {
			free[i] = true;
			for (int j = i + 1; j < s.length(); j++) {
				if (s.charAt(j) == s.charAt(i)) {
					free[i] = false;
				}
			}
		}
		boolean[] licensed = new boolean[26];
		Arrays.fill(licensed, false);
		for (int i = 0; i < s.length(); i++) {
			licensed[s.charAt(i) - 'A'] = true;
			int cnt = 0;
			for (int j = 0; j < 26; j++) {
				if (licensed[j]) {
					cnt++;
				}
			}
			if (cnt > 3) {
				return false;
			}
			if (free[i]) {
				licensed[s.charAt(i) - 'A'] = false;
			}
		}
		return true;
	}

	public int audit(String log) {
		String tmp = "";
		for (int i = 0; i < log.length(); i++) {
			tmp += log.charAt(i);
			if (!correct(tmp)) {
				return i;
			}
		}
		return -1;
	}
}
