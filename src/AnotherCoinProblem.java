// http://www.topcoder.com/stat?c=problem_statement&pm=10285
public class AnotherCoinProblem {
	int minimumCoins(long cost) {
		int res = 0;
		while (cost > 0) {
			int coin = maxMatch(cost);
			int num = (int) (cost/coin);
			cost = cost - coin*num;
			res += num;
		}
		return res;
	}

	private int maxMatch(long cost) {
		// TODO Auto-generated method stub
		if (cost < 25) {
			return (cost < 10)? 1: 10;
		}
		int maxCoin1 = 1;
		int maxCoin2 = 25;
		while (maxCoin1*10 <= cost) maxCoin1 *= 10;
		while (maxCoin2*100 <= cost) maxCoin2 *= 100;
		return Math.max(maxCoin1, maxCoin2);
	}
}
