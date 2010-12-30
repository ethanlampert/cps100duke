
public class Bagels {
	public int bagelCount(int[] orders) { 
		int res = 0;
		for (Integer x:orders) {
			res += x + x/12;
		}
		return res;
	}
}
