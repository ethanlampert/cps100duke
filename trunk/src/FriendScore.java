// http://www.topcoder.com/wiki/pages/viewpage.action?pageId=35685125
public class FriendScore {
	public int hightestScore(String[] friends) {
		int max = 0;
		int len = friends.length;
		for (int i = 0; i < len; i++) {
			int cnt = 0;
			for (int j = 0; j < len; j++) {
				if (i == j)
					continue;
				if (friends[i].charAt(j) == 'Y') {
					cnt++;
				} else {
					for (int k = 0; k < len; k++) {
						if (k == i || k == j)
							continue;
						if (friends[k].charAt(i) == 'Y'
								&& friends[k].charAt(j) == 'Y') {
							cnt++;
							break;
						}
					}
				}
			}
			if (cnt > max)
				max = cnt;
		}
		return max;
	}
}
