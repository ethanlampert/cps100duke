import java.util.HashMap;


public class SandwichBar {
	public int whichOrder(String[] available, String[] orders){ // fill in code here } 
		HashMap<String, Integer> avail_map = new HashMap<String, Integer>();
		for (String item: available) {
			if (!avail_map.containsKey(item))
				avail_map.put(item, 1);
		}
		int count = 0;
		for (int i = 0; i < orders.length; i++) {
			String[] parts = orders[i].split(" ");
			count = 0;
			for (String part: parts) {
				if (avail_map.containsKey(part))
					count++;
			}
			if (count == parts.length)
				return i;
		}
		return -1;
	}
}
