import java.util.Comparator;
import java.util.PriorityQueue;


public class VoteRigging {
	public int minimumVotes(int[] votes) { 
		if (votes.length == 1)
			return 0;
		Comparator<Integer> cmp = new Comparator<Integer>()
		{
		    public int compare( Integer x, Integer y )
		    {
		        return y - x;
		    }
		};
		PriorityQueue pq = new PriorityQueue(10, cmp); 
		
		for (int i = 1; i < votes.length; i++) {
			pq.add(votes[i]);
		}
		int count = 0;
		while(votes[0] <= (Integer)pq.peek()) {
			int item = (Integer) pq.remove (); 
			count++;
			votes[0]++;
			pq.add(item-1);
		}
		return count;
	}

	public static void main(String[] args) {
    	VoteRigging test = new VoteRigging();
    	int[] votes = {4, 1, 7, 4, 6, 5 };
    	System.out.println(test.minimumVotes(votes));
    }
}

