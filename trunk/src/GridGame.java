
public class GridGame {
	char [][]map;
	public boolean empty(int x, int y) {
		if (x>=map.length || x <0 || y >= map.length || y < 0) 
			return true;
		else if (map[y][x] == '.')
			return true;
		else
			return false;
	}
	
	public boolean valid (int x, int y) {
		if (empty(x, y-1) && empty(x, y+1) && empty(x+1, y) && empty(x-1, y)
				&& map[y][x] == '.')
			return true;
		else 
			return false;
	}
	
	public boolean move(int x, int y) {
		if (valid(x, y)) {
			boolean flag = false;
			map[y][x] = 'X';
			for (int i = 0; i < map.length; i++)
				for (int j=0; j < map[0].length; j++)
					if (move(j, i))
						flag = true;
			map[y][x] = '.';
			return !flag;
		}else
			return false;
	}
	
	public int winningMoves(String[] grid) {
		int counter = 0;
		map = new char[grid.length][grid[0].length()];
		for (int i = 0; i < grid.length; i++)
			for (int j=0; j<grid[0].length(); j++)
				map[i][j] = grid[i].charAt(j);
		
		for (int i = 0; i < grid.length; i++)
			for (int j=0; j<grid[0].length(); j++)
				if (move(j, i))
					counter++;
		return counter;
		
	}
}
