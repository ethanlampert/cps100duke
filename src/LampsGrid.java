import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class LampsGrid {
	public int mostLit(String[]initial, int K) { 
		Map<String, Integer> cnt = new HashMap<String, Integer>();
		for (String item: initial) {
			if (cnt.containsKey(item))
				cnt.put(item, cnt.get(item) + 1);
			else
				cnt.put(item, 1);
		}
		int res = 0;
		for (Entry<String, Integer> entry: cnt.entrySet()) {
			String temp = entry.getKey();
			int num_0 = 0;
			for (Character x: temp.toCharArray()) {
				if (x == '0')
					num_0++;
			}
			
			if (K>= num_0 && (K-num_0)%2==0) {
				res = Math.max(res, entry.getValue());
			}
		}
		return res;
	}
}
