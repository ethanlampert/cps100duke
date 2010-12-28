import java.util.ArrayList;


public class NumberFill {
	String[] map;
	ArrayList<Position> highest_nums;

	private class Position {
		public int x;
		public int y;
		public int v;
		public Position(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	
	public int calc_cost(Position p, Position high) {

		if (p.y < 0 || p.y >= map.length)
			return 0;
		if (p.x < 0 || p.x >= map[0].length())
			return 0;
		if (map[p.y].charAt(p.x) == 'X')
			return 0;
		else if (map[p.y].charAt(p.x) == '.') {
			
		}
		int cost;
		calc_cost(new Position(p.x-1, p))
		return cost;
	}
	public int gradient(String[] picture) { 
		map = picture;
		
		int sum = 0;
		return sum;
	}
}
