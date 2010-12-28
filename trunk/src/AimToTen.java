
public class AimToTen {
	public int need(int[] marks) { 
		// fill in code here 
		int x;
		int sum = 0;
		int len = marks.length;
		for (int i: marks)
			sum += i;
		x = 19 * len - 2* sum;
		if (x < 0)
			return 0;
		return x;
	}
}
