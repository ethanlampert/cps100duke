public class SilverDistance {
	public int minSteps(int sx, int sy, int gx, int gy) {
		int x = Math.abs(sx - gx);
		int y = Math.abs(sy - gy);

		if ((x - y) % 2 == 0)
			return x > y ? x : y;
		else if (x > y)
			return (x + 1);
		else if (gy > sy)
			return y;
		else if (gy < sy)
			return y + 2;
		return 0;
	}
}
