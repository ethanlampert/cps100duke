import java.util.Arrays;

public class OlympicCandles {
	public int numberOfNights(int[] candles) {
		int res = 0;
		int n = candles.length;
		while (true) {
			Arrays.sort(candles);
			if (res >= n)
				break;
			if (candles[n - res - 1] == 0)
				break;
			for (int i = n - 1; i >= n - res - 1; i--) {
				candles[i]--;
			}
			res++;
		}
		return res;
	}
}
