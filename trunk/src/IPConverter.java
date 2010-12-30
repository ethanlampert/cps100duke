import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// http://www.topcoder.com/stat?c=problem_solution&cr=277659&rd=5856&pm=2937
public class IPConverter {

	boolean okay(String s) {
		if (s.length() > 3) {
			return false;
		}
		if (s.length() < 1) {
			return false;
		}
		if (s.charAt(0) == '0' && s.length() > 1) {
			return false;
		}
		int i = new Integer(s).intValue();
		if (i > 255) {
			return false;
		}
		return true;
	}

	public String[] possibleAddresses(String ambiguousIP) {
		int i, j, k;
		int n = ambiguousIP.length();
		List r = new ArrayList();
		String s = ambiguousIP;
		for (i = 1; i + 1 < n; i++)
			if (okay(s.substring(0, i))) {
				for (j = i + 1; j + 1 < n; j++)
					if (okay(s.substring(i, j))) {
						for (k = j + 1; k < n; k++)
							if (okay(s.substring(j, k)) && okay(s.substring(k))) {
								r.add(s.substring(0, i) + "."
										+ s.substring(i, j) + "."
										+ s.substring(j, k) + "."
										+ s.substring(k));
							}
					}
			}
		String[] rr = (String[]) r.toArray(new String[0]);
		Arrays.sort(rr);
		return rr;
	}

}
