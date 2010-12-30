import java.util.Vector;

public class Underprimes {
	/**
	 * Checking primality of a given integer.
	 */
	public static boolean isPrime(int x) {
		if (x < 3) {
			return (x == 2);
		}
		for (int i = 2; i <= Math.sqrt(x); ++i) {
			if (x % i == 0) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Factorize the given integer.
	 */
	public static int[] factorize(int x) {
		Vector<Integer> ans = new Vector<Integer>();

		for (int i = 2; i <= Math.sqrt(x); ++i) {
			while (x % i == 0) {
				ans.add(i);
				x /= i;
			}
		}
		if (x > 1) {
			ans.add(x);
		}
		int[] ret = new int[ans.size()];
		for (int i = 0; i < ans.size(); ++i) {
			ret[i] = ans.elementAt(i);
		}
		return ret;
	}

	public int howMany(int A, int B) {
		int res = 0;
		for (int i = A; i <= B; ++i) {
			if (isPrime(factorize(i).length)) {
				++res;
			}
		}
		return res;
	}
}
