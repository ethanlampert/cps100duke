
public class SoccerLeagues {
	public int[] points(String[] matches) { 
		int len = matches.length;
		int[] res = new int[len];
		for (int i =0; i < len; i++ )
			for (int j=0; j < len; j++) {
				if (i == j)
					continue;
				if (matches[i].charAt(j) == 'D') {
					res[i] += 1;
					res[j] += 1;
				} else if (matches[i].charAt(j) == 'W') {
					res[i] += 3;
				} else if (matches[i].charAt(j) == 'L') {
					res[j] += 3;
				}
			}
		
		return res;
	}
}
