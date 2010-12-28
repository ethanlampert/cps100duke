// not correct, the unittest can not run!
public class SortingGame {
	public int fewestMoves(int[] board, int k) { 
		int[] helper = new int[board.length];
		int min = 0;
		for (int i = 0; i < board.length; i++) {
			helper[i] = Math.abs(board[i] - i);
//			System.out.println(helper[i]);
			if (helper[i]%(k-1) != 0)
				return 0;
			if (helper[i]/(k-1) > min)
				min = helper[i]/(k-1);
		}
		
		return min;
		
	}
}
