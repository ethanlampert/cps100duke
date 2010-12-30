import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BadNeighbors {
	public int maxDonations(int[] donations) {
		List<Integer> l1 = new ArrayList<Integer>();
		List<Integer> l2 = new ArrayList<Integer>();
		int n = donations.length;
		for (int i = 0; i < n; i++) {
			if (i == 0) {
				l1.add(donations[i]);
			} else if (i== n-1) {
				l2.add(donations[i]);
			} else {
				l1.add(donations[i]);
				l2.add(donations[i]);
			}
		}
		return Math.max(findMax(l1), findMax(l2));
	}

	private int findMax(List<Integer> l1) {
		// TODO Auto-generated method stub
		if (l1.size() == 1)
			return l1.get(0);
		if (l1.size() == 2)
			return Math.max(l1.get(0), l1.get(1));
		if (l1.size() == 3)
			return Math.max(l1.get(0) + l1.get(2), l1.get(1));
		int[] dp = new int[l1.size()];
		dp[0] = l1.get(0);
		dp[1] = Math.max(l1.get(0), l1.get(1));
		dp[2] = Math.max(l1.get(0) + l1.get(2), l1.get(1));
		int i;
		for (i=3; i<l1.size(); i++) {
			dp[i] = Math.max(l1.get(i)+dp[i-2], l1.get(i-1)+dp[i-3]);
		}
		return dp[l1.size()-1];
	}

}
