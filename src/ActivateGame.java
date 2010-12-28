import java.util.PriorityQueue;

class Node implements Comparable<Node> {
	int x;
	int y;
	int cost;
	public Node(int x, int y, int cost) {
		this.x = x;
		this.y = y;
		this.cost = cost;
	}
	
	public int compareTo(Node temp) {
		return temp.cost - cost;
	}
}
public class ActivateGame {

	
	public int distance(Character x) {
		if (Character.isDigit(x))
			return x - '0';
	    if(Character.isLowerCase(x)) return x-'a'+10;
	    else return x-'A'+36;
	}
	
	public int findMaxScore(String[] grid){ 
		PriorityQueue<Node> queue = new PriorityQueue<Node>();
		int cols, rows;
		cols = grid.length;
		rows = grid[0].length();
		int sum =0; 
		char [][]map = new char[rows][cols];
		boolean [][]visited = new boolean[rows][cols];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++) {
				map[i][j] = grid[j].charAt(i);
			}
		
		queue.add(new Node(0,0,0));
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			int x = temp.x;
			int y = temp.y;
			int cost = temp.cost;
			if (visited[x][y])
				continue;
			visited[x][y] = true;
			sum += cost;
			if(x>0) queue.add(new Node(x-1,y,Math.abs(distance(map[x][y])-distance(map[x-1][y]))));
			if(x< rows-1) queue.add(new Node(x+1,y,Math.abs(distance(map[x][y])-distance(map[x+1][y]))));
			if (y > 0) queue.add(new Node(x,y-1,Math.abs(distance(map[x][y])-distance(map[x][y-1]))));
			if (y < cols-1) queue.add(new Node(x,y+1,Math.abs(distance(map[x][y])-distance(map[x][y+1]))));
		}
		return sum;
	}
}
