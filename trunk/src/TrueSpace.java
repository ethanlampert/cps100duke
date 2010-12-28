
public class TrueSpace {
	public long calculateSpace(int[] sizes, int clusterSize) { 
		int len = sizes.length;
		long res = 0;
		for (int size: sizes) {
			if (size == 0)
				continue;
			res += size/clusterSize;
			res = (size % clusterSize == 0) ? res: res+1;
		}
		return (long)res*clusterSize;
	}
}
