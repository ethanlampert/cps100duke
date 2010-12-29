import java.util.Arrays;


public class Highcard {
	public int cheat(int[] mine, int[] friend) { 
		Arrays.sort(mine);
		Arrays.sort(friend);
		
		int friend_index = friend.length - 1;
		
		int numWinners=0;
		int chris_index = friend_index;
		while (friend_index>=0) {
		   if (mine[chris_index]>friend[friend_index]) {
		      numWinners++;
		      chris_index--;
		      friend_index--;
		   }
		   else {
		      friend_index--;
		   }
		}
		return numWinners;

	}
}
