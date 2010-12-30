import java.util.LinkedList;
import java.util.Queue;


public class Tourney {
	public String winner(String[] bracket, String results) { // fill in code here } 
		Queue<String> q = new LinkedList<String>();
		String res = "";
		for (String s: bracket) {
			q.offer(s);
		}
		int i =0;
		while (i < results.length()) {

			String a = q.poll();
			String b = q.poll();
			if (a.equals("bye")) {
				q.offer(b);
				continue;
			}
			if (b.equals("bye")) {
				q.offer(a);
				continue;
			}
			if (results.charAt(i) == 'L')
				q.offer(b);
			else 
				q.offer(a);
			i++;	
		}
		while (q.peek().equals("bye"))
			q.poll();
		return q.peek();
	}
}
