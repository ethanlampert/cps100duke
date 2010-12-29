import java.util.PriorityQueue;

class Pair implements Comparable<Pair> {
	public int x;
	public int y;
	public Pair(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int compareTo(Pair o) {
		// TODO Auto-generated method stub
		return o.y - y;
	}
	
}
public class ProgramSchedule {
	public int schedule(int[] setUp, int[] runTime) { 
		PriorityQueue<Pair> q = new PriorityQueue<Pair>();
		for (int i=0; i < setUp.length; i++) {
			q.add(new Pair(setUp[i], runTime[i]));
		}
		int ret = 0;
		int start = 0;
		while (!q.isEmpty()) {
			Pair node = q.poll();
			start += node.x;
			ret = Math.max(ret, start+node.y);
		}
		return ret;
	}
}
